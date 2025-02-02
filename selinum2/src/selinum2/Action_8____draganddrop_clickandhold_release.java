package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_8____draganddrop_clickandhold_release {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);

		WebElement src=driver.findElement(By.id("box6"));
		WebElement des= driver.findElement(By.id("box101"));
		Thread.sleep(3000);

		act.clickAndHold(src).perform();
		Thread.sleep(3000);
		act.release(des).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
