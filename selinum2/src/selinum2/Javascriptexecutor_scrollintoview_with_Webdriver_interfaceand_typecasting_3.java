package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javascriptexecutor_scrollintoview_with_Webdriver_interfaceand_typecasting_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.meesho.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(6000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");//this for to scroll till last
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//h4[text()='Products For You']"));	
		//js.executeScript("arguments[0].scrollIntoView(true);",ele);
//or
		js.executeScript("arguments[0].scrollIntoView(false);",ele);
		Thread.sleep(3000);
		driver.quit();
	}

}
