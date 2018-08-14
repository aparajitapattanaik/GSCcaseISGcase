package com.deere.webformpages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deere.global.CommonFunctions;
import com.deere.global.GlobalThings;

public class JDPartsWebFormSubmissionPage extends GlobalThings{

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement jdUserName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement jdPassword;

	@FindBy(xpath = "//input[@class='cta_btn']")
	private WebElement jdSubmit;

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement jdParts_FirstName;

	@FindBy(xpath = "//span[@data-test-id='20180309154956072045627']")
	private WebElement jdParts_PhoneNumber;

	@FindBy(xpath = "//span[@data-test-id='20180309163651024524817']")
	private WebElement jdParts_Email;

	@FindBy(xpath = "//div[@data-test-id='20180309163423012514679']")
	private WebElement jdParts_PrimaryMessage;

	@FindBy(xpath = "//select[@data-test-id=\"2018031412181703917767\"]")
	private WebElement jdParts_SelectProduct;

	@FindBy(xpath = "#PIN")
	private WebElement jdlDashboard_MachinePIN;

	@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
	private WebElement jdParts_Description;

	@FindBy(xpath = "#DealerName")
	private WebElement jdlDashboard_DealerName;

	@FindBy(xpath = "#DealerCity")
	private WebElement jdlDashboard_DealerCity;

	@FindBy(xpath = "#DealerState")
	private WebElement jdlDashboard_DealerState;

	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement jdParts_AttButton;

	@FindBy(xpath = "//div[@class='file-input-wrapper centered']")
	private WebElement jdParts_SelectButton;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement jdParts_FileAttachButton;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement jdParts_AttachSubmitButton;

	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement jdParts_SubInfo;

	@FindBy(xpath = "//a[@class='Case_tools']")
	private WebElement jdParts_AttachedFileLink;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement jdParts_ClearButton;

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement firstAndLastName;

	@FindBy(xpath = "//*[@id='$PpyWorkPage$pWebformCommentError']")
	private WebElement validMessg;

	@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[2]")
	private WebElement address;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement submitBtn;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement clearBtn;

	@FindBy(xpath = "(//div[@class='content-item content-label item-2 standard_dataLabelWrite'])[2]")
	private WebElement jdPartsWebForm;

	protected WebDriver driver;

	public JDPartsWebFormSubmissionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public JDPartsWebFormSubmissionPage product_Selection() {
		CommonFunctions.waitForElement(driver, jdParts_SelectProduct);
		CommonFunctions.selectFromDropdown(driver, "JDLink Dashboard", jdParts_SelectProduct);
		return new JDPartsWebFormSubmissionPage(driver);
	}

	public JDPartsWebFormSubmissionPage detailedDescription(String desc) throws InterruptedException {

		CommonFunctions.waitForElement(driver, jdParts_Description).sendKeys(desc);
		Thread.sleep(2000);
		return new JDPartsWebFormSubmissionPage(driver);

	}

	// File uploading and submit
	public JDPartsWebFormSubmissionPage uploadFile() throws Throwable {
		CommonFunctions.waitForElement(driver, jdParts_AttButton).click();
		CommonFunctions.waitForElement(driver, jdParts_SelectButton).click();
		CommonFunctions.uploadFileUsingRobotClass("C:\\Users\\laharip\\Pictures\\Emailble Report.png");
		CommonFunctions.waitForElement(driver, jdParts_FileAttachButton).click();
		return new JDPartsWebFormSubmissionPage(driver);
	}

	public JDPartsWebFormSubmissionPage clickSubmit() throws IOException {
		CommonFunctions.waitForElement(driver, jdParts_AttachSubmitButton).click();
		return new JDPartsWebFormSubmissionPage(driver);
	}
	
	
	
	
	public JDPartsWebFormSubmissionPage getCaseID() throws IOException {
		String tm = CommonFunctions.waitForElement(driver, jdParts_SubInfo).getText();
		String[] strArr = tm.split(" ");
		Caseid_JDParts = strArr[8];
		return new JDPartsWebFormSubmissionPage(driver);
	}

	public boolean hasFinalMessageDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdParts_SubInfo);

	}

	public JDPartsWebFormSubmissionPage waitForAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(500);
			// driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		return new JDPartsWebFormSubmissionPage(driver);
	}

	public boolean hasPhoneNumberDisplyed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdParts_PhoneNumber);
	}

	public boolean hasEmailAddressDisplyed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdParts_Email);
	}

	public boolean hasPrimaryMessageDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdParts_PrimaryMessage);
	}

	// Assertion for FileAttached
	public boolean hasFileAttached() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, jdParts_AttachedFileLink);
	}

	public JDPartsWebFormSubmissionPage clickOnClearButton() {
		CommonFunctions.waitForElement(driver, jdParts_ClearButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submitBtn).click();
		CommonFunctions.waitForAlert(driver);
		CommonFunctions.isElementExist(driver, validMessg);
		return new JDPartsWebFormSubmissionPage(driver);
	}

	public JDPartsWebFormSubmissionPage submitButton() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submitBtn).click();
		CommonFunctions.waitForAlert(driver);
		CommonFunctions.isElementExist(driver, validMessg);
		return new JDPartsWebFormSubmissionPage(driver);
	}

	public boolean hasFirstNameLastNameDisplyed() {
		return CommonFunctions.isElementExist(driver, firstAndLastName);

	}

	public boolean hasAddressDisplyed() {
		return CommonFunctions.isElementExist(driver, address);
	}

	public boolean hasCommentsTextAreaFiledDisplayed() {
		return CommonFunctions.isElementExist(driver, jdParts_Description);
	}

	public boolean hasAddFileButtonDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, jdParts_AttButton);
	}

	public boolean hasSubmitButtonDisplayed() {
		// TODO Auto-generated method stub
		CommonFunctions.scrollSomeDown(driver);
		return CommonFunctions.isElementExist(driver, submitBtn);
	}

	public boolean hasClearButtonDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, clearBtn);
	}

	public boolean hasJDLinksWebFormPageDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, jdPartsWebForm);
	}

}
