package testng_basic;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class progr_12_parameter_and_read_data_from_xmltestng {
	//@Parameters({"URL","SEARCH"})
	@Test
	public void demo(String url,String search) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys(search+Keys.ENTER);
		System.out.println("Mango");
		Thread.sleep(3000);
		//driver.quit();
	}

}
