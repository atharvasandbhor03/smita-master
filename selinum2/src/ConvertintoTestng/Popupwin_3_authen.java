package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popupwin_3_authen {
	@Test
	public void task() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");/*username:admin &&&&&& pass:admin*/
		Thread.sleep(3000);
		driver.quit();

	}

}
