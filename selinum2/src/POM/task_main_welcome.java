package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task_main_welcome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com");
	//	*********************************************************************
		task_pom_welcome wel=new task_pom_welcome(driver);
		WebElement w1= wel.getLogin();
		w1.click();
	//	*********************************************************************
		task_pom_Login logcred=new task_pom_Login(driver);
		WebElement email=logcred.getEmail();
		email.sendKeys("priyakutwal@gmail.com");
		
		WebElement pass=logcred.getPass();
		pass.sendKeys("Priya@k");
		
		WebElement logbu=logcred.getLogbutt();
		logbu.click();
	//	***********************************************************************
		Actions act=new Actions(driver);
	//*****************************************************************************	
		task_pom_Homepage home=new task_pom_Homepage(driver);
		WebElement add= home.getAdd();
		act.scrollToElement(add).perform();
		Thread.sleep(2000);
		act.click(add).perform();
	//	***********************************************************************
		task_pom_address addresspage=new task_pom_address(driver);
		act.click(addresspage.getAddnewBut()).perform();
		
	//***************************************************************************
		task_pom_addressdetails fin=new task_pom_addressdetails(driver);
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
