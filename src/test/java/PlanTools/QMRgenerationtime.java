package PlanTools;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QMRgenerationtime {
	
	@Test
	public void loginToApplication() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		String planId = "147506";
		driver.get("https://p3-staging.plantools.com/login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("uiUserName")).sendKeys("vipul.kumar@dadjexperts.com");
		driver.findElement(By.id("uiPassword")).sendKeys("V!pulgola66");
		driver.findElement(By.id("btnLogin")).click();
		
		
		///search for plan
		driver.findElement(By.id("search-plan")).click();
		driver.findElement(By.id("searchBox")).sendKeys(planId);
		driver.findElement(By.id("plansearch-btn")).click();
		driver.findElement(By.xpath("//a[text()='"+planId+"']")).click();
		
		
		///generate report
		driver.findElement(By.id("_ctl0_MasterContent_qmrUpdateLink")).click();
		WebElement ddown = driver.findElement(By.id("_ctl0_MasterContent_periodDropDown"));
		Select select = new Select(ddown);
		select.selectByValue("202206");
		driver.findElement(By.id("_ctl0_MasterContent_updateQMRButton")).click();
		
		
		
		///calculate time required to generate QMR report
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofHours(1));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Download QMR']"))));
		long endTime = System.currentTimeMillis();
		driver.findElement(By.xpath("//a[text()='Download QMR']")).click();
		System.out.println(endTime);
		long totalTime = endTime - startTime;
		long timeInMinutes = (totalTime/1000)/60;
		long timeInSeconds = (totalTime/1000)%60;
		System.out.println("Total time taken to generate QMR for "+planId+" is "+timeInMinutes+ " minute and "+timeInSeconds+" seconds");		
		driver.quit();
		
		
	}
	
	
}
