package testng_basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class progr_11_threadpoolsize_parllel__threadcount_with_class_amazon {
	@Test
	public void amazon() throws InterruptedException
	{
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com/");
		
		
		Thread.sleep(3000);
		driver.quit();


	}
}
