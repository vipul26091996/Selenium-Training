package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");

		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
		driver.findElement(By.name("email")).sendKeys("vipul.kumar@fleekitsolutions.com");
		driver.findElement(By.name("email")).clear();
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value"));     //Request a Demo
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getCssValue("box-sizing")); //border-box
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getSize());    
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getTagName()); //input
		System.out.println(driver.findElement(By.className("review-name")).getText());            //GEORGE D
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());//true
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isEnabled());  //true
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isSelected()); //false
		
		

	}

}
