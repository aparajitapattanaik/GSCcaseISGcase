package com.deere.isgpage;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.gscpage.GSCCustomerSearch;
import com.deere.gscpage.ViewEmailZeacomPage;
import com.deere.mailrelatedpages.SendCaseEmail;

import com.deere.pages.OwnedCasePage;

import com.deere.pages.solutionsearchpage.SolutionSearchHomePage;


public class ISGCasePage {

	@FindBy(xpath = "(//*[@class='menu menu-format-standard menu-regular'])/li[2]")
	private WebElement workCase;
	
	@FindBy(xpath="//*[@data-test-id='201802011400580656111285']")
	private WebElement acceptButton; 

	@FindBy(xpath = "//*[@class='menu menu-format-standard menu-regular']/li[2]")
	private WebElement isgTransferWB;

	@FindBy(xpath = "//input[@id='WBName']")
	private WebElement newWorkBasket;

	@FindBy(xpath = "//tr[@id='$PD_ListWorkbasketInformationWithGSC$ppxResults$l1']")
	private WebElement newWorkBasketDropDown;

	@FindBy(xpath = "(//button[@data-test-id='20180419123512080115230'])[1]")
	private WebElement isgTransfer_Button;

	@FindBy(xpath = "//span[contains(text(),'Refresh')]")
	private WebElement refresh;

	@FindBy(xpath = "//input[@data-test-id='20180223145844071532513']")
	private WebElement isgCustomer_LastName;

	@FindBy(xpath = "//label[contains(text(),'Correspondence')]")
	private WebElement gscCorrespondence;

	@FindBy(xpath = "(//a[@class='Case_tools'])[2]")
	private WebElement gscNewCaseMailLink;
	
	@FindBy(xpath="//span[text()='Work Case']")
	private WebElement workCaseInActions;

	@FindBy(xpath = "(//a[starts-with(@title,'New Deere.com Case')])[1]")
	private WebElement gscNewCaseMailLinkZeacom;

	@FindBy(xpath = "//span[contains(text(),'Send Case Email')]")
	private WebElement clickGSCSendCaseMailButton;

	@FindBy(xpath = "//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing' ]")
	private WebElement reopenedStatus;

	@FindBy(xpath = " //input[@class='customIntegerInput']")
	private WebElement solutionIdBox;

	@FindBy(xpath = "//span[@data-test-id='201708302308570779178839']")
	private WebElement solutionSuccessMsg;

	@FindBy(xpath = "//img[@src='webwb/jdsearch_11621810146.png!!.png']")
	private WebElement solutionIdSearchImg;

	@FindBy(xpath = " (//button[@data-test-id='20180531073524008831831'])[1]")
	private WebElement withdrawButton;

	@FindBy(xpath = " //span[contains(text(),'US')]")
	private WebElement isgCust_CountryCodeAutoOption;

