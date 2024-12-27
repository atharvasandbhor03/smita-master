package ConvertintoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_id_and_name_method_1 {
	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		//id & name for textfield and also for button
		driver.findElement(By.name("email")).sendKeys("Priyanka@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Priya@123");
		driver.findElement(By.name("login")).click();
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
