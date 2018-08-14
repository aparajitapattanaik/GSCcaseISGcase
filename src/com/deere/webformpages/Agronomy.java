package com.deere.webformpages;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deere.global.CommonFunctions;
import com.deere.global.GlobalThings;

public class Agronomy extends GlobalThings {

	public static String Caseid_Agr;

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement agrUsername;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement agrpassword;

	@FindBy(xpath = "//input[@class='cta_btn']")
	private WebElement agrPSubmit;

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement agrDashboardFirstName;

	@FindBy(xpath = "//span[@data-test-id='20180309154956072045627']")
	private WebElement agrDashboardPhoneNumber;

	@FindBy(xpath = "//span[@data-test-id='20180309163651024524817']")
	private WebElement agrDashboardEmail;

	@FindBy(xpath = "//div[@data-test-id='20180309163423012514679']")
	private WebElement agrDashboardPrimaryMessage;

	@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
	private WebElement agrDashboardDescription;

	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement agrDashboardAttButton;

	@FindBy(xpath = "//div[@class='file-input-wrapper centered']")
	private WebElement agrDashboardSelectButton;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement agrDashboardFileAttachButton;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement agrDashboardAttachSubmitButton;

	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement agrDashboardSubinfo;

	@FindBy(xpath = "//a[@class='Case_tools']")
	private WebElement agrDashboardattachedFileLink;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement agronomyDashboardClearButton;

	@FindBy(xpath = "//span[text()='Value cannot be blank']")
	private WebElement errorMsgCommts;

	@FindBy(xpath = "(//div[@class='content-item content-label item-2 standard_dataLabelWrite'])[2]")
	private WebElement agronomyTitle;

	protected WebDriver driver;

	public Agronomy(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Assertion for First Name opened
	public boolean hasAgrFirstNameDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, agrDashboardFirstName);
	}

	public boolean hasAgronomyWebFormPageDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, agronomyTitle);
	}

	// Assertion for Phonenumber
	public boolean hasAgrPhone() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, agrDashboardPhoneNumber);
	}

	// Assertion for Email
	public boolean hasAgrEmail() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, agrDashboardEmail);
	}

	// Assertion for PrimaryMessage
	public boolean hasAgrPrimaryMessage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, agrDashboardPrimaryMessage);
	}

	// Assertion for ClearButton
	public boolean hasClearButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, agronomyDashboardClearButton);
	}

	// Method for Clear Button
	public Agronomy clickOnClearButton() {
		CommonFunctions.waitForElement(driver, agronomyDashboardClearButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new Agronomy(driver);
	}

	// Detailed_description entering in JDLinkswebform
	public Agronomy detailedDescription(String desc) {
		CommonFunctions.waitForElement(driver, agrDashboardDescription).sendKeys(desc);
		return new Agronomy(driver);

	}

	// File uploading
	public Agronomy addButton() {
		CommonFunctions.waitForElement(driver, agrDashboardAttButton).click();
		CommonFunctions.waitForElement(driver, agrDashboardSelectButton).click();
		try {
			CommonFunctions.uploadFileUsingRobotClass(filePathImage);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, agrDashboardFileAttachButton).click();
		return new Agronomy(driver);
	}

	// Validate the attached file
	public boolean hasFileAttached() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, agrDashboardattachedFileLink);
	}

	// Getting Case ID from Final Message
	public Agronomy getCaseID1() {
		CommonFunctions.waitForElement(driver, agrDashboardAttachSubmitButton).click();
		String tm = CommonFunctions.waitForElement(driver, agrDashboardSubinfo).getText();
		String[] strArr = tm.split(" ");
		String Case_ID = strArr[8];
		Caseid_Agr = strArr[8];
		return new Agronomy(driver);
	}

	public Agronomy clickSubmitBtn() {
		CommonFunctions.waitForElement(driver, agrDashboardAttachSubmitButton).click();
		return new Agronomy(driver);
	}

	public Agronomy getCaseID() {
		String finalMsg = CommonFunctions.waitForElement(driver, agrDashboardSubinfo).getText();
		String[] finalMsgSplit = finalMsg.split(" ");
		String case_ID = finalMsgSplit[8];
		caseID_Agronomy = finalMsgSplit[8];
		FileWriter fw;
		try {
			fw = new FileWriter(filepath);
			fw.write(case_ID);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().deleteAllCookies();
		return new Agronomy(driver);
	}

	public boolean hasFinalMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, agrDashboardSubinfo);
	}

	// Assertion for error Msg for Commts
	public boolean hasCommErrorMsgDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, errorMsgCommts);
	}

	public Agronomy waitForAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(500);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		return new Agronomy(driver);
	}

}
