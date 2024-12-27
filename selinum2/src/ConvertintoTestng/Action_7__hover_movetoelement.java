package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_7__hover_movetoelement {
	
	@Test
	public void task() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act = new Actions(driver);
		WebElement ele=driver.findElement(By.partialLinkText("ELE"));
		Thread.sleep(3000);
		act.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
