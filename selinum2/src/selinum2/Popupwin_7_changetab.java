package selinum2;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class Popupwin_7_changetab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://flipkart.com");/*username:admin &&&&&& pass:admin*/
		//driver.getSessionId();
		
		String id=driver.getWindowHandle();
		
		System.out.println(id);
		/*
		Set<String> ids=driver.getWindowHandles();
				for (String string : ids) {
		
						System.out.println(ids);

				}*/
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone"+Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
		Thread.sleep(3000);
		
		Set<String> idss=driver.getWindowHandles();
		for (String string : idss) {
			
			System.out.println(idss);
			driver.switchTo().window(string);

		}
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
