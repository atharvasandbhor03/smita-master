package ConvertintoTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_cssselector_4 {
@Test
public void task() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com");
	
	driver.findElement(By.cssSelector("label[for=\"pollanswers-1\"]")).click();
	Thread.sleep(3000);

	List<WebElement> e1=driver.findElements(By.cssSelector("input[type=\"button\"]"));
	Thread.sleep(3000);                                                                         
	e1.get(1).click();
	Thread.sleep(3000);
	driver.quit();	
}

}
