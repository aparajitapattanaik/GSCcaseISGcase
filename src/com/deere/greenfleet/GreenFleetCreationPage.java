package com.deere.greenfleet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;


public class GreenFleetCreationPage {

	@FindBy(xpath = "(//label[contains(text(),'Home')])[1]")
	private WebElement homePageTab;

	@FindBy(xpath = "//iframe[contains(@src,'SolutionSearchHome')]")
	private WebElement iFramePegaGadget;

	@FindBy(xpath = "//button[@data-test-id='20180201163908004467353']")
	private WebElement createGreenfleetCase;

	// Add Customer Information Details
	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[1]")
	private WebElement greenFleetAddCustInfoButton;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement greenFleetFirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement greenFleetLastName;

	@FindBy(xpath = "//select[@id='country']")
	private WebElement customerCountry;

	@FindBy(xpath = "//input[@class='button btn btn-primary']")
	private WebElement greenFleetAddCustInfoSearchCustomers;
	
	@FindBy(xpath="(//button[@class='buttonTdButton'])[2]")
	private WebElement alertCancel;

	@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
	private WebElement greenFleetCustomerSearchHeader;

	@FindBy(xpath = "//table[@id='results']/tbody/tr[2]/td[2]/a")
	private WebElement customerSearchDetails;
	// AddCustomer GetText
	@FindBy(xpath = "//h2[@id='headerlabel1600']")
	private WebElement customerInformation;

	@FindBy(xpath = "(//span[@data-test-id='201802211054570002105727'])[1]")
	private WebElement firstNameText;

	@FindBy(xpath = "(//span[@data-test-id='201802211054570002105727'])[2]")
	private WebElement lastNameText;

	@FindBy(xpath = "//span[@data-test-id='201803021304180155104235']")
	private WebElement phonenumber;

	@FindBy(xpath = "//span[@ data-test-id='20180221105250019383254']")
	private WebElement entityId;

	// Add product info details
	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[2]")
	private WebElement greenFleetAddProductInfoIcon;

	@FindBy(xpath = "//input[@id='DecalModel']")
	private WebElement greenFleetModel;

	@FindBy(xpath = "(//span[text()='r/JD Miscellaneous Equipment'])[2]")
	private WebElement greenFleetSelectedModel;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement greenFleetProductInformationSubitButton;

	// CaseCoding functional code, functional area
	@FindBy(xpath = "//input[@id='FUNC_AREA_NM']")
	private WebElement caseCodingFunctionalArea;

	@FindBy(xpath = "(//span[text()='CCE'])[1]")
	private WebElement selectCaseCodingFunctionalArea;

	@FindBy(xpath = "//input[@id='FUNC_CODE_NM']")
	private WebElement caseCodingFunctionalcode;

	@FindBy(xpath = "//span[text()='1602']")
	private WebElement selectCaseCodingFunctionalcode;

	// CaseInformation: priority, language, origin
	@FindBy(xpath = "//select[@id='CasePriority']")
	private WebElement greenFleetPriority;

	@FindBy(xpath = "//select[@id='LanguageWithCode']")
	private WebElement greenFleetLanguage;

	@FindBy(xpath = "//select[@id='Origin']")
	private WebElement greenFleetOrigin;
	// Add Summary
	@FindBy(xpath = "//input[@name='$PpyWorkPage$pCaseSummary']")
	private WebElement greenFleetAddSummary;
	// Submit
	@FindBy(xpath = "(//button[@data-test-id=\"2018021409524402562359\"])[1]")
	private WebElement greenFleetSubmitButton;

