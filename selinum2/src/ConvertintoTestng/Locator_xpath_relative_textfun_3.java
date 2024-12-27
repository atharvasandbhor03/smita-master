package ConvertintoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_xpath_relative_textfun_3 {
	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		
		driver.findElement(By.xpath("//span[text()='Home & Kitchen']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
