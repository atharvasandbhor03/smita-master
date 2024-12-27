package ConvertintoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_method_inktest_partiallinktest_2 {
	@Test
	public void task() throws InterruptedException
	{

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	
	//link_text & partial_linktext with anchor tag<a>
	driver.findElement(By.name("email")).sendKeys("Priyanka@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Priya@123");
	//driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Forgotten password?")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Cancel")).click();
	
	
	Thread.sleep(5000);
	driver.quit();
	}

}
