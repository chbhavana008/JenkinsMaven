package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	

	public WebDriver driver;	
		
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;

	
	}
	
	@FindBy(how=How.ID,id="email") WebElement Id;
	
	@FindBy(how=How.NAME,name="pass") WebElement Password;
	
	@FindBy(how=How.XPATH,xpath="//input[@type='submit']") WebElement submit;
	
	
	public void loginToFB(String Username, String pwd) {
		
		Id.sendKeys(Username);
		Password.sendKeys(pwd);
		submit.click();
		
		
		
	}
	
	
	

}
