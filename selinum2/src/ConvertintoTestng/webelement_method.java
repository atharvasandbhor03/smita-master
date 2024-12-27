package ConvertintoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webelement_method {
	@Test
	public void abmethod() throws InterruptedException
	{
	
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com");
			Thread.sleep(5000);	
			
			driver.findElement(By.id("pollanswers-2")).click();//****************1
			Thread.sleep(5000);
			WebElement e1=driver.findElement(By.id("small-searchterms"));	
			e1.sendKeys("priya");//***********3
			Thread.sleep(5000);
			System.out.println("Text "+e1.getText());//**********************5
			e1.clear();//***************4
			Thread.sleep(5000);
			e1.sendKeys("priya");//***********3
			Thread.sleep(5000);
			driver.findElement(By.className("search-box-button")).submit();//************2 
			Thread.sleep(5000);

		
		
			String value=driver.findElement(By.id("As")).getAttribute("class");
			System.out.println("attribute name "+value);
			Thread.sleep(5000);

			String tagname=driver.findElement(By.id("Cid")).getTagName();
			System.out.println("tag name "+tagname);
			Thread.sleep(5000);

			String css=driver.findElement(By.id("Isc")).getCssValue("margin");
			System.out.println("css value "+css);
			Thread.sleep(5000);

			Dimension dim=driver.findElement(By.id("Sid")).getSize();
			System.out.println("height & width "+dim);
			Thread.sleep(5000);

			Point poi=driver.findElement(By.xpath("//a[@class=\"account\"]")).getLocation();
			System.out.println("X & y coor "+poi);
			Thread.sleep(5000);
			
			Rectangle rect=driver.findElement(By.className("master-wrapper-main")).getRect();
			System.out.println("rect Width : "+rect.getWidth());
			
			Boolean b1=driver.findElement(By.className("search-input")).isDisplayed();
			System.out.println("Displayed or not:- "+b1);
			
			Boolean b2=driver.findElement(By.id("As")).isSelected();
			System.out.println("selected or not:-  "+b2);
			

			Boolean b3=driver.findElement(By.id("newsletter-subscribe-button")).isEnabled();
			System.out.println("Enable or not:-  "+b3);
					
			
			Thread.sleep(5000);

			driver.quit();


}
}