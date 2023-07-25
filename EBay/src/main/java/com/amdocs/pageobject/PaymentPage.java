package com.amdocs.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.actiondriver.Action;
import com.amdocs.ebay.base.BaseClass;
public class PaymentPage extends BaseClass{

	@FindBy(xpath = "//*[@id=\"payment-selection-fieldset\"]/div[2]/div[1]/label/div/span/span")
	WebElement paymentSection;
	
	@FindBy(xpath = "//*[@id=\"page-form\"]/div/button/span[2]")
	WebElement procedtoPayment; 
	
	public PaymentPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void paymentSection() {
		Action.click(getDriver(), paymentSection);
		Action.click(getDriver(), procedtoPayment);
		
	}
}
