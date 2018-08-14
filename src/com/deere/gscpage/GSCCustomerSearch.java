package com.deere.gscpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;


public class GSCCustomerSearch {
	public static String Caseid;

	@FindBy(xpath = "(//a[starts-with(@title,'New Deere.com Case')])[1]")
	private WebElement gscNewCaseMailLinkZeacom;

	// click on Zeacom mail
	public ViewEmailZeacomPage clickOnMailZeacom() {
		CommonFunctions.waitForElement(driver, gscNewCaseMailLinkZeacom).click();
		return new ViewEmailZeacomPage(driver);
	}

	@FindBy(xpath = "(//label[contains(text(),'Home')])[1]")
	private WebElement homePagetab;

	@FindBy(xpath = "//iframe[contains(@src,'SolutionSearchHome')]")
	private WebElement iFramePegaGadget;

	@FindBy(xpath = "//button[@data-test-id='20180201163908004467353']")
	private WebElement createGSCCase;

	// Add Customer Information Details
	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[1]")
	private WebElement gscAddCustInfoButton;

	// Add contact & Dealership info.
	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[2]")
	private WebElement addContactDealership;

	// Add product Info
	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[2]")
	private WebElement productInfoButton;

	// CaseCoding
	@FindBy(xpath = "(//h2[contains(text(),'Case Coding')])[2]")
	private WebElement caseCoding;

	@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
	private WebElement customerSearchHeader;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement customerFirstName;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement customerLastName;

	@FindBy(xpath = "//select[@id='country']")
	private WebElement customerCountry;

	@FindBy(xpath = "//input[@class='button btn btn-primary']")
	private WebElement gscAddCustInfoSearchCustomers;

	@FindBy(xpath = "(//a[contains(text(),' DETAILS ')])[1]")
	private WebElement customerDetails;

	@FindBy(xpath = "//table[@id='results']/tbody/tr[2]/td[2]/a")
	private WebElement customerSearchDetails;

	// Add product info details
	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[2]")
	private WebElement gscAddProductInfoIcon;

	@FindBy(xpath = "//input[@id='DecalModel']")
	private WebElement gscModel;

	@FindBy(xpath = "(//span[text()='r/JD Miscellaneous Equipment'])[2]")
	private WebElement gscSelectedModel;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement gscProductInformationSubitButton;

	// CaseCoding functional code, functional area
	@FindBy(xpath = "//input[@id='FUNC_AREA_NM']")
	private WebElement caseCodingFunctionalArea;

	@FindBy(xpath = "(//span[text()='CCE'])[1]")
	private WebElement selectCaseCodingFunctionalArea;

	@FindBy(xpath = "//input[@id='FUNC_CODE_NM']")
	private WebElement caseCodingFunctionalcode;

	// CaseInformation: priority, language, origin
	@FindBy(xpath = "//select[@id='CasePriority']")
	private WebElement gscPriority;

	@FindBy(xpath = "//select[@id='LanguageWithCode']")
	private WebElement gscLanguage;

	@FindBy(xpath = "//select[@id='Origin']")
	private WebElement gscOrigin;
	// Add Summary
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pCaseSummary']")
	private WebElement gscAddSummary;
	// Select WorkBasket
	@FindBy(xpath = "//select[@id='WorkbasketName']")
	private WebElement workBasket;

	@FindBy(xpath = "//select[@id='GSCSubWorkgroup']")
	private WebElement workSubgroup;

	@FindBy(xpath = "//input[@id='GreenFleetNumber']")
	private WebElement greenFleetNumber;

	// IFRame
	// @FindBy(id="PegaGadget0Ifr")
	// private WebElement IframeHomepage;

	@FindBy(name = "PegaGadget0Ifr")
	private WebElement iFrameHomepage;

	@FindBy(xpath = "//iframe[@id='CSC_Section']")
	private WebElement iFrameAddCustomer;

	// Click on Accept Button
	@FindBy(xpath = "(//button[@data-test-id='201802011400580656111285'])[1]")
	private WebElement clickonAcceptButton;

	@FindBy(xpath = "//span[@data-test-id='20141009112850013217103']")
	private WebElement caseId;

	@FindBy(xpath = "(//button[@data-test-id='2018021409524402562359'])[1]")
	private WebElement clickonsubmitbutton;

	@FindBy(xpath = "//a[@data-test-id='2014100609491604327565']")
	private WebElement clickonName;

