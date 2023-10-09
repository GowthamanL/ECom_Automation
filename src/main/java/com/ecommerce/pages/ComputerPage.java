package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.baseutilities.BaseUtilities;

public class ComputerPage extends BaseUtilities {
	
	@FindBy(xpath="(/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img")
	public static WebElement notebookBtn;
	
	@FindBy(xpath="(//img[@title='Show products in category Desktops']")
	public static WebElement desktopBtn;
	
	@FindBy(xpath="(//img[@title='Show products in category Software']")
	public static WebElement softwareBtn;
	
	public ComputerPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	public void clickNotebookBtn() {
		Actions action=new Actions(driver);
		action.moveToElement(notebookBtn).click(notebookBtn).build().perform();
	}

}