	@FindBy(xpath = "//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
	private WebElement isg_Actions;

	@FindBy(xpath = "//span[contains(text(),'Transfer Case To Individu...')]")
	private WebElement isgTransferIndividual_Button;

	@FindBy(xpath = "//input[@data-test-id='20170915163723049610155']")
	private WebElement isgTransferIndividualOperator;

	@FindBy(xpath = "//input[@data-test-id='2015031809055206723480']")
	private WebElement isgTransferIndividualWorkbasket;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement isgTransferSubmit;

	@FindBy(xpath = "//h2[contains(text(),'Audit')]")
	private WebElement auditTrails;

	@FindBy(xpath = "	//span[@id='close']")
	private WebElement caseclose;

	@FindBy(xpath = "(//div[@class='pzbtn-mid'])[1])")
	private WebElement discard;

	@FindBy(xpath = "//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
	private WebElement clickonActionButton;

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

	@FindBy(xpath = "//span[contains(text(),'Summary')]")
	private WebElement summ;

	@FindBy(xpath = "//span[contains(text(),'Workbasket')]")
	private WebElement workBas;

	@FindBy(xpath = "(//button[contains(text(),'Accept')])[1]")
	private WebElement accept;

	@FindBy(xpath = "(//button[contains(text(),'Accept And Close')])[1]")
	private WebElement acceptAndClose;

	@FindBy(xpath = "(//button[contains(text(),'Withdraw')])[1]")
	private WebElement withdraw;
	
	@FindBy(xpath = "//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing' ]")
	private WebElement newDraft;

	@FindBy(xpath = "//h2[contains(text(),'Audit')]")
	private WebElement audit;

	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement save;

	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[3]")
	private WebElement productInfoButton;

	@FindBy(xpath = "(//h2[contains(text(),'Case Coding')])[2]")
	private WebElement caseCoding;

	@FindBy(xpath = "//span[@data-test-id='20151102025927043277266'][@class='jd_h3_text']")
	private WebElement isgProductValueAssertion;

	@FindBy(xpath = "(//span[@data-test-id='201802211054570002105727'])[1]")
	private WebElement isgCustomerFirstName;

	@FindBy(xpath = "(//span[@data-test-id='201802211054570002105727'])[2]")
	private WebElement isgCustomerLastName;

	@FindBy(xpath = "//span[@data-test-id='201803021304180157105844']")
	private WebElement isgCustomerPhoneNumber;

	@FindBy(xpath = "//span[@data-test-id='20180221105250019383254']")
	private WebElement isgEntityId;

	@FindBy(xpath = "//span[@data-test-id='20180221105140017779602']")
	private WebElement isgEmailAddress;

	@FindBy(xpath = "//span[@data-test-id='2018042413580400821689']")
	private WebElement isgWorkBasket;

	@FindBy(xpath = "//div[@class=' content layout-content-portal_header_group_primary  content-portal_header_group_primary clearfix']")
	private WebElement isgPSC_ErrorMsg;

	@FindBy(xpath = "(//img[@src='webwb/pzediticon_13962397645.png!!.png'])")
	private WebElement isgCustomer_Clear;

	@FindBy(xpath = "(//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing'])[1]")
	private WebElement isg_Status;

	@FindBy(xpath = "//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
	private WebElement isgAction_Button;

	@FindBy(xpath = "//iframe[contains(@src,'SolutionSearchHome')]")
	private WebElement framePegaGadget;

	@FindBy(xpath = "//input[@id='SolutionSummary'][contains(@name,'SolutionSummary')]")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//div[text()='Actions ']")
	private WebElement actionBtn; 

	@FindBy(xpath = "//input[@id='CategoryString'][@title='Search Category']")
	private WebElement categoryTxtBox;

	@FindBy(xpath = "//table[@id='bodyTbl_right']//tbody//div[@class='oflowDiv']//div[@class='cellIn']/span")
	private List<WebElement> categoryAutoOptions;

	@FindBy(xpath = "//input[@id='SubCategoryString'][@title='Search Sub-Category']")
	private WebElement subCategoryTxtBox;

	@FindBy(xpath = "//table[@id='bodyTbl_right']//tr[contains(@id,'$PD_DTACSubCategory')]//div[@class='cellIn']/span")
	private List<WebElement> subCategoryAutoOptions;

	@FindBy(xpath = "//input[@id='SearchDecalModel']")
	private WebElement decalModelTxtBox;

	@FindBy(xpath = "//table[@id='bodyTbl_right']/tbody/tr//td/div[@class='oflowDiv']//span[@class='match-highlight']")
	private WebElement autoOptions;

	@FindBy(xpath = "//input[@id='ModelString'][@title='Select Decal Model']")
	private WebElement modelTxtBox;

	@FindBy(xpath = "//table[@id='bodyTbl_right']/tbody//div[@class='oflowDiv']//span[@class='match-highlight']")
	private WebElement modelAutoOptions;

	@FindBy(xpath = "//span[@data-test-id='20180424084340049412218']")
	private WebElement gscWorkBasket;

	@FindBy(xpath = "//iframe[@id='PegaGadget0Ifr']")
	private WebElement iframePegaGadgetISG;

	@FindBy(xpath = "//iframe[@id='PegaGadget1Ifr']")
	private WebElement iframePegaGadgetISG_Assertion;

	@FindBy(xpath = "//iframe[@id='PegaGadget3Ifr']")
	private WebElement iframe_Case_Form_Assertion;

	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[1]")
	private WebElement addCustomerInfoLink;

	@FindBy(xpath = "//*[@id='CustomerSearchCountryCode']")
	private WebElement isgCustomer_CountryCode;

	@FindBy(xpath = "//*[@id='SearchContactFirstName']")
	private WebElement isgCustomer_FirstName;
	
	@FindBy(xpath = "(//button[@data-test-id='201802081002310780562'])[1]")
	private WebElement cancel;

	@FindBy(xpath = "(//button[@data-test-id='20180201162439008710139'])[1]")
	private WebElement close;

	

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement isgProduct_Submit;

	@FindBy(xpath = "//*[@id='DefaultAG']")
	private WebElement isgCustomer_RadioButton;

	@FindBy(xpath = "//*[@data-test-id='20180222111133075630347']")
	private WebElement isgCustomer_SearchButton;

	@FindBy(xpath = "//button[@id='ModalButtonSubmit']")
	private WebElement isgCustomer_SubmitButton;

	@FindBy(xpath = "(//span[@data-test-id=\"201802211054570002105727\"])[1]")
	private WebElement isgCustomer_MainPage_FirstName;

	@FindBy(xpath = "(//*[@data-test-id='201512210438090148308293'])[2]")
	private WebElement isgAddProductInfo;

	@FindBy(xpath = "//input[@data-test-id='2015100603215503417556']")
	private WebElement isgProduct_Model;

	@FindBy(xpath = "//span[@data-test-id='20151102025927043277266']")
	private WebElement isgProduct_MainPage_Model;

	@FindBy(id = "FUNC_AREA_NM")
	private WebElement isgFunctionalArea;

	@FindBy(xpath = "//input[@id='FUNC_CODE_NM']")
	private WebElement isgFunctionalCode;

	@FindBy(xpath = "//span[text()='1602']")
	private WebElement isgFunctionalCode_Select;

	@FindBy(xpath = "(//span[text()=\"Ag\"])[1]")
	private WebElement isg_TWB_WB;

	@FindBy(xpath = "//span[@data-test-id='20151102025927043277266'][@class='jd_h3_text']")
	private WebElement ISGProductValueAssertion;

	@FindBy(xpath = "(//span[@data-test-id='201802211054570002105727'])[1]")
	private WebElement ISGCustomerFirstName;

	@FindBy(xpath = "(//span[@data-test-id='201802211054570002105727'])[2]")
	private WebElement ISGCustomerLastName;

	@FindBy(xpath = "//span[@data-test-id='201803021304180157105844']")
	private WebElement ISGCustomerPhoneNumber;

	@FindBy(xpath = "//span[@data-test-id='20180221105250019383254']")
	private WebElement ISGEntityId;

	@FindBy(xpath = "//span[@data-test-id='20180221105140017779602']")
	private WebElement ISGEmailAddress;

	@FindBy(xpath = "//span[@data-test-id='2018042413580400821689']")
	private WebElement ISGWorkBasket;

	// ************************ Raghu ****************************

	@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
	private WebElement ISGCustomer_MainPage_Customerinfo;

	@FindBy(xpath = "//div[@class=' content layout-content-portal_header_group_primary  content-portal_header_group_primary clearfix']")
	private WebElement ISGPSC_errormsg;

	@FindBy(xpath = "(//img[@src='webwb/pzediticon_13962397645.png!!.png'])")
	private WebElement ISGCustomer_clear;

	@FindBy(xpath = "(//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing'])[1]")
	private WebElement ISG_Status;

	@FindBy(xpath = "//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
	private WebElement ISGAction_Button;

	@FindBy(xpath = "(//*[@class='menu menu-format-standard menu-regular'])/li[2]")
	private WebElement WorkCase;

	@FindBy(xpath = "//*[@class=\"menu menu-format-standard menu-regular\"]/li[2]")
	private WebElement ISGTransferWB;

	@FindBy(xpath = "//input[@id='WBName']")
	private WebElement NewWorkBasket;

	@FindBy(xpath = "//tr[@id='$PD_ListWorkbasketInformationWithGSC$ppxResults$l1']")
	private WebElement NewWorkBasketdropdown;

	@FindBy(xpath = "(//button[@data-test-id='20180419123512080115230'])[1]")
	private WebElement ISGTransfer_Button;

	@FindBy(xpath = "//span[contains(text(),'Refresh')]")
	private WebElement Refresh;

	@FindBy(xpath = "//span[contains(text(),'Transfer Case To WB')]")
	private WebElement Transfer_Case_To_WB;

	@FindBy(xpath = "//span[contains(text(),'Transfer Case To Individu...')]")
	private WebElement Transfer_Case_To_Individu;

	@FindBy(xpath = "//span[contains(text(),'Send Case Email')]")
	private WebElement Send_Case_Email;

	@FindBy(xpath = "//li[@class='menu-item menu-item-enabled']//span[contains(text(),'Reopen')]")
	private WebElement Reopen;

	@FindBy(xpath = "//label[contains(text(),'Correspondence')]")
	private WebElement GSCCorrespondence;

	@FindBy(xpath = "(//a[@class='Case_tools'])[2]")
	private WebElement GSCNewCaseMailLink;

	@FindBy(xpath = "(//a[starts-with(@title,'New Deere.com Case')])[1]")
	private WebElement GSCNewCaseMailLinkZeacom;

	@FindBy(xpath = "//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
	private WebElement ClickonActionButton;
	// ClickonSendCaseEmail
	@FindBy(xpath = "//span[contains(text(),'Send Case Email')]")
	private WebElement ClickGSCSendCaseMailButton;

	@FindBy(xpath = "//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing' ]")
	private WebElement ReopenedStatus;

	@FindBy(xpath = "//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement statusAsNew;

	@FindBy(xpath = "//span[@data-test-id='2018042408424805539718']")
	private WebElement summary;

	@FindBy(xpath = "//span[@data-test-id='20180420090320013510319']")
	private WebElement priority;

	@FindBy(xpath = "//span[@data-test-id='20180420090350031226135']")
	private WebElement origin;

	@FindBy(xpath = "(//span[@data-test-id='20180420090320013510319'])|(//span[@data-test-id='20160208091722005978870'])")
	private WebElement priorityText;

	@FindBy(xpath = "//span[@data-test-id='20160208091722005978870']")
	private WebElement languageText;

	@FindBy(xpath = "(//span[@data-test-id='20180420090350031226135'])|(//span[@data-test-id='20180424140140011822773'])")
	private WebElement originText;

	@FindBy(xpath = "//div[contains(text(),'     Owned   ')]")
	private WebElement ownStatus;

	@FindBy(xpath = "(//button[contains(text(),'Accept')])[1]")
	private WebElement acceptStatus;

	@FindBy(xpath = "(//button[contains(text(),'Close')])[1]")
	private WebElement closeStatus;

	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement cancelStatus;

	@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
	private WebElement isgCustomer_MainPage_Customerinfo;

	@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
	private WebElement isgCustomer_Title;

	@FindBy(xpath = "//iframe[@id='PegaGadget1Ifr']")
	private WebElement iFramePegaGadgetISG_Assertion;

	@FindBy(id = "CasePriority")
	private WebElement isgCase_Priority;


	@FindBy(xpath = "//select[@data-test-id='20180424140126019614930']")
	private WebElement languDD;

	@FindBy(id = "LanguageWithCode")
	private WebElement isgCaselanguagecode;

	@FindBy(xpath = "//span[contains(text(),'Print')]")
	private WebElement print;
	
	@FindBy(xpath = "//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement owned;

	@FindBy(id = "Origin")
	private WebElement isgCase_Origin;
	@FindBy(xpath = "//*[@name='$PpyWorkPage$pCaseSummary']")
	private WebElement isgSummary;

	@FindBy(xpath = "(//button[@data-test-id='201802011400580656111285'])[1]")
	private WebElement isgAccept_Button;

	@FindBy(xpath = "(//*[@data-test-id=\"201802011400580656112342\"])[1]")
	private WebElement isgRoute_Button;

	@FindBy(xpath = "(//*[@data-test-id=\"20180201162439008710139\"])[2]")
	private WebElement isgClose_Button;

	@FindBy(xpath = "(//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing'])[1]")
	private WebElement statusOwned;
	
	@FindBy(xpath = "//span[contains(text(),'Transfer Case To WB')]")
	private WebElement transferCaseToWB;

	@FindBy(xpath = "//span[contains(text(),'Transfer Case To Individu...')]")
	private WebElement transferCaseToIndividu;

	@FindBy(xpath = "//span[contains(text(),'Send Case Email')]")
	private WebElement sendCaseEmail;

	@FindBy(xpath = "//li[@class='menu-item menu-item-enabled']//span[contains(text(),'Reopen')]")
	private WebElement reopen;
	
	@FindBy(xpath = "//span[contains(text(),'TSS Reopen: ')]")
	private WebElement tss;
	
	@FindBy(xpath = "(//div[@class='field-item dataValueRead'])[2]")
	private WebElement resolved;


	public static String ParentHandle;
	protected WebDriver driver;

	public ISGCasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean hasCustomerDetailsDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, isgCustomer_SearchButton);
	}

	public boolean hasCustomerDetailsDisplayedInMainPage() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, isgCustomer_MainPage_FirstName);

	}

	public boolean hasRefresh() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, Refresh);

	}

	public boolean hasReopen() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, Reopen);

	}

	public boolean hasTransfer_Case_To_Individu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, Transfer_Case_To_Individu);

	}

	public boolean hasRadioButtonDisplayed() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, isgCustomer_RadioButton);

	}

	public boolean haserrormsgdisplayed() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ISGPSC_errormsg);

	}

	public boolean hasWorkCase() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, WorkCase);

	}

	// Enter Country Code
	public ISGCasePage isgCountryCode(String category) {
		CommonFunctions.waitForElement(driver, isgCustomer_CountryCode).sendKeys(category);
		return new ISGCasePage(driver);
	}

	public SolutionSearchHomePage switchToIFrame() {
		CommonFunctions.switchToiFrameByWebElement(driver, framePegaGadget);
		return new SolutionSearchHomePage(driver);
	}

	public boolean hasCategoryAutoOptionDisplayed(String category) {
		CommonFunctions.waitForElement(driver, categoryTxtBox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, categoryAutoOptions).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, categoryAutoOptions).get(i).getText().contains(category)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasSubCategoryAutoOptionDisplayed(String subCategory) {
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, subCategoryTxtBox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, subCategoryAutoOptions).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, subCategoryAutoOptions).get(i).getText()
					.contains(subCategory)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public SolutionSearchHomePage SSenterCategory(String category) {
		CommonFunctions.waitForElement(driver, categoryTxtBox).sendKeys(category);
		return new SolutionSearchHomePage(driver);
	}

	public SolutionSearchHomePage enterDecalModel(String decalModel) {
		CommonFunctions.waitForElement(driver, decalModelTxtBox).sendKeys(decalModel);
		decalModelTxtBox.sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, autoOptions);
		try {
			if (autoOptions.getText().contains(decalModel))
				autoOptions.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new SolutionSearchHomePage(driver);
	}

	public SolutionSearchHomePage SSenterModel(String model) {
		CommonFunctions.waitForElement(driver, modelTxtBox).sendKeys(model);
		modelTxtBox.sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
			if (modelAutoOptions.getText().contains(model))
				modelAutoOptions.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SolutionSearchHomePage(driver);
	}

	public boolean hasCreateISGCaseDisplayed() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadgetISG);
		CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadgetISG);
		return CommonFunctions.isElementExist(driver, addCustomerInfoLink);

	}

	public boolean hasCustomerFirstNameDisplayed() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// switching to default content
		CommonFunctions.SwitchToDefaultFrame(driver);

		// Switch to Frame in Main Page
		CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadgetISG_Assertion);
		return CommonFunctions.isElementExist(driver, ISGCustomerFirstName);

	}

	public boolean hasCustomerLastNameDisplayed() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ISGCustomerLastName);

	}

	public boolean hasCustomerPhoneNumberDisplayed() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ISGCustomerPhoneNumber);

	}
	
	// Work Case
		public ISGCasePage clickOnWorkCase() {
			CommonFunctions.waitForElement(driver, workCaseInActions).click();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new ISGCasePage(driver);
		}

	public boolean hasCustomerEntityIdDisplayed() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ISGEntityId);

	}

	public boolean hasCustomerEmailAddressDisplayed() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ISGEmailAddress);

	}

	public boolean hasWorkBasketDisplayed(String workBas) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, gscWorkBasket);

	}
	
	public boolean hasWorkBasketDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, gscWorkBasket);

	}
	
	// Action Button
		public ISGCasePage clickOnActionsBtn() {
			CommonFunctions.waitForElement(driver, actionBtn).click();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new ISGCasePage(driver);
		} 

	public ISGCasePage GetWorkBasket() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadgetISG_Assertion);
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String WorkBasket = CommonFunctions.waitForElement(driver, ISGWorkBasket).getText();
		System.out.println("WorkBasket: " + WorkBasket);
		return new ISGCasePage(driver);
	}

	public ISGCaseSearchPage GetGSCWorkBasket() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadgetISG_Assertion);
		String WorkBasket = CommonFunctions.waitForElement(driver, gscWorkBasket).getText();
		System.out.println("WorkBasket : " + WorkBasket);
		return new ISGCaseSearchPage(driver);
	}

	public OwnedCasePage ISGRoute_Button() throws InterruptedException {
		String Status1 = CommonFunctions.waitForElement(driver, ISG_Status).getText();
		System.out.println("Current case status is " + Status1);

		CommonFunctions.waitForElement(driver, isgRoute_Button).click();
		System.out.println("Clicked on Route Button");
		Thread.sleep(3000);

		String Status2 = CommonFunctions.waitForElement(driver, ISG_Status).getText();
		System.out.println("Routed Case Status is " + Status2);
		// String WB1 = CommonFunctions.waitForElement(driver,
		// ISGWorkBasket1).getText();
		// System.out.println("Current WorkBasket is" +WB1);

		return new OwnedCasePage(driver);
	}

	public OwnedCasePage Actions_Button() throws InterruptedException {
		CommonFunctions.waitForElement(driver, ISGAction_Button).click();

		Thread.sleep(3000);

		return new OwnedCasePage(driver);
	}

	public OwnedCasePage Actions_Button_WorkCase() throws InterruptedException {

		CommonFunctions.waitForElement(driver, WorkCase).click();
		Thread.sleep(3000);

		return new OwnedCasePage(driver);
	}

	public OwnedCasePage Actions_ToTransferWB() throws InterruptedException {
		CommonFunctions.waitForElement(driver, isgAccept_Button).click();
		Thread.sleep(3000);
		CommonFunctions.waitForElement(driver, ISGAction_Button).click();
		CommonFunctions.waitForElement(driver, ISGTransferWB).click();
		Thread.sleep(4000);

		return new OwnedCasePage(driver);
	}
	// Accept Btn
		public ISGCasePage clickOnAcceptBtn() {
			CommonFunctions.waitForElement(driver, acceptButton).click();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new ISGCasePage(driver);
		} 
	public ISGCasePage NewWorkBasket(String WorkBasket) throws InterruptedException {
		CommonFunctions.waitForElement(driver, NewWorkBasket).sendKeys(WorkBasket);
		CommonFunctions.waitForElement(driver, NewWorkBasketdropdown).click();
		Thread.sleep(2000);
		CommonFunctions.waitForElement(driver, ISGTransfer_Button).click();
		Thread.sleep(4000);

		return new ISGCasePage(driver);
	}

	public OwnedCasePage ISG_Close_Button() throws InterruptedException {

		CommonFunctions.waitForElement(driver, isgClose_Button).click();
		Thread.sleep(4000);
		return new OwnedCasePage(driver);
	}

	public OwnedCasePage Reopen() throws InterruptedException {
		CommonFunctions.waitForElement(driver, Reopen).click();

		Thread.sleep(3000);

		return new OwnedCasePage(driver);
	}

	public OwnedCasePage Actions_ToAccept() throws InterruptedException {
		CommonFunctions.waitForElement(driver, isgAccept_Button).click();
		Thread.sleep(4000);
		return new OwnedCasePage(driver);
	}

	public ISGCasePage clickOnCorrespondence() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.scrollToElement(driver, GSCCorrespondence);
		CommonFunctions.waitForElement(driver, GSCCorrespondence).click();
		// System.out.println("scrolled down ");
		ParentHandle = driver.getWindowHandle();
		System.out.println("Parent window is " + ParentHandle);
		return new ISGCasePage(driver);
	}

	public ISGCasePage clickOnMail() {
		CommonFunctions.waitForElement(driver, GSCNewCaseMailLink).click();
		return new ISGCasePage(driver);
	}

	public ISGCasePage SwitchToMainPage() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		return new ISGCasePage(driver);
	}

	public ISGCasePage SwitchToDefaultFrame() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		return new ISGCasePage(driver);
	}

	public ISGCasePage SwitchToMainFrame() {
		CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadgetISG_Assertion);
		return new ISGCasePage(driver);
	}

	public ViewEmailZeacomPage clickOnMailZeacom() {
		CommonFunctions.waitForElement(driver, GSCNewCaseMailLinkZeacom).click();
		return new ViewEmailZeacomPage(driver);
	}

	public ISGCasePage clickonActions() {
		CommonFunctions.waitForElement(driver, ClickonActionButton).click();
		return new ISGCasePage(driver);
	}

	public SendCaseEmail sendcasemail() {
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, ClickGSCSendCaseMailButton).click();
		return new SendCaseEmail(driver);

	}

	public boolean hasReopenedStatusDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ReopenedStatus);

	}

	public boolean hasSummaryDispayed(String summ) {
		return CommonFunctions.isElementExist(driver, summary);
	}

	public boolean hasPriorityDispayed(String prioy) {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, priority);
	}

	public boolean hasOriginDispayed(String org) {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, origin);
	}

	public ISGCasePage switchToFrame1() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitAndSwitchToFrame(driver, iFramePegaGadgetISG_Assertion);
		return new ISGCasePage(driver);
	}
