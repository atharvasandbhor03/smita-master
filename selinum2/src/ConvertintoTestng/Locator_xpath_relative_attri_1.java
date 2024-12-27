package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_xpath_relative_attri_1 {
	
	@Test()
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class=\"_2puWtW _3a3qyb\"])[1]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class=\"QqFHMw UhdyNX M5XAsp\"]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"zDPmFV\" and @type=\"text\"]")).sendKeys("ghee");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"MJG8Up\"]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("((//img[loading=\"eager\"or @class=\"DByuf4\"])[9]")).click();
		driver.findElement(By.xpath("(//img[@height=\"24\" or @width=\"24\"])[1]")).click();
		////input[not@class="AFOXgu"]
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
