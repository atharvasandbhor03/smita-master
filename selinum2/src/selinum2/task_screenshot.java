package selinum2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class task_screenshot {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-T1&gad_source=1&gclid=Cj0KCQjw-5y1BhC-ARIsAAM_oKnm2t9lTpHUGDecRB2IUmjVaw11oGyV37k6ELY3BEAhhzGwltaEtBMaAtyZEALw_wcB");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Products...']")).sendKeys("Mangos");
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ele=driver.findElement(By.xpath("//h3[text()='Mango Alphonso, Ratnagiri']"));
		Actions act=new Actions(driver);
		act.scrollToElement(ele).perform();
		driver.findElement(By.xpath("//img[@title='fresho! Mango Alphonso, Ratnagiri 6 pcs (Approx. 200g - 225g per pc)']")).click();
		Set<String> s1=driver.getWindowHandles();
		for (String string : s1) {
			System.out.println(string);
			driver.switchTo().window(string);

		}
	
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='px-1.5 w-9cursor-pointer rounded-2xs py-1.5  bg-rossoCorsa-50 relative']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/addtocart.png");
		FileHandler.copy(src, des);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