	@FindBy(xpath = "	//span[contains(text(),'Log off')]")
	private WebElement clickonLogout;

	// Click on Route Button
	@FindBy(xpath = "(//button[@data-test-id='201802011400580656112342'])[1]")
	private WebElement clickonRouteButton;
	// Status as new
	@FindBy(xpath = "//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement statusAsNew;

	// Click on Action button
	@FindBy(xpath = "//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
	private WebElement clickonActionButton;
	
	@FindBy(xpath = "//span[contains(text(),'TSS Reopen: ')]")
	private WebElement tss;

	
	@FindBy(xpath = "//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement reopenStatus;
	
	@FindBy(xpath = "//li[@class='menu-item menu-item-enabled']//span[contains(text(),'Reopen')]")
	private WebElement reopen;

	// ClickonSendCaseEmail
	@FindBy(xpath = "//span[contains(text(),'Send Case Email')]")
	private WebElement clickGSCSendCaseMailButton;

	@FindBy(xpath = "//input[@data-test-id='201612271036230356233958']")
	private WebElement clickGSCEmailEnterBox;

	@FindBy(xpath = "(//button[@data-test-id='20140919030420037410647'])[1]")
	private WebElement clickGSCSendButton;

	// click on Audit Trails
	@FindBy(xpath = "//h2[contains(text(),'Audit')]")
	private WebElement auditTrails;

	// Casecoding_Action validation
	@FindBy(xpath = "//select[@id='Action']")
	private WebElement actionTextbox;

	// CaseCoding_Action_category
	@FindBy(xpath = "")
	private WebElement actionTextboxOptions;

	// Assertion Audit Trails
	@FindBy(xpath = "//div[contains(text(),'Time')]")
	private WebElement time;

	// assert Description
	@FindBy(xpath = "//div[contains(text(),'Description')]")
	private WebElement description;

	// assert PerformedBy
	@FindBy(xpath = "//div[contains(text(),'Performed by')]")
	private WebElement performedBy;

	// Transfer to workbasket
	@FindBy(xpath = "//span[contains(text(),'Work Case')]")
	private WebElement workcaseButton;

	@FindBy(xpath = "(//button[@data-test-id='201802011400580656112342'])[1]")
	private WebElement routeButton;

	@FindBy(xpath = "(//div[@class='field-item dataValueRead'])[3]")
	private WebElement assertNew;

	@FindBy(xpath = "//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement satatusOwned;

	
	@FindBy(xpath = "//li[@title='Transfer Case To WB']")
	private WebElement transferCaseToWB;

	@FindBy(xpath = "(//button[@data-test-id='20180206104022047318388'])[1]")
	private WebElement transferButton;

	@FindBy(xpath = "//button[@data-test-id='20180531073524008831831']")
	private WebElement withdrawButton;

	@FindBy(xpath = "(//button[@data-test-id='2018021409524402562359'])[2]")
	private WebElement withDrawSubmit;

	@FindBy(xpath = "//div[@data-test-id=\"20141009112130085821433\"]")
	private WebElement textMessage;

	@FindBy(xpath = "(//div[@class='field-item dataValueRead'])[2]")
	private WebElement resolvedWithdrawn;

	@FindBy(xpath = "//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing' ]")
	private WebElement newDraft;

	@FindBy(xpath = "//select[@id='WBName']")
	private WebElement selectWorkBasket;

	@FindBy(xpath = "(//button[contains(text(),'Cancel')])[1]")
	private WebElement cancelButton;

	@FindBy(xpath = "//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
	private WebElement withdrawAction;

	@FindBy(xpath = "//span[contains(text(),'Refresh')]")
	private WebElement refreshButton;

	@FindBy(xpath = "//span[contains(text(),'Work Case')]")
	private WebElement workcase;

	@FindBy(xpath = "//span[contains(text(),'Print')]")
	private WebElement print;

	@FindBy(xpath = "//iframe[@id='PegaGadget1Ifr']")
	private WebElement iFramePegaGadgetISG_Assertion;

	@FindBy(xpath = "//span[@data-test-id='20180424084340049412218']")
	private WebElement gscWorkBasket;

	@FindBy(xpath = "//label[contains(text(),'Correspondence')]")
	private WebElement gscCorrespondence;

	@FindBy(xpath = "(//a[@class='Case_tools'])[2]")
	private WebElement gscNewCaseMailLink;

	@FindBy(xpath = "//img[@data-test-id='20150114172745004213890']")
	private WebElement gscAttButton;

	@FindBy(xpath = "//div[@class='file-input-wrapper centered']")
	private WebElement gsc_SelectButton;

	@FindBy(xpath = "(//div[@class='pzbtn-mid'])[1]")
	private WebElement gsc_FileAttachButton;

	@FindBy(xpath = "//div[contains(text(),'A file has been attached: ISG_cust.')]")
	private WebElement assertFileAttached;

	@FindBy(xpath = "//div[contains(text(),'Correspondence has been attached: fddddddd.')]")
	private WebElement assertCorrespondanceAttached;

	@FindBy(xpath = "//span[contains(text(),'Transfer Case To Individu...')]")
	private WebElement gscTransferIndividual_Button;

	@FindBy(xpath = "//input[@data-test-id='20170915163723049610155']")
	private WebElement gscTransferIndividualOperator;

	@FindBy(xpath = "//input[@data-test-id='2015031809055206723480']")
	private WebElement gscTransferIndividualWorkbasket;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement gscTransferSubmit;

	@FindBy(xpath = "(//button[contains(text(),'Accept')])[1]")
	private WebElement acceptStatus;

	@FindBy(xpath = "(//button[contains(text(),'Accept And Close')])[1]")
	private WebElement acceptAndClose;

	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement saveStatus;

	@FindBy(xpath = "(//button[contains(text(),'Close')])[1]")
	private WebElement closeStatus;

	@FindBy(xpath = "//button[@data-test-id='201802081002310780562'])[1]")
	private WebElement cancelStatus;

	@FindBy(xpath = "//input[@id='phoneNumber']")
	private WebElement phone;
	
	@FindBy(xpath = "//td[contains(text(),'Business Name:')]")
	private WebElement businessName;

	@FindBy(xpath = "//td[contains(text(),'Last Name:')]")
	private WebElement lastName;

	@FindBy(xpath = "//td[contains(text(),'First/Familiar Name:')]")
	private WebElement firstName;

	@FindBy(xpath = "//td[contains(text(),'Country:')]")
	private WebElement country;

	@FindBy(xpath = "//div[@id='stateLabelSelect']")
	private WebElement state;

	@FindBy(xpath = "//div[@id='cityLabelText']")
	private WebElement city;

	@FindBy(xpath = "//td[contains(text(),'Zip/Postal Code:')]")
	private WebElement postalCode;

	@FindBy(xpath = "//input[@id='businessName']")
	private WebElement businessNameField;

	@FindBy(xpath = "//input[@id='postalCode']")
	private WebElement postal;

	@FindBy(xpath = "(//input[@class='button'])[1]")
	private WebElement reset;

	@FindBy(xpath = "//b[contains(text(),'Name')]")
	private WebElement business;

	@FindBy(xpath = "//b[contains(text(),'Physical Address')]")
	private WebElement physical;

	@FindBy(xpath = "//b[contains(text(),'Mailing Address')]")
	private WebElement mailing;

	@FindBy(xpath = "//a[contains(text(),'Clear Customer')]")
	private WebElement createCustomer;

	@FindBy(xpath = "//a[contains(text(),'Create Customer')]")
	private WebElement clearCustomer;

	@FindBy(xpath = "")
	private WebElement back;

	@FindBy(xpath = "//b[contains(text(),'Contact Information')]")
	private WebElement businessNumber;

	@FindBy(xpath = "//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
	private WebElement actionButton;
	// Select WorkBasket
	@FindBy(xpath = "//select[@id='WorkbasketName']")
	private WebElement workBasketButton;

	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[1]")
	private WebElement customerInfo;

	@FindBy(xpath = "//div[contains(text(),'Add Contact & Dealership Info')]")
	private WebElement contactDealesrship;

	@FindBy(xpath = "(//h2[contains(text(),'Case Coding')])[2]")
	private WebElement caseCodingHeader;

	@FindBy(xpath = "(//div[@data-test-id='20151123025854066711391'])[3]")
	private WebElement productInfo;

	@FindBy(xpath = "//h2[contains(text(),'Case Information')]")
	private WebElement caseInformation;

	@FindBy(xpath = "//h2[contains(text(),'Related Case')]")
	private WebElement relatedCase;

	@FindBy(xpath = "//h2[contains(text(),'Problem Details')]")
	private WebElement problemDetails;

	@FindBy(xpath = "//div[@data-test-id='20151123094958005467694']")
	private WebElement addFiles;

	@FindBy(name = "PegaGadget0Ifr")
	private WebElement greenFleetIframeHomepage;

	@FindBy(xpath = "//span[contains(text(),'Summary')]")
	private WebElement summ;

	@FindBy(xpath = "//span[contains(text(),'Workbasket')]")
	private WebElement workBas;

	@FindBy(xpath = "//span[@data-test-id='201802060658510010138182']")
	private WebElement greenFleetR4;

	@FindBy(xpath = "(//button[contains(text(),'Accept')])[1]")
	private WebElement accept;

	@FindBy(xpath = "(//button[contains(text(),'Accept And Close')])[1]")
	private WebElement accNClose;

	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement sav;

	@FindBy(xpath = "(//button[contains(text(),'Withdraw')])[1]")
	private WebElement withdraw;

	@FindBy(xpath = "//h2[contains(text(),'Audit')]")
	private WebElement audit;

	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement save;

	@FindBy(id = "CSC_Section")
	private static WebElement greenFleetIFrameAddCustomer;

	@FindBy(id = "PegaGadget0Ifr")
	private WebElement iFrameAddProduct;

	@FindBy(xpath = "(//button[@data-test-id='201802081002310780562'])[1]")
	private WebElement cancel;

	@FindBy(xpath = "(//button[@data-test-id='20180201162439008710139'])[1]")
	private WebElement close;

	@FindBy(xpath = "//span[contains(text(),'Refresh')]")
	private WebElement refresh;
	

	@FindBy(xpath = "//span[contains(text(),'Work Case')]")
	private WebElement workCase;

	public static String ParentHandleGSC;
	protected WebDriver driver;

	public GSCCustomerSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean isHomePageDisplayed() {

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadget);
		return CommonFunctions.isElementExist(driver, homePagetab);

	}

	public boolean isGSCPageDisplayed() throws InterruptedException {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitAndSwitchToFrame(driver, iFrameHomepage);
		return CommonFunctions.isElementExist(driver, gscAddCustInfoButton);
	}

	public boolean isContactAndDealership() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, addContactDealership);
	}

	public boolean isProductInfo() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, productInfoButton);
	}

	public boolean hasPhoneDisplayed() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, phone);
	}

	public boolean hasBusinessNameDisplayed() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, businessName);
	}

	public boolean haslastNameDisplayed() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, lastName);
	}

	public boolean hasFirstNameDisplayed() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, firstName);
	}

	public boolean hasCountryDisplayed() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, country);
	}

	public boolean hasStateDisplayed() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, state);
	}

	public boolean hasCityDisplayed() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, city);
	}

	public boolean hasZipDisplayed() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, postalCode);
	}

	public boolean isCaseCoding() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, caseCoding);
	}

	public boolean isAddCustomerDisplayed() {
		try {

			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return CommonFunctions.isElementExist(driver, customerSearchHeader);
	}

	public GSCCustomerSearch clickOnGSCCase() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, createGSCCase).click();
		// CommonFunctions.switchToiFrameByIDOrName(driver, IframeHomepage);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch enterBusiness(String business) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, businessNameField).sendKeys(business);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch enterZip(String business) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, postal).sendKeys(business);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickonReset() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, reset).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickAddCustomeInfo() throws InterruptedException {
		// CommonFunctions.waitAndSwitchToFrame(driver, IframeHomepage);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.waitAndSwitchToFrame(driver, iFrameHomepage);
		CommonFunctions.waitForElement(driver, gscAddCustInfoButton).click();
		return new GSCCustomerSearch(driver);

	}

	public boolean isFirstNameDisplayed() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, customerFirstName);
	}

	public boolean isLastNameDisplayed() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, customerLastName);
	}

	public boolean hasCustomeInfoDisplayed() {
		try {
			Thread.sleep(1000);
			driver.switchTo().parentFrame();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, gscAddProductInfoIcon);
	}

	// asertion for Route---> Status as New
	public boolean statusNew() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, statusAsNew);
	}

	public boolean hasActionDisplayed() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, clickonActionButton);
	}

	// method for customer firstname
	public GSCCustomerSearch enterCustomerFirstName(String custFirstName) throws InterruptedException {
		// driver.switchTo().defaultContent();
		// CommonFunctions.waitAndSwitchToFrame(driver, IframeHomepage);
		CommonFunctions.waitAndSwitchToFrame(driver, iFrameAddCustomer);
		try {

			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, customerFirstName).sendKeys(custFirstName);
		return new GSCCustomerSearch(driver);
	}
	// method for customer details:

	// method for customer lastname
	public GSCCustomerSearch enterCustomerLastName(String custLastName) {
		CommonFunctions.waitForElement(driver, customerLastName).sendKeys(custLastName);
		return new GSCCustomerSearch(driver);
	}

	// method to select country
	public GSCCustomerSearch selectCountry(String Country) {
		try {

			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, customerCountry).sendKeys(Country);
		return new GSCCustomerSearch(driver);

	}

	// method for Search customer
	public GSCCustomerSearch gscSearchCustomer() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, gscAddCustInfoSearchCustomers).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch gscCustomerDetails() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, customerDetails).click();
		return new GSCCustomerSearch(driver);
	}

	// click on search customer details
	public GSCCustomerSearch gscSearchCustomerDetails() {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, customerSearchDetails).click();
		return new GSCCustomerSearch(driver);
	}

	// click on Add product
	public GSCCustomerSearch clickOnAddProductInfo() throws InterruptedException {
		CommonFunctions.waitAndSwitchToFrame(driver, iFrameAddProduct);
		CommonFunctions.waitForElement(driver, gscAddProductInfoIcon).click();
		return new GSCCustomerSearch(driver);
	}

	// enter product model
	public GSCCustomerSearch enterProductModel(String model) {
		CommonFunctions.waitForElement(driver, gscModel).sendKeys(model);
		return new GSCCustomerSearch(driver);
	}

	// click on product submit
	public GSCCustomerSearch clickAddProductSubmit() {

		CommonFunctions.waitForElement(driver, gscProductInformationSubitButton).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch enterCasecodingFA(String FArea) {
		try {

			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, caseCodingFunctionalArea).sendKeys(FArea);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch enterCasecodingFC(String FCode) {
		CommonFunctions.waitForElement(driver, caseCodingFunctionalcode).sendKeys(FCode);

		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch enterPriority(String Priority) throws InterruptedException {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, gscPriority).sendKeys(Priority);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch enterLanguage(String Language) {
		CommonFunctions.waitForElement(driver, gscLanguage).sendKeys(Language);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch enterOrigin(String Origin) throws InterruptedException {
		Thread.sleep(1000);
		CommonFunctions.waitForElement(driver, gscOrigin).sendKeys(Origin);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch enterGreenFleetNumber(String number) throws InterruptedException {
		Thread.sleep(1000);
		CommonFunctions.waitForElement(driver, greenFleetNumber).sendKeys(number);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch enterAddSummary(String summary) {
		CommonFunctions.waitForElement(driver, gscAddSummary).sendKeys(summary);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickOnClose() {
		CommonFunctions.waitForElement(driver, closeStatus).click();
		return new GSCCustomerSearch(driver);
	}
	
	// click on Withdraw
		public GSCCustomerSearch clickOnWithdraw() {
			CommonFunctions.waitForElement(driver, withdrawButton).click();
			return new GSCCustomerSearch(driver);
		}

	// File uploading and submit
	public GSCCustomerSearch enterFileAttachmentDetails() throws Throwable {
		CommonFunctions.waitForElement(driver, gscAttButton).click();
		CommonFunctions.waitForElement(driver, gsc_SelectButton).click();
		CommonFunctions.uploadFileUsingRobotClass("C:\\Users\\laharip\\Pictures\\Emailble Report.png");
		CommonFunctions.waitForElement(driver, gsc_FileAttachButton).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch selectWorkBasket(String Workbasket) {
		try {
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.selectFromDropdown(driver, Workbasket, workBasket);
		CommonFunctions.selectFromDropdown(driver, Workbasket, workBasket);

		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch selectWorkgroup(String Workgroup) throws InterruptedException {
		try {

			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, workSubgroup).sendKeys(Workgroup);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickOnAccept() {
		try {
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, clickonAcceptButton).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch switchToAlert() {
		CommonFunctions.waitForAlert(driver);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch getDealerCase() {
		String Case_ID = CommonFunctions.waitForElement(driver, caseId).getText();
		System.out.println("" + Case_ID);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickOnsubmit() {
		CommonFunctions.waitForElement(driver, clickonsubmitbutton).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickOnName() {
		CommonFunctions.waitForElement(driver, clickonName).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickOnLogout() {
		CommonFunctions.waitForElement(driver, clickonLogout).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickOnRoute() {
		CommonFunctions.waitForElement(driver, clickonRouteButton).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickOnActions() {
		CommonFunctions.waitForElement(driver, clickonActionButton).click();
		return new GSCCustomerSearch(driver);
	}
	
	public GSCCustomerSearch clickonTSS() {
		CommonFunctions.waitForElement(driver, tss).click();
		return new GSCCustomerSearch(driver);
	}
	
	public GSCCustomerSearch clickOnWorkcase() {
		CommonFunctions.waitForElement(driver, workCase).click();
		return new GSCCustomerSearch(driver);
	}
	
	

	public GSCCustomerSearch clickOnReopen() {
		CommonFunctions.waitForElement(driver, reopen).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch gscTransferToIndividual() throws InterruptedException {
		CommonFunctions.waitForElement(driver, gscTransferIndividual_Button).click();
		Thread.sleep(4000);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch sendCaseMail() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, clickGSCSendCaseMailButton).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch enterSendCaseMail(String mail) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, clickGSCEmailEnterBox).sendKeys(mail);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch sendButton() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, clickGSCSendButton).click();
		return new GSCCustomerSearch(driver);

	}

	public GSCCustomerSearch auditTrails() {
		CommonFunctions.scrollToElement(driver, auditTrails);
		CommonFunctions.waitForElement(driver, auditTrails).click();
		return new GSCCustomerSearch(driver);
	}

	public boolean time() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, time);
	}

	public boolean description() {
		try {
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, description);

	}

	public boolean performedBy() {
		try {
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, performedBy);

	}

	public GSCCustomerSearch alertVerification() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForAlert(driver);
		return new GSCCustomerSearch(driver);
	}

	public boolean route_NewStatus() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return CommonFunctions.isElementExist(driver, statusAsNew);

	}

	public boolean hasOwnedStatus() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, satatusOwned);
	}

	public boolean hasCloseStatus() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, closeStatus);
	}

	public boolean hasSaveStatus() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, saveStatus);
	}

	public boolean hasCancelStatus() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, cancelStatus);
	}

	public boolean hasReopenStatus() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, reopenStatus);
	}

	public boolean hasFileAttached(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (CommonFunctions.waitForElement(driver, assertFileAttached).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean hasCorrespondanceAttached(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (CommonFunctions.waitForElement(driver, assertCorrespondanceAttached).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	// selected from operator dropdown
	public GSCCustomerSearch gscOperatortDropdown(String operator) throws InterruptedException {
		CommonFunctions.waitForElement(driver, gscTransferIndividualOperator).sendKeys(operator);
		Thread.sleep(4000);
		return new GSCCustomerSearch(driver);
	}

	// selected from transfer workbasket dropdown
	public GSCCustomerSearch gscTransferWorkbasket(String workbasket) throws InterruptedException {
		CommonFunctions.waitForElement(driver, gscTransferIndividualWorkbasket).sendKeys(workbasket);
		Thread.sleep(4000);
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch transferSubmitButton() {
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, gscTransferSubmit).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickonAction() {
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, clickonActionButton).click();
		return new GSCCustomerSearch(driver);

	}

	public GSCCustomerSearch clickonWorkcase() {
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, workcaseButton).click();
		return new GSCCustomerSearch(driver);

	}

	public GSCCustomerSearch clickOnTransfer_Case_Workbasket() {
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, transferCaseToWB).click();
		return new GSCCustomerSearch(driver);

	}

	public GSCCustomerSearch selectRoutingWorkBasket(String WB) {
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, selectWorkBasket).sendKeys(WB);

		return new GSCCustomerSearch(driver);

	}
	


	public GSCCustomerSearch clickOnTransfer() {
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, transferButton).click();
		return new GSCCustomerSearch(driver);
	}

	// click on cancel button.
	public GSCCustomerSearch clickOnCancel() {
		CommonFunctions.waitForElement(driver, cancelButton).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickOnSubmitwithdraw() {
		CommonFunctions.waitForElement(driver, withDrawSubmit).click();
		return new GSCCustomerSearch(driver);
	}

	public GSCCustomerSearch clickonWithdrawAction() {
		CommonFunctions.waitForElement(driver, withdrawAction).click();
		return new GSCCustomerSearch(driver);
	}

	public boolean isOptionsRefreshDisplayed(String ref) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (CommonFunctions.waitForElement(driver, refresh).getText().contains(ref)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOptionsWorkCaseDisplayed(String wc) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (CommonFunctions.waitForElement(driver, workcase).getText().contains(wc)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOptionsPrintDisplayed(String prnt) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (CommonFunctions.waitForElement(driver, print).getText().contains(prnt)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean hasWithdrawStatusDisplayed() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, resolvedWithdrawn);
	}

	public boolean hasNewDraftStatusDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, newDraft);

	}

	public boolean hasSaveStatusDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, saveStatus);

	}

	public boolean hasAcceptAndCloseStatusDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, acceptAndClose);

	}

	public boolean hasAcceptStatusDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, acceptStatus);

	}

	public GSCCustomerSearch enterCasecodingFCReportonly(String FCode) {
		CommonFunctions.waitForElement(driver, caseCodingFunctionalcode).sendKeys(FCode);
		CommonFunctions.waitForElement(driver, caseCodingFunctionalcode).sendKeys(FCode);
		return new GSCCustomerSearch(driver);
	}

	// Get GSC WorkBasket value
	public GSCCustomerSearch getWorkBasket_GSC() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitAndSwitchToFrame(driver, iFramePegaGadgetISG_Assertion);
		String WorkBasket = CommonFunctions.waitForElement(driver, gscWorkBasket).getText();
		return new GSCCustomerSearch(driver);
	}

	public boolean hasBusinessDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, business);

	}

	public boolean hasPhysicalDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, physical);

	}

	public boolean hasMailingDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, mailing);

	}

	public boolean hasBackDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, back);

	}

	public boolean hasCreateCustomerDisplayed() {
		return CommonFunctions.isElementExist(driver, createCustomer);

	}

	public boolean hasClearCustomerDisplayed() {
		return CommonFunctions.isElementExist(driver, clearCustomer);

	}

	public boolean hasBusinessNumberDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, businessNumber);

	}

	public boolean hasCustomerInfoDisplayed(String cust) {
		return CommonFunctions.isElementExist(driver, customerInfo);
	}

	public boolean hasConatctAndDealershipDisplayed(String contact) {
		return CommonFunctions.isElementExist(driver, contactDealesrship);
	}

	public boolean hasProductInfoDisplayed(String product) {
		return CommonFunctions.isElementExist(driver, productInfoButton);
	}

	public boolean hasCaseCodingDisplayed(String cc) {
		return CommonFunctions.isElementExist(driver, caseCoding);
	}

	public boolean hasCaseInformationDisplayed(String ci) {
		return CommonFunctions.isElementExist(driver, caseInformation);
	}

	public boolean hasRelatedCaseDisplayed(String relcas) {
		return CommonFunctions.isElementExist(driver, relatedCase);
	}

	public boolean hasProblemDetailsDisplayed(String probdet) {
		return CommonFunctions.isElementExist(driver, problemDetails);
	}

	public boolean hasSummaryDisplayed(String summary) {
		return CommonFunctions.isElementExist(driver, summ);
	}

	public boolean hasWorkbasketDisplayed(String workbasketButton) {
		return CommonFunctions.isElementExist(driver, workBas);
	}

	public boolean hasAcceptDisplayed(String acc) {
		return CommonFunctions.isElementExist(driver, accept);
	}

	public boolean hasAcceptandCloseDisplayed(String accNClose) {
		return CommonFunctions.isElementExist(driver, acceptAndClose);
	}

	public boolean hasAcceptandCloseDisplayed() {
		return CommonFunctions.isElementExist(driver, acceptAndClose);
	}

	public boolean hasWithdrawDisplayed(String withdraw) {
		return CommonFunctions.isElementExist(driver, acceptAndClose);
	}

	public boolean hasAuditDisplayed(String aud) {
		return CommonFunctions.isElementExist(driver, audit);
	}

	public boolean hasSaveDisplayed(String sav) {
		return CommonFunctions.isElementExist(driver, save);
	}

	// Validate Work Basket in main pge
	public boolean hasWorkBasketDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, gscWorkBasket);

	}

	// Click on Correspondence
	public GSCCustomerSearch clickOnCorrespondence() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, gscCorrespondence).click();
		ParentHandleGSC = driver.getWindowHandle();
		System.out.println("Parent window is " + ParentHandleGSC);
		return new GSCCustomerSearch(driver);
	}
	

}
