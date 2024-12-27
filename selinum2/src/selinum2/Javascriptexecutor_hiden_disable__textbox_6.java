package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor_hiden_disable__textbox_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		WebElement scrolltillele=driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",scrolltillele);

		Thread.sleep(3000);
		driver.findElement(By.id("hide-textbox")).click();
        Thread.sleep(3000);
		WebElement textbox=driver.findElement(By.name("show-hide"));
		js.executeScript("arguments[0].value='Hello world';",textbox);
		Thread.sleep(3000);

		
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(3000);


		Thread.sleep(3000);
		driver.quit();
	}

}
