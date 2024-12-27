package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_3_contextclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		
		WebElement e2 = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		act.doubleClick(e2).perform();//two types of *one will accept click(webelement) eg.cleck(e1)*second will accept nothing eg.click()
		Thread.sleep(5000);
//manully click on alert ok 
		
		WebElement e3= driver.findElement(By.xpath("//span[text()=\'right click me\']"));
		
		act.contextClick(e3).perform();
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
