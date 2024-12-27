package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_6__movetolocation_or_movebyoffset {

	@Test
	public void task() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://flipkart.com");
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		Point p1= driver.findElement(By.xpath("//span[text()='Login']")).getLocation();
		//act.moveByOffset(p1.getX(), p1.getY()).perform();
		//or
		act.moveToLocation(p1.getX(), p1.getY()).perform();
		
		Thread.sleep(3000);
		driver.quit();

	}
}
