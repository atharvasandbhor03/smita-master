package testng_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class progr_13_crossBrowser_External_ip_xml {
	WebDriver driver;

	
	@Parameters({"browserName"})
	@Test
	public void cross(String browser ) throws InterruptedException
	{
		if(browser.toLowerCase().contains("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.toLowerCase().contains("firefox")) {
			driver=new FirefoxDriver();
		}
		else if (browser.toLowerCase().contains("edge")) {
			driver=new EdgeDriver();
		}
		else  {
			System.out.println("enter valid");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.id("email")).sendKeys("qsp@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("qsp@1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
;		
		
	}

}
