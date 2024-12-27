package selinum2;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath_absolute {
	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div/div/div[2]/div/div[2]/label")).click();//gender
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Priyanka");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Sandbhor");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("priyankasandbhor@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("Priyanka@123");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("Priyanka@123");
		                            
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
