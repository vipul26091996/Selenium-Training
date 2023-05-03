package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 10 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		driver.findElement(By.xpath("//a[contains(@href,'OnePlus-Volcanic-Black-128GB-Storage')]")).click();
		Set<String> window = driver.getWindowHandles();
		//String h = driver.getWindowHandle();
		System.out.println(window);
		//System.out.println(h);
		//Iterator<String> iterator = window.iterator();
//		String prevwindow = iterator.next();
//		String newwindow = iterator.next();
//		System.out.println(prevwindow);
//		System.out.println(newwindow);
		//driver.switchTo().window(prevwindow);
		//String newtab = driver.getWindowHandle();	
		//driver.switchTo().window(newtab);
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		//driver.findElement(By.id("buy-now-button")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
