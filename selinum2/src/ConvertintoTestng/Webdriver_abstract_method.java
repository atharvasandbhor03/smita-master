package ConvertintoTestng;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webdriver_abstract_method {
	@Test
	public void abmethod() throws InterruptedException
	{
	
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://amazon.com");//get method
			
			String webtitle=driver.getTitle();//gettitle method
			System.out.println(webtitle);
			
			String current_url=driver.getCurrentUrl();//getcurrenturl method
			System.out.println(current_url);
			
			String src=driver.getPageSource();
			//System.out.println(src);
			
			
			////////////////Manage().window()
			driver.manage().window().fullscreen();
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			Dimension di=driver.manage().window().getSize();
			System.out.println("Size: "+di);
			Thread.sleep(5000);
			
			Dimension di1=new Dimension(1500,1000);
			driver.manage().window().setSize(di1);
			Thread.sleep(5000);
			
			Point p1=driver.manage().window().getPosition();
			System.out.println("Position: "+p1);
			Thread.sleep(5000);
			
			Point p2=new Point(500, 300);
			driver.manage().window().setPosition(p2);
			Thread.sleep(5000);
			
			
			
			
			//driver.close();//by using this only close that page which is open by using selenium tool and only physical browser is close & task manager task still running
			Thread.sleep(10000);
			driver.quit();//to overcome limitation of close() recommended to use quit only bcz it closes tab/page that is open by using selenium tool and also tab that is manually open and task manager task also stop by using this
			
	}
}
