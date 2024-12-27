package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_3_contextclick {
	
	@Test
	public void task() throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions act = new Actions(driver);
		Thread.sleep(3000);
		
		WebElement e2 = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		act.doubleClick(e2).perform();
		Thread.sleep(5000);

		driver.switchTo().alert().accept();
		Thread.sleep(5000);
				
		WebElement e3= driver.findElement(By.xpath("//span[text()=\'right click me\']"));
		act.contextClick(e3).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
