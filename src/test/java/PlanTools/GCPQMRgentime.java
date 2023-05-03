package PlanTools;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GCPQMRgentime {

	@Test
	public void qmrGenerate() {
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();

		/// Private Window
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions firefoxProfile = new FirefoxOptions();
		firefoxProfile.addArguments("-private");
		WebDriver driver = new FirefoxDriver(firefoxProfile);

		String planID = "147308";
		driver.get("https://p3-staging.plantools.com/login.aspx");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofHours(2));
		driver.findElement(By.id("uiUserName")).sendKeys("vipul.kumar@dadjexperts.com");
		driver.findElement(By.id("uiPassword")).sendKeys("V!pulgola66");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("search-plan")).click();
		driver.findElement(By.id("searchBox")).sendKeys(planID);
		driver.findElement(By.id("plansearch-btn")).click();
		driver.findElement(By.xpath("//a[text()='" + planID + "']")).click();

		driver.findElement(By.id("_ctl0_MasterContent_qmrUpdateLink")).click();
		WebElement ddown = driver.findElement(By.id("_ctl0_MasterContent_periodDropDown"));
		Select select = new Select(ddown);
		select.selectByValue("202206");
		driver.findElement(By.id("_ctl0_MasterContent_generateQMRButton")).click();

		long startTime = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofHours(2));
		//WebElement download = driver.findElement(By.xpath("//a[text()='Download QMR']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Download QMR']")));
		//wait.until(ExpectedConditions.visibilityOf(download));
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		long timeInMinutes = (totalTime / 1000) / 60;
		long timeInSeconds = (totalTime / 1000) % 60;
		System.out.println("Total time taken to generate QMR for " + planID + " is " + timeInMinutes + " minute and "
				+ timeInSeconds + " seconds");
		// driver.quit();

	}

}
