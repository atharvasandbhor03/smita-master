package selinum2;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mock3 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter url you wantto close");
		String str=sc.next();
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(6000);
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(6000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(6000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");//this for to scroll till last 
		Thread.sleep(6000);

		//WebElement ele=driver.findElement(By.xpath("//img[@alt=\"blushis Liquid Matte Lipsticks Combo\"]"));
	
		/*// WebElement ele= driver.findElement(By.xpath("//span[text()='blushis Liquid Matte Lipsticks Combo']"));
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView(false);",ele);
		*/
	
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		//act.scrollToElement(ele).click().perform();
		Thread.sleep(3000);
		act.scrollByAmount(0, 500);
		Thread.sleep(3000);

		//act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//img[@alt=\"blushis Liquid Matte Lipsticks Combo\"]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[name()='svg'])[7]")).click();
		
		Set<String> ids=driver.getWindowHandles();
		
		for (String string : ids) {
		
			driver.switchTo().window(string);
			String currentclose=driver.getCurrentUrl();
			if(currentclose.contains(str))
			{
				driver.close();
				break;
			}
			
		}
	//	Thread.sleep(6000);
	//	driver.quit();
	}

}
