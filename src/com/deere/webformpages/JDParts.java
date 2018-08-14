package com.deere.webformpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;

public class JDParts {

	@FindBy(xpath = "//input[@name='username1']")
	private WebElement UserName;

	@FindBy(xpath = "//input[@name='password1']")
	private WebElement PassWord;

	@FindBy(xpath = "//input[@class='submit-btn cta_btn']")
	private WebElement submit;

	protected WebDriver driver;

	public JDParts(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Enter UserName
	public JDParts enterUserName(String username) throws InterruptedException {
		CommonFunctions.waitForElement(driver, UserName).sendKeys(username);
		return new JDParts(driver);
	}

	// Enter Password
	public JDParts enterPassword(String password) {
		CommonFunctions.waitForElement(driver, PassWord).sendKeys(password);
		return new JDParts(driver);
	}

	// Click on submit
	public JDPartsWebFormSubmissionPage clickSignInBtn() {
		CommonFunctions.waitForElement(driver, submit).click();
		return new JDPartsWebFormSubmissionPage(driver);
	}

}
