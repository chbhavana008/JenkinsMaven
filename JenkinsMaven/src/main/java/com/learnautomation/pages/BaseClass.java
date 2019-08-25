package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;

public class BaseClass {

	public WebDriver driver;
	
	public ExcelDataProvider excel;
	
	
	@BeforeSuite
	public void setUpSuite()
	{
				
		excel=new ExcelDataProvider();
		
	}
	
	@BeforeClass
	public void setup() 
	{
		driver=BrowserFactory.startApplication(driver, "chrome","http://facebook.com");	
				
		System.out.println("title of the page is" + driver.getTitle());			
	}
	
	@AfterClass
	public void quitbrowser() {
	
	BrowserFactory.quitBrowser(driver);
			
	}
}
