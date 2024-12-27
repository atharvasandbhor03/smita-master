package testng_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class prog_7_Log_assignment {
	@Test
	public void insta() throws InterruptedException
	{
		
		System.out.println("Instagram");
		
		Reporter.log("Hello");
		Reporter.log("By",false);
		Reporter.log("Hii",true);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("qsp@gmail.com");
		driver.findElement(By.name("password")).sendKeys("qsp@1234");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		Thread.sleep(3000);
		driver.quit();


	}

}
