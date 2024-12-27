package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class task_pom_addressdetails {

	public task_pom_addressdetails(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="Address_FirstName")
private WebElement FirstName;

@FindBy(id="Address_LastName")
private WebElement LastName;

@FindBy(id="Address_Email")
private WebElement Email;

@FindBy(id="Address_Company")
private WebElement Company;

@FindBy(id="Address_CountryId")
private WebElement CountryId;

@FindBy(id="Address_StateProvinceId")
private WebElement StateProvinceId;

@FindBy(id="Address_City")
private WebElement City;


@FindBy(id="Address_Address1")
private WebElement Address1;

@FindBy(id="Address_Address2")
private WebElement Address2;


@FindBy(id="Address_ZipPostalCode")
private WebElement ZipPostalCode;

@FindBy(id="Address_PhoneNumber")
private WebElement PhoneNumber;

@FindBy(id="Address_FaxNumber")
private WebElement FaxNumber;

@FindBy(xpath="(//input[@type=\"submit\"])[2]")
private WebElement submit;

public WebElement getFirstName() {
	return FirstName;
}

public WebElement getLastName() {
	return LastName;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getCompany() {
	return Company;
}

public WebElement getCountryId() {
	return CountryId;
}

public WebElement getStateProvinceId() {
	return StateProvinceId;
}

public WebElement getCity() {
	return City;
}

public WebElement getAddress1() {
	return Address1;
}

public WebElement getAddress2() {
	return Address2;
}

public WebElement getZipPostalCode() {
	return ZipPostalCode;
}

public WebElement getPhoneNumber() {
	return PhoneNumber;
}

public WebElement getFaxNumber() {
	return FaxNumber;
}

public WebElement getSubmit() {
	return submit;
}



}
