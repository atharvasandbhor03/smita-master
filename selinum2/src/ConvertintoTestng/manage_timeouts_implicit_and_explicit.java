package ConvertintoTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class manage_timeouts_implicit_and_explicit {

	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/login");
		
		//implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.partialLinkText("Forgot password?")).click();
		
		//explicit
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));//in old -only sec is work//in latest version explisit wait has to do some changes
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("forgot_password_input")));
		
		driver.findElement(By.name("forgot_password_input")).sendKeys("priyanka@gmail.com");
		Thread.sleep(3000);
		driver.quit();
	}
}
