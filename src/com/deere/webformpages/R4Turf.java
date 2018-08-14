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

public class R4Turf extends GlobalThings{

	public static String Caseid_R4Turf,alertMsg;

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement r4TurfDashboardFirstName;
	
	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement r4TurfDashboardAddress;

	@FindBy(xpath = "//span[@data-test-id=\"20180309154956072045627\"]")
	private WebElement r4TurfDashboard_PhoneNumber;

	@FindBy(xpath = "//span[@data-test-id=\"20180309163651024524817\"]")
	private WebElement r4TurfDashboard_Email;

	@FindBy(xpath = "//div[@data-test-id=\"20180309163423012514679\"]")
	private WebElement r4TurfDashboard_PrimaryMessage;

	@FindBy(xpath = "//select[@data-test-id='2018032215532701475431']")
	private WebElement r4TurfDashboard_SelectCountry;

	@FindBy(xpath = "//textarea[@data-test-id='2018031408201703885440']")
	private WebElement r4TurfDashboard_Description;

	@FindBy(xpath = "#DealerName")
	private WebElement r4TurfDashboard_DealerName;

	@FindBy(xpath = "#DealerCity")
	private WebElement r4TurfDashboard_DealerCity;

	@FindBy(xpath = "#DealerState")
	private WebElement r4TurfDashboard_DealerState;

	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement r4TurfDashboard_AttButton;

	@FindBy(xpath = "//div[@class='file-input-wrapper centered']")
	private WebElement r4TurfDashboard_SelectButton;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement r4TurfDashboard_FileAttachButton;

	@FindBy(xpath = "//a[@class='Case_tools']")
	private WebElement r4TurfDashboard_attachedFileLink;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement r4TurfDashboard_AttachSubmitButton;

	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement r4TurfDashboard_subinfo;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement r4TurfDashboard_ClearButton;
	
	@FindBy(xpath = "//span[@data-test-id='20180309154956072045627']")
	private WebElement r4TurfDashboardPhoneNumber;
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-2 standard_dataLabelWrite'])[2]")
	private WebElement webForm;
	
	@FindBy(xpath = "//span[@data-test-id=\"20180309154956071941973\"]")
	private WebElement firstName;


	protected WebDriver driver;

	

	private WebElement r4TurfDashboardEmail;

