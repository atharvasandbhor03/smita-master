package ConvertintoTestng;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popupwin_2_Hidden {
	@Test
	public void task() throws InterruptedException, AWTException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		
		/*Hidden*/
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9527710027");
		driver.findElement(By.xpath("//button[@class='capText font16']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
