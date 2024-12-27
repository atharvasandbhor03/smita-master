package ConvertintoTestng;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popupwin_4_upload {
	@Test
	public void task() throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/admin/Downloads/file%20(1).html");
		
		File upload=new File("./foldernamedataupload/report.xlsx");
		String s1=upload.getAbsolutePath();
		System.out.println(s1);
		
		driver.findElement(By.id("cv")).sendKeys(s1);
		Thread.sleep(3000);
		driver.quit();

	}
}
