package ConvertintoTestng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robotclass_with_hw {
	@Test
	public void task() throws InterruptedException, AWTException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("gender-female")).click();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		
		robo.keyPress(KeyEvent.VK_P);
		robo.keyPress(KeyEvent.VK_R);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_Y);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyPress(KeyEvent.VK_K);
		robo.keyPress(KeyEvent.VK_A);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent.VK_S);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyPress(KeyEvent.VK_B);
		robo.keyPress(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_R);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent.VK_P);
		robo.keyPress(KeyEvent.VK_R);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_Y);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_2);
	    robo.keyRelease(KeyEvent.VK_2);
		robo.keyRelease(KeyEvent.VK_SHIFT);
	    robo.keyPress(KeyEvent.VK_G);
		robo.keyPress(KeyEvent.VK_M);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_L);
		robo.keyPress(KeyEvent.VK_DECIMAL);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_M);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_P);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_R);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_Y);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_2);
	   // robo.keyRelease(KeyEvent.VK_2);
		robo.keyRelease(KeyEvent.VK_SHIFT);
	    robo.keyPress(KeyEvent.VK_1);
		robo.keyPress(KeyEvent.VK_2);
		robo.keyPress(KeyEvent.VK_3);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_P);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_R);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_Y);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_2);
	  //  robo.keyRelease(KeyEvent.VK_2);
		robo.keyRelease(KeyEvent.VK_SHIFT);
	    robo.keyPress(KeyEvent.VK_1);
		robo.keyPress(KeyEvent.VK_2);
		robo.keyPress(KeyEvent.VK_3);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
	    
		robo.keyPress(KeyEvent.VK_ENTER);
		//robo.keyRelease(KeyEvent.VK_ENTER);

		
		Thread.sleep(6000);
		driver.quit();
	}

}
