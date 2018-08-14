package com.deere.global;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.deere.greenfleet.GreenFleetCreationPage;
import com.deere.gscpage.CaseCoding;
import com.deere.gscpage.GSCCustomerSearch;
import com.deere.gscpage.GSCRoutingFilterPage;
import com.deere.gscpage.GSCRoutingFilterSearchPage;
import com.deere.gscpage.GSCRoutingPage;
import com.deere.gscpage.ViewEmailZeacomPage;
import com.deere.isgpage.ISGCaseCreationHomePage;
import com.deere.isgpage.ISGCasePage;
import com.deere.isgpage.ISGCaseSearchPage;
import com.deere.isgpage.ISGLinkSolutionPage;
import com.deere.isgpage.ISGRecommendedSolutionsSectionPage;
import com.deere.mailrelatedpages.GmailLoginPage;
import com.deere.mailrelatedpages.GmailStep2;
import com.deere.mailrelatedpages.GmailStep3;
import com.deere.mailrelatedpages.SendCaseEmail;
import com.deere.mailrelatedpages.ViewEmaiPage;
import com.deere.pages.ISGNavigationClass;
import com.deere.pages.NavigationClass;
import com.deere.pages.PegaLoginPage;
import com.deere.pages.SiteMinderLoginPage;
import com.deere.pages.homepage.HomePage;
import com.deere.pages.reports.ReportsPage;
import com.deere.pages.reports.TssWorkBasketDetailsPage;
import com.deere.pages.solutionsearchpage.GSCCaseCreationPage;
import com.deere.pages.solutionsearchpage.ISGCaseCreation;
import com.deere.pages.solutionsearchpage.SolutionSearchHomePage;
import com.deere.webformpages.Agronomy;
import com.deere.webformpages.AgronomyLoginPage;
import com.deere.webformpages.CommentsWebForm;
import com.deere.webformpages.Deere;
import com.deere.webformpages.DeereLoginPage;
import com.deere.webformpages.GreenFleetWebFormSubmissionPage;
import com.deere.webformpages.India;
import com.deere.webformpages.IndiaLoginPage;
import com.deere.webformpages.JDLinks;
import com.deere.webformpages.JDLinksWebFormSubmitionPage;
import com.deere.webformpages.JDParts;
import com.deere.webformpages.JDPartsWebFormSubmissionPage;
import com.deere.webformpages.R4Turf;
import com.deere.webformpages.R4TurfLoginPage;
import com.deere.webformpages.R4_AgCC;
import com.deere.webformpages.R4_AgCCWebFormSubmissionPage;
import com.deere.webformpages.SouthEastAsia;
import com.deere.webformpages.SouthEastAsiaLoginPage;
import com.deere.webformpages.SouthSahara;
import com.deere.webformpages.SouthSaharaLoginPage;
import com.deere.webformpages.StellarSupport;
import com.deere.webformpages.StellarSupportWebformSubmissionPage;
import com.deere.webformpages.Techpubs;
import com.deere.webformpages.TechpubsLoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * 
 * @author kw75188 Description : This Class contains Functional Methods that are
 *         used in Test Scripts
 *
 */

public class FunctionalMethods {

	private ExtentTest logger = ExtentReportManager.getLogger();
	private PegaLoginPage pegaLoginPage;
	private SolutionSearchHomePage solutionSearchHomePage;
	private ISGCasePage isgCasePage;
	private ReportsPage reportsPage;
	private TssWorkBasketDetailsPage TssWorkBasketDetailsPage;
	private Deere deere;
	private ISGCasePage ISGCasePage;
	private ViewEmailZeacomPage ViewEmailZeacomPage;
	private R4_AgCCWebFormSubmissionPage R4_AgCCWebFormSubmissionPage;
	private GmailStep3 GmailStep3;
	private SendCaseEmail SendCaseEmail;
	private CommentsWebForm CommentsWebForm;
	private SouthEastAsia southEastAsia;
	private SouthSaharaLoginPage southSaharaLoginPage;
	private SouthSahara southSahara;
	private StellarSupportWebformSubmissionPage stellarSupportWebformSubmissionPage;
	private GreenFleetWebFormSubmissionPage greenFleetWebFormSubmissionPage;
	private IndiaLoginPage indiaLoginPage;
	private India india;
	private AgronomyLoginPage agronomyLoginPage;
	private Agronomy agronomy;
	private JDLinksWebFormSubmitionPage jdLinksWebFormSubmitionPage;
	private ISGCaseSearchPage isgCaseSearchPage;
	private GreenFleetCreationPage greenFleetCreationPage;
	private GSCCustomerSearch gscCustomerSearch;
    private CaseCoding caseCoding;
	// Open the Site Minder Portal
	public SiteMinderLoginPage openPortal(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening Site Minder Portal");
		return new SiteMinderLoginPage(driver);
	}

	// Login to Site Minder Portal
	public PegaLoginPage loginToSiteMinder(SiteMinderLoginPage siteMinderLoginPag, String username, String password) {
		pegaLoginPage = siteMinderLoginPag.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging in to Site Minder");
		return pegaLoginPage;
	}

	// Login to Pega Site
	public <T> T loginToPega(PegaLoginPage loginPage, String username, String password, Class<T> landingPage) {
		Object obj = loginPage.enterUserId(username).enterPassword(password).clickLogInBtn(landingPage);
		logger.log(LogStatus.PASS, "Logging in to Pega Site");
		return (T) obj;
	}

	// Navigate to Solution search page
	public SolutionSearchHomePage navigateToSolutionSearchHome(NavigationClass navigationPag) {
		solutionSearchHomePage = navigationPag.clickSolutionSearchHomeLink();
		logger.log(LogStatus.PASS, "Navigating to Solution Search home page");
		return solutionSearchHomePage;
	}

	// Navigate to CreateISGCase page
	public ISGCasePage navigateToCreateISGCaseHome(HomePage homePage) {
		// isgCasePage = iSGnavigationPag.clickCreateISGCaseHomeLink();
		isgCasePage = homePage.clickCreateISGCaseHomeLink();
		logger.log(LogStatus.PASS, "Navigating to Create ISG Case home page");
		return isgCasePage;
	}

	// Jyothsna :Entering Customer Info Details
	public ISGCasePage enterIsgCaseCreationDet(ISGCasePage isgCasePage, String CountryCode, String FirstName,
			String LastName, String model, String func_area, String func_code, String summary) {
		isgCasePage = isgCasePage.clickAddCustomerInfo(isgCasePage).isgCountryCode(CountryCode)
				.isgEnterFirstName(FirstName).isgEnterLastName(LastName).clickCustomerSearch()
				.clickRadioButton(isgCasePage).clickCustomerSubmitButton(isgCasePage).clickOnAddProductInfo(isgCasePage)
				.enterModel(model).clickProductSubmitButton(isgCasePage).FunctionalArea(func_area).FunCode(func_code)
				.priority().origin().isgSummary(summary).AccepButton();
		logger.log(LogStatus.PASS, "Entering Customer details for ISG Case Creation  ");
		return isgCasePage;
	}

	// Entering Product info Details
	public ISGCasePage addProductInfoDetails(ISGCasePage isgCasePage, String model) {
		isgCasePage = isgCasePage.clickOnAddProductInfo(isgCasePage).enterModel(model)
				.clickProductSubmitButton(isgCasePage);
		logger.log(LogStatus.PASS, "Entering Product info Details");
		return isgCasePage;
	}

	// Entering Functional Area and code,Priority,Origin, ISGSummary
	public ISGCasePage addFunctionalDetails(ISGCasePage isgCasePage, String func_area, String func_code,
			String summary) {
		isgCasePage = isgCasePage.FunctionalArea(func_area).FunCode(func_code).priority().origin().isgSummary(summary)
				.AccepButton();
		logger.log(LogStatus.PASS,
				"Entering Functional Area and code Priority,Origin, ISGSummary and click on Accept ");
		return isgCasePage;
	}

	public ISGCasePage ISGAccept_Button(ISGCasePage isgCasePage) {
		isgCasePage = isgCasePage.AccepButton();
		logger.log(LogStatus.PASS, "Clicked on Accept button ");
		return isgCasePage;
	}

	// Click on Case search Img button and click on case id link
	public ISGCaseSearchPage clickCaseSearchImgLink(ISGCaseSearchPage isgCaseSearchPage) {
		isgCaseSearchPage = isgCaseSearchPage.clickCaseSearchImgLink().clickCaseIdLink();
		logger.log(LogStatus.PASS, "Click on Case search Img button and click on case Id link");
		return isgCaseSearchPage;
	}

	// Click on Case Link to main Page
	public ISGCasePage clickCaseLink(ISGCaseSearchPage isgCaseSearchPage) {
		isgCasePage = isgCaseSearchPage.clickCaseLink();
		logger.log(LogStatus.PASS, "Click on Case search Link");
		return isgCasePage;
	}

	// enter CaseId in solution search box
	public SolutionSearchHomePage clickOnSolutionSearchBox(SolutionSearchHomePage solutionSearchHomePage,
			String caseid) {
		solutionSearchHomePage = solutionSearchHomePage.clickOnSolutionSearchBox(caseid);
		logger.log(LogStatus.PASS, "Entering the CaseId in search box ");
		return solutionSearchHomePage;

	}

	// Click on Solution Search Button
	public SolutionSearchHomePage clickOnSolutionSearchButton(SolutionSearchHomePage solutionSearchHomePage) {
		solutionSearchHomePage = solutionSearchHomePage.clickOnSolutionSearchButton();
		logger.log(LogStatus.PASS, "click on Solution Search Button");
		return solutionSearchHomePage;

	}

	// click on GSC homepage
	public GSCCaseCreationPage clickonGSCCase(GSCCaseCreationPage gscCaseCreationPage) {

		gscCaseCreationPage = gscCaseCreationPage.clickonGSCCase();
		logger.log(LogStatus.PASS, "Clicking on GSC case");
		return gscCaseCreationPage;
	}

