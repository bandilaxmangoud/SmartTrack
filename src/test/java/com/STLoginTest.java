package com;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.STLoginPage;
import resources.base;

public class STLoginTest extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
    @Test
	public void loginST()
	{
    	STLoginPage lgn=new STLoginPage(driver);
    	lgn.userName().sendKeys(prop.getProperty("username"));
    	lgn.passWord().sendKeys(prop.getProperty("password"));
    	lgn.login().click();
	}
}
