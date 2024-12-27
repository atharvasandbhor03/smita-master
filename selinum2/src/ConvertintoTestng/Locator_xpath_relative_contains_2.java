package ConvertintoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_xpath_relative_contains_2 {
	
	@Test()
	public void task() throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");	
		driver.findElement(By.xpath("(//span[contains(text(),'Become')])[1]")).click();//text()
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(@href,\"#create\")])[1]")).click();//an,av
		Thread.sleep(5000);
		driver.quit();

	}

}
