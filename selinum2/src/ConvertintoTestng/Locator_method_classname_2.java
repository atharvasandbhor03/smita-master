package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_method_classname_2 {

	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.partialLinkText("Books")).click();
		//OR
		//	driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("health book");
		driver.findElement(By.className("search-box-button")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
