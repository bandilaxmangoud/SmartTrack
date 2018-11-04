package com;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidatTitle extends base{

	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("Driver is initiated");
		driver.get(prop.getProperty("url"));
		log.info("Navigatedto Home page");
	}

	
	@Test
	public void basePageNavigation() throws IOException
	{
		
		LandingPage l = new LandingPage(driver);
		
		
		Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES");
		log.info("Successfully validated text message");
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