/*******************/
	public boolean hasPriorityText() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.scrollSomeDown(driver);
		CommonFunctions.scrollSomeDown(driver);
		CommonFunctions.scrollSomeDown(driver);
		return CommonFunctions.isElementExist(driver, priorityText);
	}

	public boolean hasOriginText() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, originText);
	}

	public boolean hasOwnedStatusDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ownStatus);
	}
/*****************/
	// select Priority as "1-Tech in Field - Urgent"
	public ISGCasePage isgCasePriority() {
		CommonFunctions.selectFromDropdown(driver, "1-Tech in Field - Urgent", isgCase_Priority);
		return new ISGCasePage(driver);
	}

	// select origin as "Email"
	public ISGCasePage isgCaseOrigin() {
		CommonFunctions.selectFromDropdown(driver, "Email", isgCase_Origin);
		return new ISGCasePage(driver);
	}

	// send summary value
	public ISGCasePage summary(String summary) {
		CommonFunctions.waitForElement(driver, isgSummary).sendKeys(summary);
		return new ISGCasePage(driver);
	}

	// Click on Accept button
	public ISGCasePage accept_Button() {
		CommonFunctions.waitForElement(driver, isgAccept_Button).click();
		return new ISGCasePage(driver);
	}

	// Validate ISG owned status
	public boolean isStatusOwned() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, statusOwned);
	}

	public ISGCasePage clickOnClose() {
		CommonFunctions.waitForElement(driver, closeStatus).click();
		return new ISGCasePage(driver);
	}

	public ISGCasePage clickOnReopen() {
		CommonFunctions.waitForElement(driver, reopen).click();
		return new ISGCasePage(driver);
	}

	public boolean hasCloseStatus() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, closeStatus);
	}

	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement saveStatus;

	public boolean hasSaveStatus() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, saveStatus);
	}

	public boolean hasAcceptStatusDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, acceptStatus);
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
		return CommonFunctions.isElementExist(driver, reopen);
	}

	// Validate Customer Title
	public boolean hasCustomerTitleDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, isgCustomer_Title);
	}

	// Validate product details in Main page with Model value
	public boolean hasProductDetailsDisplayedInMainPage() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, isgProduct_MainPage_Model);

	}

	public boolean hasPrint() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, print);
	}

	// Validate Send Case Email presence
	public boolean hasSend_Case_Email() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, send_Case_Email);

	}

	// Validate Transfer case to WorkBook
	public boolean hasTransfer_Case_To_WB() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, transfer_Case_To_WB);

	}

	// Validate Customer Details in Main Page presence
	public boolean hasCustomerDetailsDisplayedInmainPage() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, isgCustomer_MainPage_Customerinfo);

	}

	@FindBy(xpath = "//span[contains(text(),'Transfer Case To WB')]")
	private WebElement transfer_Case_To_WB;

	@FindBy(xpath = "//span[contains(text(),'Transfer Case To Individu...')]")
	private WebElement transfer_Case_To_Individu;

	@FindBy(xpath = "//span[contains(text(),'Send Case Email')]")
	private WebElement send_Case_Email;

	// Validate Error message
	public boolean hasErrormsgdisplayed() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, isgPSC_ErrorMsg);

	}

	// Click on AddCustomer Info Link
	public ISGCasePage clickAddCustomerInfo(ISGCasePage isgCasePage) {
		CommonFunctions.waitForElement(driver, addCustomerInfoLink).click();
		return new ISGCasePage(driver);
	}

	// Enter Last Name
	public ISGCasePage isgEnterLastName(String lastname) {
		CommonFunctions.waitForElement(driver, isgCustomer_LastName).sendKeys(lastname);
		return new ISGCasePage(driver);
	}

	// Enter First Name
	public ISGCasePage isgEnterFirstName(String firstname) {
		CommonFunctions.waitForElement(driver, isgCustomer_FirstName).sendKeys(firstname);
		return new ISGCasePage(driver);
	}

	// Enter Country Code
	public ISGCasePage isgEnterCountryCode(String ccode) {
		CommonFunctions.waitForElement(driver, isgCustomer_CountryCode).sendKeys(ccode);
		return new ISGCasePage(driver);
	}

	// Click on Customer Search
	public ISGCasePage clickCustomerSearch() {
		CommonFunctions.waitForElement(driver, isgCustomer_SearchButton).click();
		return new ISGCasePage(driver);
	}

	// Click on Radio Button
	public ISGCasePage clickRadioButton(ISGCasePage isgCasePage) {
		CommonFunctions.waitForElement(driver, isgCustomer_RadioButton).click();
		return new ISGCasePage(driver);
	}

	// Click on Customer submit
	public ISGCasePage clickCustomerSubmitButton(ISGCasePage isgCasePage) {
		CommonFunctions.waitForElement(driver, isgCustomer_SubmitButton).click();
		return new ISGCasePage(driver);
	}
	
	public boolean hasGSCWorkBasketDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, gscWorkBasket);

	} 

	// Click on Add Product Info Link
	public ISGCasePage clickOnAddProductInfo(ISGCasePage isgCasePage) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, isgAddProductInfo).click();
		return new ISGCasePage(driver);
	}

	// Enter Model Value
	public ISGCasePage enterModel(String category) {
		CommonFunctions.waitForElement(driver, isgProduct_Model).sendKeys(category);
		CommonFunctions.waitForElement(driver, isgProduct_Model).sendKeys(Keys.ARROW_DOWN);
		return new ISGCasePage(driver);
	}

	// Click on Product submit
	public ISGCasePage clickProductSubmitButton(ISGCasePage isgCasePage) {
		CommonFunctions.waitForElement(driver, isgProduct_Submit).click();
		return new ISGCasePage(driver);
	}

	// Enter Functional area value
	public ISGCasePage functionalArea(String category) {
		CommonFunctions.waitForElement(driver, isgFunctionalArea).sendKeys(category);
		CommonFunctions.waitForElement(driver, isgFunctionalArea).sendKeys(Keys.ARROW_DOWN);
		return new ISGCasePage(driver);
	}

	// enter Functional code value
	public ISGCasePage functionalCode(String category) {
		CommonFunctions.waitForElement(driver, isgFunctionalCode).sendKeys(category);
		CommonFunctions.waitForElement(driver, isgFunctionalCode).sendKeys(Keys.ARROW_DOWN);
		return new ISGCasePage(driver);
	}

	// Get ISG WorkBasket value
	public ISGCasePage getWorkBasket() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitAndSwitchToFrame(driver, iFramePegaGadgetISG_Assertion);
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, isgWorkBasket).getText();
		return new ISGCasePage(driver);
	}

	// Get GSC WorkBasket value
	public ISGCasePage getWorkBasket_GSC() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitAndSwitchToFrame(driver, iFramePegaGadgetISG_Assertion);
		String WorkBasket = CommonFunctions.waitForElement(driver, gscWorkBasket).getText();
		return new ISGCasePage(driver);
	}

	// Get Work Basket Value for ISG
	public ISGCasePage getGSCWorkBasket() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitAndSwitchToFrame(driver, iFramePegaGadgetISG_Assertion);
		String WorkBasket = CommonFunctions.waitForElement(driver, gscWorkBasket).getText();
		return new ISGCasePage(driver);
	}

	// Verify Clear button in Customer page
	public ISGCasePage clearCustomer(ISGCasePage isgCasePage) {
		CommonFunctions.waitForElement(driver, isgCustomer_Clear).click();
		return new ISGCasePage(driver);
	}

	// Validate the status after routing
	public OwnedCasePage isgRouteButton() throws InterruptedException {
		String Status1 = CommonFunctions.waitForElement(driver, isg_Status).getText();
		System.out.println("Current case status is " + Status1);
		CommonFunctions.waitForElement(driver, isgRoute_Button).click();
		System.out.println("Clicked on Route Button");
		Thread.sleep(3000);
		String Status2 = CommonFunctions.waitForElement(driver, isg_Status).getText();
		System.out.println("Routed Case Status is " + Status2);
		return new OwnedCasePage(driver);
	}

	// Click on Actions Button
	public OwnedCasePage actionsButton() throws InterruptedException {
		CommonFunctions.waitForElement(driver, isgAction_Button).click();
		Thread.sleep(3000);
		return new OwnedCasePage(driver);
	}

	// Click on Actions Button work case
	public OwnedCasePage actions_Button_WorkCase() throws InterruptedException {
		CommonFunctions.waitForElement(driver, workCase).click();
		Thread.sleep(3000);
		return new OwnedCasePage(driver);
	}

	// Click on ISG Transfer Work Basket
	public OwnedCasePage actions_ToTransferWB() throws InterruptedException {
		CommonFunctions.waitForElement(driver, isgAccept_Button).click();
		Thread.sleep(3000);
		CommonFunctions.waitForElement(driver, isgAction_Button).click();
		CommonFunctions.waitForElement(driver, isgTransferWB).click();
		Thread.sleep(4000);
		return new OwnedCasePage(driver);
	}

	// Click on ISG Transfer button
	public ISGCasePage newWorkBasket(String WorkBasket) throws InterruptedException {
		CommonFunctions.waitForElement(driver, newWorkBasket).sendKeys(WorkBasket);
		CommonFunctions.waitForElement(driver, newWorkBasketDropDown).click();
		Thread.sleep(2000);
		CommonFunctions.waitForElement(driver, isgTransfer_Button).click();
		Thread.sleep(4000);
		return new ISGCasePage(driver);
	}

	// click on Actions
	public ISGCasePage isgActionsButton() throws InterruptedException {
		CommonFunctions.waitForElement(driver, isg_Actions).click();
		Thread.sleep(4000);
		return new ISGCasePage(driver);
	}

	public ISGCasePage isgTransferToIndividual() throws InterruptedException {
		CommonFunctions.waitForElement(driver, isgTransferIndividual_Button).click();
		Thread.sleep(4000);
		return new ISGCasePage(driver);
	}

	// selected from operator dropdown
	public ISGCasePage isgTransferOperator(String operator) throws InterruptedException {
		CommonFunctions.waitForElement(driver, isgTransferIndividualOperator).sendKeys(operator);
		Thread.sleep(4000);
		return new ISGCasePage(driver);
	}

	// selected from transfer workbasket dropdown
	public ISGCasePage isgTransferWorkbasket(String workbasket) throws InterruptedException {
		CommonFunctions.waitForElement(driver, isgTransferIndividualWorkbasket).sendKeys(workbasket);
		Thread.sleep(4000);
		return new ISGCasePage(driver);
	}

	// click on transfer to individual submit.
	public ISGCasePage isgTransferSubmitButton() throws InterruptedException {
		CommonFunctions.waitForElement(driver, isgTransferSubmit).click();
		Thread.sleep(4000);
		return new ISGCasePage(driver);
	}

	// click on isgAudittrails
	public ISGCasePage isgAudit() {
		CommonFunctions.scrollToElement(driver, auditTrails);
		CommonFunctions.waitForElement(driver, auditTrails).click();
		return new ISGCasePage(driver);
	}

	public ISGCasePage isgCaseClose() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, caseclose).click();
		return new ISGCasePage(driver);
	}

	public ISGCasePage isgCaseDiscard() {
		CommonFunctions.waitForElement(driver, discard).click();
		return new ISGCasePage(driver);
	}

	// Click on ISG Close button
	public OwnedCasePage isg_Close_Button() throws InterruptedException {
		CommonFunctions.waitForElement(driver, isgClose_Button).click();
		Thread.sleep(4000);
		return new OwnedCasePage(driver);
	}

	// Click on Reopen button
	public OwnedCasePage reopen() throws InterruptedException {
		CommonFunctions.waitForElement(driver, reopen).click();
		Thread.sleep(3000);
		return new OwnedCasePage(driver);
	}

	// Click on ISG Accept Button
	public OwnedCasePage actions_ToAccept() throws InterruptedException {
		CommonFunctions.waitForElement(driver, isgAccept_Button).click();
		Thread.sleep(4000);
		return new OwnedCasePage(driver);
	}

	// Switch to Main page
	public ISGCasePage switchToMainPage() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		return new ISGCasePage(driver);
	}

	// Switch to Default frame
	public ISGCasePage switchToDefaultFrame() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		return new ISGCasePage(driver);
	}

	// Switch to main Frame
	public ISGCasePage switchToMainFrame() {
		CommonFunctions.waitAndSwitchToFrame(driver, iFramePegaGadgetISG_Assertion);
		return new ISGCasePage(driver);
	}

	@FindBy(xpath = "//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
	private WebElement clickOnActionButton;

	// click on Actions button
	public ISGCasePage clickOnActions() {
		CommonFunctions.waitForElement(driver, clickOnActionButton).click();
		return new ISGCasePage(driver);
	}


	// click on GSC send case Mail Button
	public SendCaseEmail sendCaseMail() {
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, clickGSCSendCaseMailButton).click();
		return new SendCaseEmail(driver);
	}

	// Send Solution ID Value
	public ISGCasePage sendSolutionId(String solutionId) {
		CommonFunctions.waitForElement(driver, solutionIdBox).sendKeys(solutionId);
		return new ISGCasePage(driver);
	}

	// Validate Solution Success message
	public boolean hasSolutionSuccessMsgDisplayed(String ExpectedMsg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (CommonFunctions.waitForElement(driver, solutionSuccessMsg).getText().contains(ExpectedMsg)) {
			return true;
		} else {
			return false;
		}
	}

	// Click on Solution search img
	public ISGCasePage clickSolutionSearchImg() {
		CommonFunctions.waitForElement(driver, solutionIdSearchImg).click();
		return new ISGCasePage(driver);
	}

	// asertion for Route---> Status as New
	public boolean statusNew() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, statusAsNew);
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

	public boolean hasWithdrawDisplayed(String withdra) {
		return CommonFunctions.isElementExist(driver, withdraw);
	}

	public boolean hasAuditDisplayed(String aud) {
		return CommonFunctions.isElementExist(driver, audit);
	}

	public boolean hasSaveDisplayed(String sav) {
		return CommonFunctions.isElementExist(driver, save);
	}

	public ISGLinkSolutionPage Functionalarea(String category) {
		CommonFunctions.waitForElement(driver, isgFunctionalArea).sendKeys(category);
		CommonFunctions.waitForElement(driver, isgFunctionalArea).sendKeys(Keys.ARROW_DOWN);
		return new ISGLinkSolutionPage(driver);
	}

	public ISGLinkSolutionPage FunctionalCode(String category) {
		CommonFunctions.waitForElement(driver, isgFunctionalCode).sendKeys(category);
		CommonFunctions.waitForElement(driver, isgFunctionalCode).sendKeys(Keys.ARROW_DOWN);
		return new ISGLinkSolutionPage(driver);
	}
	
	public ISGCasePage FunctionalArea(String category) {
		CommonFunctions.waitForElement(driver, isgFunctionalArea).sendKeys(category);
		CommonFunctions.waitForElement(driver, isgFunctionalArea).sendKeys(Keys.ARROW_DOWN);
		return new ISGCasePage(driver);
	}

	public ISGCasePage FunCode(String category) {
		CommonFunctions.waitForElement(driver, isgFunctionalCode).sendKeys(category);
		CommonFunctions.waitForElement(driver, isgFunctionalCode).sendKeys(Keys.ARROW_DOWN);
		return new ISGCasePage(driver);
	}
	
	public ISGCasePage clickonClose() {
		CommonFunctions.waitForElement(driver, close).click();
		return new ISGCasePage(driver);
	}

	
	public ISGCasePage priority() {
		CommonFunctions.selectFromDropdown(driver, "1-Tech in Field - Urgent", isgCase_Priority);
		return new ISGCasePage(driver);
	}

	public ISGLinkSolutionPage ISGCase_Priority() {
		CommonFunctions.selectFromDropdown(driver, "1-Tech in Field - Urgent", isgCase_Priority);
		return new ISGLinkSolutionPage(driver);
	}
	
	public ISGCasePage origin() {
		CommonFunctions.selectFromDropdown(driver, "Email", isgCase_Origin);
		return new ISGCasePage(driver);
	}

	public ISGLinkSolutionPage ISGCase_Origin() {
		CommonFunctions.selectFromDropdown(driver, "Email", isgCase_Origin);
		return new ISGLinkSolutionPage(driver);
	}

	public ISGLinkSolutionPage Summary(String summary) {
		CommonFunctions.waitForElement(driver, isgSummary).sendKeys(summary);
		return new ISGLinkSolutionPage(driver);
	}
	
	public ISGCasePage isgSummary(String summary) {
		CommonFunctions.waitForElement(driver, isgSummary).sendKeys(summary);
		return new ISGCasePage(driver);
	}
	
	public ISGCasePage AccepButton() {

		CommonFunctions.waitForElement(driver, isgAccept_Button).click();
		return new ISGCasePage(driver);
	}

	public ISGLinkSolutionPage Accept_Button() {

		CommonFunctions.waitForElement(driver, isgAccept_Button).click();
		return new ISGLinkSolutionPage(driver);
	}

	public ISGLinkSolutionPage isgCase_Language(String language) {
		CommonFunctions.waitAndSwitchToFrame(driver, languDD);
		CommonFunctions.selectFromDropdown(driver, language, languDD);
		return new ISGLinkSolutionPage(driver);
	}
   
	public boolean hasPriorityText(String priority) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.scrollSomeDown(driver);
		CommonFunctions.scrollSomeDown(driver);
		CommonFunctions.scrollSomeDown(driver);
		return CommonFunctions.isElementExist(driver, priorityText);
	}

	public boolean hasLanguageText() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, languageText);
	}

	public boolean hasOriginText(String origin) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, originText);
	}
	public boolean hasRefreshDisplayed(String ref) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, refresh);

	}

	public boolean hasNewDraftStatusDisplayed(String draft) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, newDraft);

	}

	public boolean hasTransferIndividuDisplayed(String trindividual) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, transferCaseToIndividu);

	}
	
	public boolean hasSendCaseEmailDisplayed(String mail) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, send_Case_Email);

	}
	public ISGCasePage clickonTSS() {
		CommonFunctions.waitForElement(driver, tss).click();
		return new ISGCasePage(driver);
	}
	
	public ISGCasePage clickOnWorkcase() {
		CommonFunctions.waitForElement(driver, workCase).click();
		return new ISGCasePage(driver);
	}
	
	
	public boolean hasTransferCaseToWBDisplayed(String wb) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, transfer_Case_To_WB);

	}
	public boolean hasResolvedCompletedDisplayed(String resolv) {
		return CommonFunctions.isElementExist(driver, resolved);
	}
	
	public boolean hasPrintDisplayed(String pnt) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, print);
	}
	public boolean hasOwnedDisplayed(String own) {
		return CommonFunctions.isElementExist(driver, owned);
	}
	
	public boolean hasCloseDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, close);
	}

	public boolean hasCancelDisplayed(String greenfleet) {
		return CommonFunctions.isElementExist(driver, cancel);
	}




	public boolean hasOwnedStatusDisplayed(String status) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, ownStatus);
	}
	
	

}
