package com.deere.webformpages;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.global.GlobalThings;

public class Deere extends GlobalThings{

	@FindBy(xpath="//input[@name='userName']")
	private WebElement DeereUsername;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Deerepassword;
	
	@FindBy(xpath="//input[@class='cta_btn']")
	private WebElement DeereSubmit;
	
	@FindBy(xpath = "//select[@data-test-id='2018032215532701475431']")
	private WebElement country;

	@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
	private WebElement comment;

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement fisrtName;

	@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[2]")
	private WebElement address;

	@FindBy(xpath = "//span[@data-test-id='20180309154956072045627']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//span[@data-test-id='20180309154956071941973']")
	private WebElement DeereDashboard_FirstName;
	
	@FindBy(xpath = "//span[@data-test-id='20180309163651024524817']")
	private WebElement emailAddress;

	@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
	private WebElement description;
	
	@FindBy(xpath="//span[@data-test-id='20180309154956071941973']")
	private WebElement DeereDashboard_Address;
	
	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement deereDashboard_subinfo;
	
	@FindBy(xpath="//span[@data-test-id=\"20180309154956072045627\"]")
	private WebElement DeereDashboard_PhoneNumber;
	
	@FindBy(xpath="//span[@data-test-id=\"20180309163651024524817\"]")
	private WebElement DeereDashboard_Email;
	
	@FindBy(xpath="//div[@data-test-id=\"20180309163423012514679\"]")
	private WebElement DeereDashboard_PrimaryMessage;
	
	@FindBy(xpath="//select[@data-test-id='2018032215532701475431']")
	private WebElement DeereDashboard_SelectCountry;
	
	@FindBy(xpath="//textarea[@id='WebformComment']")
	private WebElement DeereDashboard_Description;
	
	@FindBy(xpath="//input[@id='DealerName']")
	private WebElement DeereDashboard_DealerName;
	
	@FindBy(xpath="//input[@id='DealerCity']")
	private WebElement DeereDashboard_DealerCity;
	
	@FindBy(xpath="//input[@id='DealerState']")
	private WebElement DeereDashboard_DealerState;
	
