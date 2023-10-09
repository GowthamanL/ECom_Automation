package com.ecommerce.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.baseutilities.BaseUtilities;

public class OrderNumberPage extends BaseUtilities {
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[1]")
	public static WebElement orderNum;
	@FindBy(xpath="//button[@class='button-1 order-completed-continue-button']")
	public static WebElement contBtn;
	
	public OrderNumberPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void printOrderNum() {

		String num=orderNum.getText();
		System.out.println(num);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(contBtn));
		contBtn.click();
	}
	

}
