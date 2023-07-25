package com.amdocs.ebay.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.ebay.base.BaseClass;
import com.amdocs.pageobject.HomePage;
import com.amdocs.pageobject.IndexPage;
import com.amdocs.pageobject.SearchResultPage;

public class HomePageTest extends BaseClass {
	
	HomePage homePage;
	
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
//	@AfterMethod
//	public void tearDown() {
//		getDriver().quit();
//	}
	
	@Test
	public void searchBar() {
		homePage = new HomePage();
		homePage.searchProduct(prop.getProperty("ProductName"));
        		
	}
}
