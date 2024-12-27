package selinum2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot_webelement_2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://flipkart.com/");
		
		WebElement ele=driver.findElement(By.name("q")); //for webelement screenshot no need of typecasting find element and directly take screen shot
		
		File temp=ele.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/webelement.png");
		FileHandler.copy(temp, des);
		Thread.sleep(3000);
		driver.quit();
	}

}
