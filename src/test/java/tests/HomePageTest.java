package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cs.driver.DriverManager;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends BaseTest{

	
	@DataProvider(name="getData")
	public Object[][] getData()
	{
		return new Object[][] {
			{"Admin","admin123","OrangeHRM"}
		};
		
	}
	
	@Test(description="Check whether title of ORangeHRM is dispalyed correctly", dataProvider="getData")
	public void HomePageTest1(String userName, String password, String expTitle)
	{
/*		DriverManager.getDriver().findElement(By.name("username")).sendKeys(ReadPropertyFile.prop.getProperty("username"));
		
		DriverManager.getDriver().findElement(By.name("password")).sendKeys(ReadPropertyFile.prop.getProperty("password"));
		DriverManager.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
*/
/*		LoginPage loginPage = new LoginPage();
		loginPage.setUserName(userName);
		loginPage.setPassword(password);
		loginPage.clickLogin();
*/
		LoginPage loginPage = new LoginPage();
		loginPage.loginToApplication(userName, password);
		
		HomePage homePage = new HomePage();
		String actualTitle = homePage.getHomePageTitle();
		
		Assert.assertEquals(actualTitle, expTitle, "actual title: " + actualTitle + " does not match with expected title: " + expTitle);
	}

}
