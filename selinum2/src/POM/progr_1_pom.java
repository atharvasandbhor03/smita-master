package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class progr_1_pom {

	public progr_1_pom(WebDriver driver) { // ************constructor
		PageFactory.initElements(driver, this);
	}

	
	
	// ****************************************************************
//	@FindAll({@FindBy(id="products-orderby"), @FindBy(name="products-orderby")})
//	@FindBy(id="products-orderby")//***********find element using findby
	@FindBys({ @FindBy(xpath = "//div[@class='product-sorting']"), @FindBy(id = "products-orderby") })//*********find element using findbys
	private WebElement dropdown;// *********name of element
	public WebElement getDropDown()// **********getter method
	{
		return dropdown;
	}


	
	// *******************************************************************
	@FindBy(xpath = "//img[@title=\"Show details for Computing and Internet\"]")
	private WebElement img;

	public WebElement getImg() {
		return img;
	}

}
