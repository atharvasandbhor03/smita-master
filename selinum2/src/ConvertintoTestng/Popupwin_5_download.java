package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Popupwin_5_download {
	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/downloads/");
		//driver.findElement(By.xpath("//p[text()='Java']/../p[2]/a")).click();
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//p[@class='card-title fw-bold h6']/../p[2]/a"));
		act.scrollToElement(ele).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
