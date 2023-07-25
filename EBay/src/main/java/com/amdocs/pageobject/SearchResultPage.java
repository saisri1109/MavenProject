package com.amdocs.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.actiondriver.Action;
import com.amdocs.ebay.base.BaseClass;

public class SearchResultPage extends BaseClass {
	// //*[@id="item3e0324ffe6"]/div/div[1]/div/a/div
	@FindBy(xpath = "//*[@id=\"item3e0324ffe6\"]/div/div[1]/div/a/div")
	WebElement selectedProduct;
	////*[@id=\"item3e00167eb5\"]/div/div[2]/a/div/span
	public SearchResultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public ItemPage selectItem() {
	  Action.click(getDriver(), selectedProduct);
	  return new ItemPage();
	}
}
