package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_with_NestedMultiple_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		Thread.sleep(3000);
		
		WebDriver m1=driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebDriver d1= m1.switchTo().frame(0).switchTo().frame(0);
		d1.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		
		d1.switchTo().parentFrame().switchTo().frame(1);
		Thread.sleep(3000);
		d1.findElement(By.id("password")).sendKeys("Admin@1234");
		
		d1.switchTo().parentFrame().switchTo().frame(2);
		Thread.sleep(3000);
		d1.findElement(By.id("confirm")).sendKeys("Admin@1234");
		
		d1.switchTo().parentFrame().switchTo().frame(3);
		Thread.sleep(3000);
		d1.findElement(By.id("submitButton")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
