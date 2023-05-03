package Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//take date so that while saving the screenshot it does not override previous one
		Date currentdate = new Date();
		System.out.println(currentdate);
		String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);
		
		//to take screenshot
		File screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//to save the file
		FileUtils.copyFile(screenshotfile, new File(".//screenshot//"+screenshotfilename+".png"));
		
		
	}

}
