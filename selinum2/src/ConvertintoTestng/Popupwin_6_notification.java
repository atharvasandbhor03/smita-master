package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Popupwin_6_notification {
	
	@Test
	public void task() throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
