package com.cs.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverFactory {

	private DriverFactory()
	{
	}
	
	public static WebDriver getDriver(String browser)
	{
		WebDriver driver;
		if (browser.equalsIgnoreCase("CHROME"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("EDGE"))
		driver = new EdgeDriver();
		else if (browser.equalsIgnoreCase("FIREFOX"))
		driver = new FirefoxDriver();
		else
			throw new RuntimeException("Invalid Driver " + browser);
		
		return driver;
	}
}
