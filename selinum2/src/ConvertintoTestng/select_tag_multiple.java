package ConvertintoTestng;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class select_tag_multiple {
	@Test
	public void task() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/admin/Desktop/mul.html");

		WebElement web=driver.findElement(By.name("fruits"));
		Thread.sleep(3000);
		
		Select sel=new Select(web);
		
		sel.selectByIndex(3);/////**************select by Index
		Thread.sleep(3000);

		sel.selectByValue("orange");/////**********select by value
		Thread.sleep(3000);

		sel.selectByVisibleText("Apple");/////**********select by visible text
		Thread.sleep(3000);

		sel.deselectAll();/////*************** deselect all
		Thread.sleep(3000);

		sel.selectByIndex(3);
		Thread.sleep(3000);

		sel.selectByValue("orange");
		Thread.sleep(3000);

		sel.selectByVisibleText("Apple");
		Thread.sleep(3000);

		sel.deselectByIndex(3);//**********************deselect by index
		Thread.sleep(3000);
		
		sel.deselectByVisibleText("Apple");//////**************deselect by visibletext
		Thread.sleep(3000);
		
		sel.deselectByValue("orange");///////***********deselect by value
		Thread.sleep(3000);

		Boolean multBoolean=sel.isMultiple();/////////*******check dropdown is single select or multi select
		System.out.println(multBoolean);
		
		System.out.println("***********************");
		sel.selectByIndex(3);
		Thread.sleep(3000);

		sel.selectByValue("orange");
		Thread.sleep(3000);

		sel.selectByVisibleText("Apple");
		Thread.sleep(3000);
		
		WebElement first=sel.getFirstSelectedOption();///******************get first selected from top down approch
		System.out.println(first.getText());
		Thread.sleep(3000);

		System.out.println("******************");

		List<WebElement> all= sel.getAllSelectedOptions();////********get all selected from top down approach
		for (WebElement webElement : all) {
			System.out.println(webElement.getText());
		}
		
		System.out.println("*******************");
		Thread.sleep(3000);

		List<WebElement> alloptions=sel.getOptions();////************get all available options
		for(int i=0;i<alloptions.size();i++)
		{
			System.out.println(alloptions.get(i).getText() );
		}
		System.out.println("******************");

		Thread.sleep(3000);
		driver.quit();
	}

}
