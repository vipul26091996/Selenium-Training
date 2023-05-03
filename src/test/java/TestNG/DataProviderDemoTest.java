package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {

	@Test(dataProvider="dataSet")
	public void test(String user,String password) {
		
		System.out.println(user+"===="+password);

	}

	@Test(dataProvider="create")
	public void test1(String user,String password,String test)
	{
		System.out.println(user+"==="+password+"===="+test);
	}
	
	@DataProvider
	public Object[][] dataSet() {
		Object[][] dataset = new Object[4][2];

		dataset[0][0] = "user1";
		dataset[0][1] = "password1";

		dataset[1][0] = "user2";
		dataset[1][1] = "password2";

		dataset[2][0] = "user3";
		dataset[2][1] = "password3";

		dataset[3][0] = "user4";
		dataset[3][1] = "password4";

		return dataset;

	}
	
	@DataProvider(name="create")
	public Object[][] dataSet1()
	{
		return new Object[][] {{"user1","password1","test1"},
			{"user2","password2","test2"},
			{"user3","password3","test3"},
			{"user4","password4","test4"}};
	}

}