	@FindBy(xpath = "//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
	private WebElement clickonActionButton;
	// Select WorkBasket
	@FindBy(xpath = "//select[@id='WorkbasketName']")
	private WebElement workBasket;

	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[1]")
	private WebElement customerInfo;

	@FindBy(xpath = "//div[contains(text(),'Add Contact & Dealership Info')]")
	private WebElement contactDealesrship;

	@FindBy(xpath = "(//h2[contains(text(),'Case Coding')])[2]")
	private WebElement caseCoding;

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
	
	@FindBy(xpath = "//*[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement owned;
	
	@FindBy(xpath = "(//button[contains(text(),'Withdraw')])[1]")
	private WebElement withdraw;

	@FindBy(xpath = "//h2[contains(text(),'Audit')]")
	private WebElement audit;

	@FindBy(id = "CSC_Section")
	private static WebElement greenFleetIFrameAddCustomer;

	@FindBy(id = "PegaGadget0Ifr")
	private WebElement iFrameAddProduct;
	
	@FindBy(id="CSC_Section")
	private WebElement iFrameCustomerSearch;

	@FindBy(xpath = "(//button[@data-test-id='201802081002310780562'])[1]")
	private WebElement cancel;

	@FindBy(xpath = "(//button[@data-test-id='20180201162439008710139'])[1]")
	private WebElement close;
	
	@FindBy(xpath = "")
	private WebElement action;
	
	@FindBy(xpath = "")
	private WebElement workcase;
	
	@FindBy(xpath = "@//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement resolved;

	@FindBy(xpath = "//span[contains(text(),'Refresh')]")
	private WebElement refresh;

	@FindBy(xpath = "//span[contains(text(),'Transfer Case To WB')]")
	private WebElement transferWorkbasket;

	@FindBy(xpath = "//span[contains(text(),'Transfer Case To Individu...')]")
	private WebElement transferToIndividua;

	@FindBy(xpath = "//span[contains(text(),'Send Case Email')]")
	private WebElement sendCaseEmail;

	@FindBy(xpath = "//span[contains(text(),'Print')]")
	private WebElement print;
	
	@FindBy(xpath = "//a[@data-test-id='2014100609491604327565']")
	private WebElement clickonName;

	@FindBy(xpath = "	//span[contains(text(),'Log off')]")
	private WebElement clickonLogout;

	@FindBy(xpath = "//span[@data-test-id='20141009112850013217103']")
	private WebElement caseId;
	
	@FindBy(xpath="//td[contains(text(),'Zip/Postal Code:')]")
	private WebElement postalCode;
	
	@FindBy(xpath="//span[contains(text(),'Model')]")
	private WebElement modal;
	
	@FindBy(xpath="//label[contains(text(),'Usage')]")
	private WebElement usage;
	
	@FindBy(xpath="//label[contains(text(),'Units')]")
	private WebElement units;
	
	@FindBy(xpath="//input[@id='PinNumber']")
	private WebElement pin;
	
	@FindBy(xpath="	//input[@id='PartNumber1']")
	private WebElement part;
	
	@FindBy(xpath="//input[@id='ComponentSerialNumber1']")
	private WebElement component;
	
	@FindBy(xpath="")
	private WebElement comment;
	

	protected WebDriver driver;

	public GreenFleetCreationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean homePageDisplayed() {

		try {

			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadget);
		return CommonFunctions.isElementExist(driver, homePageTab);

	}

	public boolean greenFleetPageDisplayed() {

		// CommonFunctions.waitAndSwitchToFrame(driver, GreenFleetIFrameAddCustomer);
		CommonFunctions.waitAndSwitchToFrame(driver, greenFleetIframeHomepage);
		return CommonFunctions.isElementExist(driver, greenFleetAddCustInfoButton);
	}

	public boolean hasCustomerInfoDisplayed(String cust) {
		return CommonFunctions.isElementExist(driver, customerInfo);
	}

	public boolean hasConatctAndDealershipDisplayed(String contact) {
		return CommonFunctions.isElementExist(driver, contactDealesrship);
	}

	public boolean hasProductInfoDisplayed(String product) {
		return CommonFunctions.isElementExist(driver, productInfo);
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

	public boolean hasWorkbasketDisplayed(String workbasket) {
		return CommonFunctions.isElementExist(driver, workBas);
	}

	public boolean hasGreenFleetR4Displayed(String greenfleet)

	{
		return CommonFunctions.isElementExist(driver, greenFleetR4);
	}
    
	public boolean hasCommentsDisplayed(String greenfleet)

	{
		return CommonFunctions.isElementExist(driver, comment);
	}
    
	
	public GreenFleetCreationPage getDealerCase()  {
		String Case_ID = CommonFunctions.waitForElement(driver, caseId).getText();
		System.out.println("" + Case_ID);
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage clickOnName() {
		CommonFunctions.waitForElement(driver, clickonName).click();
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage clickOnLogout() {
		CommonFunctions.waitForElement(driver, clickonLogout).click();
		return new GreenFleetCreationPage(driver);
	}
	/*
	 * public boolean hasCommentsDisplayed(String greenfleet) { return
	 * CommonFunctions.isElementExist(driver,comment); }
	 */

	public boolean hasAcceptDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, accept);
	}

	public boolean hasAcceptandCloseDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, accNClose);
	}

	public boolean hasWithdrawDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, withdraw);
	}

