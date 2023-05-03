package PlanTools;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QMRgenerate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		// driver.get("https://p3-qa.plantools.com/login.aspx");
		driver.get("https://p3-staging.plantools.com/login.aspx");
		driver.findElement(By.id("uiUserName")).sendKeys("vipul.kumar@dadjexperts.com");
		driver.findElement(By.id("uiPassword")).sendKeys("V!pulgola66");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='145260']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='_ctl0_MasterContent_qmrUpdateLink']")));
		WebElement generate = driver.findElement(By.xpath("//a[@id='_ctl0_MasterContent_qmrUpdateLink']"));
		System.out.println(generate.getText());
		generate.click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='_ctl0:MasterContent:periodDropDown']"));
		Select select = new Select(dropdown);
		select.selectByValue("202103");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_ctl0_MasterContent_generateQMRButton']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_ctl0_MasterContent_reportsGrid__ctl2_downloadReportHyperLink")));
		driver.findElement(By.id("_ctl0_MasterContent_reportsGrid__ctl2_downloadReportHyperLink")).click();

		Set<String> windowhandle = driver.getWindowHandles();
		System.out.println(windowhandle);
		Iterator<String> iterator = windowhandle.iterator();
		String plandetails = iterator.next();
		String report = iterator.next();
		System.out.println(report);
		System.out.println(plandetails);
		driver.switchTo().window(report);

		Actions action = new Actions(driver);
//		WebElement page36 = driver.findElement(By.xpath("//div[@data-page-number='36'and @class='page']"));
//		action.moveToElement(page36).perform();

		driver.switchTo().window(plandetails);
		driver.findElement(By.id("_ctl0_MasterContent_PlanNotes_lnkPlanDetails")).click();

	}

}