	public R4Turf(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	/************************************/
	public boolean hasR4TurfWebFormOpened() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4TurfDashboardFirstName);
	}
	
	public boolean hasAddressDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4TurfDashboardAddress);
	}

	public boolean hasPhoneNumberDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4TurfDashboardPhoneNumber);
	}

	public boolean hasR4TurfEmailAdressDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4TurfDashboardEmail);
	}

	public boolean hasR4TurfPrimaryMessageDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4TurfDashboard_PrimaryMessage);
	}

	public boolean hasClearButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4TurfDashboard_ClearButton);
	}
	
	@FindBy(xpath = "//*[@id='$PpyWorkPage$pWebformCommentError']")
	private WebElement validMessg;

	public R4Turf clickOnClearButton() {
		CommonFunctions.waitForElement(driver, clearBtn).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submitBtn).click();
		CommonFunctions.waitForAlert(driver);
		CommonFunctions.isElementExist(driver, validMessg);
		return new R4Turf(driver);
	}
	
	public R4Turf clickSubmitButton() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submitBtn).click();
		CommonFunctions.waitForAlert(driver);
		CommonFunctions.isElementExist(driver, validMessg);
		return new R4Turf(driver);
	}

	// Product DD selection in JDLinkswebform
	public R4Turf Product_selection() {
		CommonFunctions.waitForElement(driver, r4TurfDashboard_SelectCountry);
		CommonFunctions.selectFromDropdown(driver, "JDLink Dashboard", r4TurfDashboard_SelectCountry);
		return new R4Turf(driver);
	}

	// Detailed_description entering in JDLinkswebform
	public R4Turf detailedDescription(String desc) throws InterruptedException {
		CommonFunctions.waitForElement(driver, r4TurfDashboard_Description).sendKeys(desc);
		Thread.sleep(2000);
		return new R4Turf(driver);
	}

	public boolean hasDealerNameDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4TurfDashboard_DealerName);

	}

	public boolean hasDealerCityDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4TurfDashboard_DealerCity);

	}

	public boolean hasDealerStateDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4TurfDashboard_DealerState);

	}
	
	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement jdParts_AttButton;
	
	public boolean hasAddFileButtonDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, jdParts_AttButton);
	}
	
	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement clearBtn;

	public boolean hasSubmitButtonDisplayed() {
		// TODO Auto-generated method stub
		CommonFunctions.scrollSomeDown(driver);
		return CommonFunctions.isElementExist(driver, submitBtn);
	}

	public boolean hasClearButtonDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, clearBtn);
	}

	public R4Turf country_selection() {
		CommonFunctions.waitForElement(driver, r4TurfDashboard_SelectCountry);
		CommonFunctions.selectFromDropdown(driver, "United States", r4TurfDashboard_SelectCountry);
		return new R4Turf(driver);
	}

	public R4Turf dealerName() {
		CommonFunctions.waitForElement(driver, r4TurfDashboard_Description);
		return new R4Turf(driver);
	}

	public R4Turf dealerCity() {
		CommonFunctions.waitForElement(driver, r4TurfDashboard_Description);
		return new R4Turf(driver);
	}

	public R4Turf dealerState() {
		CommonFunctions.waitForElement(driver, r4TurfDashboard_Description);
		return new R4Turf(driver);
	}

	// File uploading and submit
	public R4Turf uploadFile() throws Throwable {
		CommonFunctions.waitForElement(driver, r4TurfDashboard_AttButton).click();
		CommonFunctions.waitForElement(driver, r4TurfDashboard_SelectButton).click();
		 CommonFunctions.uploadFileUsingRobotClass("C:\\Users\\laharip\\Pictures\\Emailble Report.png");	
		CommonFunctions.waitForElement(driver, r4TurfDashboard_FileAttachButton).click();
		return new R4Turf(driver);
	}

	public boolean hasFileAttachmentDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return CommonFunctions.isElementExist(driver, r4TurfDashboard_attachedFileLink);
	}

	public R4Turf GetCaseID() throws IOException {

		CommonFunctions.waitForElement(driver, r4TurfDashboard_AttachSubmitButton).click();
		String tm = CommonFunctions.waitForElement(driver, r4TurfDashboard_subinfo).getText();

		String[] strArr = tm.split(" ");
		String Case_ID = strArr[8];
		Caseid_R4Turf = strArr[8];
		System.out.println("" + Case_ID);
		return new R4Turf(driver);

	}
	
	public R4Turf clickSubmit() throws IOException {
		CommonFunctions.waitForElement(driver, r4TurfDashboard_AttachSubmitButton).click();
		return new R4Turf(driver);
	}
	
	public R4Turf getCaseID() throws IOException {
		String finalMsg = CommonFunctions.waitForElement(driver, r4TurfDashboard_subinfo).getText();
		String[] finalMsgSplit = finalMsg.split(" ");
		String case_ID = finalMsgSplit[8];
		Caseid_R4Turf = finalMsgSplit[8];
		FileWriter fw;
		try {
			fw = new FileWriter(filepath);
			fw.write(case_ID);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.manage().deleteAllCookies();
		
		return new R4Turf(driver);
	}
		
	public boolean hasFinalMessage(String msg){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (CommonFunctions.waitForElement(driver, r4TurfDashboard_subinfo ).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
	public R4Turf waitForAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(500);
			alertMsg=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		}catch(Exception e) {
	 }
		return new R4Turf(driver);
	}

	public boolean hasR4TurfWebFormPageDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, webForm);
	}

	public boolean hasFirstNameLastNameDisplyed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, firstName);
	} 


}
