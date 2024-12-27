package ConvertintoTestng;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_1_click_and_perform {
	
	@Test
	public void task() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.partialLinkText("Link"));//we can also use click() here
		Thread.sleep(3000);
		act.click(e1).perform();
	//	act.moveToElement(e1).click().perform();//two types of *one will accept click(webelement) eg.cleck(e1)*second will accept nothing eg.click()
		Thread.sleep(3000);
		driver.quit();
	}

}
