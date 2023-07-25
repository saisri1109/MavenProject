package com.amdocs.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.actiondriver.Action;
import com.amdocs.ebay.base.BaseClass;

public class SignUp extends BaseClass {
	
	
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div[3]/div/div[2]/div/div/fieldset/span[1]/span[1]")
	WebElement personalAccountButton;
	
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	WebElement firstNameBar;
	
	@FindBy(xpath = "//*[@id=\"lastname\"]")
	WebElement lastNameBar;
	
	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement emailBar;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement passwordBar;
	
	@FindBy(xpath = "//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
	WebElement signUpButton;
	
	//In Case Already user click on signin Button
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div[3]/div/span")
	WebElement signIn;
	
	public SignUp() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public String getTitle() {
		return getDriver().getCurrentUrl();
	}
	

	public void signUpAccount(String signUpFirstName, String signUpLastName, String signUpEmail, String signUpPassword) throws InterruptedException {
	  Action.click(getDriver(), personalAccountButton);
	  Action.type(firstNameBar, signUpFirstName);
	  Action.type(lastNameBar, signUpLastName);
	  Action.type(emailBar, signUpEmail);
	  Action.type(passwordBar, signUpPassword);
	  Thread.sleep(3000);
	  Action.click(getDriver(), signUpButton);
	}
	
	public void AlreadyUserSignIn() throws Throwable {
		IndexPage indexPage = new IndexPage();
		indexPage.clickonSignIn();
	}
}
