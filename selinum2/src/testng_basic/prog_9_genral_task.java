package testng_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prog_9_genral_task {
	
	@Test
	public void task() throws InterruptedException
	{
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("commonModal__close") ).click();
		Thread.sleep(3000);
		
		

		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Mumbai");
		Thread.sleep(3000);

		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		Thread.sleep(3000);
		
		

		driver.findElement(By.id("toCity")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("Chennai");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class=\"makeFlex appendTop12  forHideundefined\"]")).click();
		Thread.sleep(3000);
		
		
		
		
		
		//driver.findElement(By.xpath("//div[@class=\"DayPicker\"]/div/div/div/div[3]/div[3]/div[5]/div/p")).click();
		//**********Or*********
		//*************above is also correct but it is useful only for specific and below work for all general so recommended to use below*********
		
		driver.findElement(By.xpath("(//div[@class=\"DayPicker-Body\"])[1]/div/div/div/p[text()='15']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		Thread.sleep(3000);
		driver.quit();

	

		
	}

}
