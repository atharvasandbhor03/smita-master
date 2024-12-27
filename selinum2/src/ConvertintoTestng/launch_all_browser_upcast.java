package ConvertintoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launch_all_browser_upcast {
	
	@Test
	public void launch()
	{
	WebDriver webdriver=new ChromeDriver();
	webdriver=new FirefoxDriver();//****************3
	webdriver=new EdgeDriver();
	}
}
