package selinum2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class launch_all_upcast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		ChromeDriver chdriver=new ChromeDriver();
		FirefoxDriver ffdriver=new FirefoxDriver();
		EdgeDriver eddriver=new EdgeDriver(); //**********1
	
		
		
		 RemoteWebDriver redriver=new ChromeDriver();
		 redriver=new FirefoxDriver();
		 redriver=new EdgeDriver(); //*************2
		 */
		
		WebDriver webdriver=new ChromeDriver();
		webdriver=new FirefoxDriver();//****************3
		webdriver=new EdgeDriver();
		
		/*
		SearchContext search=new ChromeDriver(); //****************4
		search=FirefoxDriver();
		search=EdgeDriver();
		
			*/
	
		  
		
	}

}