	// click on Add Customer Info
	public GSCCaseCreationPage clickAddCustomeInfo(GSCCaseCreationPage gscCaseCreationPage)
			throws InterruptedException {
		gscCaseCreationPage = gscCaseCreationPage.clickAddCustomeInfo();
		logger.log(LogStatus.PASS, "Click on Add Info");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage enterCustomerFirstName(GSCCaseCreationPage gscCaseCreationPage, String CustFirstName)
			throws InterruptedException {

		gscCaseCreationPage = gscCaseCreationPage.enterCustomerFirstName(CustFirstName);
		logger.log(LogStatus.PASS, "Click on Add Info");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage enterCustomerLastName(GSCCaseCreationPage gscCaseCreationPage, String CustLastName) {
		gscCaseCreationPage = gscCaseCreationPage.enterCustomerLastName(CustLastName);
		logger.log(LogStatus.PASS, "Click on Add Info");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage selectCountry(GSCCaseCreationPage gscCaseCreationPage, String Country) {
		gscCaseCreationPage = gscCaseCreationPage.selectCountry(Country);
		logger.log(LogStatus.PASS, "Country should be select successfully");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage GSCSearchCustomer(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.GSCSearchCustomer();
		logger.log(LogStatus.PASS, "Search customer should display successfully");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage GSCSearchCustomerDetails(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.GSCSearchCustomerDetails();
		logger.log(LogStatus.PASS, "Customer details displayed successfully");
		return gscCaseCreationPage;
	}

	// ********Functional method ***click on Add product Info Icon****
	public GSCCaseCreationPage clickonAddProductInfo(GSCCaseCreationPage gscCaseCreationPage)
			throws InterruptedException {
		gscCaseCreationPage = gscCaseCreationPage.clickonAddProductInfo();
		logger.log(LogStatus.PASS, "product icon clicked");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage enterProductModel(GSCCaseCreationPage gscCaseCreationPage, String model) {
		gscCaseCreationPage = gscCaseCreationPage.enterProductModel(model);
		logger.log(LogStatus.PASS, "select product model");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage ClickAddProductSubmit(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.ClickAddProductSubmit();
		logger.log(LogStatus.PASS, "click on product submit");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage enterCasecodingFA(GSCCaseCreationPage gscCaseCreationPage, String FArea) {
		gscCaseCreationPage = gscCaseCreationPage.enterCasecodingFA(FArea);
		logger.log(LogStatus.PASS, "enter FArea");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage enterCasecodingFC(GSCCaseCreationPage gscCaseCreationPage, String FCode) {
		gscCaseCreationPage = gscCaseCreationPage.enterCasecodingFC(FCode);
		logger.log(LogStatus.PASS, "Enter Fcode");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage enterPriority(GSCCaseCreationPage gscCaseCreationPage, String Priority)
			throws InterruptedException {
		gscCaseCreationPage = gscCaseCreationPage.enterPriority(Priority);
		logger.log(LogStatus.PASS, "Enter Priority");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage enterLanguage(GSCCaseCreationPage gscCaseCreationPage, String Language) {
		gscCaseCreationPage = gscCaseCreationPage.enterLanguage(Language);
		logger.log(LogStatus.PASS, "Enter Language");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage enterOrigin(GSCCaseCreationPage gscCaseCreationPage, String Origin)
			throws InterruptedException {
		gscCaseCreationPage = gscCaseCreationPage.enterOrigin(Origin);
		logger.log(LogStatus.PASS, "Enter origin");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage EnterAddSummary(GSCCaseCreationPage gscCaseCreationPage, String summary) {
		gscCaseCreationPage = gscCaseCreationPage.EnterAddSummary(summary);
		logger.log(LogStatus.PASS, "Enter details in summary");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage selectWorkBasket(GSCCaseCreationPage gscCaseCreationPage, String Workbasket) {
		gscCaseCreationPage = gscCaseCreationPage.selectWorkBasket(Workbasket);
		logger.log(LogStatus.PASS, "select workbasket");
		return gscCaseCreationPage;

	}

	public GSCCaseCreationPage clickonAccept(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.clickonAccept();
		logger.log(LogStatus.PASS, "clcik on Accept button");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage selectWorkgroup(GSCCaseCreationPage gscCaseCreationPage, String Workgroup)
			throws InterruptedException {
		gscCaseCreationPage = gscCaseCreationPage.selectWorkgroup(Workgroup);
		logger.log(LogStatus.PASS, "select workgroup");
		return gscCaseCreationPage;

	}

	public GSCCaseCreationPage clickonRoute(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.clickonRoute();
		logger.log(LogStatus.PASS, "clicked on Route button");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage clickonActions(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.clickonActions();
		logger.log(LogStatus.PASS, "clicked on Actions button");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage sendcasemail(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.sendcasemail();
		logger.log(LogStatus.PASS, "clicked on send case mail button");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage entersendcasemail(GSCCaseCreationPage gscCaseCreationPage, String mail) {
		gscCaseCreationPage = gscCaseCreationPage.entersendcasemail(mail);
		logger.log(LogStatus.PASS, "enter details in send case mail ");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage sendbutton(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.sendbutton();
		logger.log(LogStatus.PASS, "clicked on send case  button");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage audittrails(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.audittrails();
		logger.log(LogStatus.PASS, "clicked on audit trails  button");
		return gscCaseCreationPage;
	}

	// alert verification
	public GSCCaseCreationPage alertVerification(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.alertVerification();
		logger.log(LogStatus.PASS, "need to verify alert");
		return gscCaseCreationPage;
	}

	// click on ISG
	public ISGCaseCreation clickonISGCase(ISGCaseCreation isgCaseCreation) throws InterruptedException {

		isgCaseCreation = isgCaseCreation.clickonISGCase();
		logger.log(LogStatus.PASS, "Clicking on ISG case");
		return isgCaseCreation;
	}

	// ***************US31497_GSC Routing
	// Workbasket***************************************

	public GSCCaseCreationPage clickonAction(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.clickonAction();
		logger.log(LogStatus.PASS, "click on Action");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage clickonWorkcase(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.clickonWorkcase();
		logger.log(LogStatus.PASS, "select workbasket");
		return gscCaseCreationPage;

	}

	public GSCCaseCreationPage clickontransfer_case_Workbasket(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.clickontransfer_case_Workbasket();
		logger.log(LogStatus.PASS, "select workbasket");
		return gscCaseCreationPage;
	}

	public GSCCaseCreationPage clickontransfer(GSCCaseCreationPage gscCaseCreationPage) {
		gscCaseCreationPage = gscCaseCreationPage.clickontransfer();
		logger.log(LogStatus.PASS, "select workbasket");
		return gscCaseCreationPage;
	}

	// Jyothsna : click on new case creation Auto mail
	public ViewEmaiPage getOpenedCaseMessage(ViewEmaiPage ViewEmaiPage) {
		ViewEmaiPage = ViewEmaiPage.getOpenedCaseMessage();
		logger.log(LogStatus.PASS, "Validated opened case Information details ");
		return ViewEmaiPage;
	}

	// Jyothsna : click on new case creation Auto mail
	public ISGCasePage SwitchToMainPage(ViewEmaiPage ViewEmaiPage) {
		ISGCasePage = ViewEmaiPage.SwitchToMainPage();
		logger.log(LogStatus.PASS, "Switched to Main Page ");
		return ISGCasePage;
	}

	// Jyothsna : click on new case creation Auto mail
	public ISGCasePage SwitchToDefaultFrame(ISGCasePage ISGCasePage) {
		ISGCasePage = ISGCasePage.SwitchToDefaultFrame();
		logger.log(LogStatus.PASS, "Switched to Main Page ");
		return ISGCasePage;
	}

	// Jyothsna : click on new case creation Auto mail
	public ISGCasePage SwitchToMainFrame(ISGCasePage ISGCasePage) {
		ISGCasePage = ISGCasePage.SwitchToMainFrame();
		logger.log(LogStatus.PASS, "Switched to Main Page ");
		return ISGCasePage;
	}

	// Jyothsna : click on new case creation Auto mail
	public ViewEmailZeacomPage clickOnMailZeacom(ISGCasePage isgCasePage) {
		ViewEmailZeacomPage = ISGCasePage.clickOnMailZeacom();
		logger.log(LogStatus.PASS, "Click on mail Zeacom ");
		return ViewEmailZeacomPage;
	}

	// Jyothsna : click on new case creation Auto mail
	public ISGCasePage SwitchToMainPage(ViewEmailZeacomPage ViewEmailZeacomPage) {
		ISGCasePage = ViewEmailZeacomPage.SwitchToMainPage();
		logger.log(LogStatus.PASS, "Switched to Main Page ");
		return ISGCasePage;
	}

	// Jyothsna : click on new case creation Auto mail
	public ISGCasePage clickonActions(ISGCasePage isgCasePage) {
		ISGCasePage = isgCasePage.clickonActions();
		logger.log(LogStatus.PASS, "Clicked on Actions");
		return ISGCasePage;
	}

	public SendCaseEmail sendcasemail(ISGCasePage isgCasePage) {
		SendCaseEmail = isgCasePage.sendcasemail();
		logger.log(LogStatus.PASS, "clicked on send case mail button");
		return SendCaseEmail;
	}

	public SendCaseEmail entersendcasemail(SendCaseEmail SendCaseEmail, String mail) {
		SendCaseEmail = SendCaseEmail.entersendcasemail(mail);
		logger.log(LogStatus.PASS, "enter details in send case mail ");
		return SendCaseEmail;
	}

	public SendCaseEmail sendbutton(SendCaseEmail SendCaseEmail) {
		SendCaseEmail = SendCaseEmail.sendbutton();
		logger.log(LogStatus.PASS, "clicked on send case  button");
		return SendCaseEmail;
	}
	
	// click on GSCCase
			public CaseCoding caseCodingClickOnGSCCase(CaseCoding casecode) {
				caseCoding = casecode.clickOnGSCCase();
				logger.log(LogStatus.PASS, "Clicking on GSC case");
				return caseCoding;
			}



	// Login to Gmail Portal
	public GmailStep3 LogintoGmailPage(GmailLoginPage GmailLoginPage, String username, String password)
			throws InterruptedException {
		GmailStep3 = GmailLoginPage.enterUserName(username).enterPassword(password);
		logger.log(LogStatus.PASS, "Logging in to Gmail Page");
		return GmailStep3;
	}

	public GmailStep2 clickOnAppsButton(GmailStep2 GmailStep2) {
		GmailStep2 = GmailStep2.clickOnAppsButton();
		logger.log(LogStatus.PASS, "clicked on Gmail Apps button");
		return GmailStep2;
	}

	public GmailStep3 clickOnGmailButton(GmailStep2 GmailStep2) {
		GmailStep3 = GmailStep2.clickOnGmailButton();
		logger.log(LogStatus.PASS, "clicked on Gmail  button");
		return GmailStep3;
	}

	public GmailStep3 clickOnSearchBox(GmailStep3 GmailStep3) {
		GmailStep3 = GmailStep3.clickOnSearchBox();
		logger.log(LogStatus.PASS, "clicked on Gmail Search box");
		return GmailStep3;
	}

	public GmailStep3 EnterValueInSearchBox(GmailStep3 GmailStep3, String SearchValue, String Caseid) {
		GmailStep3 = GmailStep3.EnterValueInSearchBox(SearchValue, Caseid);
		logger.log(LogStatus.PASS, "clicked on Gmail Search button");
		return GmailStep3;
	}

	/****************** South Sahara By Jyothsna ****************************/

	public GmailStep2 clickOnAppsButton1(GmailStep2 GmailStep2) {
		GmailStep2 = GmailStep2.clickOnAppsButton1();
		logger.log(LogStatus.PASS, "clicked on Gmail Apps button");
		return GmailStep2;
	}

	public GmailStep3 clickOnGmailButton1(GmailStep2 GmailStep2) {
		GmailStep3 = GmailStep2.clickOnGmailButton1();
		logger.log(LogStatus.PASS, "clicked on Gmail  button");
		return GmailStep3;
	}

	public GmailStep3 clickOnSearchIcon(GmailStep3 GmailStep3) {
		GmailStep3 = GmailStep3.clickOnSearchIcon();
		logger.log(LogStatus.PASS, "clicked on Search box Icon");
		return GmailStep3;
	}

	public GmailStep3 clickOnInboxLink(GmailStep3 GmailStep3) {
		GmailStep3 = GmailStep3.clickOnInboxLink();
		logger.log(LogStatus.PASS, "clicked on Inbox link");
		return GmailStep3;
	}

	public CommentsWebForm clickOnAddCommentsLink(GmailStep3 GmailStep3) {
		CommentsWebForm = GmailStep3.clickOnAddCommentsLink();
		logger.log(LogStatus.PASS, "clicked on clickOnAddCommentsLink");
		return CommentsWebForm;
	}

	public CommentsWebForm sendUserComments(CommentsWebForm CommentsWebForm, String comments) {
		CommentsWebForm = CommentsWebForm.sendUserComments(comments);
		logger.log(LogStatus.PASS, "Entered comments");
		return CommentsWebForm;
	}

	public CommentsWebForm ClearComments(CommentsWebForm CommentsWebForm) {
		CommentsWebForm = CommentsWebForm.ClearComments();
		logger.log(LogStatus.PASS, "Clicked on clear button");
		return CommentsWebForm;
	}

	public CommentsWebForm SubmitComments(CommentsWebForm CommentsWebForm) {
		CommentsWebForm = CommentsWebForm.SubmitComments();
		logger.log(LogStatus.PASS, "clicked on submit button");
		return CommentsWebForm;
	}

	// Open the Gmail Portal
	public GmailLoginPage openGmailPortal(WebDriver driver, String url) {
		System.out.println("entered into method openGmailPortal");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new GmailLoginPage(driver);
	}

	// WorkgroupFilter
	public GSCRoutingFilterPage clickonWorkGroupQueuefilter(GSCRoutingFilterPage GSCRoutingFilterPage) {
		GSCRoutingFilterPage = GSCRoutingFilterPage.clickonWorkGroupQueuefilter();
		logger.log(LogStatus.PASS, "click on WorkGroupQueue filter");
		return GSCRoutingFilterPage;
	}

	public GSCRoutingFilterPage enterWorkbasket(GSCRoutingFilterPage GSCRoutingFilterPage, String WBasket) {
		GSCRoutingFilterPage = GSCRoutingFilterPage.enterWorkbasket(WBasket);
		logger.log(LogStatus.PASS, "click on WorkGroupQueue filter");
		return GSCRoutingFilterPage;
	}

	public GSCRoutingFilterPage entersubgroupselection(GSCRoutingFilterPage GSCRoutingFilterPage) {
		GSCRoutingFilterPage = GSCRoutingFilterPage.entersubgroupselection();
		logger.log(LogStatus.PASS, "click on WorkGroupQueue filter");
		return GSCRoutingFilterPage;
	}

	/********************
	 * TC6587
	 ***********************************************************/

	private ISGRecommendedSolutionsSectionPage isgRecommendedSolutionsSection;

	// Lahari : Navigating to ISg Case Creation Page and Clicking on ISG Case
	// Creation Button
	public ISGRecommendedSolutionsSectionPage NavToISGCaseCreatClkISGBtn(HomePage homePage) {
		isgRecommendedSolutionsSection = homePage.clickCreateISGCaseBtn().switchToFrame();
		logger.log(LogStatus.PASS,
				" Navigating to ISGRecommendedSolutionsSection and Clicking on ISG Case Creation Button ");
		return isgRecommendedSolutionsSection;
	}

	// Lahari : Navigating to home page and clicking on Home Button
	public ISGRecommendedSolutionsSectionPage navigateToHome(NavigationClass navigationPag) {
		isgRecommendedSolutionsSection = navigationPag.clickHomeBtn();
		logger.log(LogStatus.PASS, "Navigating to  home page and clicking on Home Button");
		return isgRecommendedSolutionsSection;
	}

	// Clicking in search icon for solution search Id filed
	public ISGRecommendedSolutionsSectionPage clickOnSearchForSolutionIdFiled(
			ISGRecommendedSolutionsSectionPage isgRecommendedSolutionsSectionPag) {
		isgRecommendedSolutionsSection = isgRecommendedSolutionsSectionPag.clickSearchIcon();
		logger.log(LogStatus.PASS, "Clicking on ISG Case Creation Button");
		return isgRecommendedSolutionsSection;
	}

	// Lahari : Enter solution Id filed data
	public ISGRecommendedSolutionsSectionPage enterSoluId(
			ISGRecommendedSolutionsSectionPage isgRecommendedSolutionsSectionPag, String id) {
		isgRecommendedSolutionsSection = isgRecommendedSolutionsSectionPag.enterIdInSolSearchFiled(id);
		logger.log(LogStatus.PASS, "Entering Solution Id filed data");
		return isgRecommendedSolutionsSection;
	}

	// Lahari : Enter solution Id filed data
	public ISGRecommendedSolutionsSectionPage enterSoluIdClickSecrh(
			ISGRecommendedSolutionsSectionPage isgRecommendedSolutionsSectionPag, String id) {
		isgRecommendedSolutionsSection = isgRecommendedSolutionsSectionPag.enterIdInSolSearchFiled(id)
				.clickSearchIcon();
		logger.log(LogStatus.PASS,
				"Entering Solution ID search field, enter a valid solution ID  and Clicking on search of Solution ID");
		return isgRecommendedSolutionsSection;
	}

	// Lahari : Clicking on solution Id Link
	public ISGRecommendedSolutionsSectionPage clickOnSolutionIdLink(
			ISGRecommendedSolutionsSectionPage isgRecommendedSolutionsSectionPag) {
		isgRecommendedSolutionsSection = isgRecommendedSolutionsSectionPag.clickOnSolutionIdLink().frameSwitching();
		logger.log(LogStatus.PASS, " Clicking on  solution Id Link");
		return isgRecommendedSolutionsSection;
	}

	/********************
	 * End of TC6587
	 ***********************************************************/

	/********************
	 * TC6560
	 ***********************************************************/

	private ISGCaseCreationHomePage isgCaseCreationHomePage;
	private HomePage homePage;

	// Lahari : Navigate to Home Page from any page
	public HomePage navigateToHomePage(NavigationClass navigationPag) {
		homePage = navigationPag.clickOnHomeButton();
		logger.log(LogStatus.PASS, "Navigating to  home page");
		return homePage;
	}

	// Lahari : Navigate toISGCaseCreationHomePage
	public ISGCaseCreationHomePage navigateToISGCaseCreationHomePage(NavigationClass navigationPag) {
		isgCaseCreationHomePage = navigationPag.clickHomeLink();
		logger.log(LogStatus.PASS, "Navigating to  ISGCaseCreationHomePage ");
		return isgCaseCreationHomePage;
	}

	// Lahari : Clicking on EYE Icon
	public ISGCaseCreationHomePage clickCaseInfmEyeBtn(ISGCaseCreationHomePage isgCaseCreationHomePag) {
		isgCaseCreationHomePage = isgCaseCreationHomePag.clickEyeBtn();
		logger.log(LogStatus.PASS, "Clicking on EYE Icon");
		return isgCaseCreationHomePage;
	}

	// Lahari : Navigating to ISg Case Creation Page and Clicking on ISG Case
	// Creation Button
	public ISGCaseCreationHomePage NavToISGCaseCreatclkISGBtn(HomePage homePage) {
		isgCaseCreationHomePage = homePage.clickISgBtn().switchToFrame();
		logger.log(LogStatus.PASS, " Navigating to ISg Case Creation Page and Clicking on ISG Case Creation Button ");
		return isgCaseCreationHomePage;
	}

	// Lahari : Clicking on Edit Icon
	public ISGCaseCreationHomePage clickEditBtn(ISGCaseCreationHomePage isgCaseCreationHomePag) {
		isgCaseCreationHomePage = isgCaseCreationHomePag.clickEdit();
		logger.log(LogStatus.PASS, "Clicking on edit Icon");
		return isgCaseCreationHomePage;
	}

	// Lahari : Click on Add Product Info and Enter model details for Product Info
	public ISGCaseCreationHomePage clickAddProductInfoEnterModelDetail(ISGCaseCreationHomePage isgCaseCreationHomePag,
			String model) {
		isgCaseCreationHomePage = isgCaseCreationHomePag.productInfoModel(model);
		logger.log(LogStatus.PASS, "Entering model details for Product Info");
		return isgCaseCreationHomePage;
	}

	// Lahari : Click on Edit Product Info and Enter model details for Product Info
	public ISGCaseCreationHomePage clickEditProductInfoEnterModelDetail(ISGCaseCreationHomePage isgCaseCreationHomePag,
			String model) {
		isgCaseCreationHomePage = isgCaseCreationHomePag.editproductInfoModel(model);
		logger.log(LogStatus.PASS, "Entering model details for Product Info");
		return isgCaseCreationHomePage;
	}

	// Lahari : Clear Value from Product Model Drop down filed
	public ISGCaseCreationHomePage clearValueFromModelDropDownfiled(ISGCaseCreationHomePage isgCaseCreationHomePag) {
		isgCaseCreationHomePage = isgCaseCreationHomePag.clearproductInfoModel();
		logger.log(LogStatus.PASS, "Clearing model details for Product Info");
		return isgCaseCreationHomePage;
	}

	private GSCRoutingPage gscRouting;

	// Lahari : Navigate to Home Page from any page
	public GSCRoutingPage navigateToGSCRoutingPageClkHomeBtn(NavigationClass navigationPag) {
		gscRouting = navigationPag.clickHomeButn();
		logger.log(LogStatus.PASS, "Navigating to GSCRoutingPage and clicking on Home Button");
		return gscRouting;
	}

	// Lahari : click on GSC button
	public GSCRoutingPage clickonGSCCase(GSCRoutingPage gscRoutingPage) {
		gscRouting = gscRoutingPage.clickonGSCCase();
		logger.log(LogStatus.PASS, "Clicking on GSC Case Creation button");
		return gscRouting;
	}

	// Lahari :Entering GSC Case Creation All Mandatory fields data clicking on
	// submit button
	public GSCRoutingPage gscCaseCreationDetails(GSCRoutingPage GSCRoutingPage, String lastNme, String fisName,
			String country, String model, String funarea, String functionCode, String priorty, String orig, String summ)
			throws InterruptedException {
		gscRouting = GSCRoutingPage.clickAddCustomeInfo(lastNme, fisName, country).productInfoModel(model)
				.functionalArea(funarea).functionalCode(functionCode).priority(priorty).origin(orig)
				.problemDetailsSummary(summ).selectWorkBasket().clickonAcceptBtn();
		logger.log(LogStatus.PASS,
				" Entering GSC Case Creation All Mandatory fileds data and clicking on submit button");
		return gscRouting;
	}

	// Lahari : Perform Actions Functionalities
	public GSCRoutingPage selectvalfromActionsClkSubmit(GSCRoutingPage GSCRoutingPage, String oper, String work) {
		gscRouting = GSCRoutingPage.clickonActionsselectVal(oper, work);
		logger.log(LogStatus.PASS,
				"selecting Transfer to Individual option from Actions and submit all details in Transfer popup screen clicking on submit button");
		return gscRouting;
	}

	// Lahari : Perform Actions Functionalities
	public GSCRoutingPage selActionsDDEntOperWBClkSubmit(GSCRoutingPage GSCRoutingPage, String oper, String wrkBask)
			throws InterruptedException {
		gscRouting = GSCRoutingPage.clickontransferToWorkBasket().clickonActionsselectValTranWB(oper, wrkBask);
		logger.log(LogStatus.PASS,
				"selecting Transfer case to WB option from Actions and submit all details in Transfer popup screen clicking on submit button");
		return gscRouting;
	}

	// Lahari : Perform Actions Functionalities
	public GSCRoutingPage getCaseId(GSCRoutingPage GSCRoutingPage) throws InterruptedException {
		gscRouting = GSCRoutingPage.getGscCaseId();
		logger.log(LogStatus.PASS,
				"selecting Transfer case to WB option from Actions and submit all details in Transfer popup screen clicking on submit button");
		return gscRouting;
	}

	// Lahari : selecting Transfer case to WB option from Actions
	public GSCRoutingPage selectTransWB(GSCRoutingPage GSCRoutingPage) throws InterruptedException {
		gscRouting = GSCRoutingPage.clickontransferToWorkBasket();
		logger.log(LogStatus.PASS, "selecting Transfer case to WB option from Actions ");
		return gscRouting;
	}

	// Lahari : select value from WorkBasket and click on transfer
	public GSCRoutingPage selectValFromWorkBasket(GSCRoutingPage gscRoutingPage, String workbasket)
			throws InterruptedException {
		gscRouting = gscRoutingPage.selectWorkBasketTrafCase(workbasket);
		logger.log(LogStatus.PASS, "selecting select WorkBasket value and  clicking on transfer button");
		return gscRouting;
	}

	// Lahari : selecting transferToIndividual from Actions DD
	public GSCRoutingPage selecttransferToIndividual(GSCRoutingPage gscRoutingPage) throws InterruptedException {
		gscRouting = gscRoutingPage.clickontransferToIndividual();
		logger.log(LogStatus.PASS, "selecting transferToIndividual from Actions DD");
		return gscRouting;
	}

	// Lahari :click on WorkGroupQueue
	public GSCRoutingFilterSearchPage NavToGSCRoutingFilterSearchPageclkWBQueue(GSCRoutingPage gscRoutingPage) {

		gscRoutingFilterSearch = gscRoutingPage.clickonWorkGroupQueue();
		logger.log(LogStatus.PASS, "Clicking on WorkGroupQueue");
		return gscRoutingFilterSearch;
	}

	// Lahari : click on transfer
	public GSCRoutingPage clikTransfBtn(GSCRoutingPage gscRoutingPage) throws InterruptedException {
		gscRouting = gscRoutingPage.transferBtn();
		logger.log(LogStatus.PASS, "  clicking on transfer button");
		return gscRouting;
	}

	// Lahari : click on transfer
	public GSCRoutingPage enterOperatiorFiledData(GSCRoutingPage gscRoutingPage, String oper)
			throws InterruptedException {
		gscRouting = gscRoutingPage.operatiorFiledDataValid(oper);
		logger.log(LogStatus.PASS, " Entering data into Operator filed Data");
		return gscRouting;
	}

	// Lahari : click on transfer
	public GSCRoutingPage enterOperatiorFiledDataInvalid(GSCRoutingPage gscRoutingPage, String oper)
			throws InterruptedException {
		gscRouting = gscRoutingPage.operatiorFiledDataInval(oper);
		logger.log(LogStatus.PASS, " Entering data into Operator filed Data");
		return gscRouting;
	}

	// Lahari : click on transfer
	public GSCRoutingPage enterOperatiorSelWBClkSub(GSCRoutingPage gscRoutingPage, String oper, String workbaket)
			throws InterruptedException {
		gscRouting = gscRoutingPage.operatiorFiledDataInval(oper).selectValFromWorkBasket(workbaket).submitBtnClick();
		logger.log(LogStatus.PASS,
				" Entering data into Operator filed ,Selecting workbasket value and clicking on submit button");
		return gscRouting;
	}

	// Lahari : click on submit
	public GSCRoutingPage clickSubmitbutton(GSCRoutingPage gscRoutingPage) throws InterruptedException {
		gscRouting = gscRoutingPage.submitBtnClick();
		logger.log(LogStatus.PASS, "  clicking on Submit button");
		return gscRouting;
	}

	// Lahari : Clicking on close button
	public GSCRoutingPage clickOnCloseButton(GSCRoutingPage GSCRoutingPage) throws InterruptedException {
		gscRouting = GSCRoutingPage.clickonCloseBtn();
		logger.log(LogStatus.PASS, "Clicking on close button ");
		return gscRouting;
	}

	// Lahari : selecting Valiue From Workbasket and clicking on Submit button
	public GSCRoutingPage selectWorkBasketFiledData(GSCRoutingPage gscRoutingPage, String workbaket)
			throws InterruptedException {
		gscRouting = gscRoutingPage.selectValFromWorkBasket(workbaket);
		logger.log(LogStatus.PASS, "  selecting Valiue From Workbasket and clicking on Submit button");
		return gscRouting;
	}

	// Lahari : selecting Valaue From Workbasket and clicking on Candle button
	public GSCRoutingPage selectWorkBasketFiledclickCancle(GSCRoutingPage gscRoutingPage, String workbaket)
			throws InterruptedException {
		gscRouting = gscRoutingPage.selectWorkBasket(workbaket);
		logger.log(LogStatus.PASS, "  selecting Valiue From Workbasket and clicking on Candle button");
		return gscRouting;
	}

	// Lahari : Perform Actions Functionalities clickontransferToWorkBasket
	public GSCRoutingPage selectWorkCasefromActionsDD(GSCRoutingPage GSCRoutingPage) {
		gscRouting = GSCRoutingPage.clickonWorkCase();
		logger.log(LogStatus.PASS, "selecting WorkCase option from Actions ");
		return gscRouting;
	}

	// Lahari : clickontransferToWorkBasket
	public GSCRoutingPage selectTranfWorkbasketFrmActionsDD(GSCRoutingPage GSCRoutingPage) {
		gscRouting = GSCRoutingPage.clickontransferToWorkBasket();
		logger.log(LogStatus.PASS, "selecting TransfertoWorkBasket  option from Actions ");
		return gscRouting;
	}

	// Lahari : Clicking on Transfer button accepting alert
	public GSCRoutingPage clikTransfBtnAccetAlert(GSCRoutingPage GSCRoutingPage) throws InterruptedException {
		gscRouting = GSCRoutingPage.transferBtn().AcceptAlert();
		logger.log(LogStatus.PASS, "Clicking on Transfer button accepting alert ");
		return gscRouting;
	}

	private GSCRoutingFilterSearchPage gscRoutingFilterSearch;

	// Lahari :click on WorkGroupQueue
	public GSCRoutingFilterSearchPage NavToGSCRoutingFilterSearchclkWBQueue(GSCRoutingPage gscRoutingPage) {

		gscRoutingFilterSearch = gscRoutingPage.clickonWorkGroupQueue();
		logger.log(LogStatus.PASS, "Clicking on WorkGroupQueue");
		return gscRoutingFilterSearch;
	}

	// Lahari :click on filters
	public GSCRoutingFilterSearchPage clickfiltersLink(GSCRoutingFilterSearchPage gscRoutingFilterSearchPage) {
		gscRoutingFilterSearch = gscRoutingFilterSearchPage.clickFilters();
		logger.log(LogStatus.PASS, "Clicking on filters");
		return gscRoutingFilterSearch;
	}

	// Lahari : select value from WorkBasket and click on submit
	public GSCRoutingFilterSearchPage selectValFromWorkBasketandClikSubmit(
			GSCRoutingFilterSearchPage gscRoutingFilterSearchPage, String workbas) throws InterruptedException {
		gscRoutingFilterSearch = gscRoutingFilterSearchPage.selectfilterWorkBasket(workbas).submitBtn();
		logger.log(LogStatus.PASS, "selecting  value from WorkBasket and clicking on submit btn");
		return gscRoutingFilterSearch;
	}

	// Lahari : select value from WorkBasket and click on submit
	public GSCRoutingFilterSearchPage verfyCaseIsExistInWBQ(GSCRoutingFilterSearchPage gscRoutingFilterSearchPage)
			throws InterruptedException {
		gscRoutingFilterSearch = gscRoutingFilterSearchPage.storeCaseIdIntoStringVar().verifyCaseIdExistInTable();
		logger.log(LogStatus.PASS, "selecting  value from WorkBasket and clicking on submit btn");
		return gscRoutingFilterSearch;
	}

	// Lahari : select value from WorkBasket
	public GSCRoutingFilterSearchPage selectValFromWorkBasket(GSCRoutingFilterSearchPage gscRoutingFilterSearchPage,
			String workbas) throws InterruptedException {
		gscRoutingFilterSearch = gscRoutingFilterSearchPage.selectfilterWorkBasket(workbas);
		logger.log(LogStatus.PASS, "selecting  value from WorkBasket ");
		return gscRoutingFilterSearch;
	}

	// Lahari : Get the case id and clicking on filters Link
	public GSCRoutingFilterSearchPage capCaseId(GSCRoutingFilterSearchPage gscRoutingFilterSearchPage)
			throws InterruptedException {
		gscRoutingFilterSearch = gscRoutingFilterSearchPage.setGscCaseID();
		// String caseid=gscRoutingFilterSearchPage.getGscCaseId();
		logger.log(LogStatus.PASS, "Capturing Case Id ");
		return gscRoutingFilterSearch;
	}

	// Lahari : Get the case id and clicking on filters Link
	public GSCRoutingFilterSearchPage capCaseIdClkfilters(GSCRoutingFilterSearchPage gscRoutingFilterSearchPage)
			throws InterruptedException {
		gscRoutingFilterSearch = gscRoutingFilterSearchPage.setGscCaseID().clickFilters();
		// String caseid=gscRoutingFilterSearchPage.getGscCaseId();
		logger.log(LogStatus.PASS, "Capturing Case Id and  clicking on filters Link ");
		return gscRoutingFilterSearch;
	}

	private ISGLinkSolutionPage isgLinkSolutionPage;

	// Lahari : Navigate ISGLinkSolutionPage page and add all Case Coding Details
	// and Case Information Details
	public ISGLinkSolutionPage navigateToISGLinkSolutionPage(ISGCasePage isgCasePage, String func_area,
			String func_code, String language, String summary) {
		isgLinkSolutionPage = isgCasePage.Functionalarea(func_area).FunctionalCode(func_code).ISGCase_Priority()
				.isgCase_Language(language).ISGCase_Origin().Summary(summary).Accept_Button();
		logger.log(LogStatus.PASS, "Navigating to  home page");
		return isgLinkSolutionPage;
	}

	// Lahari :click on WorkGroupQueue
	public ISGLinkSolutionPage clickWorkBasketQueue(ISGLinkSolutionPage isgLinkSolutionPag) {
		isgLinkSolutionPage = isgLinkSolutionPag.clickonWorkGroupQueue();
		logger.log(LogStatus.PASS, "Clicking on WorkGroupQueue");
		return isgLinkSolutionPage;
	}

	// Lahari : Navigate to Home Page from any page
	public ISGLinkSolutionPage NavToISGLinkSolutionPageClkHome(NavigationClass navigationPag) {
		isgLinkSolutionPage = navigationPag.clickHomeButton();
		logger.log(LogStatus.PASS, "Navigating to  ISGLinkSolutionPage and clicking on Home Button");
		return isgLinkSolutionPage;
	}

	// click to open ISg cases from workBasket and Click on Solutions Search and
	// click on search
	public ISGLinkSolutionPage clickISGCases(ISGLinkSolutionPage isgLinkSolutionPag) throws InterruptedException {
		isgLinkSolutionPage = isgLinkSolutionPag.clickToOpenISGCase().clickSoluSeach().clickSearchBtn();
		logger.log(LogStatus.PASS,
				"clicking to open ISg cases from workGroup Queue and Clicking on Solutions Search and click on search");
		return isgLinkSolutionPage;
	}

	// Click on SolutionSearch Link
	public ISGLinkSolutionPage clickSolutionsSearch(ISGLinkSolutionPage isgLinkSolutionPag) {
		isgLinkSolutionPage = isgLinkSolutionPag.clickSoluSeach().clickSearchBtn();
		logger.log(LogStatus.PASS, "Clicking on SolutionSearch ");
		return isgLinkSolutionPage;
	}

	// Click on SolutionSearch Link
	public ISGLinkSolutionPage clickSolutionsSearchSeltLangu(ISGLinkSolutionPage isgLinkSolutionPag) {
		isgLinkSolutionPage = isgLinkSolutionPag.clickSoluSeach();
		logger.log(LogStatus.PASS, "Clicking on SolutionSearch ");
		return isgLinkSolutionPage;
	}

	// Click on Link solution
	public ISGLinkSolutionPage clickLinkSolution(ISGLinkSolutionPage isgLinkSolutionPag) {
		isgLinkSolutionPage = isgLinkSolutionPag.clickLinkSolution();
		logger.log(LogStatus.PASS, "Clicking on Link solution  ");
		return isgLinkSolutionPage;
	}

	// Opening the case that you choose to attach the solution
	public ISGLinkSolutionPage openCaseIdOfChooseSolution(ISGLinkSolutionPage isgLinkSolutionPag) {
		isgLinkSolutionPage = isgLinkSolutionPag.openCase();
		logger.log(LogStatus.PASS, "Opening the case that you choose to attach the solution");
		return isgLinkSolutionPage;
	}

	// Comparing list of 5 recently opened Cases with checkBox, case ID and Summary
	// and Click on checkCheckBoxForCaseId
	public ISGLinkSolutionPage CompareAndCheckCheckBoxForCaseId(ISGLinkSolutionPage isgLinkSolutionPag) {
		isgLinkSolutionPage = isgLinkSolutionPag.selectCheckBox().compareCaseIdsAndOpenCase()
				.compareCaseIdsAndOpenCase();
		logger.log(LogStatus.PASS,
				"Comparing list of 5 recently opened Cases with checkBox, case ID and Summary and Clicking on checkCheckBoxForCaseId ");
		return isgLinkSolutionPage;
	}

	// Click on Solution
	public ISGLinkSolutionPage clickAnySolution(ISGLinkSolutionPage isgLinkSolutionPag) {
		isgLinkSolutionPage = isgLinkSolutionPag.clickSolution();
		logger.log(LogStatus.PASS, "Clicking on Solution Link   ");
		return isgLinkSolutionPage;
	}

	// Click on Actions
	public ISGLinkSolutionPage clickActionsDD(ISGLinkSolutionPage isgLinkSolutionPag) {
		isgLinkSolutionPage = isgLinkSolutionPag.clickAction().linksolutionPopUp().naviageToCase();
		logger.log(LogStatus.PASS, "Clicking on  Actions and click on Link Solutions ");
		return isgLinkSolutionPage;
	}

	private ISGCaseSearchPage isgCaseSearch;

	// Navigate to Case Search page
	public ISGCaseSearchPage navigateToCaseSearchPage(NavigationClass navigationClass) {
		isgCaseSearch = navigationClass.clickCaseSearchHomeLink();
		logger.log(LogStatus.PASS, "Navigating to Case Search  page");
		return isgCaseSearch;
	}

	// Entered Case Id into case search filed
	public ISGCaseSearchPage enterCaseIdInCaseSearchBox(ISGCaseSearchPage isgCaseSearchPage, String caseID)
			throws Throwable {
		isgCaseSearch = isgCaseSearchPage.enterCaseIDInCaseSearchBox(caseID);
		logger.log(LogStatus.PASS, "Entering Case Id into case search filed");
		return isgCaseSearch;

	}

	// Jyothsna : click on new case creation Auto mail
	public ISGCaseSearchPage clickOnCorrespondence(ISGCaseSearchPage isgCaseSearchPage) {
		isgCaseSearch = isgCaseSearchPage.clickOnCorrespondence();
		logger.log(LogStatus.PASS, "Clicked on Corresrpondence");
		return isgCaseSearch;
	}

	// Jyothsna : click on new case creation Auto mail
	public ISGCaseSearchPage clickOnMail(ISGCaseSearchPage isgCaseSearchPage) {
		isgCaseSearch = isgCaseSearchPage.clickOnMail();
		logger.log(LogStatus.PASS, "Clicked on Email link");
		return isgCaseSearch;
	}

	private ViewEmailZeacomPage viewEmailZeacomPage;

	// Click on mail Zeacom
	public ViewEmailZeacomPage clickOnMailZeacom(ISGCaseSearchPage isgCaseSearchPage) {
		viewEmailZeacomPage = isgCaseSearchPage.clickOnMailZeacom();
		logger.log(LogStatus.PASS, "Clicking on mail Zeacom ");
		return viewEmailZeacomPage;
	}

	// Jyothsna : click on new case creation Auto mail
	public ViewEmailZeacomPage getOpenedCaseMessageZeacom(ViewEmailZeacomPage viewEmailZeacomPag) {
		viewEmailZeacomPage = viewEmailZeacomPag.getOpenedCaseMessageZeacom();
		logger.log(LogStatus.PASS, "Validatingd opened case Information details in zeacom ");
		return viewEmailZeacomPage;
	}

	// Switched to Main Page
	public ISGCasePage switchToMainPage(ViewEmailZeacomPage viewEmailZeacom) {
		isgCasePage = viewEmailZeacom.switchToMainPage();
		logger.log(LogStatus.PASS, "Switching to Main Page ");
		return isgCasePage;
	}

	/************* JDPARTS *************************/

	private JDPartsWebFormSubmissionPage jdPartsWebFormSubmissionPage;

	public JDParts openJDPartsWebformPortal(WebDriver driver, String url) {

		System.out.println("JDPARTS : " + url);
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening JDParts Form Portal");

		return new JDParts(driver);
	}

	// Logged in to Web Forms
	public JDPartsWebFormSubmissionPage logintoWebform(JDParts jd, String username, String password)
			throws InterruptedException {
		jdPartsWebFormSubmissionPage = jd.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging in to Web Forms");
		return jdPartsWebFormSubmissionPage;
	}

	// Entering Data into Detailed description filed and uploading file using File
	// attach button
	public JDPartsWebFormSubmissionPage enterdetailedDescriptionUploadFile(
			JDPartsWebFormSubmissionPage jdPartsWebFormSubmission, String desc) throws Throwable {
		jdPartsWebFormSubmissionPage = jdPartsWebFormSubmission.detailedDescription(desc).uploadFile();
		logger.log(LogStatus.PASS,
				"Entering Data into Detailed description filed and uploading file using File attach button");
		return jdPartsWebFormSubmissionPage;
	}

	// Clicking on Clear button and validating validation message
	public JDPartsWebFormSubmissionPage clickClearButtonVefyValidaMeg(
			JDPartsWebFormSubmissionPage jdPartsWebFormSubmissionPag) {
		jdPartsWebFormSubmissionPage = jdPartsWebFormSubmissionPag.clickOnClearButton();
		logger.log(LogStatus.PASS, "Clicking on Clear button and validating validation message ");
		return jdPartsWebFormSubmissionPage;
	}

	// Clicking on Submit button and validate validation message appear
	public JDPartsWebFormSubmissionPage clickOnSubBtnValidateValidMsgAppear(
			JDPartsWebFormSubmissionPage jdPartsWebFormSubmissionPag) {
		jdPartsWebFormSubmissionPage = jdPartsWebFormSubmissionPag.submitButton();
		logger.log(LogStatus.PASS, " Clicking  on Submit button and validating validation message appear ");
		return jdPartsWebFormSubmissionPage;
	}

	// Clicking on submit button
	public JDPartsWebFormSubmissionPage clickSubmitButton(JDPartsWebFormSubmissionPage jdPartsWebFormSubmissionPag)
			throws Throwable {
		jdPartsWebFormSubmissionPage = jdPartsWebFormSubmissionPag.clickSubmit();
		logger.log(LogStatus.PASS, " Clicking on submit button ");
		return jdPartsWebFormSubmissionPage;
	}

	// Get Case Id
	public JDPartsWebFormSubmissionPage getCaseID(JDPartsWebFormSubmissionPage jdPartsWebFormSubmissionPag)
			throws IOException {
		jdPartsWebFormSubmissionPage = jdPartsWebFormSubmissionPag.getCaseID();
		logger.log(LogStatus.PASS, "Getting Case Id and storing into String Variable");
		return jdPartsWebFormSubmissionPage;
	}

	// // Get work basket
	// public ISGCasePage getGSCWorkBasket(ISGCasePage isgCase) {
	// isgCasePage = isgCase.GetGSCWorkBasket();
	// logger.log(LogStatus.PASS, "Getting work basket");
	// return isgCasePage;
	// }

	/****************** R4_AgCC *********************/
	public R4_AgCC openAgccWebformPortal(WebDriver driver, String url) {

		System.out.println("R4_AgCC : " + url);
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening R4_AgCC Form Portal");

		return new R4_AgCC(driver);
	}

	public R4_AgCCWebFormSubmissionPage logintoWebform(R4_AgCC agcc, String username, String password)
			throws InterruptedException {
		R4_AgCCWebFormSubmissionPage = agcc.enterUserName(username).enterPassword(password).clickSignInBtn();

		return R4_AgCCWebFormSubmissionPage;
	}

	// Enter Data into Detaild Description Field and Uplaoding File
	public R4_AgCCWebFormSubmissionPage enterDetailedDescriptionUploadFile(
			R4_AgCCWebFormSubmissionPage R4_AgCCWebFormSubmissionPage, String desc) throws Throwable {
		R4_AgCCWebFormSubmissionPage = R4_AgCCWebFormSubmissionPage.detailedDescription(desc).uploadFile();
		logger.log(LogStatus.PASS, "Enter Data into Detaild Description Field and Uploading File ");
		return R4_AgCCWebFormSubmissionPage;
	}

	// Click on Clear button validating validation Message
	public R4_AgCCWebFormSubmissionPage clickOnClearButtonValValidMesg(
			R4_AgCCWebFormSubmissionPage R4_AgCCWebFormSubmissionPage) {
		R4_AgCCWebFormSubmissionPage = R4_AgCCWebFormSubmissionPage.clickOnClearButton();
		logger.log(LogStatus.PASS, "Clicking on clear button and validating validation Message");
		return R4_AgCCWebFormSubmissionPage;
	}

	// Clicking on submit button
	public R4_AgCCWebFormSubmissionPage clickSubmitBtn(R4_AgCCWebFormSubmissionPage R4_AgCCWebFormSubmissionPage)
			throws Throwable {
		R4_AgCCWebFormSubmissionPage = R4_AgCCWebFormSubmissionPage.clickSubmit();
		logger.log(LogStatus.PASS, " Clicking on submit button ");
		return R4_AgCCWebFormSubmissionPage;
	}

	// Get Case Id
	public R4_AgCCWebFormSubmissionPage getCaseID(R4_AgCCWebFormSubmissionPage R4_AgCCWebFormSubmissionPage)
			throws IOException {
		R4_AgCCWebFormSubmissionPage = R4_AgCCWebFormSubmissionPage.getCaseID();
		logger.log(LogStatus.PASS, "Clicking on clear button ");
		return R4_AgCCWebFormSubmissionPage;
	}

	// Click on Clear button
	public R4_AgCCWebFormSubmissionPage clickOnSubmitButton(R4_AgCCWebFormSubmissionPage R4_AgCCWebFormSubmissionPage) {
		R4_AgCCWebFormSubmissionPage = R4_AgCCWebFormSubmissionPage.clickSubmitButton();
		logger.log(LogStatus.PASS, "Clicking on clear button ");
		return R4_AgCCWebFormSubmissionPage;
	}

	/**********************
	 * R4Turf Methods by Jyothsna
	 *************************************************/

	private R4Turf r4Turf;

	// login to web form
	public R4Turf logintoR4Turfwebform(R4TurfLoginPage r4TurfLoginPage, String username, String password)
			throws InterruptedException {
		r4Turf = r4TurfLoginPage.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logged in to web form");
		return r4Turf;
	}

	// login to web form
	public R4Turf LogintoR4Turfwebform(R4TurfLoginPage r4TurfLoginPage, String username, String password)
			throws InterruptedException {
		r4Turf = r4TurfLoginPage.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logged in to web form");
		return r4Turf;
	}

	// open form portal
	public R4TurfLoginPage openWebformPortal_R4Turf(WebDriver driver, String url) {
		System.out.println(url);
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening R4Turf WebForm Portal");
		return new R4TurfLoginPage(driver);
	}

	// Storing the case id to string
	public R4Turf getCaseID(R4Turf r4Turf) throws Throwable {
		r4Turf = r4Turf.getCaseID();
		logger.log(LogStatus.PASS, " Storing the case id to string ");
		return r4Turf;
	}

	// Select country
	public R4Turf countrySelection(R4Turf r4Turf) {
		r4Turf = r4Turf.country_selection();
		logger.log(LogStatus.PASS, "Entered Dealer StateCountry selected");
		return r4Turf;
	}

	// Enter dealer name
	public R4Turf DealerName(R4Turf r4Turf) {
		r4Turf = r4Turf.dealerName();
		logger.log(LogStatus.PASS, "Entered Dealer name");
		return r4Turf;
	}

	// Enter Dealer city
	public R4Turf DealerCity(R4Turf r4Turf) {
		r4Turf = r4Turf.dealerCity();
		logger.log(LogStatus.PASS, "Entered Dealer city");
		return r4Turf;
	}

	// Enter dealer state
	public R4Turf DealerState(R4Turf r4Turf) {
		r4Turf = r4Turf.dealerState();
		logger.log(LogStatus.PASS, "Entered Dealer State");
		return r4Turf;
	}

	// Entering the WebForm Detailed_description and uploading file
	public R4Turf detailedDescriptionUploadFile(R4Turf r4Turf, String desc) throws Throwable {
		r4Turf = r4Turf.detailedDescription(desc).uploadFile();
		logger.log(LogStatus.PASS, "Entered description into Agronomy webform  and uploading file");
		return r4Turf;
	}

	// Attaching file to Agronomy Form
	public R4Turf AddButton(R4Turf r4Turf) throws Throwable {
		r4Turf = r4Turf.uploadFile();
		logger.log(LogStatus.PASS, "Attaching a file is successful");
		return r4Turf;
	}

	// click On Clear Button
	public R4Turf clkClearBtnValValdMesg(R4Turf r4Turf) throws Throwable {
		r4Turf = r4Turf.clickOnClearButton();
		logger.log(LogStatus.PASS, "click On ClearButton is successful");
		return r4Turf;
	}

	// click On Submit Button
	public R4Turf clickOnSubmitButton(R4Turf r4Turf) throws Throwable {
		r4Turf = r4Turf.clickSubmitButton();
		logger.log(LogStatus.PASS, "click On Submit Button is successful");
		return r4Turf;
	}

	// Clicking on submit button
	public R4Turf clickSubmitBtn(R4Turf r4Turf) throws Throwable {
		r4Turf = r4Turf.clickSubmit();
		logger.log(LogStatus.PASS, " Clicking on submit button ");
		return r4Turf;
	}

	// Get CaseId
	public R4Turf GetCaseID(R4Turf r4Turf) throws Throwable {
		r4Turf = r4Turf.GetCaseID();
		logger.log(LogStatus.PASS, " Final message was displayed ");
		return r4Turf;
	}

	/**********************
	 * Techpubs Methods by Jyothsna
	 *************************************************/

	private Techpubs techpubs;

	// Logging into webforms
	public Techpubs logintoTechpubsWebform(TechpubsLoginPage techpubsLogin, String username, String password)
			throws InterruptedException {
		techpubs = techpubsLogin.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging into web form");
		return techpubs;
	}

	// opening webform
	public TechpubsLoginPage openWebformPortalTechpubs(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening Techpubs WebForm Portal");
		return new TechpubsLoginPage(driver);
	}

	// Entering the WebForm Detailed_description
	public Techpubs enterdetailedDesUplaodFile(Techpubs techpub, String desc) throws Throwable {
		techpubs = techpub.detailedDescription(desc).uloadFile();
		logger.log(LogStatus.PASS, "Entering description and uplaoding file");
		return techpubs;
	}

	// Attaching file to Techpubs Form
	public Techpubs UploadAttachment(Techpubs techpub) throws Throwable {
		techpubs = techpubs.uloadFile();
		logger.log(LogStatus.PASS, "Attaching a file is not successful");
		return techpubs;
	}

	// Verifying portugues language comment message
	public Techpubs verifyPortuguesLanguageMsg(Techpubs techpub) {
		techpubs = techpubs.verifyPortuguesLanguageMsg();
		logger.log(LogStatus.PASS, "Verifying of portugues language is not successful");
		return techpubs;
	}

	// Verifying portugues language
	public Techpubs selectPortuguesLanguage(Techpubs techpub) {
		techpubs = techpub.selectPortuguesLanguage();
		logger.log(LogStatus.PASS, "Selecting portugues language");
		return techpubs;
	}

	// Verifying language
	public Techpubs selectEnglishLanguage(Techpubs techpub) {
		techpubs = techpub.selectPortuguesLanguage();
		logger.log(LogStatus.PASS, "Selecting  language");
		return techpubs;
	}

	// Click on Clear button
	public Techpubs clickOnClearButton(Techpubs techpub) {
		techpubs = techpub.clickOnClearButton();
		logger.log(LogStatus.PASS, "Clicking on clear button is sucessful");
		return techpubs;
	}

	// Click on submit button
	public Techpubs clickOnSubmitButton(Techpubs techpub) {
		techpubs = techpub.clickSumitButton();
		logger.log(LogStatus.PASS, "Clicking on submit button is sucessful");
		return techpubs;
	}

	// Get Case Id
	public Techpubs getCaseID(Techpubs techpub) throws IOException {
		techpubs = techpub.getCaseID();
		logger.log(LogStatus.PASS, "Getting CaseId ");
		return techpubs;
	}

	// Clicking on submit button
	public Techpubs clickSubmit(Techpubs techpub) throws Throwable {
		techpubs = techpub.clickSubmit();
		logger.log(LogStatus.PASS, " Clicking on submit button ");
		return techpubs;
	}

	/*************** Deere New *************************/

	/*******************************************/

	// Login to Deere form
	public Deere loginToDeereWebform(DeereLoginPage deereLoginPag, String username, String password) {
		deere = deereLoginPag.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging into web form");
		return deere;
	}

	// selecting country and Entering description and uplaod attachment
	public Deere selCounEntDesUplodFile(Deere deer, String desc) {
		deere = deer.selectCountry().detailedDesc(desc).fileUpload();
		logger.log(LogStatus.PASS,
				"selecting country and Entering description into Deere webform and uplaoding attachment");
		return deere;
	}

	// Click on Clear button, Submit button and Accept Alert
	public Deere clickOnClearBtnSubmitBtnAcptAlrt(Deere deer) {
		deere = deer.clickOnClearButton().clkSubmitButton().alertAccept();
		logger.log(LogStatus.PASS, "Clicking on Clear button, Submit button");
		return deere;
	}

	// Opening Deere WebForm Portal
	public DeereLoginPage openWebformPortal_Deere(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening Deere WebForm Portal");
		return new DeereLoginPage(driver);
	}

	// Entered description into Agronomy webform
	public Deere detailedDescription_Deere(Deere deer, String desc) throws InterruptedException {
		deere = deer.detailedDescription(desc);
		logger.log(LogStatus.PASS, "Entering description into Agronomy webform");
		return deere;
	}

	// Click on clear button
	public Deere clickOnClearButton(Deere deer) {
		deere = deer.clickOnClearButton();
		logger.log(LogStatus.PASS, "Clicking on clear button");
		return deere;
	}

	// Clicking on submit button
	public Deere clickOnSubmitButton(Deere deer) {
		deere = deer.clkSubmitButton();
		logger.log(LogStatus.PASS, "Clicking on submit button ");
		return deere;
	}

	// Get Case Id
	public Deere getCaseID(Deere Deere) {
		deere = deere.GetCaseID();
		logger.log(LogStatus.PASS, " Final message was displayed ");
		return deere;
	}

	// Clicking on submit button and Accept Alert
	public Deere clickSbmtBtnAcptAlrt(Deere deer) {
		deere = deer.clkSubmitButton().alertAccept();
		logger.log(LogStatus.PASS, "Clicking on submit button and Accept Alert");
		return deere;
	}

	/*
	 * // Get Work Basket value from Main Page public ISGCasePage
	 * getWorkBasket(ISGCasePage isgCasePag) { ISGCasePage =
	 * isgCasePag.getWorkBasketGSC(); logger.log(LogStatus.PASS,
	 * "WorkBasket is  displayed"); return ISGCasePage; }
	 * 
	 * // Get Work Basket value from Main Page public ISGCasePage
	 * GetWorkBasket_GSC(ISGCaseSearchPage isgCaseSearchPage) { ISGCasePage =
	 * isgCaseSearchPage.GetWorkBasket_GSC(); logger.log(LogStatus.PASS,
	 * "WorkBasket is  displayed"); return ISGCasePage; }
	 */
	// Click on Clear button, Submit button
	public Deere clickOnClearBtnSubmitBtn(Deere deer) {
		deere = deer.clickOnClearButton().clkSubmitButton();
		logger.log(LogStatus.PASS, "Clicking on Clear button, Submit button");
		return deere;
	}

	/************ JDLinksWebFormSubmitionPage **************/
	// Login to webform
	public JDLinks openWebformPortal(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening JDLinks Form Portal");
		return new JDLinks(driver);
	}

	// Login to WebForm Portal
	public JDLinksWebFormSubmitionPage loginToWebform(JDLinks JDLinks, String username, String password) {
		jdLinksWebFormSubmitionPage = JDLinks.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging in to WebForm portal");
		return jdLinksWebFormSubmitionPage;
	}

	// Selecting the product DP value, Enter Detailed Description and Attaching file
	public JDLinksWebFormSubmitionPage prodSltEntDetlDescAtchFile(JDLinksWebFormSubmitionPage jdLinksWebFormSubmition,
			String desc) {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.productSelection().DetailedDescription(desc).addButton();
		logger.log(LogStatus.PASS, "Selecting the product DP value, Enter Detailed Description and Attaching file");
		return jdLinksWebFormSubmitionPage;
	}

	// Selecting the Language, product DP value, Enter Detailed Description and
	// Attaching file
	public JDLinksWebFormSubmitionPage slctLangProdSltEntDetlDescAtchFile(
			JDLinksWebFormSubmitionPage jdLinksWebFormSubmition, String desc) {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.selectLanguage().productSelection()
				.DetailedDescription(desc).addButton();
		logger.log(LogStatus.PASS,
				"Selecting the Language, product DP value, Enter Detailed Description and Attaching file");
		return jdLinksWebFormSubmitionPage;
	}

	// Entering the WebForm Detailed_description
	public JDLinksWebFormSubmitionPage detailedDescription(JDLinksWebFormSubmitionPage jdLinksWebFormSubmition,
			String desc) {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.DetailedDescription(desc);
		logger.log(LogStatus.PASS, "Entering  the WebForm Detailed_description ");
		return jdLinksWebFormSubmitionPage;
	}

	// Click Submit button And Accept Alert
	public JDLinksWebFormSubmitionPage clickSubmitAndAcceptAlert(JDLinksWebFormSubmitionPage jdLinksWebFormSubmition) {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.clickOnSubmitButton().waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on Submit button And Accept Alert");
		return jdLinksWebFormSubmitionPage;
	}

	// Submit Btn
	public JDLinksWebFormSubmitionPage clickOnSubmitButton(JDLinksWebFormSubmitionPage jdLinksWebFormSubmition) {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.clickOnSubmitButton();
		logger.log(LogStatus.PASS, "Clicking on Submit Btn");
		return jdLinksWebFormSubmitionPage;
	}

	// Alert Accept
	public JDLinksWebFormSubmitionPage waitForAlert(JDLinksWebFormSubmitionPage jdLinksWebFormSubmition)
			throws Throwable {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.waitForAlert();
		logger.log(LogStatus.PASS, "Accepting Alert");
		return jdLinksWebFormSubmitionPage;
	}

	// Click on Clear button
	public JDLinksWebFormSubmitionPage clickOnClearButton(JDLinksWebFormSubmitionPage jdLinksWebFormSubmition) {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.clickOnClearButton();
		logger.log(LogStatus.PASS, "Clicking on clear button ");
		return jdLinksWebFormSubmitionPage;
	}

	// Click on Clear button, Submit button and Accept Alert
	public JDLinksWebFormSubmitionPage clickOnClearBtnSubmitBtnAcceptAlert(
			JDLinksWebFormSubmitionPage jdLinksWebFormSubmition) {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.clickOnClearButton().clickOnSubmitButton().waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on Clear button, Submit button and Accept Alert");
		return jdLinksWebFormSubmitionPage;
	}

	// Get Case Id
	public JDLinksWebFormSubmitionPage getCaseID(JDLinksWebFormSubmitionPage jdLinksWebFormSubmition) {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.getCaseID();
		logger.log(LogStatus.PASS, "Clicking on clear button ");
		return jdLinksWebFormSubmitionPage;
	}

	// Get Case Id in spanish
	public JDLinksWebFormSubmitionPage getCaseIDSpanish(JDLinksWebFormSubmitionPage jdLinksWebFormSubmition) {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.getCaseIDSpanish();
		logger.log(LogStatus.PASS, "Clicking on clear button ");
		return jdLinksWebFormSubmitionPage;
	}

	// Uplaoding file
	public JDLinksWebFormSubmitionPage addButton(JDLinksWebFormSubmitionPage jdLinksWebFormSubmition) {
		jdLinksWebFormSubmitionPage = jdLinksWebFormSubmition.addButton();
		logger.log(LogStatus.PASS, "Uploading file is  successful");
		return jdLinksWebFormSubmitionPage;
	}

	/********* StellarSupportWebformSubmissionPage *****************/

	// Opening StellarSupport Form Portal
	public StellarSupport openWebFormPortal(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening StellarSupport Form Portal");
		return new StellarSupport(driver);
	}

	// Logged in to web form
	public StellarSupportWebformSubmissionPage logintoWebform(StellarSupport ss, String username, String password) {
		stellarSupportWebformSubmissionPage = ss.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging in to web form");
		return stellarSupportWebformSubmissionPage;
	}

	// Click on Clear button Submit button Accept Alert
	public StellarSupportWebformSubmissionPage clickOnClearBtnSubmitBtnAcceptAlert(
			StellarSupportWebformSubmissionPage stellarSupportWebformSubmission) {
		stellarSupportWebformSubmissionPage = stellarSupportWebformSubmission.clickOnClearButton().clickSubmit()
				.waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on Clear button Submit button Accept Alert");
		return stellarSupportWebformSubmissionPage;
	}

	// Entered Stellar support Detailed Description and Attaching file
	public StellarSupportWebformSubmissionPage detailedDescriptionAndAttachFile(
			StellarSupportWebformSubmissionPage stellarSupportWebformSubmission, String desc) {
		stellarSupportWebformSubmissionPage = stellarSupportWebformSubmission.detailedDescription(desc)
				.addAttachmentFile();
		logger.log(LogStatus.PASS, "Entering Stellar support Detailed Description and Attaching file");
		return stellarSupportWebformSubmissionPage;
	}

	// click Submit btn
	public StellarSupportWebformSubmissionPage clickSubmit(
			StellarSupportWebformSubmissionPage stellarSupportWebformSubmission) {
		stellarSupportWebformSubmissionPage = stellarSupportWebformSubmission.clickSubmit();
		logger.log(LogStatus.PASS, "Clicking on Submit Button");
		return stellarSupportWebformSubmissionPage;
	}

	// click Submit btn And Accept Alert
	public StellarSupportWebformSubmissionPage clickSubmitAndAcceptAlert(
			StellarSupportWebformSubmissionPage stellarSupportWebformSubmission) {
		stellarSupportWebformSubmissionPage = stellarSupportWebformSubmission.clickSubmit().waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on Submit Button And Accept Alert");
		return stellarSupportWebformSubmissionPage;
	}

	// Get CaseID
	public StellarSupportWebformSubmissionPage getCaseID(
			StellarSupportWebformSubmissionPage stellarSupportWebformSubmission) {
		stellarSupportWebformSubmissionPage = stellarSupportWebformSubmission.getCaseID();
		logger.log(LogStatus.PASS, "Storing CaseID");
		return stellarSupportWebformSubmissionPage;
	}

	// Alert accept
	public StellarSupportWebformSubmissionPage waitForAlert(
			StellarSupportWebformSubmissionPage stellarSupportWebformSubmission) {
		stellarSupportWebformSubmissionPage = stellarSupportWebformSubmission.waitForAlert();
		logger.log(LogStatus.PASS, "Accepting Alert");
		return stellarSupportWebformSubmissionPage;
	}

	/*********** SouthSahara ***************/

	// Logging into webforms
	public SouthSahara logintoSouthSaharaWebform(SouthSaharaLoginPage southSaharaLogin, String username,
			String password) {
		southSahara = southSaharaLogin.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging into web form");
		return southSahara;
	}

	// opening webform
	public SouthSaharaLoginPage openWebformPortal_SouthSahara(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening SouthSahara WebForm Portal");
		return new SouthSaharaLoginPage(driver);
	}

	// Enter Detailed Description and Attaching file
	public SouthSahara detailedDescriptionAndAttachFile(SouthSahara southSahar, String desc) {
		southSahara = southSahar.detailedDescription(desc).addButton();
		logger.log(LogStatus.PASS, "Entering description into SouthSahara webform");
		return southSahara;
	}

	// Attaching file to SouthSahara Form
	public SouthSahara addButton(SouthSahara southSahar) {
		southSahara = southSahar.addButton();
		logger.log(LogStatus.PASS, "Attaching a file is not successful");
		return southSahara;
	}

	// Click Submit button And Accept Alert
	public SouthSahara clickSubmitAndAcceptAlert(SouthSahara southSahar) {
		southSahara = southSahar.clickSubmitBtn().waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on Submit button");
		return southSahara;
	}

	// click on Submit
	public SouthSahara clickSubmitBtn(SouthSahara southSahar) {
		southSahara = southSahar.clickSubmitBtn();
		logger.log(LogStatus.PASS, "Clicking on Submit button");
		return southSahara;
	}

	// Alert Accept
	public SouthSahara waitForAlert(SouthSahara southSahar) {
		southSahara = southSahar.waitForAlert();
		logger.log(LogStatus.PASS, "Accepting Alert");
		return southSahara;
	}

	// Verifying portugues language comment message
	public SouthSahara verifyPortuguesLanguageMsg(SouthSahara southSahar) {
		southSahara = southSahar.verifyPortuguesLanguageMsg();
		logger.log(LogStatus.PASS, "Verifying of portugues language ");
		return southSahara;
	}

	// Verifying portugues language
	public SouthSahara selectPortuguesLanguage(SouthSahara southSahar) {
		southSahara = southSahar.selectPortuguesLanguage();
		logger.log(LogStatus.PASS, "Selecting portugues language");
		return southSahara;
	}

	// Click on Clear button
	public SouthSahara clickOnClearButton(SouthSahara southSahar) {
		southSahara = southSahar.clickOnClearButton();
		logger.log(LogStatus.PASS, "Clicking on clear button is sucessful");
		return southSahara;
	}

	// Get Case Id
	public SouthSahara getCaseID(SouthSahara southSahar) {
		southSahara = southSahar.getCaseID();
		logger.log(LogStatus.PASS, "getting CaseId ");
		return southSahara;
	}

	// Click on Clear button, Submit button and Accept Alert
	public SouthSahara clickOnClearBtnSubmitBtnAcceptAlert(SouthSahara southSahar) {
		southSahara = southSahar.clickOnClearButton().clickSubmitBtn().waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on clear button is sucessful");
		return southSahara;
	}

	/********* India ****************/

	// Logging into webforms
	public India loginToIndiaWebform(IndiaLoginPage indiaLoginPag, String username, String password) {
		india = indiaLoginPag.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging into web form");
		return india;
	}

	// Opening India Form Portal
	public IndiaLoginPage openWebformPortal_India(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening India Form Portal");
		return new IndiaLoginPage(driver);
	}

	// Entering the WebForm Detailed_description and Attaching file
	public India detailedDescriptionAndAttachFile(India indi, String desc) {
		india = indi.detailedDescription(desc).addButton();
		logger.log(LogStatus.PASS, "Entering data into detailed description and Attaching file");
		return india;
	}

	// Attaching file to Form
	public India addButton(India indi) {
		india = indi.addButton();
		logger.log(LogStatus.PASS, "Attaching a file is not successful");
		return india;
	}

	// Click on Clear button, Submit button and Accept Alert
	public India clickOnClearBtnSubmitBtnAcceptAlert(India indi) {
		india = indi.clickOnClearButton().clickSubmitBtn().waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on Clear button, Submit button and Accept Alert");
		return india;
	}

	// click on clear button
	public India clickOnClearButton(India indi) {
		india = indi.clickOnClearButton();
		logger.log(LogStatus.PASS, "Clicking on clear button");
		return india;
	}

	// Click Submit button And Accept Alert
	public India clickSubmitAndAcceptAlert(India indi) {
		india = indi.clickSubmitBtn().waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on Submit button");
		return india;
	}

	// Submit Btn
	public India clickSubmitBtn(India indi) {
		india = indi.clickSubmitBtn();
		logger.log(LogStatus.PASS, "Clicking on Submit button");
		return india;
	}

	// Accept Alert
	public India waitForAlert(India indi) {
		india = indi.waitForAlert();
		logger.log(LogStatus.PASS, "Accepting Alert");
		return india;
	}

	// Get CaseId
	public India getCaseID(India indi) {
		india = indi.getCaseID();
		logger.log(LogStatus.PASS, "Storing case ID");
		return india;
	}

	/************ GreenFleetWebFormSubmissionPage *****************/

	// Opening GreenFleet Form Portal
	public GreenFleetWebFormSubmissionPage greenFleetWebForm(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening GreenFleet Form Portal");
		return new GreenFleetWebFormSubmissionPage(driver);
	}

	// Logged into web form
	public GreenFleetWebFormSubmissionPage loginToWebform(
			GreenFleetWebFormSubmissionPage greenFleetWebFormSubmissionPag, String username, String password) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmissionPag.enterUserName(username).enterPassword(password)
				.clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging into web form");
		return greenFleetWebFormSubmissionPage;
	}

	// greenfleet number
	public GreenFleetWebFormSubmissionPage greenFleetNumber(GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission,
			String number) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.greenFleetNumber(number);
		logger.log(LogStatus.PASS, "entering greenfleet number");
		return greenFleetWebFormSubmissionPage;
	}

	// Entered Green Fleet Detailed Description
	public GreenFleetWebFormSubmissionPage detailedDescription(
			GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission, String desc) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.detailedDescription(desc);
		logger.log(LogStatus.PASS, "Entering Green Fleet Detailed Description");
		return greenFleetWebFormSubmissionPage;
	}

	// Greenfleet serial number
	public GreenFleetWebFormSubmissionPage greenFleetMachineSerial(
			GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission, String number) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.greenFleetMachineSerial(number);
		logger.log(LogStatus.PASS, "entering greenfleet serial machine");
		return greenFleetWebFormSubmissionPage;
	}

	// GreenFleet comment
	public GreenFleetWebFormSubmissionPage enterComment(GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission,
			String comment) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.greenFleetEnterComment(comment);
		logger.log(LogStatus.PASS, "entering greenfleet comment");
		return greenFleetWebFormSubmissionPage;
	}

	// Enter dealer name
	public GreenFleetWebFormSubmissionPage enterDealerName(GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission,
			String name) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.enterDealerName(name);
		logger.log(LogStatus.PASS, "entering enter dealer name");
		return greenFleetWebFormSubmissionPage;
	}

	// Enter dealer state
	public GreenFleetWebFormSubmissionPage enterDealerState(GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission,
			String state) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.enterDealerState(state);
		logger.log(LogStatus.PASS, "entering enter dealer state");
		return greenFleetWebFormSubmissionPage;
	}

	// Enter dealer city
	public GreenFleetWebFormSubmissionPage enterDealerCity(GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission,
			String city) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.enterDealerCity(city);
		logger.log(LogStatus.PASS, "entering  dealer city");
		return greenFleetWebFormSubmissionPage;
	}

	// Adding Attachment
	public GreenFleetWebFormSubmissionPage addAttachment(GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission)
			throws Throwable {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.addAttachment();
		logger.log(LogStatus.PASS, "Adding Attachment");
		return greenFleetWebFormSubmissionPage;
	}

	// clicking on Submit Btn
	public GreenFleetWebFormSubmissionPage clickSubmitBtn(GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.clickSubmitBtn();
		logger.log(LogStatus.PASS, "clicking on Submit Btn");
		return greenFleetWebFormSubmissionPage;
	}

	// Store CaseID
	public GreenFleetWebFormSubmissionPage getCaseID(GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.getCaseID();
		logger.log(LogStatus.PASS, "Storing CaseID");
		return greenFleetWebFormSubmissionPage;
	}

	// click On Clear Button
	public GreenFleetWebFormSubmissionPage clickOnClearButton(
			GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.clickOnClearButton();
		logger.log(LogStatus.PASS, "Clicking On Clear Button");
		return greenFleetWebFormSubmissionPage;
	}

	// Accepting Alert
	public GreenFleetWebFormSubmissionPage waitForAlert(GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.waitForAlert();
		logger.log(LogStatus.PASS, "Accepting Alert");
		return greenFleetWebFormSubmissionPage;
	}

	// Enter data into Detailed Description field and Attach file
	public GreenFleetWebFormSubmissionPage detailedDescriptionAndAttachFile(
			GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission, String desc) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.detailedDescription(desc).addAttachment();
		logger.log(LogStatus.PASS, "Entering data into Detailed Description field and Attaching file");
		return greenFleetWebFormSubmissionPage;
	}

	// Click on Clear button, Submit button and Accept Alert
	public GreenFleetWebFormSubmissionPage clickOnClearBtnSubmitBtnAcceptAlert(
			GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.clickOnClearButton().clickSubmitBtn()
				.waitForAlert();
		logger.log(LogStatus.PASS, "Clicking On Clear Button");
		return greenFleetWebFormSubmissionPage;
	}

	// Click Submit button And Accept Alert
	public GreenFleetWebFormSubmissionPage clickSubmitAndAcceptAlert(
			GreenFleetWebFormSubmissionPage greenFleetWebFormSubmission) {
		greenFleetWebFormSubmissionPage = greenFleetWebFormSubmission.clickSubmitBtn().waitForAlert();
		logger.log(LogStatus.PASS, "clicking on Submit Btn");
		return greenFleetWebFormSubmissionPage;
	}

	/********* Agronomy ****************/

	public Agronomy clickSubmitBtn(Agronomy agronom) {
		agronomy = agronom.clickSubmitBtn();
		logger.log(LogStatus.PASS, " Clicking  on submit button ");
		return agronomy;
	}

	// logging into WebForm
	public Agronomy loginToAgrWebform(AgronomyLoginPage agronomyLoginPag, String username, String password) {
		agronomy = agronomyLoginPag.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging into web form");
		return agronomy;
	}

	// opening form portal
	public AgronomyLoginPage openWebformPortal_Agr(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening Agronomy Web Form Portal");
		return new AgronomyLoginPage(driver);
	}

	// Enter Detailed Description and Attaching file
	public Agronomy detailedDescriptionAttachFile(Agronomy agronom, String desc) {
		agronomy = agronom.detailedDescription(desc).addButton();
		logger.log(LogStatus.PASS, "Entering Detailed Description and Attaching file");
		return agronomy;
	}

	// Entered description into Agronomy webform
	public Agronomy detailedDescriptionAgr(Agronomy agronom, String desc) {
		agronomy = agronom.detailedDescription(desc);
		logger.log(LogStatus.PASS, "Entering description into Agronomy webform");
		return agronomy;
	}

	// Attaching file to Agronomy Form
	public Agronomy addButton(Agronomy agronom) {
		agronomy = agronom.addButton();
		logger.log(LogStatus.PASS, "Attaching file to Agronomy Form");
		return agronomy;
	}

	// Click on Clear button
	public Agronomy clickOnClearButton(Agronomy agronom) {
		agronomy = agronom.clickOnClearButton();
		logger.log(LogStatus.PASS, "Clicking on clear button is sucessful");
		return agronomy;
	}

	// Get Case Id
	public Agronomy getCaseID(Agronomy agronom) {
		agronomy = agronom.getCaseID();
		logger.log(LogStatus.PASS, "Getting CaseId ");
		return agronomy;
	}

	// switch and click on Alert box
	public Agronomy waitForAlert(Agronomy agronom) {
		agronomy = agronom.waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on  Alert box accept button");
		return agronomy;
	}

	// Click Submit button And Accept Alert
	public Agronomy clickSubmitAndAcceptAlert(Agronomy agronom) {
		agronomy = agronom.clickSubmitBtn().waitForAlert();
		logger.log(LogStatus.PASS, " Clicking  on submit button ");
		return agronomy;
	}

	// Click on Clear button, Submit button and Accept Alert
	public Agronomy clickOnClearBtnSubmitBtnAcceptAlert(Agronomy agronom) {
		agronomy = agronom.clickOnClearButton().clickSubmitBtn().waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on Clear button, Submit button and Accept Alert");
		return agronomy;
	}

	/************ SouthEastAsiaLoginPage *********************/

	// opening webform
	public SouthEastAsiaLoginPage openWebformPortal_SouthEastAsia(WebDriver driver, String url) {
		driver.get(url);
		logger.log(LogStatus.PASS, "Opening SouthEastAsia WebForm Portal");
		return new SouthEastAsiaLoginPage(driver);
	}

	// Logging into webforms
	public SouthEastAsia logintoSouthEastAsiaWebform(SouthEastAsiaLoginPage southEastAsiaLoginPag, String username,
			String password) {
		southEastAsia = southEastAsiaLoginPag.enterUserName(username).enterPassword(password).clickSignInBtn();
		logger.log(LogStatus.PASS, "Logging into web form");
		return southEastAsia;
	}

	// Entering the Detailed description and Attach file
	public SouthEastAsia detailedDesptAndAttachFileSouthEastAsia(SouthEastAsia southEastAsi, String desc) {
		southEastAsia = southEastAsi.detailedDescription(desc).addButton();
		logger.log(LogStatus.PASS, "Entering detailed description and Attaching File");
		return southEastAsia;
	}

	// click on Submit
	public SouthEastAsia clickSubmitBtn(SouthEastAsia southEastAsi) {
		southEastAsia = southEastAsi.clickSubmitBtn();
		logger.log(LogStatus.PASS, "Clicking on Submit button");
		return southEastAsia;
	}

	// click on Submit button and Accept Alert
	public SouthEastAsia clickSubmitBtnAndAcceptAlert(SouthEastAsia southEastAsi) {
		southEastAsia = southEastAsi.clickSubmitBtn().waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on Submit button and Accept Alert");
		return southEastAsia;
	}

	// Alert Accept
	public SouthEastAsia waitForAlert(SouthEastAsia southEastAsi) {
		southEastAsia = southEastAsi.waitForAlert();
		logger.log(LogStatus.PASS, "Accepting Alert");
		return southEastAsia;
	}

	// Click on Clear button, Submit button and Accept Alert
	public SouthEastAsia clickOnClearBtnSubmitBtnAcceptAlert(SouthEastAsia southEastAsi) {
		southEastAsia = southEastAsi.clickOnClearButton().clickSubmitBtn().waitForAlert();
		logger.log(LogStatus.PASS, "Clicking on Clear button, Submit button and Accept Alert");
		return southEastAsia;
	}

	// Get Case Id
	public SouthEastAsia getCaseID(SouthEastAsia southEastAsi) {
		southEastAsia = southEastAsi.getCaseID();
		logger.log(LogStatus.PASS, "getting CaseId ");
		return southEastAsia;
	}

	// Switch to frame
	public ISGCaseSearchPage switchToFrame(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.switchToFrame1();
		logger.log(LogStatus.PASS, "Switching to frame");
		return isgCaseSearchPage;
	}

	// Click on Action Button Then WorkCase And Accept Button
	public ISGCasePage clickOnActionsBtnThenWorkCaseAndAcceptBtn(ISGCasePage ISGCasePag) {
		isgCasePage = ISGCasePag.clickOnActionsBtn().clickOnWorkCase().clickOnAcceptBtn();
		logger.log(LogStatus.PASS, "Clicking on Action Button then WorkCase And Accept Button");
		return isgCasePage;
	}

	// Click Case Search tab
	public ISGCaseSearchPage clickCaseSearchHomeLink(NavigationClass navigationClas) {
		isgCaseSearchPage = navigationClas.clickCaseSearchHomeLink();
		logger.log(LogStatus.PASS, "Entering the Case Id in Case Search Box");
		return isgCaseSearchPage;
	}

	// Entering the Case Id in Case Search Box and click on case link
	public ISGCaseSearchPage enterCaseIDClickCaseSrch(ISGCaseSearchPage isgCaseSearchPag, String CaseId) {
		isgCaseSearchPage = isgCaseSearchPag.enterCaseIDInCaseSearchBox(CaseId).clickCaseSearchImgLink()
				.clickOnCaseLink();
		logger.log(LogStatus.PASS, "Entering the Case Id in Case Search Box and clicking on case link");
		return isgCaseSearchPage;
	}

	// Navigate to Case Search page and switching to frame
	public ISGCasePage navigateToISGCasePage(ISGCaseSearchPage isgCaseSearchPage) {
		isgCasePage = isgCaseSearchPage.switchToFrame1();
		logger.log(LogStatus.PASS, "Navigating to Case Search page and Switchig to frame");
		return isgCasePage;
	}

	/******************************************/

	/*
	 * // Switch to frame public ISGCaseSearchPage switchToFrame(ISGCasePage
	 * isgCasePag) { isgCasePage = isgCasePag.switchToFrame1();
	 * logger.log(LogStatus.PASS, "Switching to frame"); return isgCaseSearchPage; }
	 */
	// Click on Action Button
	public ISGCasePage clickOnActionsBtn(ISGCaseSearchPage isgCaseSearchPage) {
		isgCasePage = isgCaseSearchPage.clickOnActionsBtn();
		logger.log(LogStatus.PASS, "Clicking on Action Button");
		return isgCasePage;
	}

	// Click on Accept Btn
	public ISGCasePage clickOnAcceptBtn(ISGCaseSearchPage isgCaseSearchPage) {
		isgCasePage = isgCaseSearchPage.clickOnAcceptBtn();
		logger.log(LogStatus.PASS, "Clicking on Accept Btn");
		return isgCasePage;
	}

	// Click on Work Case
	public ISGCasePage clickOnWorkCase(ISGCaseSearchPage isgCaseSearchPage) {
		isgCasePage = isgCaseSearchPage.clickOnWorkCase();
		logger.log(LogStatus.PASS, "Clicking on Work Case");
		return isgCasePage;
	}

	// Entering the Case Id in Case Search Box
	public ISGCaseSearchPage enterCaseID(ISGCaseSearchPage isgCaseSearchPag, String CaseId) {
		isgCaseSearchPage = isgCaseSearchPag.enterCaseIDInCaseSearchBox(CaseId);
		logger.log(LogStatus.PASS, "Entering the Case Id in Case Search Box");
		return isgCaseSearchPage;
	}

	/*********** TC6339 ***************/
	private GSCCustomerSearch gscCustomerSerch;

	public GSCCustomerSearch clickonGSCCase(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.clickOnGSCCase();
		logger.log(LogStatus.PASS, "Clicking on GSC case");
		return gscCustomerSerch;
	}

	// click on Add Customer Info
	public GSCCustomerSearch clickAddCustomeInfo(GSCCustomerSearch gscCustomerSearch) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.clickAddCustomeInfo();
		logger.log(LogStatus.PASS, "Clicking on Add Info");
		return gscCustomerSerch;
	}

	// enter business zipdetails
	public GSCCustomerSearch enterBusinessZipDetails(GSCCustomerSearch gscCustomerSearch, String business,
			String code) {
		gscCustomerSerch = gscCustomerSearch.enterBusiness(business).enterZip(code).clickonReset();
		logger.log(LogStatus.PASS, "Clicking on GSC case");
		return gscCustomerSerch;
	}

	public GSCCustomerSearch enterCustomerSearch(GSCCustomerSearch gscCustomerSearch, String CustFirstName,
			String CustLastName, String Country) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.enterCustomerFirstName(CustFirstName).enterCustomerLastName(CustLastName)
				.selectCountry(Country).gscSearchCustomer().gscCustomerDetails();
		logger.log(LogStatus.PASS, "Entering Customer First Name,LastName,Country");
		return gscCustomerSerch;
	}

	/******************* TC6585 ************************************/

	// Enter customer details for GSC case creation.
	public GSCCustomerSearch enterGSCCustomerDetails(GSCCustomerSearch gscCustomerSearch, String custFirstName,
			String custLastName, String country, String model, String fArea, String fCode, String priority,
			String language, String origin, String summary, String workbasket) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.clickAddCustomeInfo().enterCustomerFirstName(custFirstName)
				.enterCustomerLastName(custLastName).selectCountry(country).gscSearchCustomer()
				.gscSearchCustomerDetails().clickOnAddProductInfo().enterProductModel(model).clickAddProductSubmit()
				.enterCasecodingFA(fArea).enterCasecodingFC(fCode).enterPriority(priority).enterLanguage(language)
				.enterOrigin(origin).enterAddSummary(summary).selectWorkBasket(workbasket).clickOnAccept();
		logger.log(LogStatus.PASS, "Entering GSC Customer details ");
		return gscCustomerSerch;
	}

	// enter business zipdetails
	public GSCCustomerSearch enterBusinessZipField(GSCCustomerSearch gscCustomerSearch, String business, String code) {
		gscCustomerSerch = gscCustomerSearch.enterBusiness(business).enterZip(code).clickonReset();
		logger.log(LogStatus.PASS, "entering data for business & zip field");
		return gscCustomerSerch;
	}

	// Click on Accept Button
	public GSCCustomerSearch clickOnAccept(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.clickOnAccept();
		logger.log(LogStatus.PASS, "clicking on Accept button");
		return gscCustomerSerch;
	}

	public GSCCustomerSearch clickOnReopen(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSerch.clickOnActions().clickOnReopen();
		logger.log(LogStatus.PASS, "Clicking on close button");
		return gscCustomerSerch;
	}

	// Enter Add Summary and select workbasket
	public GSCCustomerSearch enterAddSummary(GSCCustomerSearch gscCustomerSearch, String summary, String Workbasket) {
		gscCustomerSerch = gscCustomerSearch.enterAddSummary(summary).selectWorkBasket(Workbasket);
		logger.log(LogStatus.PASS, "Entering details in summary");
		return gscCustomerSerch;
	}

	public GSCCustomerSearch clickOnClose(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.clickOnClose();
		logger.log(LogStatus.PASS, "Clicking on close button");
		return gscCustomerSerch;
	}

	// click on cancel button
	public GSCCustomerSearch clickOnCancel(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.clickOnCancel();
		logger.log(LogStatus.PASS, "clciking on  ");
		return gscCustomerSerch;
	}

	public GSCCustomerSearch clickonAction(GSCCustomerSearch gscCustomerSearc) {
		gscCustomerSearch = gscCustomerSearc.clickonAction();
		logger.log(LogStatus.PASS, "click on Action");
		return gscCustomerSearch;
	}

	/************ TC6586 **********************/
	// Click on addCustomer Info Link
	public ISGCasePage isgAddCustomerInfo(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.clickAddCustomerInfo(isgCasePage);
		logger.log(LogStatus.PASS, "Clicking on addCustomer Info Link ");
		return isgCasePage;
	}

	// enter Customer details for ISG Case Creation
	public ISGCasePage isgEnterCustomerDetails(ISGCasePage isgCasePag, String CountryCode, String FirstName,
			String LastName, String model, String func_area, String func_code, String summary) {
		isgCasePage = isgCasePag.clickAddCustomerInfo(isgCasePage).isgEnterCountryCode(CountryCode)
				.isgEnterFirstName(FirstName).isgEnterLastName(LastName).clickCustomerSearch()
				.clickRadioButton(isgCasePage).clickCustomerSubmitButton(isgCasePage).clickOnAddProductInfo(isgCasePage)
				.enterModel(model).clickProductSubmitButton(isgCasePage).functionalArea(func_area)
				.functionalCode(func_code).isgCasePriority().isgCaseOrigin().summary(summary).accept_Button();
		logger.log(LogStatus.PASS, "Entering Customer details for ISG Case Creation ");
		return isgCasePage;
	}

	public ISGCasePage clickOnReopen(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.clickOnActions().clickOnReopen();
		logger.log(LogStatus.PASS, "Clicking on Reopen button");
		return isgCasePage;
	}

	// Navigate to CreateISGCase page
	public ISGCasePage navigateToCreateISGCaseHome(ISGNavigationClass iSGnavigationclass) {
		// isgCasePage = iSGnavigationPag.clickCreateISGCaseHomeLink();
		isgCasePage = iSGnavigationclass.clickCreateISGCaseHomeLink();
		logger.log(LogStatus.PASS, "Navigating to Create ISG Case home page");
		return isgCasePage;
	}

	public ISGCasePage clickOnActionWorkcase(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.clickOnActions().clickonTSS().clickOnWorkcase();
		logger.log(LogStatus.PASS, "Clicking on Action,Reopen button");
		return isgCasePage;
	}

	public GSCCustomerSearch clickOnActionWorkCase(GSCCustomerSearch gscCustomerSearc) {
		gscCustomerSearch = gscCustomerSearc.clickOnActions().clickonTSS().clickOnWorkcase();
		logger.log(LogStatus.PASS, "Clicking on Action,Reopen button");
		return gscCustomerSearch;
	}

	// Click on RadioButton
	public ISGCasePage isgClickRadioButton(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.clickRadioButton(isgCasePage);
		logger.log(LogStatus.PASS, "Clicking on RadioButton");
		return isgCasePage;
	}

	// Jyothsna : Click on Customer Submit
	public ISGCasePage isgClickCustomerSubmitButton(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.clickCustomerSubmitButton(isgCasePage);
		logger.log(LogStatus.PASS, "Clicking on Customer submit");
		return isgCasePage;
	}

	// Click on ISG Product Info Button
	public ISGCasePage isgClickProductInfoButton(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.clickOnAddProductInfo(isgCasePage);
		logger.log(LogStatus.PASS, "Clicking on Product info Button");
		return isgCasePage;
	}

	// Enter Model Information and click on submit button
	public ISGCasePage isgEnterModelInfo(ISGCasePage isgCasePag, String model) {
		isgCasePage = isgCasePag.enterModel(model).clickProductSubmitButton(isgCasePage);
		logger.log(LogStatus.PASS, "Entering model info ");
		return isgCasePage;
	}

	// Enter Functional Area and functional code values
	public ISGCasePage isgFunctionalArea(ISGCasePage isgCasePag, String func_area, String func_code) {
		isgCasePage = isgCasePag.functionalArea(func_area).functionalCode(func_code);
		logger.log(LogStatus.PASS, "Entering Functional Area and code");
		return isgCasePage;
	}

	// Enter Case priority value
	public ISGCasePage isgCasePriorityAndOrigin(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.isgCasePriority().isgCaseOrigin();
		logger.log(LogStatus.PASS, "Entering the Priority");
		return isgCasePage;
	}

	// Enter ISG Summary value
	public ISGCasePage isgSummary(ISGCasePage isgCasePag, String summary) {
		isgCasePage = isgCasePag.summary(summary);
		logger.log(LogStatus.PASS, "Entering the summary");
		return isgCasePage;
	}

	// Click on Accept button
	public ISGCasePage isgAccept_Button(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.accept_Button();
		logger.log(LogStatus.PASS, "Clicking on Accept button ");
		return isgCasePage;
	}

	// Click on close button
	public ISGCasePage clickOnClose(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.clickOnClose();
		logger.log(LogStatus.PASS, "Clicking on close button");
		return isgCasePage;
	}

	/******** TC6441 ***********************/

	public ISGCasePage isgActionsButton(ISGCasePage isgCase) throws InterruptedException {
		isgCasePage = isgCase.isgActionsButton();
		logger.log(LogStatus.PASS, "Clicking on Actions button ");
		return isgCasePage;
	}

	public ISGCasePage isgActionsButton(ISGCasePage isgCase, String operator, String workbasket)
			throws InterruptedException {
		isgCasePage = isgCase.isgActionsButton().isgTransferToIndividual().isgTransferOperator(operator)
				.isgTransferWorkbasket(workbasket).isgTransferSubmitButton().isgAudit();
		logger.log(LogStatus.PASS, "Clicking on Actions button ");
		return isgCasePage;
	}

	// clicked on Transfer Case To Individual
	public ISGCasePage isgTransferToIndividual(ISGCasePage isgCase) throws InterruptedException {
		isgCasePage = isgCase.isgTransferToIndividual();
		logger.log(LogStatus.PASS, "Clicking on Actions transfer individual button ");
		return isgCasePage;
	}

	// Select data from operator and workbasket dropdown
	public ISGCasePage isgTransferSelectDropdown(ISGCasePage isgCase, String operator, String workbasket)
			throws InterruptedException {
		isgCasePage = isgCase.isgTransferOperator(operator).isgTransferWorkbasket(workbasket);
		logger.log(LogStatus.PASS, "Selecting data from operator and workbasket dropdown ");
		return isgCasePage;
	}

	// Clicked on TransferToIndividual transfer-submit button.
	public ISGCasePage isgTransferSubmit(ISGCasePage isgCase) throws InterruptedException {
		isgCasePage = isgCase.isgTransferSubmitButton();
		logger.log(LogStatus.PASS, "Clicking on transfer submit button ");
		return isgCasePage;
	}

	// Clicked on AuditTrails
	public ISGCasePage isgAuditTrails(ISGCasePage isgCase) throws InterruptedException {
		isgCasePage = isgCase.isgAudit();
		logger.log(LogStatus.PASS, "Clicking on Audit ");
		return isgCasePage;
	}

	// Clicked on CaseClose & discard button
	public ISGCasePage clickOnCaseCloseAndDiscard(ISGCasePage isgCase) throws InterruptedException {
		isgCasePage = isgCase.isgCaseClose().isgCaseDiscard();
		logger.log(LogStatus.PASS, "Clicking on case close ");
		return isgCasePage;
	}

	/************* TC6847 ************************/

	// Verify alert message for GSC case.
	public GSCCustomerSearch gscCaseAlertVerification(GSCCustomerSearch gscCustomerSearch, String priority,
			String language, String origin, String summary, String workbasket, String custFirstName,
			String custLastName, String country, String model) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.clickOnAccept().switchToAlert().enterPriority(priority)
				.enterLanguage(language).enterOrigin(origin).enterAddSummary(summary).selectWorkBasket(workbasket)
				.clickOnAccept().switchToAlert().clickAddCustomeInfo().enterCustomerFirstName(custFirstName)
				.enterCustomerLastName(custLastName).selectCountry(country).gscSearchCustomer()
				.gscSearchCustomerDetails().clickOnAccept().switchToAlert().clickOnAddProductInfo()
				.enterProductModel(model).clickAddProductSubmit().clickOnAccept().switchToAlert()
				.enterPriority(priority).enterLanguage(language).enterOrigin(origin).clickOnAccept().clickOnClose();
		logger.log(LogStatus.PASS, "Verifying alert message for GSC case ");
		return gscCustomerSerch;
	}

	// Enter customer details for GSC case creation.
	public GSCCustomerSearch enterGSCCustomerWBDetails(GSCCustomerSearch gscCustomerSearch, String custfirstname,
			String custlastname, String country, String model, String fArea, String fCode, String priority,
			String language, String origin, String summary, String workbasket) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.enterCustomerFirstName(custfirstname).enterCustomerLastName(custlastname)
				.selectCountry(country).gscSearchCustomer().gscSearchCustomerDetails().clickOnAddProductInfo()
				.enterProductModel(model).clickAddProductSubmit().enterCasecodingFA(fArea).enterCasecodingFC(fCode)
				.enterPriority(priority).enterLanguage(language).enterOrigin(origin).enterAddSummary(summary)
				.selectWorkBasket(workbasket);
		logger.log(LogStatus.PASS, "Entering GSC Customer details ");
		return gscCustomerSerch;
	}

	// Enter AuditTrailsCustomer details
	public GSCCustomerSearch enterAuditCustomerDetails(GSCCustomerSearch gscCustomerSearch, String CustFirstName,
			String CustLastName, String Country) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.enterCustomerFirstName(CustFirstName).enterCustomerLastName(CustLastName)
				.selectCountry(Country).gscSearchCustomer().gscSearchCustomerDetails();
		logger.log(LogStatus.PASS, "Entering Customer First Name,LastName,Country");
		return gscCustomerSerch;
	}

	public GSCCustomerSearch clickOnActionWorkcase(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSerch.clickOnActions().clickonTSS().clickOnWorkcase();
		logger.log(LogStatus.PASS, "Clicking on Action,Reopen button");
		return gscCustomerSerch;
	}

	// Search for the customer
	public GSCCustomerSearch gscSearchCustomer(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.gscSearchCustomer();
		logger.log(LogStatus.PASS, "Searching customer ");
		return gscCustomerSerch;
	}

	// Enter customer Details
	public GSCCustomerSearch gscSearchCustomerDetails(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.gscSearchCustomerDetails();
		logger.log(LogStatus.PASS, "Searching Customer details ");
		return gscCustomerSerch;
	}

	// Click Product Info Button
	public GSCCustomerSearch clickOnAddProductInfo(GSCCustomerSearch gscCustomerSearch) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.clickOnAddProductInfo();
		logger.log(LogStatus.PASS, "Clicking Add product Info");
		return gscCustomerSerch;
	}

	// Enter Product Model
	public GSCCustomerSearch enterProductModel(GSCCustomerSearch gscCustomerSearch, String model) {
		gscCustomerSerch = gscCustomerSearch.enterProductModel(model);
		logger.log(LogStatus.PASS, "Entering Product Model");
		return gscCustomerSerch;
	}

	// Click on Submit button of Product Info
	public GSCCustomerSearch clickAddProductSubmit(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.clickAddProductSubmit();
		logger.log(LogStatus.PASS, "clicking on product submit");
		return gscCustomerSerch;
	}

	// Enter Case Coding in Functional Area
	public GSCCustomerSearch enterCasecodingFA(GSCCustomerSearch gscCustomerSearch, String FArea, String FCode) {
		gscCustomerSerch = gscCustomerSearch.enterCasecodingFA(FArea).enterCasecodingFC(FCode);
		logger.log(LogStatus.PASS, "entering Functional Area and Functional Code");
		return gscCustomerSerch;
	}

	// Enter Priority
	public GSCCustomerSearch enterPriority(GSCCustomerSearch gscCustomerSearch, String Priority, String Language,
			String Origin) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.enterPriority(Priority).enterLanguage(Language).enterOrigin(Origin);
		logger.log(LogStatus.PASS, "Entering Priority,language,origin");
		return gscCustomerSerch;
	}

	// Click on Actions Button
	public GSCCustomerSearch clickonActions(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.clickOnActions();
		logger.log(LogStatus.PASS, "clicking on Actions button");
		return gscCustomerSerch;
	}

	// clicked on Transfer Case To Individual
	public GSCCustomerSearch gscTransferToIndividual(GSCCustomerSearch gscCustomerSearch) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.gscTransferToIndividual();
		logger.log(LogStatus.PASS, "Clicking on Actions transfer individual button ");
		return gscCustomerSerch;
	}

	public GSCCustomerSearch gscTransferSelectDropdown(GSCCustomerSearch gscCustomerSearch, String operator,
			String workbasket) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.gscOperatortDropdown(operator).gscTransferWorkbasket(workbasket);
		logger.log(LogStatus.PASS, "Clicking on select workbasket and operator individual button ");
		return gscCustomerSerch;
	}

	public GSCCustomerSearch gscTransferSubmit(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.transferSubmitButton();
		logger.log(LogStatus.PASS, "Clicking on submit button ");
		return gscCustomerSerch;

	}

	// Enter file details
	public GSCCustomerSearch enterFileAttachmentDetails(GSCCustomerSearch gscCustomerSearch) throws Throwable {
		gscCustomerSerch = gscCustomerSearch.enterFileAttachmentDetails();
		logger.log(LogStatus.PASS, "Entering file details in summary");
		return gscCustomerSerch;
	}

	// click on audit trails button
	public GSCCustomerSearch auditTrails(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.auditTrails();
		logger.log(LogStatus.PASS, "clicking on audit trails  button");
		return gscCustomerSerch;
	}

	// Click on Send Case Email
	public GSCCustomerSearch sendCaseMail(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.sendCaseMail();
		logger.log(LogStatus.PASS, "clicking on send case mail button");
		return gscCustomerSerch;
	}

	// Enter Details in send case email
	public GSCCustomerSearch enterSendCaseMail(GSCCustomerSearch gscCustomerSearch, String mail) {
		gscCustomerSerch = gscCustomerSearch.enterSendCaseMail(mail);
		logger.log(LogStatus.PASS, "entering details in send case mail ");
		return gscCustomerSerch;
	}

	// click on send case button
	public GSCCustomerSearch sendButton(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.sendButton();
		logger.log(LogStatus.PASS, "clicking on send case  button");
		return gscCustomerSerch;
	}

	// Enter AuditTrailsCustomer details
	public GSCCustomerSearch enterAuditCustomerDetails(GSCCustomerSearch gscCustomerSearch, String custfirstname,
			String custlastname, String country, String model, String farea, String fcode, String priority,
			String language, String origin, String summary, String workbasket) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.enterCustomerFirstName(custfirstname).enterCustomerLastName(custlastname)
				.selectCountry(country).gscSearchCustomer().gscSearchCustomerDetails().clickOnAddProductInfo()
				.enterProductModel(model).clickAddProductSubmit().enterCasecodingFA(farea).enterCasecodingFC(fcode)
				.enterPriority(priority).enterLanguage(language).enterOrigin(origin).enterAddSummary(summary)
				.selectWorkBasket(workbasket);
		logger.log(LogStatus.PASS, "Entering customer details for case creation");
		return gscCustomerSerch;
	}

	// Click on Actions Button
	public GSCCustomerSearch clickonActionsTIndividual(GSCCustomerSearch gscCustomerSearch, String operator,
			String workbasket) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.clickOnActions().gscTransferToIndividual().gscOperatortDropdown(operator)
				.gscTransferWorkbasket(workbasket).transferSubmitButton();
		logger.log(LogStatus.PASS, "clicking on Actions button");
		return gscCustomerSerch;
	}

