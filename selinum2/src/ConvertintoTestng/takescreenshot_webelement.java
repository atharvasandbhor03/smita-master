package ConvertintoTestng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class takescreenshot_webelement {
	@Test
	public void abmethod() throws InterruptedException, IOException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://flipkart.com/");
	
	WebElement ele=driver.findElement(By.name("q")); //for webelement screenshot no need of typecasting find element and directly take screen shot
	
	File temp=ele.getScreenshotAs(OutputType.FILE);
	File des=new File("./screenshot/webelementtestng.png");
	FileHandler.copy(temp, des);
	Thread.sleep(3000);
	driver.quit();

}
}