package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	

	
	@BeforeTest /// run before all method
	public void loginToApplication()
	{
		System.out.println("Login To Application");
	}
	
	@AfterTest ///run after all method
	public void logoutFromApplication()
	{
		System.out.println("Logout from Application");
	}
	
	@BeforeMethod ///Run before each method
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@AfterMethod /// run after each method
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(priority=1,description="this is logout test") /// TestNG execute test cases alphabetically, if we use the priority attribute then we set the priority of test cases
	public void bloginTest()
	{
		System.out.println("Login is successful");
	}
	
	@Test(priority=2,description="this is logout test")
	public void alogoutTest()
	{
		System.out.println("Logout is successful");
	}


}
