package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert {

	@Test
	public void titleTest() {

		/// We use Softassert because agar hum hardassert use krte hai or hume multiple
		/// verification krni hai to
		/// agar 1 bhi verification fail ho jati hai or code aage run nhi hoga so to
		/// overcome this we use Softassert

		SoftAssert softassert = new SoftAssert();
		String expectedTitle = "Fleek IT Solutionss - Top Software Testing Company";
		String expectedText = "LET'S WORK TOGETHER";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fleekitsolutions.com/");
		driver.manage().window().maximize();
		System.out.println("Verify Title");
		String actualTitle = driver.getTitle();
		// Assert.assertEquals(actualTitle, expectedTitle,"Title Verification
		// failed");///hard assert
		softassert.assertEquals(actualTitle, expectedTitle, "Title Verification failed");
		System.out.println("Verify text");
		String actualtext = driver
				.findElement(By.xpath("//*[@id=\"qode-home-slider-3\"]/div[2]/div/div[2]/div/div/div/a")).getText();
		// Assert.assertEquals(actualtext, expectedText,"TextVerification
		// failed");///hard assert
		driver.close();
		softassert.assertAll(); /// to report any failure or assertion failure in this test cases

	}

}
