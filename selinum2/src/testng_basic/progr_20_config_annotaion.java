package testng_basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class progr_20_config_annotaion {
	
	WebDriver driver1;
	static WebDriver sDriver1;

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void beforetest()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("@BeforeClass");
		driver1=new ChromeDriver();
		sDriver1=driver1;
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver1.get("https://flipkart.com");
		
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void afterclass() throws InterruptedException
	{
		System.out.println("@AfterClass");
	    Thread.sleep(3000);
		driver1.quit();
	}
	
	@AfterTest
	public void  aftertest()
	{
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("@AfterSuite");

	}

}
