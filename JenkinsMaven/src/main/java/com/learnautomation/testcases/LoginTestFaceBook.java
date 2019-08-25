package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;

public class LoginTestFaceBook extends BaseClass{

	
	@Test
	public void loginapp() 
	{

		
	LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
	
	
	loginPage.loginToFB(excel.getStringData("LoginFBTestng", 0, 0),excel.getStringData("LoginFBTestng", 0, 1));
	
	}
	
}
