package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ecommerce.baseutilities.BaseUtilities;

public class BillingAddressPage extends BaseUtilities {

	@FindBy(id="BillingNewAddress_FirstName")
	public static WebElement firstName;
	@FindBy(id="BillingNewAddress_LastName")
	public static WebElement lastName;
	@FindBy(id="BillingNewAddress_Email")
	public static WebElement eMail;
	@FindBy(id="BillingNewAddress_CountryId")
	public static WebElement country;
	@FindBy(id="BillingNewAddress_StateProvinceId")
	public static WebElement state;
	@FindBy(id="BillingNewAddress_City")
	public static WebElement city;
	@FindBy(id="BillingNewAddress_Address1")
	public static WebElement address1;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	public static WebElement zipCode;
	@FindBy(id="BillingNewAddress_PhoneNumber")
	public static WebElement mobileNumber;
	@FindBy(xpath="//*[@id='billing-buttons-container']/button[4]")
	public static WebElement continueBtn;

	public BillingAddressPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void fillDetails() {
		firstName.sendKeys(properties.getProperty("FirstName"));
		lastName.sendKeys(properties.getProperty("LastName"));
		eMail.clear();
		eMail.sendKeys(properties.getProperty("Email"));
		Select select=new Select(country);
		select.selectByVisibleText(properties.getProperty("Country"));
		city.sendKeys(properties.getProperty("City"));
		address1.sendKeys(properties.getProperty("Address"));
		zipCode.sendKeys(properties.getProperty("ZipCode"));
		mobileNumber.sendKeys(properties.getProperty("PhoneNumber"));
		continueBtn.click();
	}

}
