package ToolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		Actions action = new Actions(driver);
		//driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]")).click();
		
		
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Vipul Kumar");
//		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("vipul@gmail.com");
//		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Noida");
//		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Ghaziabad");
//		driver.findElement(By.xpath("//button[@id='submit']")).click();
//		Thread.sleep(5000);
//		
		
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@title='Toggle']")).click();
//		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")).click();
//		driver.findElement(By.xpath("//span[text()='Office']")).click();
//		Thread.sleep(5000);
		
		
//		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
//		Thread.sleep(5000);
//		
//		WebElement yesRadio = driver.findElement(By.xpath("//input[@id='yesRadio']"));
//		WebElement impressiveRadio = driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
//		action.click(yesRadio).perform();
//		action.click(impressiveRadio).perform();
//		Thread.sleep(5000);

		
//		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vipul");
//		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumar");
//		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("vipul@gmail.com");
//		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("28");
//		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("25000");
//		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("QA");
//		driver.findElement(By.id("submit")).click();
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("edit-record-4")).click();
//		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
//		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Gola");
//		driver.findElement(By.id("submit")).click();
//		driver.findElement(By.id("delete-record-1")).click();
//		Thread.sleep(5000);
		
//
//		driver.findElement(By.xpath("//span[text()='Buttons']")).click();
//		Thread.sleep(5000);
//		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
//		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
//		action.doubleClick(doubleClick).perform();
//		action.contextClick(rightClick).perform();
//		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
//		
//		Thread.sleep(5000);
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
		Thread.sleep(5000);
		WebElement ddown = driver.findElement(By.xpath("//select[@id='userSelect']"));
		ddown.click();
		Select select = new Select(ddown);
		System.out.println(select.getOptions());
		List<WebElement> list = select.getOptions();
		System.out.println(list.get(1).getText());
		System.out.println(list.size());
		System.out.println("Hello");
		driver.close();
		
		
	}
		

}
