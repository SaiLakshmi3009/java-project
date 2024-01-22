package demo.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {	
		WebDriver driver;
		
		public  WebDriver Init()
		{
			driver=new ChromeDriver();
			driver.get("https://admin-demo.nopcommerce.com/login");
			return driver;
		}

	}

