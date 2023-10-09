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

public class PaymentInfoCBPage extends BaseUtilities {
	@FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
	public static WebElement contBtn;

	public PaymentInfoCBPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickContinue() {
		Actions action=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(contBtn));
		action.moveToElement(contBtn).click().build().perform();	
	}

}
