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


import com.relevantcodes.extentreports.LogStatus;

public class R4_AgCC {

	private R4_AgCC agcc;
	@FindBy(xpath = "//input[@name='username1']")
	private WebElement agccUsername;

	@FindBy(xpath = "//input[@name='password1']")
	private WebElement agccPassword;

	@FindBy(xpath = "//input[@class='submit-btn cta_btn']")
	private WebElement agccSubmit;

	@FindBy(xpath = "//textarea[@id='WebformComment']")
	private WebElement agccDescription;

	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement agccAttButton;

	@FindBy(xpath = "//input[@id='$PpyAttachmentPage$ppyNote']")
	private WebElement agccSelectButton;

	@FindBy(xpath = "data-test-id='20140919030420037410647'")
	private WebElement agccFileAttachButton;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement agccAttachSubmitButton;

	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement agccsubinfo;

	protected WebDriver driver;

	public R4_AgCC(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// public JDLinks openWebformPortal(WebDriver driver,String url){
	//
	// System.out.println(url);
	// driver.get(url);
	// //logger.log(LogStatus.PASS, "Opening JDLinks Form Portal");
	//
	// return new JDLinks(driver);
	// }
	// public JDLinks Logintowebform(WebDriver driver,String username,String
	// password) throws InterruptedException {
	// JD=JD.enterUserName(username).enterPassword(password).clickSignInBtn();
	// return new JDLinks(driver);
	// }

	public R4_AgCC enterUserName(String username) throws InterruptedException {

		CommonFunctions.waitForElement(driver, agccUsername).sendKeys(username);
		return new R4_AgCC(driver);
	}

	public R4_AgCC enterPassword(String password) {
		CommonFunctions.waitForElement(driver, agccPassword).sendKeys(password);
		return new R4_AgCC(driver);
	}

	public R4_AgCCWebFormSubmissionPage clickSignInBtn() {
		CommonFunctions.waitForElement(driver, agccSubmit).click();
		return new R4_AgCCWebFormSubmissionPage(driver);
	}

}
