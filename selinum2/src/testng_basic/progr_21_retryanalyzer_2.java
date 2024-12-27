package testng_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class progr_21_retryanalyzer_2 extends progr_20_config_annotaion {
	@Test(retryAnalyzer =progr_21_retryanalyzer.class)
	public void demo()
	{
		driver1.findElement(By.name("qq")).sendKeys("iphone"+Keys.ENTER);

	}
	

}
