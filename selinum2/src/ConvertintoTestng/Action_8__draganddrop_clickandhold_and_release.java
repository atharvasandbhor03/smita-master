package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_8__draganddrop_clickandhold_and_release {

	@Test
	public void task() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement src=driver.findElement(By.id("box6"));
		WebElement des= driver.findElement(By.id("box101"));
		Thread.sleep(3000);
		
		act.clickAndHold(src).perform();
		Thread.sleep(3000);
		
		act.release(des).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
