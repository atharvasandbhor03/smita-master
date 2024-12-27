package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_with_Nested_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(3000);
		driver.switchTo().frame(0).switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("priyankasandbhor95");
		driver.findElement(By.id("password")).sendKeys("123");
		Thread.sleep(3000);
		driver.quit();
	}

}
