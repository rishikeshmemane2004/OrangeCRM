package pages;

import org.openqa.selenium.By;

import com.cs.driver.DriverManager;

public class LoginPage {

	
	private static final By TXT_USERNAME = By.name("username");
	private static final By TXT_PASSWORD = By.name("password");
	private static final By BTN_LOGIN    = By.xpath("//button[@type='submit']");
	
	private void setUserName(String userName)
	{
		DriverManager.getDriver().findElement(TXT_USERNAME).sendKeys(userName);
	}
	
	private void setPassword(String pwd)
	{
		DriverManager.getDriver().findElement(TXT_PASSWORD).sendKeys(pwd);
	}
			
	private void clickLogin()
	{
		DriverManager.getDriver().findElement(BTN_LOGIN).click();
	}
	
	public void loginToApplication(String userName, String password)
	{
		setUserName(userName);
		setPassword(password);
		clickLogin();
	}
}
