package Pom_test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import demo.pom.baseclass;
import demo.pom.Dashboardpage;
import demo.pom.loginpage;

public class logintest extends baseclass{
	
	WebDriver driver=Init();
	
	loginpage lp=new loginpage(driver);
	
	Dashboardpage dp;

	@Test
	public void verifyLogin()
	{
		dp=lp.login("admin@yourstore.com", "admin");
		String actualvalue=dp.verifyPageTitle();
		Assert.assertEquals(actualvalue, "Dashboard");
	}

}

	



