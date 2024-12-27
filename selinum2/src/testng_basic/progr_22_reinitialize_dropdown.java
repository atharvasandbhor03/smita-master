package testng_basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class progr_22_reinitialize_dropdown {
	
	@Test
	public void demo() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/books");
		
		WebElement ele= driver.findElement(By.id("products-orderby"));
		Select sel=new Select(ele);
	List<WebElement> webele	=sel.getOptions();
		int count=webele.size();
		
		for(int i=0;i<count;i++)
		{
			 ele= driver.findElement(By.id("products-orderby"));
			 sel=new Select(ele);
			 sel.selectByIndex(i);
		}

		Thread.sleep(3000);
		driver.quit();
	}
	
}
