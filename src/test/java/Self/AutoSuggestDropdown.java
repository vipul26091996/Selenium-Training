package Self;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(5000);
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id,'notification-frame')]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[contains(@id,'close')]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("fromCity")).click();
		WebElement from = driver.findElement(By.xpath("//input[starts-with(@class,react-autosuggest) and @placeholder='From']"));
		from.sendKeys("Bangalore");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER); 
		//driver.findElement(By.id("toCity")).click();
		WebElement to = driver.findElement(By.xpath("//input[starts-with(@class,react-autosuggest) and @placeholder='To']"));
		to.sendKeys("Del");
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
	}

}
