package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.baseutilities.BaseUtilities;

public class ShippingMethodPage extends BaseUtilities {


	@FindBy(id="shippingoption_1")
	public static WebElement nextdayAirBtn;
	@FindBy(id="shippingoption_2")
	public static WebElement secondDayBtn;
	@FindBy(xpath="//*[@id='shipping-method-buttons-container']/button")
	public static WebElement continueButton;



	public ShippingMethodPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickAirBtnAndCont() {
		nextdayAirBtn.click();
		Actions action=new Actions(driver);
		action.moveToElement(continueButton).click().build().perform();	
	}
	public void secondBtnAndCont() {
		secondDayBtn.click();
		Actions action=new Actions(driver);
		action.moveToElement(continueButton).click().build().perform();	
	}

}
