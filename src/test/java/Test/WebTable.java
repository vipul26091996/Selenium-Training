package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// Step1 - Switch to frame which has that particular table
		// Step2 - Get the number of rows
		// Step3 - Get the number of columns
		// Step4 - iterate rows and columns and get text and print it

		List<WebElement> rowelement = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		List<WebElement> headelement = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th"));
		List<WebElement> columnelement = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td"));

		int rowsize = rowelement.size();
		int headsize = headelement.size();
		int colsize = columnelement.size();

		System.out.println(rowsize);
		System.out.println(headsize);
		System.out.println(colsize);

		for (int i = 1; i <= rowsize; i++) {
			if (i == 1) {
				for (int j = 1; j <= colsize; j++) {

					System.out.print(
							driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/th[" + j + "]"))
									.getText() + " ");

				}
			} else {
				for (int j = 1; j <= colsize; j++) {

					System.out.print(
							driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"))
									.getText() + " ");

				}
			}
			System.out.println();
		}

	}

}