	public GreenFleetCreationPage enterGreenFleetCase(GreenFleetCreationPage greenFleetCreation, String Fastname,
			String Lastname, String Country, String model, String FArea, String Fcode, String Language, String Origin,
			String Priority, String summary) throws InterruptedException {
		greenFleetCreationPage = greenFleetCreation.clickGreenFleetAddCustomeInfo()
				.enterGreenFleetCustomerFirstName(Fastname).enterGreenFleetCustomerLastName(Lastname)
				.enterGreenFleetselectCountry(Country).greenFleetSearchCustomer().greenFleetSearchCustomerDetails()
				.greenFleetClickonAddProductInfo().greenFleetEnterProductModel(model).greenFleetClickAddProductSubmit()
				.greenFleetEnterCasecodingFA(FArea).greenFleetCasecodingFC(Fcode).greenFleetenterLanguage(Language)
				.greenFleetenterOrigin(Origin).greenFleetEnterAddSummary(summary).greenFleetenterPriority(Priority)
				.acceptButton();
		logger.log(LogStatus.PASS, "Entering GreenFleet case details");
		return greenFleetCreationPage;
	}

	// Get green fleet Case Id
	public GreenFleetCreationPage getDealerCase(GreenFleetCreationPage greenFleetCreationPag) throws Throwable {
		greenFleetCreationPage = greenFleetCreationPag.getDealerCase().clickOnName().clickOnLogout();
		logger.log(LogStatus.PASS, " Displaying dealer case id ");
		return greenFleetCreationPage;
	}

