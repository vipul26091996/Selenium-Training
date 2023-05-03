package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream("D:\\eclipse-workspace\\SeleniumTraining\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(inputstream);
		System.out.println(properties.getProperty("fname"));
		System.out.println(properties.getProperty("lname"));
		
		FileOutputStream outputstream = new FileOutputStream("D:\\eclipse-workspace\\SeleniumTraining\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("address", "ghaziabad");
		properties.store(outputstream, "This is the customer data");

		
	}

}
