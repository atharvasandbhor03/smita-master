package selinum2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_method_2 {

		
		public static void main(String[] args)throws InterruptedException {
			// TODO Auto-generated method stub
			
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://facebook.com");
			
			//link_text & partial_linktext with anchor tag<a>
			driver.findElement(By.name("email")).sendKeys("Priyanka@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Priya@123");
			//driver.findElement(By.name("login")).click();
			
			driver.findElement(By.linkText("Forgotten password?")).click();
			Thread.sleep(5000);
			driver.findElement(By.partialLinkText("Cancel")).click();
			
			
			Thread.sleep(5000);
			driver.quit();
			
			
			
			

			

	}

}
