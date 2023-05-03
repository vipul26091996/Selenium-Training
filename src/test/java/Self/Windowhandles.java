package Self;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 10 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("//a[contains(@href,'OnePlus-Volcanic-Black-128GB-Storage')]")).click();
		
		//for firefox
		driver.findElement(By.xpath("//a[contains(@href,'2FSamsung-Mystique-Storage-Purchased-Separately')]")).click();
*/
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		driver.findElement(By.name("newbrowsertab453")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> iterator = window.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[4]/div/div/div[2]/div/div/div/div/div/a")).click();
		
		
	}

}
