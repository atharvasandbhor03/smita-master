package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class task_pom_welcome {

	public task_pom_welcome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Log in")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	

}
