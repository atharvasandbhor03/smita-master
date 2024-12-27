package ConvertintoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Webdriver_get {
	
	@Test
	public void abmethod() throws InterruptedException
	{
	
	
	// TODO Auto-generated method stub
	
			/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");*/
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com");
			
			driver=new FirefoxDriver();
			driver.get("https://www.flipkart.com");
			
			driver=new EdgeDriver();
			driver.get("https://www.meesho.com ");
			

}
}