package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	Boolean dataSetup=false;
	
	@Test(enabled=false)
	public void skipTest1()
	{
		System.out.println("Skiping this step as it is not complete");
	}
	
	@Test
	public void skipTest2()
	{
		System.out.println("Skipping this test forcefully");
		throw new SkipException("Skipping this Test");
		
	}
	
	@Test
	public void skipTest3()
	{
		System.out.println("Skipping this test based on condition");
		if(dataSetup==true)
		{
			System.out.println("Execute the Test");
		}
		else
		{
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not execute further steps");
		}
	}
	
	

}
