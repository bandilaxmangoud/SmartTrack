package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class STHomePage {

	public WebDriver driver;

	public STHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='dropdown']/a/img")
	WebElement client;
	
	@FindBy(xpath = "//ul[@id='clientMenu']")
	WebElement clientmenu;

	public WebElement clientdpdn() {
		return client;
	}

	public WebElement clientmenu() {
		return clientmenu;
	}

}
