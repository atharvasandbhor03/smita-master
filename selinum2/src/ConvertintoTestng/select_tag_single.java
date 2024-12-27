package ConvertintoTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class select_tag_single {
	
	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));

		
		Select sel=new Select(day);
		Thread.sleep(2000);
		//*****Day**********
		sel.selectByIndex(21);//by index
		Thread.sleep(3000);
		sel.selectByValue("3");//by value
		Thread.sleep(3000);
		sel.selectByVisibleText("4");//by visible Text
		Thread.sleep(3000);
		
		
		sel=new Select(month);
		Thread.sleep(2000);
		//*****Month**********
				sel.selectByIndex(11);//by index
				Thread.sleep(3000);
				sel.selectByValue("9");//by value
				Thread.sleep(3000);
				sel.selectByVisibleText("Oct");//by visible Text
				Thread.sleep(3000);
				
				sel=new Select(year);
				Thread.sleep(2000);
				//*****year**********
						sel.selectByIndex(21);//by index
						Thread.sleep(3000);
						sel.selectByValue("2020");//by value
						Thread.sleep(3000);
						sel.selectByVisibleText("2022");//by visible Text
						Thread.sleep(3000);							
				
		driver.quit();
	}
}
