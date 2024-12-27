package testng_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class progr_18_SoftAssert {

	@Test
	public void softassert() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		
		String title=driver.getTitle();	
		SoftAssert soft =new SoftAssert();
		
		
//		soft.assertEquals(title, "Amazon.com");
//		soft.assertNotEquals(title,"Amazon.com.");
		
//		soft.assertNull(title);
		soft.assertNotNull(title);
		
		
//		driver.findElement(By.xpath("//input[@class=\"a-span12\"]")).click();
//		Boolean ele=driver.findElement(By.xpath("//input[@id=\"captchacharacters\"]")).isDisplayed();
		
//		soft.assertTrue(ele);
//		soft.assertFalse(ele);
		
		

		
		soft.assertAll();
		
	}
}
