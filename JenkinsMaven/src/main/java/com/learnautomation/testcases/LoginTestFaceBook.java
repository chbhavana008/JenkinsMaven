package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;

public class LoginTestFaceBook extends BaseClass{

	//refer https://github.com/sanjayspear/FrameWork/blob/master/Framework/src/test/java/com/learnautomation/testcases/LoginTestHRM.java
	@Test
	public void loginapp() 
	{

		
	LoginPage LoginPage=PageFactory.initElements(driver, LoginPage.class);
	
	
	LoginPage.loginToFB(excel.getStringData("Sheet1", 0, 0),excel.getStringData("Sheet1", 0, 1));
	
	}
	
}
