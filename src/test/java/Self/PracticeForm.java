package Self;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		
		
		driver.findElement(By.xpath("//h5[text()='Forms']")).click();
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Vipul");
		driver.findElement(By.xpath("//*[@id=\"gender-radio-2\"]")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gender-radio-1']")));
		driver.findElement(By.cssSelector("input#gender-radio-1")).isSelected();
		driver.findElement(By.cssSelector("input#dateOfBirthInput")).click();
		WebElement ddownyear = driver.findElement(By.className("react-datepicker__year-select"));
		Select selectyear = new Select(ddownyear);
		selectyear.selectByValue("1996");
		
		WebElement ddownmonth = driver.findElement(By.className("react-datepicker__month-select"));
		Select selectmonth = new Select(ddownmonth);
		selectmonth.selectByValue("8");
		driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, September 26th, 1996']")).click();
		
		
		

	}

}
