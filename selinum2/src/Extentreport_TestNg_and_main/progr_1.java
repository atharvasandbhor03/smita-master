package Extentreport_TestNg_and_main;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class progr_1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ExtentSparkReporter spark=new ExtentSparkReporter("./ExtentReport/login.html");
		ExtentReports repoters=new ExtentReports();
		repoters.attachReporter(spark);
		ExtentTest test=repoters.createTest("Login page");
		
		
		WebDriver driver=new ChromeDriver(); test.log(Status.INFO, "Lanunch Browser successfully");
		driver.manage().window().maximize(); test.log(Status.INFO, "window mazimized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.facebook.com"); test.log(Status.INFO, "Navigate Successfully");
		
		driver.findElement(By.id("email")).sendKeys("priyanka@gmail.com");  test.log(Status.PASS, "Enter email id");
		driver.findElement(By.id("pass")).sendKeys("priyanka@123");   test.log(Status.PASS, "Enter password");
		driver.findElement(By.name("login")).click();  test.log(Status.PASS, "login successfully");
		
		
		String path="./screenshot/extent_login.png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileHandler.copy(temp, dest);
		test.addScreenCaptureFromPath("."+path);

		repoters.flush();
		Thread.sleep(3000);
		driver.quit();
		}

}
