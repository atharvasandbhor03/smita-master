package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_6____movetolocation_or_movebyoffset {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://flipkart.com");
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		Point p1= driver.findElement(By.xpath("//span[text()='Login']")).getLocation();

		//act.moveByOffset(p1.getX(),p1.getY()).perform();
		//or
        act.moveToLocation(p1.getX(), p1.getY()).click().perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
