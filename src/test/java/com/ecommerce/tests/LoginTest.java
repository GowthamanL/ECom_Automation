package com.ecommerce.tests;

import org.testng.annotations.Test;

import com.ecommerce.baseutilities.BaseUtilities;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.LoginPage;

public class LoginTest extends BaseUtilities {
	
	@Test
	public void login() {
		
		HomePage hp=new HomePage(driver);
		hp.clickLoginBtn();
		
		LoginPage login=new LoginPage(driver);
		login.login();
		
	}

}
