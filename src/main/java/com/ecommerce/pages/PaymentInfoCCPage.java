package com.ecommerce.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.baseutilities.BaseUtilities;

public class PaymentInfoCCPage extends BaseUtilities  {
	
	@FindBy(id="CreditCardType")
	public static WebElement cardType;
	@FindBy(id="CardholderName")
	public static WebElement cardHolderName;
	@FindBy(id="CardNumber")
	public static WebElement cardNumber;
	@FindBy(id="ExpireMonth")
	public static WebElement expireMonth;
	@FindBy(id="ExpireYear")
	public static WebElement expireYear;
	@FindBy(id="CardCode")
	public static WebElement cvv;
	@FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
	public static WebElement contBtn;
	
	public PaymentInfoCCPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void paymenCreditCardtInfo() {
		Select cType =new Select(cardType);
		cType.selectByVisibleText(properties.getProperty("CardType"));
		cardHolderName.sendKeys(properties.getProperty("CardHolderName"));
		cardNumber.sendKeys(properties.getProperty("CarNumber"));
		Select month=new Select(expireMonth) ;
		month.selectByVisibleText(properties.getProperty("Expiremonth"));
		Select year=new Select(expireYear) ;
		year.selectByVisibleText(properties.getProperty("ExpireYear"));
		cvv.sendKeys(properties.getProperty("CVV"));
		Actions action=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(contBtn));
		action.moveToElement(contBtn).click().build().perform();	
	
	}

}
