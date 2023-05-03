package TestNG;

import org.testng.annotations.Test;

//@Test(groups="registration")
public class GroupsDemoTest {
	
	@Test(priority=1,groups="regression")
	public void aTest1()
	{
		System.out.println("Test1");
	}

	@Test(priority=3,groups="regression")
	public void aTest2()
	{
		System.out.println("Test2");
	}
	
	@Test(priority=2,groups= {"regression","bvt"})
	public void bTest3()
	{
		System.out.println("Test3");
	}
	
	@Test(groups={"bvt"})
	public void bTest4()
	{
		System.out.println("Test4");
	}
	
	///Run As > Run Configurations.. > Select Group and the run the test cases of particular groups.
}
