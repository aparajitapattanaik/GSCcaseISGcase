package com.deere.webformpages;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.FileWriter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.deere.global.CommonFunctions;
import com.deere.webformpages.JDLinksWebFormSubmitionPage;
import com.relevantcodes.extentreports.LogStatus;

public class JDLinks {

	// private JDLinks JD;
	@FindBy(xpath = "//input[@name='username1']")
	private WebElement jdUsername;

	@FindBy(xpath = "//input[@name='password1']")
	private WebElement jdPassword;

	@FindBy(xpath = "//input[@class='submit-btn cta_btn']")
	private WebElement jdSubmit;

	protected WebDriver driver;

	public JDLinks(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Enter User Name
	public JDLinks enterUserName(String username) {
		CommonFunctions.waitForElement(driver, jdUsername).sendKeys(username);
		return new JDLinks(driver);
	}

	// Enter Password
	public JDLinks enterPassword(String password) {
		CommonFunctions.waitForElement(driver, jdPassword).sendKeys(password);
		return new JDLinks(driver);
	}

	// Enter submit
	public JDLinksWebFormSubmitionPage clickSignInBtn() {
		CommonFunctions.waitForElement(driver, jdSubmit).click();
		return new JDLinksWebFormSubmitionPage(driver);
	}

}
