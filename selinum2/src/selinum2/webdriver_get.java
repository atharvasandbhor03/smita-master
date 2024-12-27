package selinum2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriver_get {

	public static void main(String[] args) {
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
