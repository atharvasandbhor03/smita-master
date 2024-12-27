package ConvertintoTestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launch_all_browser {
	@Test
	public void launch()
	{
		
	ChromeDriver chdriver=new ChromeDriver();
	FirefoxDriver ffdriver=new FirefoxDriver();
	EdgeDriver eddriver=new EdgeDriver();
	
	}

}
