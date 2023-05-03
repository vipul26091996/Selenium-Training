package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.sugarcrm.com/request-demo/");
		
		//for scroll
		WebElement radio = driver.findElement(By.id("doi0"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		driver.findElement(By.name("interest_market_c")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("interest_market_c")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@type=checkbox]")).getSize());
		
		

	}

}
