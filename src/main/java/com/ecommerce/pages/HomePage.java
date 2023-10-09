package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.baseutilities.BaseUtilities;

public class HomePage extends BaseUtilities{

	@FindBy(linkText="Log in")
	public static WebElement loginBtn;
	
	@FindBy(xpath="(//ul[@class='top-menu notmobile']//a)[1]")
	public static WebElement computerBtn;
	
	@FindBy(id="small-searchterms")
	public static WebElement searchBar;
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[2]/div[2]/form/button")
	public static WebElement searchBtn;
	
	
	public HomePage(WebDriver driver) {
		
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver,this);
	}	
	
	public void clickLoginBtn() {
		loginBtn.click();	
	}
	public void search() {
		searchBar.sendKeys("notebooks");
		searchBtn.click();
	}

}
