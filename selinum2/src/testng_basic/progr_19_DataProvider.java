package testng_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class progr_19_DataProvider {

	@DataProvider(name="data")//*************connection
	public Object[][] demo()
	{
		Object [][] d1=new Object[2][2];
		
		d1[0][0]="priya@gmail.com";
		d1[0][1]="priya@123";
		
		d1[1][0]="sona@gmail.com";
		d1[1][1]="sona@123";

		return d1;
	}
	
	@Test(dataProvider = "data")//*****************connection between array and function
	public void task(String email,String pass) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	
		Thread.sleep(3000);
		driver.quit();

	}
	
}
