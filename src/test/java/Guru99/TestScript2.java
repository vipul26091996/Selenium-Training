package Guru99;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript2 {
	
	static WebDriver driver;
	static String baseURL = Util.BASE_URL;
	
	public static void setup() 
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		driver.get(baseURL);
		driver.findElement(By.xpath("//input[@name='uid']")).clear();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(Util.USER_NAME);
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Util.PASSWORD);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actualTitle = driver.getTitle();
		System.out.println(Util.EXPECT_TITLE);
		System.out.println(actualTitle);
		
		if(actualTitle.equals(Util.EXPECT_TITLE))
		{
			System.out.println("Test Case: Pass");
		}
		else
		{
			System.out.println("Test Case: Fail");
		}
		

	}

}
