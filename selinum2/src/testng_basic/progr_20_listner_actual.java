package testng_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(progr_20_listner.class)
public class progr_20_listner_actual extends progr_20_config_annotaion {
	
	@Test
	public void take()
	{
		driver1.findElement(By.name("qq")).sendKeys("iphone"+Keys.ENTER);
	}

}
