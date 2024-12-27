package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwin_9_calender_task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
	
	String month="September";
	String year="1995";
	int i=0;
while (true) {
	String text=driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText();
System.out.println(text);
	if(text.contains(month+" "+year))
	{
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='8']")).click();
		break;
	}
	else
	{
		driver.findElement(By.xpath("//span[text()='Prev']")).click();

	}
	i++;
}
		System.out.println(i);
		Thread.sleep(3000);
		driver.quit();
	}

}
