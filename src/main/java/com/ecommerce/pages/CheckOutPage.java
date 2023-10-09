package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ecommerce.baseutilities.BaseUtilities;

public class CheckOutPage {
	

	@FindBy(id="checkout_attribute_1")
	public static WebElement giftWrapDD;
	

	@FindBy(id="termsofservice")
	public static WebElement termsCheckBox;
	

	@FindBy(id="checkout")
	public static WebElement checkOutBtn;
	
	public CheckOutPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectWrapDD() {
		Select select=new Select(giftWrapDD);
		select.selectByIndex(1);
	}
	
	public void checkBoxAndCheckBox() {
		termsCheckBox.click();
		checkOutBtn.click();
	}

}
