package selinum2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath_relative_textfun{

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		
		driver.findElement(By.xpath("//span[text()='Home & Kitchen']")).click();
		Thread.sleep(5000);
		driver.quit();
	
	}

}
