package pages;

import com.cs.driver.DriverManager;

public class HomePage {
	
	public String getHomePageTitle()
	{
		return DriverManager.getDriver().getTitle();
	}
}
