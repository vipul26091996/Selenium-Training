package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static String browser = "chrome"; // External configuration XLS,CSV
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://www.libertyinsurance.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/ul[2]/li[2]/a")).click();
		driver.findElement(By.id("loginEmail")).clear();
		driver.findElement(By.id("loginEmail")).sendKeys("vipulgola");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("***");
		driver.findElement(By.className("submitbtn2")).click();
		driver.findElement(By.tagName("input")).sendKeys("Testing");
		driver.quit();

	}

}
