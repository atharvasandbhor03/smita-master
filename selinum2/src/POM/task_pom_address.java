package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class task_pom_address {

	public task_pom_address(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value=\"Add new\"]")
	private WebElement addnewBut;
	public WebElement getAddnewBut() {
		return addnewBut;
	}
	
	
	

}
