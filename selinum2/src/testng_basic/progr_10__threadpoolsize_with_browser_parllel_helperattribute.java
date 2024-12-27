package testng_basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class progr_10__threadpoolsize_with_browser_parllel_helperattribute {
	
	//@Test(invocationCount = 5,threadPoolSize = 10) //****total=five execute *******and five parllell execute
	//@Test(invocationCount = 10,threadPoolSize = 5)  //****total=Ten execute *******and five parllell execute and ******five one by one
	@Test(invocationCount = 5,threadPoolSize = 5)  //****total=five execute *******and five parllell execute
	public void face() throws InterruptedException
	{
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(3000);
		driver.quit();


	}
}
