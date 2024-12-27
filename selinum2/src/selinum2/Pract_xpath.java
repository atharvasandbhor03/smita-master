package selinum2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com");
		
		///*******Registration
		/*
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"FirstName\"]")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//input[@name=\"LastName\"]")).sendKeys("Kutwal");
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("priyakutwal@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("Priya@k");
		driver.findElement(By.xpath("//input[@name=\"ConfirmPassword\"]")).sendKeys("Priya@k");
		driver.findElement(By.xpath("//input[@name=\"register-button\"]")).click();
		*/
		
		//*********Login
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("priyakutwal@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Priya@k");
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
		
		//*******select categories
		driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[3]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')])[3]")).click();
		
		//*********add to cart
		driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[1] ")).click();
		
		//********shopping cart
		driver.findElement(By.xpath("(//span[contains(text(),'Shopping cart')])[1]")).click();
		
		//*********terms and condition accept
		driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
		
		//*********checkout
		driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
		
		//*********billing address
		driver.findElement(By.xpath("(//input[@value=\"Continue\"])[1]")).click();
		driver.findElement(By.xpath("(//input[@value=\"Continue\"])[2]")).click();
		driver.findElement(By.xpath(" //label[contains(text(),'2nd Day Air (0.00)')]")).click();
		driver.findElement(By.xpath("(//input[@value=\"Continue\"])[3]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Cash On Delivery (COD) (7.00)')]")).click();
		driver.findElement(By.xpath("(//input[@value=\"Continue\"])[4]")).click();
		driver.findElement(By.xpath("(//input[@value=\"Continue\"])[5]")).click();
		
		//*****confirm order
		driver.findElement(By.xpath("//input[@value=\"Confirm\"]")).click();
		
		//********continue shopping
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
