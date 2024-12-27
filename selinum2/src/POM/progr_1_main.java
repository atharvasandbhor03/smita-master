package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class progr_1_main {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/books");
		Thread.sleep(3000);
		
		
		/** few steps **/
		progr_1_pom p1=new progr_1_pom(driver);//*** step1===object creation
		WebElement ddele= p1.getDropDown();      //****step2===access web element
		Select sel=new Select(ddele);            //****step3===Use select class bcz drop down
		List<WebElement> e1=sel.getOptions();  	//****step4===get all options from drop drown
		for (int i = 0; i <e1.size(); i++) {
			sel.selectByIndex(i);  				//****step5===select all element one by one and set

		}
		
	
		
		WebElement imgele=p1.getImg();
		imgele.click();
	
		Thread.sleep(3000);
		driver.quit();

																																											
	}

}
