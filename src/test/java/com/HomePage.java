package com;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password,String text) throws IOException
	{
		
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp= new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		log.info(text);
		lp.getLogin().click();
		
		
	}
	
		
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[2][3];
		data[0][0]="firstdata@gmail.com";
		data[0][1]="12345";
		data[0][2]="Restricted user";
		
		data[1][0]="seconddata@gmail.com";
		data[1][1]="988656";
		data[1][2]="Non Restricted";
		
		return data;
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
}

