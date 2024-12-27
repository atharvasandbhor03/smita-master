package testng_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class progr_19_1_DataProvider {

	@DataProvider(name="login")
	public String[][] demo()
	{
		String[][] str= {{"priya@gmail.com","priya@123"},{"netra@gmail.com","netra@123"}};
		return str;
	}
	
	@Test(dataProvider = "login")
	public void demo(String[] fb) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys(fb[0]);
		driver.findElement(By.id("pass")).sendKeys(fb[1]);
		driver.findElement(By.name("login")).click();
	
		Thread.sleep(3000);
		driver.quit();

	}
}
