package com.amdocs.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.actiondriver.Action;
import com.amdocs.ebay.base.BaseClass;

public class ItemPage extends BaseClass{
	// //*[@id="item3e0324ffe6"]/div/div[1]/div/a/div
	@FindBy(xpath ="//*[@id=\"binBtn_btn_1\"]/span" )
	WebElement buyItKnowButton;

	@FindBy(xpath = "//*[@id=\"mainContent\"]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a/span/span")
	WebElement addToCartButton;

	@FindBy(xpath = "//*[@id=\"vi-atl-lnk-99\"]/a" )
	WebElement addTowishListButton;

	public ItemPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public AddToCartPage addToCart() {
		Action.click(getDriver(), addToCartButton);
		return new AddToCartPage();
	}

//	public AddToWishListPage addToWishList() {
//		Action.click(getDriver(), addTowishListButton);
//		return new AddToWishListPage();
//	}

//	public BuyItNowPage buyItNow() {
//		Action.click(getDriver(), buyItKnowButton);
//		return new BuyItNowPage();
//	}
   
}
