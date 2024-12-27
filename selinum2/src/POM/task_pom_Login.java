package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class task_pom_Login {

	public task_pom_Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement pass;
	@FindBy(xpath="//input[@value=\"Log in\"]")
	private WebElement logbutt;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogbutt() {
		return logbutt;
	}

	
	

}
