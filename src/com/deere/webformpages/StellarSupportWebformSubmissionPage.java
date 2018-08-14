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

public class StellarSupportWebformSubmissionPage extends GlobalThings {

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement ssUsername;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement sspassword;

	@FindBy(xpath = "//input[@class='cta_btn']")
	private WebElement ssSubmit;

	@FindBy(xpath = "(//div[@class='content-item content-label item-2 standard_dataLabelWrite'])[2]")
	private WebElement stellarSupportTitle;

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement ssDashboard_FirstName;

	@FindBy(xpath = "//span[@data-test-id='20180309154956072045627']")
	private WebElement ssDashboard_PhoneNumber;

	@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[1]")
	private WebElement ssDashboard_BusinessName;

	@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[2]")
	private WebElement ssDashboard_BusinessAddr;

	@FindBy(xpath = "//span[@data-test-id='20180309163651024524817']")
	private WebElement ssDashboard_Email;

	@FindBy(xpath = "//div[@data-test-id='20180309163423012514679']")
	private WebElement ssDashboard_PrimaryMessage;

	@FindBy(xpath = "//input[@id='DealerName']")
	private WebElement deereDashboard_DealerName;

	@FindBy(xpath = "//input[@id='DealerCity']")
	private WebElement deereDashboard_DealerCity;

	@FindBy(xpath = "//input[@id='DealerState']")
	private WebElement deereDashboard_DealerState;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement deereDashboard_ClearButton;

	@FindBy(xpath = "//a[@class='Case_tools']")
	private WebElement r4Agcc_attachedFileLink;

	@FindBy(xpath = "//select[@data-test-id='2018031412181703917767']")
	private WebElement ssDashboard_SelectProduct;

	@FindBy(xpath = "#PIN")
	private WebElement ssDashboard_MachinePIN;

	@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
	private WebElement ssDashboard_Description;

	@FindBy(xpath = "#DealerName")
	private WebElement ssDashboard_Dealername;

	@FindBy(xpath = "#DealerCity")
	private WebElement ssDashboard_DealerCity;

	@FindBy(xpath = "#DealerState")
	private WebElement ssDashboard_DealerState;

	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement ssDashboard_AttButton;

	@FindBy(xpath = "//div[@class='file-input-wrapper centered']")
	private WebElement ssDashboard_SelectButton;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement ssDashboard_FileAttachButton;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement ssDashboard_AttachSubmitButton;

	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement ssDashboard_subinfo;

	@FindBy(xpath = "//span[text()='Value cannot be blank']")
	private WebElement errorMsgCommts;

	protected WebDriver driver;

	public StellarSupportWebformSubmissionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean hasStellarSupportWebFormPageDisplayed(String title) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, stellarSupportTitle);
	}

	public boolean hasFirstNameDispalyed(String firstName) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_FirstName);
	}

	public boolean hasStellarBusinessName(String businessName) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_BusinessName);
	}

	public boolean hasStellarBusinessAddr(String businessAddr) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_BusinessAddr);
	}

	public boolean hasStellarPhone(String phone) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_PhoneNumber);
	}

	public boolean hasStellarEmail(String email) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_Email);
	}

	public boolean hasStellarPrimaryMessage(String priMsg) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_PrimaryMessage);
	}

	// Assertion for Dealername
	public boolean hasDealerNameExist(String dealerName) {
		return CommonFunctions.isElementExist(driver, deereDashboard_DealerName);
	}

	// Assertion for DealerCity
	public boolean hasDealerCityExist(String dealerCity) {
		return CommonFunctions.isElementExist(driver, deereDashboard_DealerCity);
	}

	// Assertion for DealerState
	public boolean hasDealerStateExist(String dealerState) {
		return CommonFunctions.isElementExist(driver, deereDashboard_DealerState);
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
	public StellarSupportWebformSubmissionPage clickOnClearButton() {
		CommonFunctions.waitForElement(driver, deereDashboard_ClearButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new StellarSupportWebformSubmissionPage(driver);
	}

	// Assertion for FileAttached
	public boolean hasFileAttached() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4Agcc_attachedFileLink);
	}

	// Assertion for error Msg for Commts
	public boolean hasErrorMsgDisplayed(String validMsg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, errorMsgCommts);
	}

	String alertMsg;

	public StellarSupportWebformSubmissionPage waitForAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(500);
			alertMsg = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		return new StellarSupportWebformSubmissionPage(driver);
	}

	// Detailed_description entering in JDLinkswebform
	public StellarSupportWebformSubmissionPage detailedDescription(String desc) {
		CommonFunctions.waitForElement(driver, ssDashboard_Description).sendKeys(desc);
		return new StellarSupportWebformSubmissionPage(driver);

	}

	// File uploading
	public StellarSupportWebformSubmissionPage addAttachmentFile() {
		CommonFunctions.waitForElement(driver, ssDashboard_AttButton).click();
		CommonFunctions.waitForElement(driver, ssDashboard_SelectButton).click();
		try {
			CommonFunctions.uploadFileUsingRobotClass(filePathImage);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, ssDashboard_FileAttachButton).click();
		return new StellarSupportWebformSubmissionPage(driver);
	}

	public StellarSupportWebformSubmissionPage clickSubmit() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, ssDashboard_AttachSubmitButton).click();
		return new StellarSupportWebformSubmissionPage(driver);
	}

	public StellarSupportWebformSubmissionPage getCaseID() {

		String finalMsg = CommonFunctions.waitForElement(driver, ssDashboard_subinfo).getText();
		String[] strArr = finalMsg.split(" ");
		String Case_ID = strArr[8];
		caseID_StellarSupport = strArr[8];
		FileWriter fw;
		try {
			fw = new FileWriter(filepath);
			fw.write(Case_ID);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().deleteAllCookies();
		return new StellarSupportWebformSubmissionPage(driver);
	}

	public boolean hasFinalMessage(String finalMsg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_subinfo);
	}

}
