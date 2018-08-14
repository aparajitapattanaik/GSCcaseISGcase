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

public class GreenFleetWebFormSubmissionPage extends GlobalThings {

	// private JDLinks JD;
	@FindBy(xpath = "//input[@name='username1']")
	private WebElement greenFleetUsername;

	@FindBy(xpath = "//input[@name='password1']")
	private WebElement greenFleetPassword;

	@FindBy(xpath = "//input[@class='submit-btn cta_btn']")
	private WebElement greenFleetSubmit;

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@class='cta_btn']")
	private WebElement submit;

	@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[2]")
	private WebElement ssDashboard_BusinessAddr;

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement firstName;

	@FindBy(xpath = "//span[@data-test-id=\"20180309154956072045627\"]")
	private WebElement phoneNumber;

	@FindBy(xpath = "//span[@data-test-id=\"20180309163651024524817\"]")
	private WebElement email;

	@FindBy(xpath = "//div[@data-test-id=\"20180309163423012514679\"]")
	private WebElement primaryMessage;

	@FindBy(xpath = "//select[@data-test-id=\"2018031412181703917767\"]")
	private WebElement selectProduct;

	@FindBy(xpath = "#PIN")
	private WebElement machinePIN;

	@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
	private WebElement description;

	@FindBy(xpath = "#DealerName")
	private WebElement dealerName;

	@FindBy(xpath = "#DealerCity")
	private WebElement dealerCity;

	@FindBy(xpath = "#DealerState")
	private WebElement dealerState;

	@FindBy(xpath = "//input[@data-test-id='20180402084717001611170']")
	private WebElement greenFleetNo;

	@FindBy(xpath = "//input[@data-test-id='20180402084717001812129']")
	private WebElement greenFleetMachineSerial;

	@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
	private WebElement greenFleetComments;

	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement attButton;

	@FindBy(xpath = "//div[@class='file-input-wrapper centered']")
	private WebElement selectButton;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement fileAttachButton;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement attachSubmitButton;

	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement subinfo;

	@FindBy(xpath = "//input[@data-test-id='20180402084717001611170']")
	private WebElement greenFleetNumber;

	// GreenFleetComments=//textarea[@data-test-id='2018031407540502455903']
	@FindBy(xpath = "//input[@data-test-id='2018030916435602054843']")
	private WebElement greenFleetDealerName;

	@FindBy(xpath = "//input[@data-test-id='20180309164356020549262']")
	private WebElement greenFleetDealerCity;

	@FindBy(xpath = "//input[@data-test-id='20180309164356020550666']")
	private WebElement greenFleetState;

	@FindBy(xpath = "//input[@class='submit-btn cta_btn']")
	private WebElement submitButton;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement deereDashboard_ClearButton;

	@FindBy(xpath = "//span[text()='Value cannot be blank']")
	private WebElement errorMsgCommts;

	@FindBy(xpath = "(//div[@class='content-item content-label item-2 standard_dataLabelWrite'])[2]")
	private WebElement greenFleetTitle;

	@FindBy(xpath = "//a[@class='Case_tools']")
	private WebElement agrDashboardattachedFileLink;

	protected WebDriver driver;

	public GreenFleetWebFormSubmissionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean hasGreenFleettWebFormPageDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, greenFleetTitle);
	}

	// enter greenfleet number
	public GreenFleetWebFormSubmissionPage greenfleetnumber(
			GreenFleetWebFormSubmissionPage greenFleetWebFormSubmissionPage, String number)
			throws InterruptedException {
		CommonFunctions.waitForElement(driver, greenFleetNumber).sendKeys(number);
		Thread.sleep(2000);
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// enter username for webform
	public GreenFleetWebFormSubmissionPage enterUserName(String username) {
		CommonFunctions.waitForElement(driver, greenFleetUsername).sendKeys(username);
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// enter password for webform
	public GreenFleetWebFormSubmissionPage enterPassword(String password) {
		CommonFunctions.waitForElement(driver, greenFleetPassword).sendKeys(password);
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// enter greenfleet number
	public GreenFleetWebFormSubmissionPage greenFleetNumber(String number) {
		CommonFunctions.waitForElement(driver, greenFleetNo).sendKeys(number);
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// click on signin button
	public GreenFleetWebFormSubmissionPage clickSignInBtn() {
		CommonFunctions.waitForElement(driver, submitButton).click();
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// enter greenfleet machine serial.
	public GreenFleetWebFormSubmissionPage greenFleetMachineSerial(String serial) {
		CommonFunctions.waitForElement(driver, greenFleetMachineSerial).sendKeys(serial);
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// enter greenfleet comment.
	public GreenFleetWebFormSubmissionPage greenFleetEnterComment(String comment) {
		CommonFunctions.waitForElement(driver, greenFleetComments).sendKeys(comment);
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// enter greenfleet name
	public GreenFleetWebFormSubmissionPage enterDealerName(String name) {
		CommonFunctions.waitForElement(driver, greenFleetDealerName).sendKeys(name);
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// enter greenfleet state
	public GreenFleetWebFormSubmissionPage enterDealerState(String state) {
		CommonFunctions.waitForElement(driver, greenFleetState).sendKeys(state);
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// enter greenfleet city
	public GreenFleetWebFormSubmissionPage enterDealerCity(String city) {
		CommonFunctions.waitForElement(driver, greenFleetDealerCity).sendKeys(city);
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// assertion for First name
	public boolean hasFirstNameDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, firstName);
	}

	public boolean hasStellarBusinessAddr() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_BusinessAddr);
	}

	// assertion for webform
	public boolean hasPhone() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, phoneNumber);
	}

	// assertion for greenfleet email.
	public boolean hasEmail() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, email);
	}

	// assertion for greenfleet message
	public boolean hasPrimaryMessage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, primaryMessage);
	}

	// Product DD selection in JDLinkswebform
	public R4_AgCCWebFormSubmissionPage product_selection() {
		CommonFunctions.waitForElement(driver, selectProduct);
		CommonFunctions.selectFromDropdown(driver, "JDLink Dashboard", selectProduct);
		return new R4_AgCCWebFormSubmissionPage(driver);
	}

	// Detailed_description entering in JDLinkswebform
	public GreenFleetWebFormSubmissionPage detailedDescription(String desc) {

		CommonFunctions.waitForElement(driver, description).sendKeys(desc);
		return new GreenFleetWebFormSubmissionPage(driver);

	}

	// File uploading
	public GreenFleetWebFormSubmissionPage addAttachment() {
		CommonFunctions.waitForElement(driver, attButton).click();
		CommonFunctions.waitForElement(driver, selectButton).click();
		try {
			CommonFunctions.uploadFileUsingRobotClass(filePathImage);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, fileAttachButton).click();
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	public GreenFleetWebFormSubmissionPage clickSubmitBtn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, attachSubmitButton).click();
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// Assertion for ClearButton
	public boolean hasClearButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, deereDashboard_ClearButton);
	}

	// Method for ClearButton
	public GreenFleetWebFormSubmissionPage clickOnClearButton() {
		CommonFunctions.waitForElement(driver, deereDashboard_ClearButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	public GreenFleetWebFormSubmissionPage getCaseID() {

		String tm = CommonFunctions.waitForElement(driver, subinfo).getText();
		String[] strArr = tm.split(" ");
		String Case_ID = strArr[8];
		caseID_GreenFleet = strArr[8];
		FileWriter fw;
		try {
			fw = new FileWriter(filepath);
			fw.write(Case_ID);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		driver.manage().deleteAllCookies();
		return new GreenFleetWebFormSubmissionPage(driver);
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

	public boolean hasFinalMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, subinfo);
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

	public GreenFleetWebFormSubmissionPage waitForAlert() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	public void close() {
		driver.quit();
	}
}
