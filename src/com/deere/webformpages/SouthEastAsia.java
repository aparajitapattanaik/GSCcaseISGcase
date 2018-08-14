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

public class SouthEastAsia extends GlobalThings{

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement southEastAsiaUsername;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement southEastAsiapassword;

	@FindBy(xpath = "//input[@class='cta_btn']")
	private WebElement southEastAsiaSubmit;

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement southEastAsiaDashboard_FirstName;

	@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[1]")
	private WebElement ssDashboard_BusinessName;

	@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[2]")
	private WebElement ssDashboard_BusinessAddr;

	@FindBy(xpath = "//span[@data-test-id=\"20180309154956072045627\"]")
	private WebElement southEastAsiaDashboard_PhoneNumber;

	@FindBy(xpath = "//span[@data-test-id=\"20180309163651024524817\"]")
	private WebElement southEastAsiaDashboard_Email;

	@FindBy(xpath = "//div[@data-test-id=\"20180309163423012514679\"]")
	private WebElement southEastAsiaDashboard_PrimaryMessage;

	@FindBy(xpath = "//select[@data-test-id=\"2018031412181703917767\"]")
	private WebElement southEastAsiaDashboard_SelectProduct;

	@FindBy(xpath = "#PIN")
	private WebElement southEastAsiaDashboard_MachinePIN;

	@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
	private WebElement southEastAsiaDashboard_Description;

	@FindBy(xpath = "#DealerName")
	private WebElement southEastAsiaDashboard_Dealername;

	@FindBy(xpath = "#DealerCity")
	private WebElement southEastAsiaDashboard_DealerCity;

	@FindBy(xpath = "#DealerState")
	private WebElement southEastAsiaDashboard_DealerState;

	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement southEastAsiaDashboard_AttButton;

	@FindBy(xpath = "//div[@class='file-input-wrapper centered']")
	private WebElement southEastAsiaDashboard_SelectButton;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement southEastAsiaDashboard_FileAttachButton;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement southEastAsiaDashboard_AttachSubmitButton;

	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement southEastAsiaDashboard_subinfo;

	@FindBy(xpath = "//a[@class='Case_tools']")
	private WebElement southEastAsiaDashboard_attachedFileLink;

	@FindBy(xpath = "//select[@name='$PpyWorkPage$pWebformLanguage']")
	private WebElement southEastAsiaDashboard_DefaultLanguage;

	@FindBy(xpath = "//span[@class='iconRequired standard_iconRequired']")
	private WebElement southEastAsiaDashboard_DescriptionMsgInPortugues;

	@FindBy(xpath = "//option[@value='pt_BR']")
	private WebElement southEastAsiaDashboard_PortuguesLanguage;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement southEastAsiaDashboard_ClearButton;

	@FindBy(xpath = "//span[text()='Value cannot be blank']")
	private WebElement errorMsgCommts;

	@FindBy(xpath = "(//div[@class='content-item content-label item-2 standard_dataLabelWrite'])[2]")
	private WebElement southEastAsiaTitle;

	protected WebDriver driver;

	public SouthEastAsia(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean hasSouthEastAsiaWebFormPageDisplayed(String title) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southEastAsiaTitle);
	}

	public boolean hasFirstNameDisplayed(String firstName) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southEastAsiaDashboard_FirstName);
	}

	public boolean hasSouthEastAsiaBusinessAddr(String bAddr) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ssDashboard_BusinessAddr);
	}

	public boolean hasSouthEastAsiaPhone(String phone) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southEastAsiaDashboard_PhoneNumber);
	}

	public boolean hasSouthEastAsiaEmail(String email) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southEastAsiaDashboard_Email);
	}

	public boolean hasSouthEastAsiaPrimaryMessage(String priMsg) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southEastAsiaDashboard_PrimaryMessage);
	}

	public boolean hasSouthEastAsiaDefaultLanguageSelected() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southEastAsiaDashboard_DefaultLanguage);

	}

	public boolean hasClearButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southEastAsiaDashboard_ClearButton);
	}

	public SouthEastAsia clickOnClearButton() {
		CommonFunctions.waitForElement(driver, southEastAsiaDashboard_ClearButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new SouthEastAsia(driver);
	}

	// Assertion for error Msg for Commts
	public boolean hasErrorMsgDisplayed(String valMsg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, errorMsgCommts);
	}

	// Product DD selection in JDLinkswebform
	public SouthEastAsia productSelection() {
		CommonFunctions.waitForElement(driver, southEastAsiaDashboard_SelectProduct);
		CommonFunctions.selectFromDropdown(driver, "southEastAsia Dashboard", southEastAsiaDashboard_SelectProduct);
		return new SouthEastAsia(driver);
	}

	// Detailed_description entering in JDLinkswebform
	public SouthEastAsia detailedDescription(String desc) {

		CommonFunctions.waitForElement(driver, southEastAsiaDashboard_Description).sendKeys(desc); 
		return new SouthEastAsia(driver);

	}

	public SouthEastAsia verifyPortuguesLanguageMsg() {

		CommonFunctions.isElementExist(driver, southEastAsiaDashboard_DescriptionMsgInPortugues);

		return new SouthEastAsia(driver);
	}

	public SouthEastAsia selectPortuguesLanguage() {
		CommonFunctions.waitForElement(driver, southEastAsiaDashboard_PortuguesLanguage).click();
		return new SouthEastAsia(driver);
	}

	// File uploading and submit
	public SouthEastAsia addButton()  {
		CommonFunctions.waitForElement(driver, southEastAsiaDashboard_AttButton).click();
		CommonFunctions.waitForElement(driver, southEastAsiaDashboard_SelectButton).click();
		 try {
			CommonFunctions.uploadFileUsingRobotClass(filePathImage);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		CommonFunctions.waitForElement(driver, southEastAsiaDashboard_FileAttachButton).click();
		return new SouthEastAsia(driver);
	}

	// Validate file attachment
	public boolean hasFileAttached() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southEastAsiaDashboard_attachedFileLink);
	}

	// Get CaseID from Final message
	public SouthEastAsia getCaseID()  {
		String finalMsg = CommonFunctions.waitForElement(driver, southEastAsiaDashboard_subinfo).getText();
		String[] strArr = finalMsg.split(" ");
		String Case_ID = strArr[8];
		caseID_SouthEastAsia = strArr[8];
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
		return new SouthEastAsia(driver);
	}

	public SouthEastAsia clickSubmitBtn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, southEastAsiaDashboard_AttachSubmitButton).click();
		return new SouthEastAsia(driver);
	}

	public boolean hasFinalMessage(String finalMsg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, southEastAsiaDashboard_subinfo);
	}


	public SouthEastAsia waitForAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(500);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		return new SouthEastAsia(driver);
	}

}
