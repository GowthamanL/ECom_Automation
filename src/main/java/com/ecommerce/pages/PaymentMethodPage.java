package com.ecommerce.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.baseutilities.BaseUtilities;

public class PaymentMethodPage extends BaseUtilities {
	
	@FindBy(id="paymentmethod_1")
	public static WebElement ccBtn;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")
	public static WebElement continueBtn;
	
	public PaymentMethodPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void creditCardBtn() {
		ccBtn.click();
		continueBtn.click();
	}
	public void continuBtn() {
		Actions action=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
		action.moveToElement(continueBtn).click().build().perform();	
	}
}
