package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.baseutilities.BaseUtilities;

public class ProductsPage extends BaseUtilities {

	@FindBy(xpath="//div[@class='item-box']")
	public static List<WebElement> products;

	@FindBy(xpath="//li[@id='topcartlink']/a")
	public static WebElement shoppingCartBtn;

	public ProductsPage(WebDriver driver) {
		BaseUtilities.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickProduct() {
		for (WebElement product : products) {
			WebElement productTitle=product.findElement(By.xpath(".//h2[@class='product-title']/a"));
			String title=productTitle.getText();
			if (title.equalsIgnoreCase(properties.getProperty("ProductName"))) {
				WebElement addToCartBtn=product.findElement(By.xpath(".//button[@class='button-2 product-box-add-to-cart-button']"));
				addToCartBtn.click();
			}
		}	
		shoppingCartBtn.click();
	}
	
}
