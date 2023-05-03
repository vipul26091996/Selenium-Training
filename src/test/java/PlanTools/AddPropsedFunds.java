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

public class AddPropsedFunds {

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
		driver.findElement(By.xpath("//a[text()='145346']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-2")));
		driver.findElement(By.id("ui-id-2")).click();
		driver.findElement(By.id("txt_1")).sendKeys("10");
		driver.findElement(By.id("txt_2")).sendKeys("10");
		driver.findElement(By.id("txt_3")).sendKeys("10");
		
		driver.findElement(By.id("ui-id-3")).click();
		driver.findElement(By.xpath("/html/body/form/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div/div[3]/div[3]/div/table/tbody/tr[3]/td[12]/a")).click();

	}

}
