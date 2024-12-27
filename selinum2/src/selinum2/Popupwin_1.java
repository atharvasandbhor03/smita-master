package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwin_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		/*Alert*/
		driver.findElement(By.xpath("//button[contains(text(),'    click the button to display an  alert box:')]")).click();
		Thread.sleep(3000);
		String text1=driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().accept();

		/*Confirmation*/
		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath(" //button[contains(text(),'click the button to display a confirm box')]")).click();
		 String text2=driver.switchTo().alert().getText();
		System.out.println(text2);
		driver.switchTo().alert().dismiss();

		
		/*Prompt*/
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		driver.switchTo().alert().sendKeys("qspider");
		String text3=driver.switchTo().alert().getText();
		System.out.println(text3);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
