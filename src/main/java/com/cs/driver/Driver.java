package com.cs.driver;

import static com.cs.driver.ReadPropertyFile.prop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public final class Driver {
	
	private Driver()
	{
	}

//	private static WebDriver driver;
	
	public static void initDriver()
	{
		String browser   = prop.getProperty("browser");
		if (DriverManager.getDriver()==null)
		{
			WebDriver driver = DriverFactory.getDriver(browser);
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get(prop.getProperty("url"));
			if (prop.getProperty("maximizeWindow").equals("true"))
				DriverManager.getDriver().manage().window().maximize();
	
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("timeOut"))));
		}
	}
	
	public static void quitDriver()
	{
		if (DriverManager.getDriver()!=null)
		{
			DriverManager.getDriver().quit();
			DriverManager.setDriver(null); // otherwise next browser will not start
		}
	}
}