	// Entering greenfleet product details
	public GreenFleetCreationPage greenFleetProductDetails(GreenFleetCreationPage greenFleetCreation, String cha,
			String model) {
		greenFleetCreationPage = greenFleetCreation.greenFleetEnterInvalidModel(cha).switchToAlert()
				.greenFleetEnterProductModel(model).greenFleetClickAddProductSubmit().acceptButton().switchToAlert();
		logger.log(LogStatus.PASS, "Entering GreenFleet product details");
		return greenFleetCreationPage;
	}

	public GreenFleetCreationPage clickonGreenFleetAction(GreenFleetCreationPage greenFleetCreationPag) {
		greenFleetCreationPage = greenFleetCreationPag.clickonGreenFleetAction();
		logger.log(LogStatus.PASS, "clicking on Action");
		return greenFleetCreationPage;
	}

	// Entering GSC Customer details for withdrawing the case
	public GSCCustomerSearch enterGSCWithdrawDetails(GSCCustomerSearch gscCustomerSearch, String custfirstname,
			String custlastname, String country, String model, String farea, String fcode, String priority,
			String language, String origin, String summary, String workbasket) throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.clickAddCustomeInfo().enterCustomerFirstName(custfirstname)
				.enterCustomerLastName(custlastname).selectCountry(country).gscSearchCustomer()
				.gscSearchCustomerDetails().clickOnAddProductInfo().enterProductModel(model).clickAddProductSubmit()
				.enterCasecodingFA(farea).enterCasecodingFC(fcode).enterPriority(priority).enterLanguage(language)
				.enterOrigin(origin).enterAddSummary(summary);
		logger.log(LogStatus.PASS, "Entering GSC Customer details for withdrawing the case ");
		return gscCustomerSerch;
	}

	// Greenfleet
	// : Navigate to Home Page from any page
	public GreenFleetCreationPage navigateToGreenFleetCreationPage(NavigationClass navigationPag) {
		greenFleetCreationPage = navigationPag.clickHome();
		logger.log(LogStatus.PASS, "Navigating to  home page");
		return greenFleetCreationPage;
	}

	public GreenFleetCreationPage clickonGreenFleetCase(GreenFleetCreationPage greenFleetCreationPag) {
		greenFleetCreationPage = greenFleetCreationPag.clickonGreenFleetCase();
		logger.log(LogStatus.PASS, "Clicking on Green fleet case");
		return greenFleetCreationPage;
	}

	// Click on Green fleet case
	public GreenFleetCreationPage clickonGreenFleetCase(HomePage homePag) {
		greenFleetCreationPage = homePag.clickonGreenFleetCase();
		logger.log(LogStatus.PASS, "Clicking on Green fleet case");
		return greenFleetCreationPage;
	}

	// Entering the GreenFleet Case Id in Case Search Box
	public ISGCaseSearchPage csEnterDealerCaseId(ISGCaseSearchPage isgCaseSearchPag, String CaseId) {
		isgCaseSearchPage = isgCaseSearchPag.enterCaseIDInCaseSearchBox(CaseId);
		logger.log(LogStatus.PASS, "Entering the Case Id in Case Search Box");
		return isgCaseSearchPage;
	}

	public ISGCasePage clickonClose(ISGCasePage isgCasePag) {
		isgCasePage = isgCasePag.clickonClose();
		logger.log(LogStatus.PASS, "Clicking on close");
		return isgCasePage;
	}

	// click on GSC withdraw button
	public GSCCustomerSearch clickOnWithdraw(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.clickOnWithdraw();
		logger.log(LogStatus.PASS, "clciking on withdraw case ");
		return gscCustomerSerch;
	}

	// click on submit
	public GSCCustomerSearch clickOnSubmit(GSCCustomerSearch gscCustomerSearch) {
		gscCustomerSerch = gscCustomerSearch.clickOnSubmitwithdraw();
		logger.log(LogStatus.PASS, "clicking on submit");
		return gscCustomerSerch;
	}

	// Click on action and sendcase email button and verify the details
	public GSCCustomerSearch clickonActions(GSCCustomerSearch gscCustomerSearch, String mail)
			throws InterruptedException {
		gscCustomerSerch = gscCustomerSearch.clickOnActions().sendCaseMail().enterSendCaseMail(mail).sendButton()
				.auditTrails();
		logger.log(LogStatus.PASS, "clicking on Actions button");
		return gscCustomerSerch;
	}

	// Lahari : select value from WorkBasket and click on transfer
	public GSCRoutingPage selectValFromWBClkTrnsBtn(GSCRoutingPage gscRoutingPage, String workbasket)
			throws InterruptedException {
		gscRouting = gscRoutingPage.selectWorkBasketTrafCase(workbasket).transferBtn();
		logger.log(LogStatus.PASS, "selecting select WorkBasket value and  clicking on transfer button");
		return gscRouting;
	}

	// Click on Green fleet case
	public GreenFleetCreationPage clickonGreenFleet(GreenFleetCreationPage greenFleetCreationPag) {
		greenFleetCreationPage = greenFleetCreationPag.clickonGreenFleetCase();
		logger.log(LogStatus.PASS, "Clicking on Green fleet case");
		return greenFleetCreationPage;
	}

	// Entering green fleet customer details in and verify alert .
	public GreenFleetCreationPage enterDetailsGreenFleet(GreenFleetCreationPage greenFleetCreation, String summary,
			String Priority, String Lastname, String code) {
		greenFleetCreationPage = greenFleetCreation.greenFleetEnterAddSummary(summary).greenFleetenterPriority(Priority)
				.acceptButton().switchToAlert().clickGreenFleetAddCustomeInfo().greenFleetSearchCustomer()
				.switchToAlert().enterGreenFleetCustomerLastName(Lastname).greenFleetLastNameCustomer().switchToAlert()
				.enterPostalCode(code).greenFleetPostalCodeCustomer().switchToAlert().clickOnCancel();
		logger.log(LogStatus.PASS, "Entering GreenFleet details");
		return greenFleetCreationPage;
	}

	// Click on green fleet Accept button.
	public GreenFleetCreationPage acceptAndAlert(GreenFleetCreationPage greenFleetCreation) {
		greenFleetCreationPage = greenFleetCreation.acceptButton().switchToAlert();
		logger.log(LogStatus.PASS, "Clicking on accept and verifying the alert");
		return greenFleetCreationPage;
	}

	// click GreenFleet on submit button
	public GreenFleetCreationPage greenFleetSubmitButton(GreenFleetCreationPage greenFleetCreation) {
		greenFleetCreationPage = greenFleetCreation.greenFleetSubmitButton();
		logger.log(LogStatus.PASS, "clicking on submit button");
		return greenFleetCreationPage;
	}

}
