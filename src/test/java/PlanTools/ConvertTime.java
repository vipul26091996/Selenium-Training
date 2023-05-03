package PlanTools;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConvertTime {
	
	@Test
	public void calculateTime()
	{

		
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		/// for open firefox in private window
		//FirefoxOptions firefoxProfile = new FirefoxOptions();
		//firefoxProfile.addArguments("-private");
		//WebDriver driver = new FirefoxDriver(firefoxProfile);
		driver.get("https://p3-staging.plantools.com/login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("uiUserName")).sendKeys("vipul.kumar@dadjexperts.com");
		driver.findElement(By.id("uiPassword")).sendKeys("V!pulgola66");
		driver.findElement(By.id("btnLogin")).click();
		//driver.close();
	}

}
