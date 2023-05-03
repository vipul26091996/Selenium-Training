package Test;

import java.util.Set;

import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.xpath("/html/body/div[3]/div[5]/div/div[6]/div[1]/div[2]/div[2]/div/div[1]/div/a")).click();
		Thread.sleep(4000);
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("RCV");
		driver.findElement(By.name("UserLastName")).sendKeys("Academy");
		driver.switchTo().window(parentwindow);
		

	}

}
