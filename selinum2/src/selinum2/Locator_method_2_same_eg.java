package selinum2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_method_2_same_eg {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		
		
		driver.findElement(By.partialLinkText("Books")).click();
		//OR
		//	driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("health book");
		driver.findElement(By.className("search-box-button")).click();

	
		
		Thread.sleep(5000);
		driver.quit();
	}

}
