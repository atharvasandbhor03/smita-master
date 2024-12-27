package selinum2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mock_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/admin/Desktop/MTR.html");
		WebElement ele=driver.findElement(By.id("mtr"));
		Select sel=new Select(ele);
		List<WebElement> alloptions=sel.getOptions();
		
		Set<String> str =new HashSet<String>();
		
		for (WebElement webElement : alloptions) {
			str.add(webElement.getText() );
		}
		System.out.println();
		System.out.println("*********after removel of duplicates **********");
		for (String string : str) {
			System.out.println(string);
		}
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
