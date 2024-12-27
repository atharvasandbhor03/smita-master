package selinum2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwin_3_authen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");/*username:admin &&&&&& pass:admin*/
		Thread.sleep(3000);
		driver.quit();
	}

}
