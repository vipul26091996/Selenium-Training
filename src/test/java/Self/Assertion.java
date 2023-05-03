package Self;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	
	@Test
	public void verifyTitle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		SoftAssert sfAssert = new SoftAssert();
		driver.get("https://demoqa.com/");
		String title = driver.getTitle();
		sfAssert.assertEquals(title, "ToolsQAq", "SOftAssert");
		//Assert.assertEquals(title,"ToolsQAq");
		System.out.println("Thanks");
		sfAssert.assertAll();
	}

}
