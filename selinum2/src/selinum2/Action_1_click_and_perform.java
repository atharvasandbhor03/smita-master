package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_1_click_and_perform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//new line added
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.partialLinkText("Link"));//we can also use click() here
		Thread.sleep(3000);
		act.moveToElement(e1).click().perform();//two types of *one will accept click(webelement) eg.cleck(e1)*second will accept nothing eg.click()
		Thread.sleep(3000);
		driver.quit();
		
		
//***********************************************************************************
		//we can also use double clik in two ways
		//*act.doubleClick(e1).perform
		//*act.moveToElement(e1).doubleClick(e1).perform




	}

}
