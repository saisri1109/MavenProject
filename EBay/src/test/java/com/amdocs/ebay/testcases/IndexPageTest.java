package com.amdocs.ebay.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.ebay.base.BaseClass;
import com.amdocs.pageobject.IndexPage;

public class IndexPageTest extends BaseClass{
	IndexPage indexPage;
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void validateLogo() throws Throwable {
	indexPage=new IndexPage();
	boolean result=indexPage.validateLogo();
	Assert.assertTrue(result);
	}
	
	@Test
	public void verifyTitle() {
		indexPage = new IndexPage();
		String title = indexPage.getTitle();
		Assert.assertEquals(title,"Electronics, Cars, Fashion, Collectibles & More | eBay");
	}
}
