package tests;

import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.cs.driver.Driver;
import com.cs.driver.ReadPropertyFile;

public class BaseTest {
	public static Properties prop = null;

	@BeforeSuite
	public void beforeSuite() 
	{
		prop = ReadPropertyFile.readPropertyFile();
	}

	@BeforeMethod
	public void setUp() 
	{
		Driver.initDriver();
	}

	@AfterMethod
	public void tearDown() 
	{
		try 
		{
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Driver.quitDriver();
	}
}