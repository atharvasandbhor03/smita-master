package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_with_Multiple_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(3000);
		
		
		WebDriver d1= driver.switchTo().frame(0);
		d1.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		d1.findElement(By.id("password")).sendKeys("Admin@1234");
		d1.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		
		Thread.sleep(3000);
		WebDriver d2= driver.switchTo().parentFrame().switchTo().frame(1);
		d2.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		d2.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
