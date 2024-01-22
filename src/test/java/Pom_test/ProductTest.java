package Pom_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import demo.pom.Dashboardpage;
import demo.pom.ProductPage;
import demo.pom.baseclass;
import demo.pom.loginpage;

public class ProductTest extends baseclass{
WebDriver driver=Init();
	
	loginpage lp=new loginpage(driver);
	
	Dashboardpage dp;
    ProductPage pp;
	@Test
	public void verifyLogin()
	{
		dp=lp.login("admin@yourstore.com", "admin");
		pp=dp.clickonproductspage();
		pp.verifysearchfunction("Apple MacBook Pro 13-inch");
	}	

}

