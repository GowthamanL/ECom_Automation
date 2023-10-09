package com.ecommerce.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.baseutilities.BaseUtilities;
import com.ecommerce.pages.BillingAddressPage;
import com.ecommerce.pages.CheckOutPage;
import com.ecommerce.pages.GuestPage;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.pages.OrderConfirmationPage;
import com.ecommerce.pages.OrderNumberPage;
import com.ecommerce.pages.PaymentInfoCBPage;
import com.ecommerce.pages.PaymentMethodPage;
import com.ecommerce.pages.ProductsPage;
import com.ecommerce.pages.ShippingMethodPage;

public class PlaceOrderTest extends BaseUtilities {

	private HomePage homePage;
	private LoginPage loginPage;
	private ProductsPage productsPage;
	private CheckOutPage checkOutPage;
	private GuestPage guestPage;
	private BillingAddressPage billingAddressPage;
	private ShippingMethodPage shippingMethodPage;
	private PaymentMethodPage paymentMethodPage;
	private PaymentInfoCBPage paymentInfoCBPage;
	private OrderConfirmationPage orderConfirmationPage;
	private OrderNumberPage orderNumberPage;



	@BeforeMethod
	public void setup() {

		homePage = new HomePage(driver);
		loginPage=new LoginPage(driver);
		productsPage = new ProductsPage(driver);
		checkOutPage = new CheckOutPage(driver);
		guestPage = new GuestPage(driver);
		billingAddressPage =new BillingAddressPage(driver);
		shippingMethodPage= new ShippingMethodPage(driver);
		paymentMethodPage = new PaymentMethodPage(driver);
		paymentInfoCBPage=new PaymentInfoCBPage(driver);
		orderConfirmationPage = new OrderConfirmationPage(driver);
		orderNumberPage=new OrderNumberPage(driver);
	}

	@Test
	public void checkOut() {

		homePage.clickLoginBtn();
		loginPage.login();
		homePage.search();
		productsPage.clickProduct();
		checkOutPage.selectWrapDD();
		checkOutPage.checkBoxAndCheckBox();
		guestPage.guestBtn();
		billingAddressPage.fillDetails();
		shippingMethodPage.secondBtnAndCont();
		paymentMethodPage.continuBtn();
		paymentInfoCBPage.clickContinue();
		orderConfirmationPage.clickContinue();
		orderNumberPage.printOrderNum();
	}


}