	public boolean hasCloseDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, close);
	}
	public boolean hasResolvedCompletedDisplayed(String resolv) {
		return CommonFunctions.isElementExist(driver, resolved);
	}

	public boolean hasCancelDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, cancel);
	}

	public boolean hasRefreshDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, refresh);
	}

	public boolean hasWorkBasketDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, transferWorkbasket);
	}

	public boolean hasTransferIndividualDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, transferToIndividua);
	}

	public boolean hasSendCaseEmailDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, sendCaseEmail);
	}

	public boolean hasPrintDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, print);
	}

	public boolean hasSaveDisplayed(String save) {
		return CommonFunctions.isElementExist(driver, sav);
	}
	
	
	public boolean hasOwnedDisplayed(String own) {
		return CommonFunctions.isElementExist(driver, owned);
	}
	

	public boolean hasAuditDisplayed(String aud) {
		return CommonFunctions.isElementExist(driver, audit);
	}

	public boolean addFiles() {
		return CommonFunctions.isElementExist(driver, addFiles);
	}

	public GreenFleetCreationPage clickonGreenFleetCase() {
		CommonFunctions.waitForElement(driver, createGreenfleetCase).click();
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage clickGreenFleetAddCustomeInfo() {
		//CommonFunctions.switchToiFrameByWebElement(driver, iFrameCustomerSearch);
		CommonFunctions.waitForElement(driver, greenFleetAddCustInfoButton).click();
		return new GreenFleetCreationPage(driver);
	}
	
	public GreenFleetCreationPage clickonClose() {
		CommonFunctions.waitForElement(driver, close).click();
		return new GreenFleetCreationPage(driver);
	}
	
	
	public GreenFleetCreationPage clickonActions() {
		CommonFunctions.waitForElement(driver, action).click();
		return new GreenFleetCreationPage(driver);
	}
	
	public GreenFleetCreationPage clickonWorkcase() {
		CommonFunctions.waitForElement(driver, workcase).click();
		return new GreenFleetCreationPage(driver);
	}
	
	public GreenFleetCreationPage clickonAccept() {
		CommonFunctions.waitForElement(driver, accept).click();
		return new GreenFleetCreationPage(driver);
	}
	
	

	

	public GreenFleetCreationPage acceptButton() {
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, accept).click();
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage switchToAlert() {
		CommonFunctions.waitForAlert(driver);
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage enterGreenFleetCustomerFirstName(String FirstName) {
		CommonFunctions.waitAndSwitchToFrame(driver, greenFleetIFrameAddCustomer);
		try {

			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, greenFleetFirstName).sendKeys(FirstName);
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage enterGreenFleetCustomerLastName(String LastName) {
		CommonFunctions.waitForElement(driver, greenFleetLastName).sendKeys(LastName);
		;
		return new GreenFleetCreationPage(driver);
	}

	public boolean addCustomerDisplayed() {
		try {

			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return CommonFunctions.isElementExist(driver, greenFleetCustomerSearchHeader);
	}

	public GreenFleetCreationPage enterGreenFleetselectCountry(String Country) {
		CommonFunctions.waitForElement(driver, customerCountry).sendKeys(Country);
		return new GreenFleetCreationPage(driver);
	}

	// method for GreenFleetsearch customer
	public GreenFleetCreationPage greenFleetSearchCustomer() {
		try {
			Thread.sleep(1000);	
		}catch(Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.switchToiFrameByWebElement(driver, iFrameCustomerSearch);
		CommonFunctions.waitForElement(driver, greenFleetAddCustInfoSearchCustomers).click();
		return new GreenFleetCreationPage(driver);
	}
	public GreenFleetCreationPage greenFleetLastNameCustomer() {
		try {
			Thread.sleep(1000);	
		}catch(Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, greenFleetAddCustInfoSearchCustomers).click();
		return new GreenFleetCreationPage(driver);
	}
	
	public GreenFleetCreationPage greenFleetPostalCodeCustomer() {
		try {
			Thread.sleep(1000);	
		}catch(Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, greenFleetAddCustInfoSearchCustomers).click();
		return new GreenFleetCreationPage(driver);
	}
	
	public GreenFleetCreationPage clickOnCancel() {

		CommonFunctions.waitForElement(driver, alertCancel).click();
		CommonFunctions.SwitchToDefaultFrame(driver);
		return new GreenFleetCreationPage(driver);
	}
	
	public GreenFleetCreationPage enterPostalCode(String code) {
		CommonFunctions.waitForElement(driver, postalCode).sendKeys(code);
		return new GreenFleetCreationPage(driver);
	}

	// method for GreenFleet Search customer Details
	public GreenFleetCreationPage greenFleetSearchCustomerDetails() {
		CommonFunctions.waitForElement(driver, customerSearchDetails).click();
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new GreenFleetCreationPage(driver);
	}
	
	
	
	public boolean hasModalDisplayed(String mod) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, modal);
	}
	public boolean hasUsageDisplayed(String usg) {
		return CommonFunctions.isElementExist(driver, usage);
	}
	
	public boolean hasUnitsDisplayed(String uni) {
		return CommonFunctions.isElementExist(driver, units);
	}
	
	public boolean hasPinDisplayed(String pi) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, pin);
	}
	
	public boolean hasPartNumberDisplayed(String par) {
		return CommonFunctions.isElementExist(driver, part);
	}
	
	
	public boolean hasComponentSerialNumberDisplayed() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, component);
	}
	

	// method for Add Product
	// click on Add product
	public GreenFleetCreationPage greenFleetClickonAddProductInfo() throws InterruptedException {
		CommonFunctions.waitAndSwitchToFrame(driver, iFrameAddProduct);
		CommonFunctions.waitForElement(driver, greenFleetAddProductInfoIcon).click();
		return new GreenFleetCreationPage(driver);
	}

	// enter product model
	public GreenFleetCreationPage greenFleetEnterProductModel(String model) {
		CommonFunctions.waitForElement(driver, greenFleetModel).sendKeys(model);
		return new GreenFleetCreationPage(driver);
	}
	
	public GreenFleetCreationPage greenFleetEnterInvalidModel(String cha) {
		CommonFunctions.waitForElement(driver, greenFleetModel).sendKeys(cha);
		return new GreenFleetCreationPage(driver);
	}
	

	// click on product submit
	public GreenFleetCreationPage greenFleetClickAddProductSubmit() {

		CommonFunctions.waitForElement(driver, greenFleetProductInformationSubitButton).click();
		return new GreenFleetCreationPage(driver);
	}

	// Switching of IFRame
	public static void switchToiFrameByID(WebDriver driver, String Id) {
		driver.switchTo().frame(Id);
	}

	public static void switchToDefaultFrame(WebDriver driver, String Id) {
		driver.switchTo().frame(Id);
	}

	public boolean firstnameDisplayed() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, greenFleetFirstName);
	}

	public boolean lastnameDisplayed() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, greenFleetLastName);
	}

	// assertion for CustomerInformation
	public boolean hasCustomeInfoDisplayed() {
		try {

			Thread.sleep(1000);

			driver.switchTo().parentFrame();
			Thread.sleep(1000);
			// CommonFunctions.waitAndSwitchToFrame(driver, GreenFleetIframeHomepage);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, greenFleetAddProductInfoIcon);
	}

	// assertion for firstname

	public boolean hasFirstNameDisplayed() {
		try {

			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return CommonFunctions.isElementExist(driver, firstNameText);
	}

	// assertion for second name
	public boolean haslastnameDisplayed() {
		try {

			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return CommonFunctions.isElementExist(driver, lastNameText);
	}

	// asertion for phone number
	public boolean hasPhonenumberDisplayed() {
		try {

			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return CommonFunctions.isElementExist(driver, phonenumber);
	}

	// assertion for entity ID
	public boolean hasEntityId() {
		try {

			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return CommonFunctions.isElementExist(driver, entityId);
	}

	// method for customer firstname
	public GreenFleetCreationPage enterCustomerFirstName(String CustFirstName) {
		CommonFunctions.waitForElement(driver, greenFleetFirstName).sendKeys(CustFirstName);
		return new GreenFleetCreationPage(driver);
	}

	// method for customer lastname
	public GreenFleetCreationPage enterCustomerLastName(String CustLastName) {
		CommonFunctions.waitForElement(driver, greenFleetLastName).sendKeys(CustLastName);
		return new GreenFleetCreationPage(driver);
	}

	// method to select country
	public GreenFleetCreationPage selectCountry(String Country) {
		CommonFunctions.waitForElement(driver, customerCountry).sendKeys(Country);
		return new GreenFleetCreationPage(driver);
	}

	// method for Search customer
	public GreenFleetCreationPage gscSearchCustomer() {
		CommonFunctions.waitForElement(driver, greenFleetAddCustInfoSearchCustomers).click();
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage gscSearchCustomerDetails() {
		CommonFunctions.waitForElement(driver, customerSearchDetails).click();
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage greenFleetEnterCasecodingFA(String FArea) {
		CommonFunctions.waitForElement(driver, caseCodingFunctionalArea).sendKeys(FArea);
		/*
		 * CaseCodingFunctionalArea.sendKeys(Keys.ARROW_DOWN);
		 * CommonFunctions.waitForElement(driver,SelectCaseCodingFunctionalArea); try {
		 * 
		 * if(SelectCaseCodingFunctionalArea.getText().contains(FArea))
		 * SelectCaseCodingFunctionalArea.click(); }catch(Exception e) {
		 * e.printStackTrace(); }
		 */

		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage greenFleetCasecodingFC(String FCode) throws InterruptedException {
		Thread.sleep(3000);
		CommonFunctions.waitForElement(driver, caseCodingFunctionalcode).sendKeys(FCode);
		/*
		 * CaseCodingFunctionalArea.sendKeys(Keys.ARROW_DOWN);
		 * CommonFunctions.waitForElement(driver,SelectCaseCodingFunctionalcode); try {
		 * 
		 * if(SelectCaseCodingFunctionalcode.getText().contains(FCode))
		 * SelectCaseCodingFunctionalcode.click(); }catch(Exception e) {
		 * e.printStackTrace(); }
		 */

		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage greenFleetenterPriority(String Priority) {
		CommonFunctions.waitForElement(driver, greenFleetPriority).sendKeys(Priority);
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage greenFleetenterLanguage(String Language) {
		CommonFunctions.waitForElement(driver, greenFleetPriority).sendKeys(Language);
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage greenFleetenterOrigin(String Origin) {
		CommonFunctions.waitForElement(driver, greenFleetPriority).sendKeys(Origin);
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage greenFleetEnterAddSummary(String summary) {
		CommonFunctions.waitForElement(driver, greenFleetAddSummary).sendKeys(summary);
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage greenFleetSubmitButton() {
		CommonFunctions.waitForElement(driver, greenFleetSubmitButton).click();
		return new GreenFleetCreationPage(driver);
	}

	public GreenFleetCreationPage clickonGreenFleetAction() {
		CommonFunctions.waitForElement(driver, clickonActionButton).click();
		return new GreenFleetCreationPage(driver);
	}

	
	/*
	 * public GreenFleetCreationPage selectWorkBasket() {
	 * CommonFunctions.selectFromDropdown(driver, "3PAreaOffice", WorkBasket);
	 * return new GreenFleetCreationPage(driver); }
	 */

}
