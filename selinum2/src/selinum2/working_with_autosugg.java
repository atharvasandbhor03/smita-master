package selinum2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_autosugg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://google.com");
		
		driver.findElement(By.className("gLFyf")).sendKeys("seleinum");
		Thread.sleep(5000);
		List<WebElement> e1= driver.findElements(By.className("wM6W7d"));
		//System.out.println(e1);
		//e1.get(6).click();
		Thread.sleep(3000);

		for(WebElement ele : e1) {
			System.out.println(ele.getText());
		}
		e1.get(5).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
