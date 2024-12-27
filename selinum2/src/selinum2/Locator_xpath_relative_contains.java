package selinum2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath_relative_contains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");	
		driver.findElement(By.xpath("(//span[contains(text(),'Become')])[1]")).click();//text()
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(@href,\"#create\")])[1]")).click();//an,av
		Thread.sleep(5000);
		driver.quit();
	

	}

}
