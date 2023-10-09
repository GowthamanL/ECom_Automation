package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.baseutilities.BaseUtilities;
public class LoginPage extends BaseUtilities {

	@FindBy(id="Email")
	public static WebElement userName;

	@FindBy(id="Password")
	public static WebElement passWord;

	@FindBy(xpath="//button[@class='button-1 login-button']")
	public static WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		userName.sendKeys(properties.getProperty("Username"));
	
		passWord.sendKeys(properties.getProperty("Password"));
	
		loginBtn.click();
	}




}
