package demo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;
	
	ProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
     @FindBy (id="SearchProductName") WebElement pname;
     @FindBy (id="search-products") WebElement search;
     @FindBy () WebElement verifysearch;
   public void verifysearchfunction (String proname)
{
    
	pname.sendKeys(proname);
	search.click();
	
	
}}
