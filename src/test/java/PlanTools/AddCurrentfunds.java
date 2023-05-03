package PlanTools;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCurrentfunds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

		// driver.get("https://p3-qa.plantools.com/login.aspx");
		driver.get("https://p3-staging.plantools.com/login.aspx");
		driver.findElement(By.id("uiUserName")).sendKeys("vipul.kumar@dadjexperts.com");
		driver.findElement(By.id("uiPassword")).sendKeys("V!pulgola66");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//a[text()='135857']")).click();
		driver.findElement(By.xpath("//a[text()='145346']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-2")));
		driver.findElement(By.id("ui-id-2")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='_ctl0_MasterContent_changeFunds']")));
		
		driver.findElement(By.id("_ctl0_MasterContent_changeFunds")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fundFindAdvanced']")));
		WebElement ticker = driver.findElement(By.xpath("//input[@id='fundFindAdvanced']"));
		ticker.sendKeys("TNVIX,BARAX,LCSSX");
		ticker.sendKeys(Keys.ENTER);
		List<WebElement> tickercheck = driver.findElements(By.id("addFundCheckbox"));
		int checkbox = tickercheck.size();
		System.out.println(checkbox);
		for (int i = 0; i < checkbox; i++) {
			tickercheck.get(i).click();
		}
		
		//driver.findElement(By.id("addCheckedFunds")).click();
		driver.findElement(By.xpath("//input[@id='addCheckedFunds']")).click();
		driver.findElement(By.id("ctl00_MasterContent_lnkPlanDetails")).click();

	}

}
