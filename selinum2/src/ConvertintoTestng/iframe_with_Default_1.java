package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframe_with_Default_1 {
	@Test
	public void task() throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
	Thread.sleep(3000);
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("username")).sendKeys("priyankasandbhor95");
	driver.findElement(By.id("password")).sendKeys("123");
	Thread.sleep(3000);
	driver.quit();
	}

}
