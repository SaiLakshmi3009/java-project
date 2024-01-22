package demo.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class loginpage extends baseclass{

		WebDriver driver;
		
		public loginpage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="Email") WebElement uname;
		@FindBy(id="Password") WebElement pass;
		@FindBy (xpath="//button[@type='submit']") WebElement btn;
		
		public Dashboardpage login(String username,String password)
		{
			uname.clear();
			uname.sendKeys(username);
			pass.clear();
			pass.sendKeys(password);
			btn.click();
			return new Dashboardpage(driver);
			
		}
		
		
	}

