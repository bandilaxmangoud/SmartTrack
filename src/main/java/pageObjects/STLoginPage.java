package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class STLoginPage {
	public WebDriver driver;

	public STLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='DefaultContent_TxtEmailAddress']")
	WebElement username;

	@FindBy(xpath = "//input[@id='DefaultContent_TxtPassword']")
	WebElement password;

	@FindBy(xpath = "//input[@id='DefaultContent_btnLog']")
	WebElement login;

	public WebElement userName() {
		return username;
	}

	public WebElement passWord() {
		return password;

	}

	public WebElement login() {
		return login;
	}
}
