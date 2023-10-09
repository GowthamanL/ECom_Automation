package com.ecommerce.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.baseutilities.BaseUtilities;

public class OrderConfirmationPage extends BaseUtilities {

	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")
	public static WebElement confirmBtn;

	public OrderConfirmationPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void clickContinue() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(confirmBtn));
		confirmBtn.click();
		
	}
}
