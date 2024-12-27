package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor_disable_button_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//h2[text()='Oracle Database Enterprise Edition']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		driver.findElement(By.xpath("(//a[@class='license-link icn-lock'])[1]")).click();
		WebElement ele1=driver.findElement(By.xpath("//a[@class=\"download-file icn-lock\"]"));
		js.executeScript("arguments[0].click();",ele1);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
