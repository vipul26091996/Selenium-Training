package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSSLError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		//Global Profile
		//DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setAcceptInsecureCerts(true);
		//dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions coptions = new ChromeOptions();
		coptions.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(coptions);
		driver.get("https://expired.badssl.com/");
		
	}

}
