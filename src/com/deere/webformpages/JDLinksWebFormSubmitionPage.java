package com.deere.webformpages;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deere.global.CommonFunctions;
import com.deere.global.GlobalThings;

public class JDLinksWebFormSubmitionPage extends GlobalThings {

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement jdLDashboardFirstName;

	@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[2]")
	private WebElement jdDashboard_BusinessAddr;

	@FindBy(xpath = "//span[@data-test-id='20180309154956072045627']")
	private WebElement jdLDashboardPhoneNumber;

	@FindBy(xpath = "//span[@data-test-id='20180309163651024524817']")
	private WebElement jdLDashboardEmail;

	@FindBy(xpath = "//div[@data-test-id='20180309163423012514679']")
	private WebElement jdLDashboardPrimaryMessage;

	@FindBy(xpath = "//select[@data-test-id='2018031412181703917767']")
	private WebElement jdLDashboardSelectProduct;

	@FindBy(xpath = "#PIN")
	private WebElement jdLDashboardMachinePIN;

	@FindBy(xpath = "//textarea[@data-test-id='2018031408201703885440']")
	private WebElement jdlDashboardDescription;

	@FindBy(xpath = "#DealerName")
	private WebElement jdlDashboardDealername;

	@FindBy(xpath = "#DealerCity")
	private WebElement jdlDashboardDealerCity;

	@FindBy(xpath = "#DealerState")
	private WebElement jdlDashboardealerState;

	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement jdlDashboardAttButton;

	@FindBy(xpath = "//div[@class='file-input-wrapper centered']")
	private WebElement jdlDashboardSelectButton;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement jdlDashboardFileAttachButton;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement jdlDashboardAttachSubmitButton;

	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement jdlDashboardSubinfo;

	@FindBy(xpath = "//a[@class='Case_tools']")
	private WebElement jdLinksDashboardAttachedFileLink;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement jdLinksDashboardClearButton;

	@FindBy(xpath = "//select[@data-test-id='2018031514545400505590']")
	private WebElement jdLLanguage;

	@FindBy(xpath = "//div[@id='$PpyWorkPage$pDecalModelError']")
	private WebElement jdLProdErrMessage;

	@FindBy(xpath = "//div[@id='$PpyWorkPage$pWebformCommentError']")
	private WebElement jdLDDErrMessage;

	@FindBy(xpath = "(//div[@class='content-item content-label item-2 standard_dataLabelWrite'])[2]")
	private WebElement jdLinksTitle;

	@FindBy(xpath = "//a[@class='Case_tools']")
	private WebElement r4Agcc_attachedFileLink;

	protected WebDriver driver;

	public JDLinksWebFormSubmitionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean hasJDLinksWebFormPageDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdLinksTitle);
	}

	// Validate JDLinks WebForm page
	public boolean hasJDLInksFirstNameDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdLDashboardFirstName);
	}

	public boolean hasJDLInksBusinessAddr() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdDashboard_BusinessAddr);
	}

	// Validate Phone number
	public boolean hasJDLInksPhone() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdLDashboardPhoneNumber);
	}

	// Validate Email
	public boolean hasJDLInksEmail() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdLDashboardEmail);
	}

	// Validate Primary message
	public boolean hasJDLInksPrimaryMessage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdLDashboardPrimaryMessage);
	}

	// Product DD selection in JDLinkswebform
	public JDLinksWebFormSubmitionPage productSelection() {
		CommonFunctions.waitForElement(driver, jdLDashboardSelectProduct);
		CommonFunctions.selectFromDropdown(driver, "JDLink Dashboard", jdLDashboardSelectProduct);
		return new JDLinksWebFormSubmitionPage(driver);
	}

	// Select Language in JDLinkswebform
	public JDLinksWebFormSubmitionPage selectLanguage() {
		CommonFunctions.waitForElement(driver, jdLLanguage);
		CommonFunctions.selectFromDropdown(driver, "Por favor seleccione su idioma: Español", jdLLanguage);
		return new JDLinksWebFormSubmitionPage(driver);
	}

	// Detailed_description entering in JDLinkswebform
	public JDLinksWebFormSubmitionPage DetailedDescription(String desc) {
		CommonFunctions.waitForElement(driver, jdlDashboardDescription).sendKeys(desc);
		return new JDLinksWebFormSubmitionPage(driver);
	}

	// File uploading and submit
	public JDLinksWebFormSubmitionPage addButton() {
		CommonFunctions.waitForElement(driver, jdlDashboardAttButton).click();
		CommonFunctions.waitForElement(driver, jdlDashboardSelectButton).click();
		try {
			CommonFunctions.uploadFileUsingRobotClass(filePathImage);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, jdlDashboardFileAttachButton).click();
		return new JDLinksWebFormSubmitionPage(driver);
	}

	// Validate file been attached
	public boolean hasFileAttached() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdLinksDashboardAttachedFileLink);
	}

	// Validate clear button
	public boolean hasClearButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdLinksDashboardClearButton);
	}

	public JDLinksWebFormSubmitionPage clickOnClearButton() {
		CommonFunctions.waitForElement(driver, jdLinksDashboardClearButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new JDLinksWebFormSubmitionPage(driver);
	}

	public JDLinksWebFormSubmitionPage clickOnSubmitButton() {
		CommonFunctions.waitForElement(driver, jdlDashboardAttachSubmitButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new JDLinksWebFormSubmitionPage(driver);
	}

	String alertMsg;

	public JDLinksWebFormSubmitionPage waitForAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(500);
			alertMsg = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		return new JDLinksWebFormSubmitionPage(driver);
	}

	// Get Case id
	public JDLinksWebFormSubmitionPage getCaseID() {
		String finalMsg = CommonFunctions.waitForElement(driver, jdlDashboardSubinfo).getText();
		String[] finalMsgSplit = finalMsg.split(" ");
		String case_ID = finalMsgSplit[8];
		caseID_JDlinks = finalMsgSplit[8];
		FileWriter fw;
		try {
			fw = new FileWriter(filepath);
			fw.write(case_ID);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.manage().deleteAllCookies();
		return new JDLinksWebFormSubmitionPage(driver);
	}

	// Get Case id Spanish
	public JDLinksWebFormSubmitionPage getCaseIDSpanish() {
		String finalMsg = CommonFunctions.waitForElement(driver, jdlDashboardSubinfo).getText();
		String[] finalMsgSplit = finalMsg.split(" ");
		String case_ID = finalMsgSplit[12];
		caseID_JDlinks = finalMsgSplit[12];
		FileWriter fw;
		try {
			fw = new FileWriter(filepath);
			fw.write(case_ID);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.manage().deleteAllCookies();
		return new JDLinksWebFormSubmitionPage(driver);
	}

	public boolean hasFinalMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdlDashboardSubinfo);
	}

	// Validate Prod Err message
	public boolean hasJDLInksProdErrMessage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdLProdErrMessage);
	}

	// Validate Comm error message
	public boolean hasJDLInksDDErrMessage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdLDDErrMessage);
	}

}
