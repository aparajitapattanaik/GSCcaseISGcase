package com.deere.mailrelatedpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;

public class GmailLoginPage {
	

	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement GmailLoginPageUsername;
	
	@FindBy(id="identifierNext")
	private WebElement GmailLoginPageUsernameNext;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement GmailLoginPagepassword;
	
	@FindBy(id="passwordNext")
	private WebElement GmailLoginPagepasswordNext;
	
	
	/*@FindBy(xpath="")
	private WebElement GmailLoginPageSubmit;*/
	
protected WebDriver driver;
	
	public  GmailLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public GmailLoginPage enterUserName(String username) throws InterruptedException {
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		CommonFunctions.waitForElement(driver, GmailLoginPageUsername).sendKeys(username);
		CommonFunctions.waitForElement(driver, GmailLoginPageUsernameNext).click();
		System.out.println("clicked next");
		return new GmailLoginPage(driver);
	}
	
	public GmailLoginPage enterUserNameNext(String username) throws InterruptedException {
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		CommonFunctions.waitForElement(driver, GmailLoginPageUsernameNext).click();;
		System.out.println("presence of toogle"+username);
		return new GmailLoginPage(driver);
	}
	
	
	public GmailStep3 enterPassword(String password) {
		CommonFunctions.waitForElement(driver, GmailLoginPagepassword).sendKeys(password);
		CommonFunctions.waitForElement(driver,GmailLoginPagepasswordNext ).click();
		System.out.println("pasword next");
		return new GmailStep3(driver);
	}
	
	
	public GmailLoginPage GmailLoginPagepasswordNext(String username) throws InterruptedException {
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		CommonFunctions.waitForElement(driver, GmailLoginPagepasswordNext).click();;
		System.out.println("presence of toogle"+username);
		return new GmailLoginPage(driver);
	}
	
	public GmailStep3 clickSignInBtn() {
		CommonFunctions.waitForElement(driver, GmailLoginPagepasswordNext).click();
		System.out.println("clicked submit button");
		return new GmailStep3(driver);
	}
	
	

}
