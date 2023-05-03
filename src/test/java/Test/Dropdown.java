package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select = new Select(ddown);

		select.selectByIndex(5);
		Thread.sleep(2000);
		
		select.selectByValue("level3");
		Thread.sleep(2000);
		
		select.selectByVisibleText("51-100 employees");
		Thread.sleep(2000);
		
		// Multiple select in Dropdown
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement mddown = driver.findElement(By.id("multi-select"));
		Select mselect = new Select(mddown);
		mselect.selectByValue("California");
		Thread.sleep(2000);
		mselect.selectByIndex(5);
		Thread.sleep(2000);
		mselect.selectByVisibleText(null);
		Thread.sleep(2000);
		List<WebElement> allItems=mselect.getAllSelectedOptions();
		System.out.println(allItems.size());
		mselect.deselectByIndex(5);
		mselect.deselectByValue("California");
		mselect.deselectAll();
		
		
		WebElement firstselect = select.getFirstSelectedOption();
		System.out.println(firstselect);
		

	}

}
