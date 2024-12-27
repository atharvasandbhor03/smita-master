package selinum2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot_webpage_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://flipkart.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;//for webpage screenshot typecasting is required then take screen shot
		
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		//File des=new File("./screenshot/first.png");

		File des=new File("./screenshot/webpage.png");
		FileHandler.copy(temp, des);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
