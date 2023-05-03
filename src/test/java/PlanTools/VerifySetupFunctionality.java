package PlanTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifySetupFunctionality {
	
	@BeforeMethod
	public void firefoxDriver()
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions firefoxProfile = new FirefoxOptions();
		firefoxProfile.addArguments("-private");
		WebDriver driver = new FirefoxDriver(firefoxProfile);
	}
	
	public void group()
	{
		
	}

}