	@FindBy(xpath="//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement DeereDashboard_AttButton;
	
	@FindBy(xpath="//div[@class='file-input-wrapper centered']")
	private WebElement DeereDashboard_SelectButton;		
	
			
	@FindBy(xpath="//button[@data-test-id='20140919030420037410647']")
	private WebElement DeereDashboard_FileAttachButton;
	
	@FindBy(xpath="//button[@data-test-id='2018032009190808106446']")
	private WebElement DeereDashboard_AttachSubmitButton;
	
	@FindBy(xpath="//a[@class='Case_tools']")
	private WebElement DeereDashboard_attachedFileLink;
	
	@FindBy(xpath="//div[@data-test-id='2015012615503109611417']")
	private WebElement DeereDashboard_subinfo;		
	
	
	@FindBy(xpath="//button[@data-test-id='2018032009190808117329']")
	private WebElement DeereDashboard_ClearButton;	
	
	@FindBy(xpath="//button[@data-test-id=\"2018032009190808106446\"]")
	private WebElement submitBtn;	
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-2 standard_dataLabelWrite'])[2]")
	private WebElement deereTitle;

    protected WebDriver driver;
	
	public  Deere(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	/******---lahari*******/
	
	public boolean hasAddressDisplayed() {
		return CommonFunctions.isElementExist(driver, address);
	}
	
	
	public boolean hasFisrtNameDisplayed(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,DeereDashboard_FirstName);
	}	
	
	public boolean hasPhoneNumberDisplayed() {
		return CommonFunctions.isElementExist(driver,phoneNumber );
	}


	public boolean hasPrimaryMessageDisplayed(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,DeereDashboard_PrimaryMessage );
	}
	public boolean hasDealerNameExist() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,DeereDashboard_DealerName);
	}
	
	public boolean hasCountryDisplayed() {
		return CommonFunctions.isElementExist(driver, country);
	}
	
	public boolean hasCommentsDisplayed() {
		return CommonFunctions.isElementExist(driver, comment);
	}


	public boolean hasDealerCityExist() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,DeereDashboard_DealerCity );
		
	}
	
	
	public boolean hasDealerStateExist() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,DeereDashboard_DealerState );
		
	}
	
	public boolean hasFinalMessage(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return	CommonFunctions.isElementExist(driver, deereDashboard_subinfo ); 
	}
	
	
	/************************************/
	public boolean hasFisrtNameDisplayed(String firstName) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, DeereDashboard_FirstName);
	}

	public boolean hasDeereWebFormPageDisplayed(String title) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, deereTitle);
	}

	public boolean hasEmailAddressDispalyed(String email) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, DeereDashboard_Email);
	}

	public boolean hasPrimaryMessageDisplayed(String priMsg) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, DeereDashboard_PrimaryMessage);
	}

	public boolean hasDealerNameExist(String dealName) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, DeereDashboard_DealerName);

	}

	public boolean hasDealerCityExist(String dealCity) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, DeereDashboard_DealerCity);

	}

	public boolean hasDealerStateExist(String dealState) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, DeereDashboard_DealerState);

	}

	// Product DD selection in JDLinkswebform
	public Deere selectCountry() {
		CommonFunctions.waitForElement(driver, DeereDashboard_SelectCountry);
		CommonFunctions.selectFromDropdown(driver, "United States", DeereDashboard_SelectCountry);
		return new Deere(driver);
	}

	// Detailed_description entering in JDLinkswebform
	public Deere detailedDescription(String desc) {
		CommonFunctions.waitForElement(driver, DeereDashboard_Description).sendKeys(desc);
		return new Deere(driver);
	}

	public Deere DealerName() {
		CommonFunctions.waitForElement(driver, DeereDashboard_Description);
		return new Deere(driver);
	}

	public Deere DealerCity() {
		CommonFunctions.waitForElement(driver, DeereDashboard_Description);
		return new Deere(driver);
	}

	public Deere DealerState() {
		CommonFunctions.waitForElement(driver, DeereDashboard_Description);
		return new Deere(driver);
	}

	// File uploading and submit
	public Deere fileUpload() {
		CommonFunctions.waitForElement(driver, DeereDashboard_AttButton).click();
		CommonFunctions.waitForElement(driver, DeereDashboard_SelectButton).click();
		try {
			CommonFunctions.uploadFileUsingRobotClass(filePathImage);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, DeereDashboard_FileAttachButton).click();
		CommonFunctions.scrollSomeDown(driver);
		hasFileAttached();
		return new Deere(driver);
	}

	public Deere clickOnSubmitBtn() {
		CommonFunctions.waitForElement(driver, submitBtn).click();
		return new Deere(driver);
	}

	public boolean hasFileAttached() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, DeereDashboard_attachedFileLink);
	}

	public boolean hasClearButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, DeereDashboard_ClearButton);
	}

	public Deere clickOnClearButton() {
		CommonFunctions.waitForElement(driver, DeereDashboard_ClearButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Deere(driver);
	}

	public Deere GetCaseID() {

		String tm = CommonFunctions.waitForElement(driver, DeereDashboard_subinfo).getText();
		String[] strArr = tm.split(" ");
		String Case_ID = strArr[8];
		caseID_Deere = strArr[8];
		driver.manage().deleteAllCookies();
		return new Deere(driver);
	}

	public boolean hasFirstNameDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, fisrtName);

	}

	public boolean hasAddressDisplayed(String addr) {
		return CommonFunctions.isElementExist(driver, address);
	}

	public boolean hasPhoneNumberDisplayed(String phone) {
		return CommonFunctions.isElementExist(driver, phoneNumber);
	}

	public boolean hasEmailAddressDisplayed() {
		return CommonFunctions.isElementExist(driver, emailAddress);
	}

	public Deere detailedDesc(String desc) {
		CommonFunctions.waitForElement(driver, description).sendKeys(desc);

		return new Deere(driver);
	}

	public boolean hasFinalMessage(String finalMsg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, deereDashboard_subinfo);
	}

	public boolean hasCountryDisplayed(String coun) {
		return CommonFunctions.isElementExist(driver, country);
	}

	public boolean hasCommentsDisplayed(String commts) {
		return CommonFunctions.isElementExist(driver, comment);
	}

	public boolean hasSubmitButton() {
		return CommonFunctions.isElementExist(driver, submitBtn);
	}

	@FindBy(xpath = "//*[@id='$PpyWorkPage$pWebformCommentError']")
	private WebElement validMessg;

	public Deere clkSubmitButton() {
		CommonFunctions.waitForElement(driver, submitBtn).click();
		return new Deere(driver);
	}

	public boolean hasValidMessgDisplayed(String validMsg) {
		return CommonFunctions.isElementExist(driver, validMessg);
	}

	public Deere alertAccept() {
		CommonFunctions.waitForAlert(driver);
		return new Deere(driver);
	}

	public Deere clkSubmit() {
		// TODO Auto-generated method stub
		CommonFunctions.waitForElement(driver, submitBtn).click();
		;

		return new Deere(driver);
	}
}


