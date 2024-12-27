package testng_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class progr_17_HardAssert {
	
	@Test
	public void hardassert() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);

//		String title=driver.getTitle();	
//		Assert.assertNotEquals(title, "Amazon.com. Spend less. Smile more.");
//		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
//		driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]")).click();

		
//		Boolean enable=driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
//		System.out.println(enable);
//	    Assert.assertTrue(enable);
//		Assert.assertFalse(enable);
		
		
		WebElement ele=driver.findElement(By.xpath("//input[@placeholder=\"Type characters\"]"));
//		Assert.assertNull(ele);
		Assert.assertNotNull(ele);

		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	

}
