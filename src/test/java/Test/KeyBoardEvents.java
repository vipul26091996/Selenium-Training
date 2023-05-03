package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement source = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[9]/pre/span"));
		
		Actions action = new Actions(driver);
		action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(4000);
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[9]/pre/span"));
		action.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
	}

}
