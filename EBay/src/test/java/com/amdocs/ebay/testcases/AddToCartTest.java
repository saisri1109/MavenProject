package com.amdocs.ebay.testcases;

import javax.naming.directory.SearchResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.actiondriver.Action;
import com.amdocs.ebay.base.BaseClass;
import com.amdocs.pageobject.AddToCartPage;
import com.amdocs.pageobject.HomePage;
import com.amdocs.pageobject.IndexPage;
import com.amdocs.pageobject.ItemPage;
import com.amdocs.pageobject.LoginPage;
import com.amdocs.pageobject.SearchResultPage;


public class AddToCartTest extends BaseClass{
	
	HomePage homePage;
	SearchResultPage searchResultPage;
    ItemPage itemPage;
    AddToCartPage addToCartPage;
    
//    public  AddToCartTest() {
//    	
//    }
    
    @BeforeMethod
    public void setUp() {
    	launchApp();
    }
    
//    @AfterMethod
//    public void tearDown() {
//    	getDriver().quit();
//    }
    
    @Test
    public void addToCartTest() throws Throwable {
    
    	homePage=new HomePage();
    	addToCartPage = new AddToCartPage();
    	itemPage = new ItemPage();
    	searchResultPage = new SearchResultPage();
    	
    	homePage.searchProduct(prop.getProperty("ProductName"));
    	searchResultPage.selectItem();
     
    	Action.launchNewWindow(getDriver());
     
    	itemPage.addToCart();
    	addToCartPage.checkOutPage();
    }
    
}
