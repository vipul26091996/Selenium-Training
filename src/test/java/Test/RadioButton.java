package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/automation-practice-form");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("firstName")).sendKeys("VipulKumarGola");
//		driver.findElement(By.xpath("//input[@id='gender-radio-1']")).click();
//		WebElement radio2 = driver.findElement(By.id("gender-radio-2"));
//		WebElement radio3 = driver.findElement(By.id("gender-radio-3"));
//		//radio1.click();
//		//System.out.println(radio1.isSelected());
//		System.out.println(radio2.isSelected());
//		System.out.println(radio3.isSelected());
//
//		WebElement radiocount = driver.findElement(By.xpath("//*[@type='radio'and @class='custom-control-input']"));
//		System.out.println(radiocount.getSize());
		
		driver.get("http://test.rubywatir.com/radios.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[6]")).click();
		

	}

}
