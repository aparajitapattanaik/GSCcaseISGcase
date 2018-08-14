package com.deere.webformpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;

public class DeereLoginPage {

	@FindBy(xpath = "//input[@name='username1']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password1']")
	private WebElement password;

	@FindBy(xpath = "//input[@class='submit-btn cta_btn']")
	private WebElement submit;

	protected WebDriver driver;

	public DeereLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Method for Loginpage username
	public DeereLoginPage enterUserName(String username1) {
		CommonFunctions.waitForElement(driver, username).sendKeys(username1);
		return new DeereLoginPage(driver);
	}

	// Method for Loginpage password
	public DeereLoginPage enterPassword(String password1) {
		CommonFunctions.waitForElement(driver, password).sendKeys(password1);
		return new DeereLoginPage(driver);
	}

	// Method for SignInButton.
	public Deere clickSignInBtn() {
		CommonFunctions.waitForElement(driver, submit).click();
		return new Deere(driver);
	}
}
