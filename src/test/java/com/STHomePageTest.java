package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.STHomePage;
import resources.base;

public class STHomePageTest extends STLoginTest {
	Actions a = new Actions(driver);
	public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void homePage() throws InterruptedException {

		loginST();
		Thread.sleep(2000);
		STHomePage hpage = new STHomePage(driver);
		hpage.clientdpdn().click();
		hpage.clientmenu().sendKeys(prop.getProperty("clientname"));

	}
}
