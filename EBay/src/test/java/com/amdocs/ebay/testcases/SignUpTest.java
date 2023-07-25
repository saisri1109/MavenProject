package com.amdocs.ebay.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.ebay.base.BaseClass;
import com.amdocs.pageobject.IndexPage;
import com.amdocs.pageobject.SignUp;


public class SignUpTest extends BaseClass {

	  IndexPage indexpage;
	    SignUp signUp;

	    @BeforeMethod
	    public void setup() {
	        launchApp();
	    }

	    @Test
	    public void signUpSetUp() throws InterruptedException {
	        indexpage = new IndexPage();
	        signUp = indexpage.clickonSignUp();
	        signUp.signUpAccount(prop.getProperty("signUpFirstName"), prop.getProperty("signUpLastName"), prop.getProperty("signUpEmail"), prop.getProperty("signUpPassword"));
	    }
	    
	    
	    
}
