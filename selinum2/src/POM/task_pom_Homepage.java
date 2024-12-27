package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class task_pom_Homepage {

	public task_pom_Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(partialLinkText = "Addresses")
	private WebElement add;

	public WebElement getAdd() {
		return add;
	}
	

}
