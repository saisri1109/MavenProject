package com.amdocs.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.amdocs.actiondriver.Action;
import com.amdocs.ebay.base.BaseClass;

public class HomePage extends BaseClass{

	private LoginPage loginPage;
	private HomePage homePage;

	@FindBy(xpath = "//*[@id=\"gh-eb-My\"]")
	WebElement wishListButton;

	@FindBy(xpath = "//*[@id=\"gh-ac\"]")
	WebElement searchBar;

	@FindBy(xpath = "//*[@id=\"gh-f\"]/table/tbody/tr/td[3]")
	WebElement searchButton;
	
	@FindBy(xpath = "//*[@id=\"gh-minicart-hover\"]/div/a[1]")
	WebElement cartButton;

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateMyWishList() {
		return Action.isDisplayed(getDriver(), wishListButton);
	}
	

	public String getURL() {
		String currentUrl = getDriver().getCurrentUrl();
		return currentUrl;
	}

	public SearchResultPage searchProduct(String ProductName) {
		Action.type(searchBar, ProductName);
		Action.click(getDriver(), searchButton);
		return new SearchResultPage();	
	}
	
	

}
