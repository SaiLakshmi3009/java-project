package demo.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage extends baseclass{
	
	WebDriver driver;
	
	@FindBy (xpath="//h1[contains(text(),'Dashboard')]") WebElement pagetitle;
	@FindBy (xpath="//i[@class='nav-icon fas fa-book']") WebElement catalog;
	@FindBy (xpath="//a[@href='/Admin/Product/List']") WebElement productspage;
	public Dashboardpage(WebDriver dr1)
	{
		driver=dr1;
		 
		PageFactory.initElements(driver,this);
	}
	
	public String verifyPageTitle()
	{
		return pagetitle.getText();
	}
	public  ProductPage clickonproductspage()
	{
		catalog.click();
		productspage.click();
		return new ProductPage(driver);
	}

}


