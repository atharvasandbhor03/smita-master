package selinum2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_method {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		//id & name for textfield and also for button
		driver.findElement(By.name("email")).sendKeys("Priyanka@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Priya@123");
		driver.findElement(By.name("login")).click();
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
