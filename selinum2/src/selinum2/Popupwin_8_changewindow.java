package selinum2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwin_8_changewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://secure.indeed.com/");
		//driver.getSessionId();
		
		String id=driver.getWindowHandle();
		System.out.println(id);
		System.out.println();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> ids=driver.getWindowHandles();
		for (String string : ids) {
			System.out.println(string);
			driver.switchTo().window(string);
		}
	
		driver.findElement(By.id("account_name_text_field")).sendKeys("Qsp@.com");
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
