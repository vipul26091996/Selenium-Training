package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScripExec {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		JavascriptExecutor jsexec = (JavascriptExecutor) driver;
		
		//Print the title of the page
		String script = "return document.title;";
		String title = (String) jsexec.executeScript(script);
		System.out.println(title);
		
		//click button
		driver.switchTo().frame("iframeResult");
		jsexec.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//highlight button
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].style.border='5px solid green'", button);
		
		//scroll
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certifiedbutton = driver.findElement(By.xpath("//*[@id=\"certsection\"]/p/a"));
		jsexec.executeScript("aruments[0].scrollIntoView(true);", certifiedbutton);
		
	}

}
