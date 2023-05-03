package Self;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Whatsapp {

	@Test
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[@title='Lunch?']")).click();
		for (int i = 1; i <= 100; i++) 
		{
			driver.findElement(By.xpath("//p[@class='selectable-text copyable-text']")).sendKeys("Hello"+i);
			driver.findElement(By.xpath("//span[@data-testid='send']")).click();
		}
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//screenshot//whatsapp.png"));
	}

}
