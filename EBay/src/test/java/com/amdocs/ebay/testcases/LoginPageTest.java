package com.amdocs.ebay.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amdocs.actiondriver.Action;
import com.amdocs.ebay.base.BaseClass;
import com.amdocs.pageobject.HomePage;
import com.amdocs.pageobject.IndexPage;
import com.amdocs.pageobject.LoginPage;


public class LoginPageTest extends BaseClass{
	private IndexPage indexPage;
	private LoginPage loginPage;
	private HomePage homePage;

	@BeforeTest
	public void setUp() {
		launchApp();
	}

//	@AfterTest
//	public void tearDown() {
//		
//		getDriver().quit();
//	}

	@Test
	public void loginTest() throws Throwable {
		indexPage = new IndexPage();
		loginPage = new LoginPage();
		loginPage = indexPage.clickonSignIn();
	    loginPage.signIn(prop.getProperty("userName"),prop.getProperty("password"));
//	    String expectedUrl = homePage.getURL();
//	    String actualUrl=getDriver().getCurrentUrl();
//	    Assert.assertEquals(actualUrl, expectedUrl);
	}

}
