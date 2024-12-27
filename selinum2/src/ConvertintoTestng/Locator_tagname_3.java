package ConvertintoTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_tagname_3 {
	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		String text=driver.findElement(By.tagName("a")).getText();//action 1 findelement
		System.out.println("text : "+text);
		Thread.sleep(5000);

		List<WebElement> e1=driver.findElements(By.tagName("a"));     //action 2 findelements
		
		for (WebElement webElement : e1) {       //action 2.a
			System.out.println("element "+webElement.getText());
		}
		Thread.sleep(5000);

		e1.get(15).click();      //action 2.b
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
