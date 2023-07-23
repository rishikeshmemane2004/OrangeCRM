package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.driver.DriverManager;
import com.cs.driver.ReadPropertyFile;
import static com.cs.driver.ReadPropertyFile.*;

public class verifyAddCustomerTest extends BaseTest {

	@Test(description = "this test script will verify newly added customer")
	public void verifyNewCustomer() {
		DriverManager.getDriver().findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		
		DriverManager.getDriver().findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		
		DriverManager.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		
		Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",
				"actual url: " + DriverManager.getDriver().getCurrentUrl() + " does not match with expected Url : https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
}
