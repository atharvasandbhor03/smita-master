package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_7____hover_movetoelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act = new Actions(driver);
		WebElement ele=driver.findElement(By.partialLinkText("ELE"));
		Thread.sleep(3000);
		act.moveToElement(ele).perform();
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
