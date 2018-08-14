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

public class SouthSahara extends GlobalThings {

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement southSaharaUsername;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement southSaharapassword;

	@FindBy(xpath = "//input[@class='cta_btn']")
	private WebElement southSaharaSubmit;

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement southSaharaDashboard_FirstName;

	@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[1]")
	private WebElement ssDashboard_BusinessName;

	@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[2]")
	private WebElement ssDashboard_BusinessAddr;

	@FindBy(xpath = "//span[@data-test-id=\"20180309154956072045627\"]")
	private WebElement southSaharaDashboard_PhoneNumber;

	@FindBy(xpath = "//span[@data-test-id=\"20180309163651024524817\"]")
	private WebElement southSaharaDashboard_Email;

	@FindBy(xpath = "//div[@data-test-id=\"20180309163423012514679\"]")
	private WebElement southSaharaDashboard_PrimaryMessage;

	@FindBy(xpath = "//select[@data-test-id=\"2018031412181703917767\"]")
	private WebElement southSaharaDashboard_SelectProduct;

	@FindBy(xpath = "#PIN")
	private WebElement southSaharaDashboard_MachinePIN;

	@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
	private WebElement southSaharaDashboard_Description;

	@FindBy(xpath = "#DealerName")
	private WebElement southSaharaDashboard_Dealername;

	@FindBy(xpath = "#DealerCity")
	private WebElement southSaharaDashboard_DealerCity;

	@FindBy(xpath = "#DealerState")
	private WebElement southSaharaDashboard_DealerState;

	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement southSaharaDashboard_AttButton;

	@FindBy(xpath = "//div[@class='file-input-wrapper centered']")
	private WebElement southSaharaDashboard_SelectButton;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement southSaharaDashboard_FileAttachButton;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement southSaharaDashboard_AttachSubmitButton;

	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement southSaharaDashboard_subinfo;

	@FindBy(xpath = "//a[@class='Case_tools']")
	private WebElement southSaharaDashboard_attachedFileLink;

	@FindBy(xpath = "//select[@name='$PpyWorkPage$pWebformLanguage']")
	private WebElement southSaharaDashboard_DefaultLanguage;

	@FindBy(xpath = "//span[@class='iconRequired standard_iconRequired']")
	private WebElement southSaharaDashboard_DescriptionMsgInPortugues;

	@FindBy(xpath = "//option[@value='pt_BR']")
	private WebElement southSaharaDashboard_PortuguesLanguage;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement southSaharaDashboard_ClearButton;

	@FindBy(xpath = "//span[text()='Value cannot be blank']")
	private WebElement errorMsgCommts;

	@FindBy(xpath = "(//div[@class='content-item content-label item-2 standard_dataLabelWrite'])[2]")
	private WebElement southSaharaTitle;

	protected WebDriver driver;

	public SouthSahara(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	/************************************/

	public boolean hasSouthSaharaWebFormPageDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southSaharaTitle);
	}

	public boolean hasFirstNameDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southSaharaDashboard_FirstName);
	}

	public boolean hasSouthSaharaBusinessName() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_BusinessName);
	}

	public boolean hasSouthSaharaBusinessAddr() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_BusinessAddr);
	}

	public boolean hasSouthSaharaPhone() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southSaharaDashboard_PhoneNumber);
	}

	public boolean hasSouthSaharaEmail() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southSaharaDashboard_Email);
	}

	public boolean hasSouthSaharaPrimaryMessage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southSaharaDashboard_PrimaryMessage);
	}

	public boolean hasSouthSaharaDefaultLanguageSelected() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southSaharaDashboard_DefaultLanguage);

	}

	public boolean hasClearButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southSaharaDashboard_ClearButton);
	}

	public SouthSahara clickOnClearButton() {
		CommonFunctions.waitForElement(driver, southSaharaDashboard_ClearButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new SouthSahara(driver);
	}

	// Assertion for error Msg for Commts
	public boolean hasErrorMsgDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, errorMsgCommts);
	}

	// Product DD selection in JDLinkswebform
	public SouthSahara productSelection() {
		CommonFunctions.waitForElement(driver, southSaharaDashboard_SelectProduct);
		CommonFunctions.selectFromDropdown(driver, "SouthSahara Dashboard", southSaharaDashboard_SelectProduct);
		return new SouthSahara(driver);
	}

	// Detailed_description entering in JDLinkswebform
	public SouthSahara detailedDescription(String desc) {
		CommonFunctions.waitForElement(driver, southSaharaDashboard_Description).sendKeys(desc);
		return new SouthSahara(driver);

	}

	public SouthSahara verifyPortuguesLanguageMsg() {

		CommonFunctions.isElementExist(driver, southSaharaDashboard_DescriptionMsgInPortugues);

		return new SouthSahara(driver);
	}

	public SouthSahara selectPortuguesLanguage() {
		CommonFunctions.waitForElement(driver, southSaharaDashboard_PortuguesLanguage).click();
		return new SouthSahara(driver);
	}

	// File uploading and submit
	public SouthSahara addButton() {
		CommonFunctions.waitForElement(driver, southSaharaDashboard_AttButton).click();
		CommonFunctions.waitForElement(driver, southSaharaDashboard_SelectButton).click();
		try {
			CommonFunctions.uploadFileUsingRobotClass(filePathImage);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, southSaharaDashboard_FileAttachButton).click();
		return new SouthSahara(driver);
	}

	// Validate file attachment
	public boolean hasFileAttached() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southSaharaDashboard_attachedFileLink);
	}

	// Get CaseID from Final message
	public SouthSahara getCaseID() {
		String finalMsg = CommonFunctions.waitForElement(driver, southSaharaDashboard_subinfo).getText();
		String[] strArr = finalMsg.split(" ");
		String Case_ID = strArr[8];
		caseID_SouthSahara = strArr[8];
		FileWriter fw;
		try {
			fw = new FileWriter(filepath);
			fw.write(Case_ID);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.manage().deleteAllCookies();
		return new SouthSahara(driver);
	}

	public SouthSahara clickSubmitBtn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, southSaharaDashboard_AttachSubmitButton).click();
		return new SouthSahara(driver);
	}

	public boolean hasFinalMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southSaharaDashboard_subinfo);
	}

	String alertMsg;

	public SouthSahara waitForAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(500);
			alertMsg = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		return new SouthSahara(driver);
	}

}
