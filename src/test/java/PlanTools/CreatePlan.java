package PlanTools;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatePlan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		driver.get("https://p3-staging.plantools.com/login.aspx");
		// driver.get("https://p3-qa.plantools.com/login.aspx");
		driver.findElement(By.id("uiUserName")).sendKeys("vipul.kumar@dadjexperts.com");
		driver.findElement(By.id("uiPassword")).sendKeys("V!pulgola66");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.id("addPlan")).click();
		driver.findElement(By.xpath("//input[@id='_ctl0_MasterContent_uiPlan_Wizard_planName']"))
				.sendKeys("Testing Plan");
		driver.findElement(By.xpath("//input[@id='_ctl0_MasterContent_uiPlan_Wizard_sponsorText']"))
				.sendKeys("QA Company");
		driver.findElement(By.xpath("//input[@id='_ctl0_MasterContent_uiPlan_Wizard_uiPlanCity']")).sendKeys("City");

		// select state
		WebElement stateddown = driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_uiPlanState"));
		Select stateselect = new Select(stateddown);
		stateselect.selectByValue("IN");

		// select sic code
		WebElement siccodeddown = driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_uiStandardIndustryCode"));
		Select sicselect = new Select(siccodeddown);
		sicselect.selectByValue("111300");

		// select scenario
		driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_fedPlanNumber")).sendKeys("135");
		WebElement scenarioddown = driver.findElement(By.xpath("//select[@id='_ctl0_MasterContent_uiPlan_Wizard_scenarioSelect']"));
		Select scenarioselect = new Select(scenarioddown);
		scenarioselect.selectByVisibleText("MMA One View");

		driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_uiNbrParticipants")).sendKeys("3");

		driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_StartNavigationTemplateContainerID_lnkNext"))
				.click();
		driver.findElement(By.xpath("//input[@id='_ctl0_MasterContent_imgCancel']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_ctl0_MasterContent_PlanNotes_lnkPlanDetails")));
		driver.findElement(By.id("_ctl0_MasterContent_PlanNotes_lnkPlanDetails")).click();
		driver.findElement(By.id("_ctl0_MasterHeader_modifyPlan")).click();
		// PLanCOntact
//		driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_txtfirstName")).sendKeys("Vipul");
//		driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_txtLastName")).sendKeys("Kumar");
//		driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_txtCompany")).sendKeys("QA Company");
//		
		//driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_StartNavigationTemplateContainerID_lnkNext")).click();
		//driver.findElement(By.xpath("//input[@id='_ctl0_MasterContent_imgCancel']")).click();
		// InvestmentMgmt
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_SideBarContainer_SideBarList__ctl3_SideBarButton")).click();
		driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_step_3_rptFeeBenchmark__ctl8_uiFeeBenchmark_uiServiceActive")).click();
		driver.findElement(By.id("_ctl0_MasterContent_uiPlan_Wizard_StepNavigationTemplateContainerID_lnkNext")).click();

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_ctl0_MasterContent_PlanNotes_lnkPlanDetails")));
		driver.findElement(By.id("_ctl0_MasterContent_PlanNotes_lnkPlanDetails")).click();

		// current funds
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-2")));
		driver.findElement(By.id("ui-id-2")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='_ctl0_MasterContent_changeFunds']")));
		
		driver.findElement(By.id("_ctl0_MasterContent_changeFunds")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fundFindAdvanced']")));
		WebElement ticker = driver.findElement(By.xpath("//input[@id='fundFindAdvanced']"));
		ticker.sendKeys("TNVIX,BARAX,LCSSX");
		ticker.sendKeys(Keys.ENTER);
		List<WebElement> tickercheck = driver.findElements(By.id("addFundCheckbox"));
		int checkbox = tickercheck.size();
		System.out.println(checkbox);
		for (int i = 0; i < checkbox; i++) {
			tickercheck.get(i).click();
		}
		
		//driver.findElement(By.id("addCheckedFunds")).click();
		driver.findElement(By.xpath("//input[@id='addCheckedFunds']")).click();
		driver.findElement(By.id("ctl00_MasterContent_lnkPlanDetails")).click();
		// Add Balance
		driver.findElement(By.id("txt_1")).sendKeys("10");
		driver.findElement(By.id("txt_2")).sendKeys("10");
		driver.findElement(By.id("txt_3")).sendKeys("10");

		// Add Proposed Fund
		driver.findElement(By.id("ui-id-3")).click();
		driver.findElement(By.xpath("/html/body/form/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div/div[3]/div[3]/div/table/tbody/tr[3]/td[12]/a")).click();

		// Add Contacts
//		driver.findElement(By.id("ui-id-5")).click();
//		WebElement sponsorfiduciary = driver.findElement(By.id("_ctl0_MasterContent_ddlsponsorcontacts"));
//		Select select = new Select(sponsorfiduciary);
//		select.selectByValue("committee_member");

		driver.findElement(By.id("ui-id-1")).click();
		// Actions action = new Actions(driver);
//		action.sendKeys(args)

	}

}
