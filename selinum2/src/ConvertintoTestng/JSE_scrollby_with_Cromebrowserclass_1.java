package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSE_scrollby_with_Cromebrowserclass_1 {
	@Test
	public void task() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://amazon.com/");
		
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollBy(0,500);");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
