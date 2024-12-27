package selinum2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lanuch_allbrowser {

	public static void main(String[] args) {
	/*	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
*/
		ChromeDriver chdriver=new ChromeDriver();
		FirefoxDriver ffdriver=new FirefoxDriver();
		EdgeDriver eddriver=new EdgeDriver();
		
		
	}
}