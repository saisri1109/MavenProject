package com.amdocs.pageobject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.actiondriver.Action;
import com.amdocs.ebay.base.BaseClass;

public class LoginPage extends BaseClass {
	
	public IndexPage indexPage;
	
	@FindBy(xpath = "//*[@id=\"switch-account-anchor\"]")
	WebElement switchAccount;

	@FindBy(xpath = "//*[@id=\"userid\"]")
	WebElement userId;

	@FindBy(xpath = "//*[@id=\"signin-continue-btn\"]")
	WebElement continuebutton;

	@FindBy(xpath = "//*[@id=\"pass\"]")
	WebElement passWord;

	@FindBy(xpath = "//*[@id=\"sgnBt\"]")
	WebElement Login;

	@FindBy(xpath = "//*[@id=\"create-account-link\"]")
	WebElement createAccount;


	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public String getTitle() {
		String title = getDriver().getTitle();
		return title;
	}

	public void switchAccount() {
		Action.click(getDriver(), switchAccount);
	}
	public void signIn(String username, String password)  {
		Action.type(userId, username);
		Action.click(getDriver(), continuebutton);
		getDriver().manage().timeouts().implicitlyWait
        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
		Action.type(passWord, password);
		getDriver().manage().timeouts().implicitlyWait
        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
		Action.click(getDriver(), Login);
//		getDriver().manage().timeouts().implicitlyWait
//        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
//		Action.type(passWord, password);
//		Action.click(getDriver(), Login);
//		return new HomePage();
	}
	
	public void createAnAccount() {
       indexPage=new IndexPage();
       indexPage.clickonSignUp();
	}
	
}
