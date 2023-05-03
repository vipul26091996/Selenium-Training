package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.libertyinsurance.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/ul[2]/li[2]/a")).click();
		driver.findElement(By.id("loginEmail")).clear();
		driver.findElement(By.id("loginEmail")).sendKeys("vipulgola");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("***");
		driver.findElement(By.className("submitbtn2")).click();
		driver.quit();
	}

}
