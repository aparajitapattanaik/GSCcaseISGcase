package com.deere.testCases;

import static com.deere.global.CommonFunctions.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.deere.global.CoreTestCase;

import com.deere.global.FunctionalMethods;
import com.deere.global.GlobalDataProvider;
import com.deere.global.GlobalThings;
import com.deere.global.InputEnvironmentDetails;
import com.deere.global.InputTestDetails;
import com.deere.gscpage.CaseCoding;
import com.deere.gscpage.GSCCustomerSearch;
import com.deere.gscpage.GSCRoutingFilterSearchPage;
import com.deere.gscpage.GSCRoutingPage;
import com.deere.gscpage.ViewEmailZeacomPage;
import com.deere.isgpage.ISGCasePage;
import com.deere.isgpage.ISGCaseSearchPage;
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
import com.deere.pages.solutionsearchpage.GSCCaseCreationPage;
import com.deere.pages.solutionsearchpage.SolutionSearchHomePage;
import com.deere.webformpages.CommentsWebForm;
import com.deere.webformpages.Deere;
import com.deere.webformpages.DeereLoginPage;

public class GSCTestCases extends CoreTestCase {

	/**
	 * Author : Lahari Pasupuleti Description : As a TSS, I want to work on GSC case
	 * so that I can create, update, route and transfer and close the given case.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws InterruptedException
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6333_GSCRouting(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		NavigationClass navigationClass;
		GSCRoutingPage gscRoutingPage;

		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to Home Page
		gscRoutingPage = functionalMethods.navigateToGSCRoutingPageClkHomeBtn(navigationClass);

		// Verify if Home Page is displayed
		assertTrue(gscRoutingPage.isHomePageDisplayed(), "Navigation to Home Page was Unsuccessful");

		// Click on GSC case creation button
		gscRoutingPage = functionalMethods.clickonGSCCase(gscRoutingPage);

		// verify if GSC page is displayed
		assertTrue(gscRoutingPage.hasNewStatusDisplayed(), "Status of the Case is not New");

		// Entering GSC Case Creation All Mandatory fields data and click on submit
		// button
		gscRoutingPage = functionalMethods.gscCaseCreationDetails(gscRoutingPage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[12], testData.getTestdata()[6],
				testData.getTestdata()[7], testData.getTestdata()[8], testData.getTestdata()[9],
				testData.getTestdata()[10], testData.getTestdata()[11]);

		// Verify Owned Status is showing
		assertTrue(gscRoutingPage.isOwnedStatusDisplayed(), "Status of the Case is not Owned");

		// Click Actions -> Transfer Case to Individual and click on submit button
		gscRoutingPage = functionalMethods.selectvalfromActionsClkSubmit(gscRoutingPage, testData.getTestdata()[12],
				testData.getTestdata()[13]);

		// Navigate to GSCRoutingPage
		gscRoutingPage = functionalMethods.navigateToGSCRoutingPageClkHomeBtn(navigationClass);

		// Need to write assertion

		// Click on GSC case creation button
		gscRoutingPage = functionalMethods.clickonGSCCase(gscRoutingPage);

		// verify landing of GSC case creation page
		assertTrue(gscRoutingPage.hasNewStatusDisplayed(), "Status of the Case is not NewStatus");

		// Entering GSC Case Creation All Mandatory fields data and click on submit
		// button
		gscRoutingPage = functionalMethods.gscCaseCreationDetails(gscRoutingPage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[12], testData.getTestdata()[6],
				testData.getTestdata()[7], testData.getTestdata()[8], testData.getTestdata()[9],
				testData.getTestdata()[10], testData.getTestdata()[11]);

		// Verify Owned Status is showing
		assertTrue(gscRoutingPage.isOwnedStatusDisplayed(), "Status of the Case is not Owned");

		// Click Actions -> Transfer Case to WB ,enter operator ,work basket and click
		// on submit
		gscRoutingPage = functionalMethods.selActionsDDEntOperWBClkSubmit(gscRoutingPage, testData.getTestdata()[12],
				testData.getTestdata()[13]);

		/*
		 * // Get the current case id stores in to a variable
		 * //GSCRoutingFilterSearchPage.caseId = gscRoutingPage.getGscCaseId();
		 * 
		 * gscRoutingPage = functionalMethods.getCaseId(gscRoutingPage);
		 * 
		 * // Verify The case is available in their My Cases grid.
		 * gscRoutingPage.verifyCaseIdExistInTable(gscRoutingPage,GlobalThings.caseId);
		 */
		// Verify New Status is showing
		assertTrue(gscRoutingPage.hasNewStatusDisplayed(), "Status of the Case is not NewStatus");

		// Entering GSC Case Creation All Mandatory fields data and click on submit
		// button
		gscRoutingPage = functionalMethods.gscCaseCreationDetails(gscRoutingPage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[12], testData.getTestdata()[6],
				testData.getTestdata()[7], testData.getTestdata()[8], testData.getTestdata()[9],
				testData.getTestdata()[10], testData.getTestdata()[11]);

		// Verify that Owned Status is showing
		assertTrue(gscRoutingPage.isOwnedStatusDisplayed(), "Status of the Case is not Owned");

		// click on close button
		gscRoutingPage = functionalMethods.clickOnCloseButton(gscRoutingPage);

		// Verify that resolved completed status is showing
		assertTrue(gscRoutingPage.isResolvedCompletedStatusDisplayed(), "Status of the Case is not ResolvedCompleted");
	}

	/**
	 * Author : Lahari Pasupuleti Description : As TSS, want to select TSS group
	 * where case need to be routed and indicate the Sub-group from drop-down for
	 * TSS to use as queue filter so that case goes to appropriate group only
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws InterruptedException
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6541_GSCRoutingFilterSearch(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		NavigationClass navigationClass;
		GSCRoutingPage gscRoutingPage;
		GSCRoutingFilterSearchPage gscRoutingFilterSearchPage;

		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to Home Page
		gscRoutingPage = functionalMethods.navigateToGSCRoutingPageClkHomeBtn(navigationClass);

		// Verify if Home Page is displayed
		assertTrue(gscRoutingPage.isHomePageDisplayed(), "Navigation to Home Page was Unsuccessful");

		// Click on GSC case creation button
		gscRoutingPage = functionalMethods.clickonGSCCase(gscRoutingPage);

		// verify landing of GSC page
		assertTrue(gscRoutingPage.hasNewStatusDisplayed(), "NewStatus is not displayed successfully");

		// Entering GSC Case Creation All Mandatory fields data and click on submit
		// button
		gscRoutingPage = functionalMethods.gscCaseCreationDetails(gscRoutingPage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[16], testData.getTestdata()[6],
				testData.getTestdata()[7], testData.getTestdata()[8], testData.getTestdata()[9],
				testData.getTestdata()[10], testData.getTestdata()[11]);

		// Verify Owned Status is showing
		assertTrue(gscRoutingPage.isOwnedStatusDisplayed(), "Owned Status is not displayed");

		// Click Actions -> select Transfer Case to Individual and click on submit
		gscRoutingPage = functionalMethods.selectTransWB(gscRoutingPage);

		// verify Owned status is displayed
		assertTrue(gscRoutingPage.hasOwnedStatusDisplayed(), "OwnedStatus is not displayed currenctly");

		// Select value from workBaket and click on transfer button
		gscRoutingPage = functionalMethods.selectValFromWBClkTrnsBtn(gscRoutingPage, testData.getTestdata()[14]);

		// verify NewStatus
		assertTrue(gscRoutingPage.hasNewStatusDisplayed(), "NewStatus is not displayed successfully");

		// Click on WorkgroupQueue
		gscRoutingFilterSearchPage = functionalMethods.NavToGSCRoutingFilterSearchPageclkWBQueue(gscRoutingPage);

		// Verify that navigated to WorkgroupQueue page
		assertTrue(gscRoutingFilterSearchPage.hasFiltersDisplayed(), "Filters is not showing");

		// Capture the current case id and click on Filters Link
		gscRoutingFilterSearchPage = functionalMethods.capCaseIdClkfilters(gscRoutingFilterSearchPage);

		// verify WorkGroups area is displayed
		assertTrue(gscRoutingFilterSearchPage.hasWorkGroupsDisplayed(), "Workgroups area is not showing");

		// verify with WorkBasket auto-complete is displayed
		assertTrue(gscRoutingFilterSearchPage.hasWorkBasketDisplayed(), "Workbasket is not showing");

		// Select value from WorkBasket click on submit
		gscRoutingFilterSearchPage = functionalMethods.selectValFromWorkBasketandClikSubmit(gscRoutingFilterSearchPage,
				testData.getTestdata()[14]);

		// verify WorkBasket is refreshed
		assertTrue(gscRoutingFilterSearchPage.hasWorkGroupRefreshedDisplayed(), "WorkGroup is Refreshed  not showing");

		// Verify grid contains WorkGroup that you chose in the Filters.
		assertTrue(gscRoutingFilterSearchPage.hasWorkGroupContSameWGNameDisplayed(),
				"Grid contains Workgroup that you chose in the Filters not showing");

		// Verify Grid contains all cases that were routed to this WorkBasket including
		// case created above.
		gscRoutingFilterSearchPage = functionalMethods.verfyCaseIsExistInWBQ(gscRoutingFilterSearchPage);

	}

	/**
	 * Author : Lahari Pasupuleti Description : As TSS, want to select TSS group
	 * where case need to be routed and indicate the Sub-group from drop-down for
	 * TSS to use as queue filter so that case goes to appropriate group only..
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws InterruptedException
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6551_GSCRoutingWorkBasketSearch(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		NavigationClass navigationClass;
		GSCRoutingPage gscRoutingPage;
		GSCRoutingFilterSearchPage gscRoutingFilterSearchPage;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to Home Page
		gscRoutingPage = functionalMethods.navigateToGSCRoutingPageClkHomeBtn(navigationClass);

		// Verify if Home Page is displayed
		assertTrue(gscRoutingPage.isHomePageDisplayed(), "Navigation to Home Page was Unsuccessful");

		// Click on GSC case creation button
		gscRoutingPage = functionalMethods.clickonGSCCase(gscRoutingPage);

		// verify landing of GSC page
		assertTrue(gscRoutingPage.hasNewStatusDisplayed(), "NewStatus is not displayed successfully");

		// Entering GSC Case Creation All Mandatory fields data and click on submit
		// button
		gscRoutingPage = functionalMethods.gscCaseCreationDetails(gscRoutingPage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[16], testData.getTestdata()[6],
				testData.getTestdata()[7], testData.getTestdata()[8], testData.getTestdata()[9],
				testData.getTestdata()[10], testData.getTestdata()[11]);

		// Verify Owned Status is showing
		assertTrue(gscRoutingPage.isOwnedStatusDisplayed(), "Owned Status is not displayed currectly");

		// Click Actions -> select Transfer Case to Individual and click on submit
		gscRoutingPage = functionalMethods.selectTransWB(gscRoutingPage);

		// verify Owned status is displayed
		assertTrue(gscRoutingPage.hasOwnedStatusDisplayed(), "OwnedStatus is not displayed successfully");

		// Select value from workBaket
		gscRoutingPage = functionalMethods.selectValFromWBClkTrnsBtn(gscRoutingPage, testData.getTestdata()[14]);

		// verify NewStatus
		assertTrue(gscRoutingPage.hasNewStatusDisplayed(), "NewStatus is not displayed successfully");

		// Click on WorkgroupQueue
		gscRoutingFilterSearchPage = functionalMethods.NavToGSCRoutingFilterSearchclkWBQueue(gscRoutingPage);

		// Capture the current case id
		gscRoutingFilterSearchPage = functionalMethods.capCaseId(gscRoutingFilterSearchPage);

		// get the current case id stores in to a variable
		// GSCRoutingFilterSearchPage.caseId =
		// gscRoutingFilterSearchPage.getGscCaseId();

		// Verify WorkBasket auto-complete box showing
		assertTrue(gscRoutingPage.hasWorkBasketAutoCompleteDisplayed(),
				"WorkBasket auto-complete box is not displayed successfully");

		gscRoutingFilterSearchPage = functionalMethods.selectValFromWorkBasket(gscRoutingFilterSearchPage,
				testData.getTestdata()[14]);

		// verify that work basket is refreshed
		assertTrue(gscRoutingFilterSearchPage.hasWorkGroupRefreshedDisplayed(),
				"WorkGroup is  not Refreshed successfully");

		// Verify that grid contains Work group Name
		assertTrue(gscRoutingFilterSearchPage.hasWorkGroupContSameWGNameDisplayed(),
				"Grid contains Workgroup Name  not showing");

		// Verify Grid contains all cases that were routed to this WorkBasket including
		// case created above.
		gscRoutingFilterSearchPage = functionalMethods.verfyCaseIsExistInWBQ(gscRoutingFilterSearchPage);
	}

	/**
	 * Author : Lahari Pasupuleti Description : The TSS ability to create a GSC
	 * case, transfer to individual, workBasket, route, and close a case.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws InterruptedException
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6849_GSCRoutingNegitive(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		NavigationClass navigationClass;
		GSCRoutingPage gscRoutingPage;

		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to Home Page
		gscRoutingPage = functionalMethods.navigateToGSCRoutingPageClkHomeBtn(navigationClass);

		// Verify if Home Page is displayed
		assertTrue(gscRoutingPage.isHomePageDisplayed(), "Navigation to Home Page was Unsuccessful");

		// Click on GSC case creation button
		gscRoutingPage = functionalMethods.clickonGSCCase(gscRoutingPage);

		// verify landing of GSC page
		assertTrue(gscRoutingPage.hasNewStatusDisplayed(), "NewStatus is not displayed successfully");

		// Verify Add customer Info section is displayed
		assertTrue(gscRoutingPage.hasAddNewCusInfoDisplayed(),
				"Add customer Info section is not displayed successfully");

		// Verify Add Contact & Dealership Info section is displayed
		assertTrue(gscRoutingPage.hasAddContactDealershipInfoDisplayed(),
				"Add Contact & Dealership Info section is not displayed successfully");

		// Verify Add Product Info section is displayed
		assertTrue(gscRoutingPage.hasAddProductInfoDisplayed(),
				"Add Product Info section is not displayed successfully");

		// Verify Case Coding section is displayed
		assertTrue(gscRoutingPage.hasCaseCodingDisplayed(), "Case Coding section is not displayed successfully");

		// Verify Case Information section is displayed
		assertTrue(gscRoutingPage.hasCaseInformationDisplayed(),
				"Case  Information  section is not displayed successfully");

		// Verify related Case section is displayed
		assertTrue(gscRoutingPage.hasRelatedCaseDisplayed(), "Related Case section is not displayed successfully");

		// Verify Problem details section is displayed
		assertTrue(gscRoutingPage.hasProbDetailsDisplayed(), "Problem Details  section is not displayed successfully");

		// Verify Add Files section is displayed
		assertTrue(gscRoutingPage.hasAllFilesDisplayed(), "All Files section is not displayed successfully");

		// Verify Action Buttons is displayed
		assertTrue(gscRoutingPage.hasActionBtnDisplayed(), "Action Button is not displayed successfully");

		// Verify Accept And CLose Buttons is displayed
		assertTrue(gscRoutingPage.hasAccpAndCloseDisplayed(), "Accept and close button is not displayed successfully");

		// Verify save Buttons is displayed
		assertTrue(gscRoutingPage.hasSaveBtnDisplayed(), "Save button is not displayed successfully");

		// Verify Withdraw Buttons is displayed
		assertTrue(gscRoutingPage.hasWithdrawBtnDisplayed(), "Withdraw button is not displayed successfully");

		// Entering GSC Case Creation All Mandatory fields data and click on submit
		// button
		gscRoutingPage = functionalMethods.gscCaseCreationDetails(gscRoutingPage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[16], testData.getTestdata()[6],
				testData.getTestdata()[7], testData.getTestdata()[8], testData.getTestdata()[9],
				testData.getTestdata()[10], testData.getTestdata()[11]);

		// verify Owned status is displayed
		assertTrue(gscRoutingPage.hasOwnedStatusDisplayed(), "OwnedStatus is not displayed successfully");

		// Select Transfer case to individual from Actions DD
		gscRoutingPage = functionalMethods.selecttransferToIndividual(gscRoutingPage);

		// verify Operator auto complete filed is showing
		assertTrue(gscRoutingPage.hasOperatorDisplayed(), "Operator is not displayed successfully");

		// verify WorkBasket auto complete filed is showing
		assertTrue(gscRoutingPage.hasWorkBasketDisplayed(), "WorkBasket is not displayed successfully");

		// verify Cancel Button is showing
		assertTrue(gscRoutingPage.hasCancleDisplayed(), " Cancle Button is  not displayed successfully");

		// verify Submit button is showing
		assertTrue(gscRoutingPage.hasSubmitDisplayed(), "Submit Button is not displayed successfully");

		// enter data into Operator filed
		gscRoutingPage = functionalMethods.enterOperatiorFiledDataInvalid(gscRoutingPage, testData.getTestdata()[0]);

		// verify User entered is not valid alert appears.
		assertTrue(gscRoutingPage.hasUserEnteredDisplayed(),
				"User entered is not valid alert  is not displayed successfully");

		// Enter data into Operator filed
		gscRoutingPage = functionalMethods.enterOperatiorFiledData(gscRoutingPage, testData.getTestdata()[17]);

		// Click on Submit Button and Handle the alert
		gscRoutingPage = functionalMethods.clickSubmitbutton(gscRoutingPage);

		// verify Value cannot be blank valid alert appears.
		assertTrue(gscRoutingPage.hasValidationMessgDisplayed(),
				"Value cannot be blank  is not displayed successfully");

		// Enter data into Operator filed ,Select work basket value and click on submit
		// button
		gscRoutingPage = functionalMethods.enterOperatiorSelWBClkSub(gscRoutingPage, testData.getTestdata()[17],
				testData.getTestdata()[14]);

		// verify Owned status is displayed
		assertTrue(gscRoutingPage.hasOwnedStatusDisplayed(), "OwnedStatus is not displayed successfully");

		// Click Actions>Work Case
		gscRoutingPage = functionalMethods.selectWorkCasefromActionsDD(gscRoutingPage);

		// verify Owned status is displayed
		assertTrue(gscRoutingPage.hasOwnedStatusDisplayed(), "OwnedStatus is not displayed successfully");

		// verify Cancel button displayed
		assertTrue(gscRoutingPage.hasCancleBtnDisplayed(), "Cancle button is not displayed successfully");

		// verify Save button is displayed
		assertTrue(gscRoutingPage.hasSaveBtnDisplayed(), "Save Button is not displayed successfully");

		// Click Actions>Transfer to WB
		gscRoutingPage = functionalMethods.selectTranfWorkbasketFrmActionsDD(gscRoutingPage);

		// verify Cancel button displayed
		assertTrue(gscRoutingPage.hasCancleBtnDisplayed(), "Cancle button is not displayed successfully");

		// verify transfer button displayed
		assertTrue(gscRoutingPage.hasTransferBtnDisplayed(), "Transfer button is not displayed successfully");

		// verify WorkBasekt displayed
		assertTrue(gscRoutingPage.hasWorkBasektDisplayed(), "WorkBasekt is not displayed successfully");

		// click on Transfer button and accept alert
		gscRoutingPage = functionalMethods.clikTransfBtnAccetAlert(gscRoutingPage);

		// verify Value cannot be blank valid alert appears.
		assertTrue(gscRoutingPage.hasValidationMessageDisplayed(),
				"Value cannot be blank  is not displayed successfully");

		// Select work basket value and click on Cancel button
		gscRoutingPage = functionalMethods.selectWorkBasketFiledclickCancle(gscRoutingPage, testData.getTestdata()[14]);

		// verify Owned status is displayed
		assertTrue(gscRoutingPage.hasOwnedStatusDisplayed(), "OwnedStatus is not displayed successfully");

	}

	/**
	 * Author :Lahari Description :Verify the Auto Reply mail to customer to add
	 * comments
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws IOException
	 * @throws AWTException
	 * @throws Throwable
	 */
	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC3670_GSCWebFormAutoReplyToCustomerForMail(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws Throwable {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		ISGCaseSearchPage isgCaseSearchPage;
		DeereLoginPage deereLoginPage;
		ISGCasePage isgCasePage;
		NavigationClass navigationClass;
		Deere deere;

		// WebDriver driver = null;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// opening Deere Form Portal
		deereLoginPage = functionalMethods.openWebformPortal_Deere(getDriver(), testData.getTestdata()[0]);

		// Entering Username ,Password and click on Submit button
		deere = functionalMethods.loginToDeereWebform(deereLoginPage, testData.getTestdata()[1],
				testData.getTestdata()[2]);

		// Validating if StellarSupport WebForm is displayed
		assertTrue(deere.hasDeereWebFormPageDisplayed(testData.getExpectedResult()[0]),
				"Navigation to Deere WebForm Page was Unsuccessful");

		// Validating that FirstName is showing
		assertTrue(deere.hasFisrtNameDisplayed(testData.getExpectedResult()[1]),
				"First name is not displayed correctly");

		// Validating that Business Address is showing
		assertTrue(deere.hasAddressDisplayed(testData.getExpectedResult()[2]), "Address is not displayed correctly");

		// Validating Phone number is showing
		assertTrue(deere.hasPhoneNumberDisplayed(testData.getExpectedResult()[3]),
				" Phonenumber is not displayed correctly");

		// Validating Email is showing
		assertTrue(deere.hasEmailAddressDispalyed(testData.getExpectedResult()[4]),
				" Email Address is not displayed correctly");

		// Validating Primary Message is showing
		assertTrue(deere.hasPrimaryMessageDisplayed(testData.getExpectedResult()[5]),
				" Primary Message is not displayed correctly");

		// Validating Country is showing
		assertTrue(deere.hasCountryDisplayed(testData.getExpectedResult()[6]), " Country is not displayed correctly");

		// Validating Comments is showing
		assertTrue(deere.hasCommentsDisplayed(testData.getExpectedResult()[7]), " Comments is not displayed correctly");

		// Validating Dealer Name is showing
		assertTrue(deere.hasDealerNameExist(testData.getExpectedResult()[8]), " Dealer Name does not exist");

		// Validating Dealer City is showing
		assertTrue(deere.hasDealerCityExist(testData.getExpectedResult()[9]), " Dealer City does not exist");

		// Validating Dealer State is showing
		assertTrue(deere.hasDealerStateExist(testData.getExpectedResult()[10]), " Dealer State does not exist");

		// Validating Submit button
		assertTrue(deere.hasSubmitButton(), "Submit button is not diaplayed");

		// Validating Clear button
		assertTrue(deere.hasClearButton(), "Clear button is not diaplayed");

		// select country and Enter description and upload attachment and click on
		// submit button
		deere = functionalMethods.selCounEntDesUplodFile(deere, testData.getTestdata()[3]);

		// Validating that file attachment is attached successfully
		assertTrue(deere.hasFileAttached(), "File attachment was unsuccessful");

		// Click on Clear button, Submit button and Accept Alert
		deere = functionalMethods.clickOnClearBtnSubmitBtnAcptAlrt(deere);

		// Validating Validation Msg for Comments textbox field
		assertTrue(deere.hasValidMessgDisplayed(testData.getExpectedResult()[11]),
				"Validation Message of Comments textbox is not displayed correctly");

		// selecting country and Entering description and uplaod attachment
		deere = functionalMethods.selCounEntDesUplodFile(deere, testData.getTestdata()[3]);

		// Validating that file attachment is attached successfully
		assertTrue(deere.hasFileAttached(), "File attachment was unsuccessful");

		// Click On Submit button
		deere = functionalMethods.clickOnSubmitButton(deere);

		// Validating Final Message
		assertTrue(deere.hasFinalMessage(testData.getExpectedResult()[15]),
				"Final Message with CaseID is not Displayed");

		// GetCaseId
		deere = functionalMethods.getCaseID(deere);

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Validating that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[4],
				testData.getTestdata()[5]);

		// Validating that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[6],
				testData.getTestdata()[7], NavigationClass.class);

		// Validating that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to Case search page
		isgCaseSearchPage = functionalMethods.clickCaseSearchHomeLink(navigationClass);

		// Validating that navigated to Case search page
		assertTrue(isgCaseSearchPage.hasCaseSearchHomePageDisplayed(),
				"Navigation to Case search page was Unsuccessful");

		// Entering the Case Id in Case Search Box and click on case link
		isgCaseSearchPage = functionalMethods.enterCaseIDClickCaseSrch(isgCaseSearchPage, deere.caseID_Deere);

		// Navigate to isgCasePage from isgCaseSearchPage
		isgCasePage = functionalMethods.navigateToISGCasePage(isgCaseSearchPage);

		// Click on correspondence
		isgCaseSearchPage = functionalMethods.clickOnCorrespondence(isgCaseSearchPage);

		// Verify presence of email to customer
		isgCaseSearchPage = functionalMethods.clickOnMail(isgCaseSearchPage);

		// Validate mail window
		assertTrue(isgCaseSearchPage.hasMailWindowDisplayed(), "Email View Window Details are not Displayed");

		// Validate mail window
		assertTrue(isgCaseSearchPage.hasSubjectDisplayed(), "Subject not Displayed");

	}

	/**
	 * Author :Jyothsna Description : Verify the Auto Reply mail to Zeacom.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */
	@Test(enabled = true, dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC3671_AutoReplyToZeacom(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws Throwable {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		NavigationClass navigationClass;
		ISGCaseSearchPage isgCaseSearchPage;
		Deere deere;
		DeereLoginPage deereLoginPage;
		ViewEmailZeacomPage viewEmailZeacomPage;
		ISGCasePage isgCasePage;

		FunctionalMethods functionalMethods = new FunctionalMethods();

		// opening Deere Form Portal
		deereLoginPage = functionalMethods.openWebformPortal_Deere(getDriver(), testData.getTestdata()[0]);

		// Entering Username ,Password and Submit
		deere = functionalMethods.loginToDeereWebform(deereLoginPage, testData.getTestdata()[1],
				testData.getTestdata()[2]);

		// Verify that Deere Form is opened and Verify FirstName is showing
		assertTrue(deere.hasFirstNameDisplayed(), "Agronomy Form is not  opened ,First Name is not displayed");

		// Verify Address is showing
		assertTrue(deere.hasAddressDisplayed(), "Address is not displayed");

		// Verify Phone number is showing
		assertTrue(deere.hasPhoneNumberDisplayed(), " Phonenumber is not Displayed");

		// Verify Email is showing
		assertTrue(deere.hasEmailAddressDisplayed(), " Email Address is not Displayed");

		// Verify Primary Message is showing
		assertTrue(deere.hasPrimaryMessageDisplayed(), " Primary Message is not Displayed");

		// Verify Country is showing
		assertTrue(deere.hasCountryDisplayed(), " Country is not Displayed");

		// Verify Comments is showing
		assertTrue(deere.hasCommentsDisplayed(), " Comments is not Displayed");

		// Verify Dealer Name is showing
		assertTrue(deere.hasDealerNameExist(), " Dealer Name does not exist");

		// Verify Dealer City is showing
		assertTrue(deere.hasDealerCityExist(), " Dealer City does not exist");

		// Verify Dealer State is showing
		assertTrue(deere.hasDealerStateExist(), " Dealer State does not exist");

		// Validate Submit button
		assertTrue(deere.hasSubmitButton(), "Submit button is not diaplayed");

		// Validate Clear button
		assertTrue(deere.hasClearButton(), "Clear button is not diaplayed");

		// select country and Enter description and upload attachment and click on
		// submit button
		deere = functionalMethods.selCounEntDesUplodFile(deere, testData.getTestdata()[3]);

		// Validate Final Message
		assertTrue(deere.hasFinalMessage(), "Final Message with CaseID is not Displayed");

		// get CaseID
		deere = functionalMethods.getCaseID(deere);

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), testData.getTestdata()[4]);

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[5],
				testData.getTestdata()[6]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[7],
				testData.getTestdata()[8], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to Case search page
		isgCaseSearchPage = navigationClass.clickCaseSearchHomeLink();

		// Verify that navigated to Case search page
		assertTrue(isgCaseSearchPage.hasCaseSearchHomePageDisplayed(),
				"Navigation to Case search page was Unsuccessful");

		// Enter the CaseId
		isgCaseSearchPage = functionalMethods.enterCaseIdInCaseSearchBox(isgCaseSearchPage, GlobalThings.caseID_Deere);

		// Click on Case Search image button and Case Link to navigate to main page
		isgCaseSearchPage = functionalMethods.clickCaseSearchImgLink(isgCaseSearchPage);

		// Click on correspondence
		isgCaseSearchPage = functionalMethods.clickOnCorrespondence(isgCaseSearchPage);

		// Click on New Case Mail For Zeacom
		viewEmailZeacomPage = functionalMethods.clickOnMailZeacom(isgCaseSearchPage);

		// Validate mail window
		assertTrue(viewEmailZeacomPage.hasMailWindowZeacomDisplayed(), "Email View Window Details are not Displayed");

		// Get the opened case information
		viewEmailZeacomPage = functionalMethods.getOpenedCaseMessageZeacom(viewEmailZeacomPage);

		// Validate From mail id
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[3]),
				"From mail ID is not displayed ");

		// Validate Full name
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[4]),
				"Full name is not displayed ");

		// Validate Business Name
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[5]),
				"Business Name is not displayed ");

		// Validate Business Phone
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[6]),
				"Business Phone is not displayed ");

		// Validate Home Phone
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[7]),
				"Home Phone is not displayed ");

		// Validate Mobile Phone
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[8]),
				"Mobile Phone is not displayed ");

		// Validate Email Address
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[9]),
				"Email Address is not displayed ");

		// Validate Product
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[10]),
				"Product is not displayed ");

		// Validate Machine PIN
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[11]),
				"Machine PIN is not displayed ");

		// Validate Comments/Questions
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[12]),
				"Comments/Questions is not displayed ");

		// Validate Dealer Information
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[13]),
				"Dealer Information is not displayed ");

		// Validate Dealer Name
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[14]),
				"Dealer Name is not displayed ");

		// Validate Dealer City
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[15]),
				"Dealer City is not displayed ");

		// Validate Dealer State
		assertTrue(ViewEmailZeacomPage.HTMLPageSourceCode2.contains(testData.getExpectedResult()[16]),
				"Dealer State is not displayed ");

		// switch to main Window page
		isgCasePage = functionalMethods.switchToMainPage(viewEmailZeacomPage);

	}

	/**
	 * Author :Jyothsna Description : Customer receives email with reply to his
	 * questions/comments.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */
	@Test(enabled = true, dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6649_CustomerReplyBackToEmail(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws Throwable {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage = null;
		SolutionSearchHomePage solutionSearchHomePage;
		ISGCaseSearchPage isgCaseSearchPage;
		ISGNavigationClass isgNavigationClass;
		NavigationClass navigationClass;
		DeereLoginPage deereLoginPage;
		Deere deere;
		ISGCasePage isgCasePage;
		ViewEmaiPage viewEmaiPage;
		ViewEmailZeacomPage viewEmailZeacomPage;
		SendCaseEmail sendCaseEmail;
		GmailLoginPage gmailLoginPage;
		GmailStep2 gmailStep2;
		GmailStep3 gmailStep3;
		CommentsWebForm commentsWebForm;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// opening Deere Form Portal
		deereLoginPage = functionalMethods.openWebformPortal_Deere(getDriver(), testData.getTestdata()[0]);

		// Entering Username ,Password and click on Submit button
		deere = functionalMethods.loginToDeereWebform(deereLoginPage, testData.getTestdata()[1],
				testData.getTestdata()[2]);

		// Validating if StellarSupport WebForm is displayed
		assertTrue(deere.hasDeereWebFormPageDisplayed(testData.getExpectedResult()[0]),
				"Navigation to Deere WebForm Page was Unsuccessful");

		// Validating that FirstName is showing
		assertTrue(deere.hasFisrtNameDisplayed(testData.getExpectedResult()[1]),
				"First name is not displayed correctly");

		// Validating that Business Address is showing
		assertTrue(deere.hasAddressDisplayed(testData.getExpectedResult()[2]), "Address is not displayed correctly");

		// Validating Phone number is showing
		assertTrue(deere.hasPhoneNumberDisplayed(testData.getExpectedResult()[3]),
				" Phonenumber is not displayed correctly");

		// Validating Email is showing
		assertTrue(deere.hasEmailAddressDispalyed(testData.getExpectedResult()[4]),
				" Email Address is not displayed correctly");

		// Validating Primary Message is showing
		assertTrue(deere.hasPrimaryMessageDisplayed(testData.getExpectedResult()[5]),
				" Primary Message is not displayed correctly");

		// Validating Country is showing
		assertTrue(deere.hasCountryDisplayed(testData.getExpectedResult()[6]), " Country is not displayed correctly");

		// Validating Comments is showing
		assertTrue(deere.hasCommentsDisplayed(testData.getExpectedResult()[7]), " Comments is not displayed correctly");

		// Validating Dealer Name is showing
		assertTrue(deere.hasDealerNameExist(testData.getExpectedResult()[8]), " Dealer Name does not exist");

		// Validating Dealer City is showing
		assertTrue(deere.hasDealerCityExist(testData.getExpectedResult()[9]), " Dealer City does not exist");

		// Validating Dealer State is showing
		assertTrue(deere.hasDealerStateExist(testData.getExpectedResult()[10]), " Dealer State does not exist");

		// Validating Submit button
		assertTrue(deere.hasSubmitButton(), "Submit button is not diaplayed");

		// Validating Clear button
		assertTrue(deere.hasClearButton(), "Clear button is not diaplayed");

		// select country and Enter description and upload attachment and click on
		// submit button
		deere = functionalMethods.selCounEntDesUplodFile(deere, testData.getTestdata()[3]);

		// Validating that file attachment is attached successfully
		assertTrue(deere.hasFileAttached(), "File attachment was unsuccessful");

		// Click on Clear button, Submit button and Accept Alert
		deere = functionalMethods.clickOnClearBtnSubmitBtnAcptAlrt(deere);

		// Validating Validation Msg for Comments textbox field
		assertTrue(deere.hasValidMessgDisplayed(testData.getExpectedResult()[11]),
				"Validation Message of Comments textbox is not displayed correctly");

		// selecting country and Entering description and uplaod attachment
		deere = functionalMethods.selCounEntDesUplodFile(deere, testData.getTestdata()[3]);

		// Validating that file attachment is attached successfully
		assertTrue(deere.hasFileAttached(), "File attachment was unsuccessful");

		// Click On Submit button
		deere = functionalMethods.clickOnSubmitButton(deere);

		// Validating Final Message
		assertTrue(deere.hasFinalMessage(testData.getExpectedResult()[15]),
				"Final Message with CaseID is not Displayed");

		// GetCaseId
		deere = functionalMethods.getCaseID(deere);

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Validating that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[4],
				testData.getTestdata()[5]);

		// Validating that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[6],
				testData.getTestdata()[7], NavigationClass.class);

		// Validating that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to Case search page
		isgCaseSearchPage = functionalMethods.clickCaseSearchHomeLink(navigationClass);

		// Validating that navigated to Case search page
		assertTrue(isgCaseSearchPage.hasCaseSearchHomePageDisplayed(),
				"Navigation to Case search page was Unsuccessful");

		// Entering the Case Id in Case Search Box and click on case link
		isgCaseSearchPage = functionalMethods.enterCaseIDClickCaseSrch(isgCaseSearchPage, deere.caseID_Deere);

		// Navigate to isgCasePage from isgCaseSearchPage
		isgCasePage = functionalMethods.navigateToISGCasePage(isgCaseSearchPage);

		// Validating that Work Basket is displayed
		assertTrue(isgCasePage.hasGSCWorkBasketDisplayed(), "Work Basket is not displayed");

		// Click on Action
		isgCasePage = functionalMethods.clickonActions(isgCasePage);

		// Click on send case mail
		sendCaseEmail = functionalMethods.sendcasemail(isgCasePage);

		// enter details in sendcase mail
		functionalMethods.entersendcasemail(sendCaseEmail, testData.getTestdata()[9]);

		// click on send button
		sendCaseEmail = functionalMethods.sendbutton(sendCaseEmail);

		gmailLoginPage = functionalMethods.openGmailPortal(getDriver(), testData.getTestdata()[10]);

		gmailStep3 = functionalMethods.LogintoGmailPage(gmailLoginPage, testData.getTestdata()[11],
				testData.getTestdata()[12]);

		// assertTrue(GmailStep2.hasAppButtonExist(),"Gmail App Button is not
		// displayedS");
		//
		// GmailStep2=functionalMethods.clickOnAppsButton(GmailStep2);
		//
		// GmailStep3=functionalMethods.clickOnGmailButton(GmailStep2);

		// GmailStep3=functionalMethods.clickOnSearchBox(GmailStep3);
		//
		// GmailStep3=functionalMethods.EnterValueInSearchBox(GmailStep3,testData.getTestdata()[12],"GSC-739");
		//
		// GmailStep3=functionalMethods.clickOnSearchIcon(GmailStep3);
		//
		// GmailStep3=functionalMethods.clickOnInboxLink(GmailStep3);
		//
		commentsWebForm = functionalMethods.clickOnAddCommentsLink(gmailStep3);

		commentsWebForm = functionalMethods.sendUserComments(commentsWebForm, testData.getTestdata()[13]);

		commentsWebForm = functionalMethods.ClearComments(commentsWebForm);

		commentsWebForm = functionalMethods.sendUserComments(commentsWebForm, testData.getTestdata()[13]);

		commentsWebForm = functionalMethods.SubmitComments(commentsWebForm);

		assertTrue(commentsWebForm.hasFinalMessage(), "Final Message is not displayed");

		// close the driver
		// getDriver().close();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site

		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[4],
				testData.getTestdata()[5]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		isgNavigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[6],
				testData.getTestdata()[7], ISGNavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(isgNavigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to Case search page
		isgCaseSearchPage = isgNavigationClass.clickCaseSearchHomeLink();

		// Verify that navigated to Case search page
		assertTrue(isgCaseSearchPage.hasCaseSearchHomePageDisplayed(),
				"Navigation to Case search page was Unsuccessful");

		// Enter the CaseId
		// isgCaseSearchPage =
		// functionalMethods.CSenterCaseId(isgCaseSearchPage,"GSC-739");//Deere.Caseid_Deere

		isgCaseSearchPage = isgCaseSearchPage.enterCaseIDInCaseSearchBox(testData.getTestdata()[8]);

		// Click on Case Search image button
		isgCaseSearchPage = functionalMethods.clickCaseSearchImgLink(isgCaseSearchPage);

		// Click on Case Link to navigate to main page
		isgCasePage = functionalMethods.clickCaseLink(isgCaseSearchPage);

		// Assert Work Basket
		assertTrue(isgCasePage.hasWorkBasketDisplayed(), "Work Basket is not displayed");

		// Click on correspondence
		// isgCasePage=functionalMethods.clickOnCorrespondence(isgCasePage);

		// Click on correspondence
		assertTrue(isgCasePage.hasReopenedStatusDisplayed(), "Status was not changed");
	}

	/**
	 * Author :Aparajita Pattanaik Description : Validating GSC customer search
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6339_GSCCustomerSearch(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		GSCCustomerSearch gscCustomerSearch;
		NavigationClass navigationClass;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage
		gscCustomerSearch = navigationClass.clickHomePageButton();

		// Verify landing of HomePage
		assertTrue(gscCustomerSearch.isHomePageDisplayed(), "Navigation to homepage displayed successfully");

		// click on GSC case creation
		gscCustomerSearch = functionalMethods.clickonGSCCase(gscCustomerSearch);

		// verify landing of GSC page
		assertTrue(gscCustomerSearch.isGSCPageDisplayed(), "Navigate to gsc pageis  not displayed successfully");

		// click on Add customer Info
		gscCustomerSearch = functionalMethods.clickAddCustomeInfo(gscCustomerSearch);

		// Validate Phone field
		assertTrue(gscCustomerSearch.hasPhoneDisplayed(), "Phone is not displayed successfully");

		// Validate for Business Name field
		assertTrue(gscCustomerSearch.hasBusinessNameDisplayed(), "Business is not displayed successfully");

		// Validate for Last Name field
		assertTrue(gscCustomerSearch.haslastNameDisplayed(), "LastName is not displayed successfully");

		// Validate for First Name field
		assertTrue(gscCustomerSearch.hasFirstNameDisplayed(), "FirstName is not displayed successfully");

		// Validate for Country field
		assertTrue(gscCustomerSearch.hasCountryDisplayed(), "Country is not displayed successfully");

		// Validate for State field
		assertTrue(gscCustomerSearch.hasStateDisplayed(), "State is not displayed successfully");

		// Validate for City field
		assertTrue(gscCustomerSearch.hasCityDisplayed(), "City is not displayed successfully");

		// Validate for Zip field
		assertTrue(gscCustomerSearch.hasZipDisplayed(), "Zip is not displayed successfully");

		// Validate business name,zipcode, reset field,
		gscCustomerSearch = functionalMethods.enterBusinessZipField(gscCustomerSearch, testData.getTestdata()[16],
				testData.getTestdata()[17]);

		// Enter customer details
		gscCustomerSearch = functionalMethods.enterCustomerSearch(gscCustomerSearch, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6]);

		// Validate Business
		assertTrue(gscCustomerSearch.hasBusinessDisplayed(), "business is not displayed successfully");

		// Validate Physical address
		assertTrue(gscCustomerSearch.hasPhysicalDisplayed(), "physical address is not displayed successfully");

		// Validate Mailing address
		assertTrue(gscCustomerSearch.hasMailingDisplayed(), "mailing address is not displayed successfully");

		// Validate Business number
		assertTrue(gscCustomerSearch.hasBusinessNumberDisplayed(), "Business number is not displayed successfully");

		// Validate Back button
		assertTrue(gscCustomerSearch.hasBackDisplayed(), "Back button is not displayed successfully");

		// Validate Create customer
		assertTrue(gscCustomerSearch.hasCreateCustomerDisplayed(), "create customer is not displayed successfully");

		// Validate Clear customer
		assertTrue(gscCustomerSearch.hasClearCustomerDisplayed(), "clear customer is not displayed successfully");

	}

	/**
	 * Author : Aparajita Pattanaik Description : GSC case creation and verifying
	 * status and button for each and every status.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */
	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6585_GSCButtons(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		GSCCustomerSearch gscCustomerSearch;
		NavigationClass navigationClass;

		FunctionalMethods functionalMethods = new FunctionalMethods();
		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage
		gscCustomerSearch = navigationClass.clickHomePageLink();

		// Verify landing of HomePage
		assertTrue(gscCustomerSearch.isHomePageDisplayed(), "Navigation to homepage displayed successfully");

		// click on GSC case creation
		gscCustomerSearch = functionalMethods.clickonGSCCase(gscCustomerSearch);

		// verify landing of GSC page
		assertTrue(gscCustomerSearch.isGSCPageDisplayed(), "Navigate to gsc pageis  not displayed successfully");

		// click on Add customer Info
		gscCustomerSearch = functionalMethods.clickAddCustomeInfo(gscCustomerSearch);

		// Verify landing of Customer Search page
		assertTrue(gscCustomerSearch.isAddCustomerDisplayed(), "Navigation to customer search not displayed");

		// Entered gsc customer deatils and select workbasket.
		gscCustomerSearch = functionalMethods.enterGSCCustomerWBDetails(gscCustomerSearch, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10],
				testData.getTestdata()[11], testData.getTestdata()[12], testData.getTestdata()[13],
				testData.getTestdata()[14]);

		// Validate for new draft status.
		assertTrue(gscCustomerSearch.hasNewDraftStatusDisplayed(), "NewDraft status is not displayed successfully");

		// Validate for Save button
		assertTrue(gscCustomerSearch.hasSaveStatusDisplayed(), "Save status is not displayed successfully");

		// Validate for Accept & Close button.
		assertTrue(gscCustomerSearch.hasAcceptAndCloseStatusDisplayed(),
				"Accept & Close status is not displayed successfully");

		// Validate for accept button
		assertTrue(gscCustomerSearch.hasAcceptStatusDisplayed(), "Accept status is not displayed successfully");

		// Click on Accept
		gscCustomerSearch = functionalMethods.clickOnAccept(gscCustomerSearch);

		// Validate for owned status button
		assertTrue(gscCustomerSearch.hasOwnedStatus(), "Owned status is not displayed successfully");

		// Validate for close button
		assertTrue(gscCustomerSearch.hasCloseStatus(), "Close status is not displayed successfully");

		// Validate for save button
		assertTrue(gscCustomerSearch.hasSaveStatus(), "Save status is not displayed successfully");

		// Validate for cancel button
		// assertTrue(gscCustomerSearch.hasCancelStatus(), "Cancel status is not
		// displayed successfully");

		// Click on close button
		gscCustomerSearch = functionalMethods.clickOnClose(gscCustomerSearch);

		// Validate for Resolved and completed status.

		// Click on Action and select reopen
		gscCustomerSearch = functionalMethods.clickOnReopen(gscCustomerSearch);

		// Validate reopened status
		assertTrue(gscCustomerSearch.hasReopenStatus(), "Reopen status is not displayed successfully");

		// Click on Action and workcase button.
		gscCustomerSearch = functionalMethods.clickOnActionWorkcase(gscCustomerSearch);

		// Validate for accept button
		assertTrue(gscCustomerSearch.hasAcceptStatusDisplayed(), "Accept status is not displayed successfully");

		// Validate for save button
		assertTrue(gscCustomerSearch.hasSaveStatus(), "Save status is not displayed successfully");

		// Validate for cancel button
		assertTrue(gscCustomerSearch.hasCancelStatus(), "Cancel status is not displayed successfully");

		// Click on cancel
		gscCustomerSearch = functionalMethods.clickOnCancel(gscCustomerSearch);

	}

	/**
	 * Author : Aparajita Pattanaik Description : GSC case creation.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6330_GSCCaseCreation(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;

		GSCCustomerSearch gscCustomerSearch;
		NavigationClass navigationClass;

		FunctionalMethods functionalMethods = new FunctionalMethods();
		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage
		gscCustomerSearch = navigationClass.clickHomePageLink();

		// Verify landing of HomePage
		assertTrue(gscCustomerSearch.isHomePageDisplayed(), "Navigation to homepage not displayed successfully");

		// click on GSC case creation
		gscCustomerSearch = functionalMethods.clickonGSCCase(gscCustomerSearch);

		// verify landing of GSC page
		assertTrue(gscCustomerSearch.isGSCPageDisplayed(), "Navigate to gsc pageis  not displayed successfully");

		// Validate customer info header
		assertTrue(gscCustomerSearch.hasCustomerInfoDisplayed(testData.getExpectedResult()[0]),
				"customer info is not Displayed succesfully");

		// Validate Contact & Dealership info
		assertTrue(gscCustomerSearch.hasConatctAndDealershipDisplayed(testData.getExpectedResult()[1]),
				"Contact & Dealership info is not Displayed succesfully");

		// Validate Product info header
		assertTrue(gscCustomerSearch.hasProductInfoDisplayed(testData.getExpectedResult()[2]),
				"product info is not Displayed successfully");

		// Validate Case Coding header
		assertTrue(gscCustomerSearch.hasCaseCodingDisplayed(testData.getExpectedResult()[3]),
				"Case Coding is not Displayed successfully");

		// Validate Case Information header
		assertTrue(gscCustomerSearch.hasCaseInformationDisplayed(testData.getExpectedResult()[4]),
				"Case Information  is not Displayed successfully");

		// Validate Related Case header
		assertTrue(gscCustomerSearch.hasRelatedCaseDisplayed(testData.getExpectedResult()[5]),
				"Related case is not Displayed successfully");

		// Validate Problem Details header
		assertTrue(gscCustomerSearch.hasProblemDetailsDisplayed(testData.getExpectedResult()[6]),
				"Problem Details info is not Displayed successfully");

		// Validate Summary field header
		assertTrue(gscCustomerSearch.hasSummaryDisplayed(testData.getExpectedResult()[7]),
				"Summary is not Displayed successfully");

		// Validate Workbasket field
		assertTrue(gscCustomerSearch.hasWorkbasketDisplayed(testData.getExpectedResult()[8]),
				"Workbasket is not Displayed successfully");

		// Validate Accept button
		assertTrue(gscCustomerSearch.hasAcceptDisplayed(testData.getExpectedResult()[10]),
				"Accept is not Displayed successfully");

		// Assert Accept and Close button
		assertTrue(gscCustomerSearch.hasAcceptandCloseDisplayed(testData.getExpectedResult()[11]),
				"Accept and Close is not Displayed successfully");

		// Validate Withdraw button
		assertTrue(gscCustomerSearch.hasWithdrawDisplayed(testData.getExpectedResult()[12]),
				"Withdraw is not Displayed successfully");

		// Validate Save button
		assertTrue(gscCustomerSearch.hasSaveDisplayed(testData.getExpectedResult()[13]),
				"Save is not Displayed successfully");

		// Validate Audit button
		// assertTrue(gscCustomerSearch.hasAuditDisplayed(testData.getExpectedResult()[14]),
		// "Audit is not Displayed successfully ");

		// Enter GSC customer details for case creation.
		gscCustomerSearch = functionalMethods.enterGSCCustomerDetails(gscCustomerSearch, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10],
				testData.getTestdata()[11], testData.getTestdata()[12], testData.getTestdata()[13],
				testData.getTestdata()[14]);

		// Assert for owned status .
		assertTrue(gscCustomerSearch.hasOwnedStatus(), "Owned status is not displayed successfully");

	}

	/**
	 * Author : Aparajita Pattanaik Description : Negative flow for GSC case.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6847_GSCNegativeCaseCreation(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		GSCCustomerSearch gscCustomerSearch;
		NavigationClass navigationClass;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage
		gscCustomerSearch = navigationClass.clickHomePageLink();

		// Verify landing of HomePage
		assertTrue(gscCustomerSearch.isHomePageDisplayed(), "Navigation to homepage displayed successfully");

		// click on GSC case creation
		gscCustomerSearch = functionalMethods.clickonGSCCase(gscCustomerSearch);

		// verify landing of GSC page
		assertTrue(gscCustomerSearch.isGSCPageDisplayed(), "Navigate to gsc pageis  not displayed successfully");

		// Validate customer info header
		assertTrue(gscCustomerSearch.hasCustomerInfoDisplayed(testData.getExpectedResult()[0]),
				"customer info is not Displayed");

		// Validate Contact & Dealership info header
		assertTrue(gscCustomerSearch.hasConatctAndDealershipDisplayed(testData.getExpectedResult()[1]),
				"Contact & Dealership info is not Displayed");

		// Validate Product info header
		assertTrue(gscCustomerSearch.hasProductInfoDisplayed(testData.getExpectedResult()[2]),
				"product info is not Displayed");

		// Validate Case Coding header
		assertTrue(gscCustomerSearch.hasCaseCodingDisplayed(testData.getExpectedResult()[3]),
				"Case Coding is not Displayed");

		// Validate Case Information header
		assertTrue(gscCustomerSearch.hasCaseInformationDisplayed(testData.getExpectedResult()[4]),
				"Case Information  is not Displayed");

		// Validate Related Case header
		assertTrue(gscCustomerSearch.hasRelatedCaseDisplayed(testData.getExpectedResult()[5]),
				"Related case is not Displayed");

		// Validate Problem Details header
		assertTrue(gscCustomerSearch.hasProblemDetailsDisplayed(testData.getExpectedResult()[6]),
				"Problem Details info is not Displayed");

		// Validate Summary field
		assertTrue(gscCustomerSearch.hasSummaryDisplayed(testData.getExpectedResult()[7]), "Summary is not Displayed");

		// Validate Workbasket field
		assertTrue(gscCustomerSearch.hasWorkbasketDisplayed(testData.getExpectedResult()[8]),
				"Workbasket is not Displayed");

		// Validate Accept button
		assertTrue(gscCustomerSearch.hasAcceptDisplayed(testData.getExpectedResult()[10]), "Accept is not Displayed");

		// Validate Accept and Close button
		assertTrue(gscCustomerSearch.hasAcceptandCloseDisplayed(testData.getExpectedResult()[11]),
				"Accept and Close is not Displayed");

		// Validate Withdraw button
		assertTrue(gscCustomerSearch.hasWithdrawDisplayed(testData.getExpectedResult()[12]),
				"Withdraw is not Displayed");

		// Validate Save button
		assertTrue(gscCustomerSearch.hasSaveDisplayed(testData.getExpectedResult()[13]), "Save is not Displayed");

		// Validate Audit button
		assertTrue(gscCustomerSearch.hasAuditDisplayed(testData.getExpectedResult()[14]), "Audit is not Displayed");

		// Enter gsc case customer details and verifying alert .
		gscCustomerSearch = functionalMethods.gscCaseAlertVerification(gscCustomerSearch, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10],
				testData.getTestdata()[11], testData.getTestdata()[12]);
		// Validate owned status

	}

	
	/**
	 * Author : Aparajita Description : verifying withdraw functionality in GSC Case
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws AWTException
	 * @throws Throwable
	 */
	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6826_GSCWithdrawDetail(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException, AWTException, IOException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		GSCCustomerSearch gscCustomerSearch;

		NavigationClass navigationClass;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage
		gscCustomerSearch = navigationClass.clickHomePageLink();

		// Verify landing of HomePage
		assertTrue(gscCustomerSearch.isHomePageDisplayed(), "Navigation to homepage displayed successfully");

		// click on GSC case creation
		gscCustomerSearch = functionalMethods.clickonGSCCase(gscCustomerSearch);

		// verify landing of GSC page
		assertTrue(gscCustomerSearch.isGSCPageDisplayed(), "Navigate to gsc page displayed successfully");

		// click on Add customer Info gscCustomerSearch =
		functionalMethods.clickAddCustomeInfo(gscCustomerSearch);

		// Verify landing of Customer Search page
		assertTrue(gscCustomerSearch.isAddCustomerDisplayed(), "Navigation to customer search displayed");

		// Enter customer first name
		gscCustomerSearch = functionalMethods.enterGSCWithdrawDetails(gscCustomerSearch, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10],
				testData.getTestdata()[11], testData.getTestdata()[12], testData.getTestdata()[6],
				testData.getTestdata()[6]);
		// Validate Accept button.

		// Validate Accept and close button.

		// Validate Withdraw button.

		// Validate Save button

		// Click on Withdraw and verify the text message.
		gscCustomerSearch = functionalMethods.clickOnWithdraw(gscCustomerSearch);

		// Validate new draft status.
		assertTrue(gscCustomerSearch.hasNewDraftStatusDisplayed(), "New Draft status is not displayed correctly");

		// click on Submit and verify the text message.
		gscCustomerSearch = functionalMethods.clickOnSubmit(gscCustomerSearch);

		// Validate of Withdraw status
		assertTrue(gscCustomerSearch.hasWithdrawStatusDisplayed(),
				" Resolved-Withdrawn status not displayed correctly");

	}

	/**
	 * Author :Aparajita Pattanaik Description : Regarding details of audit trails
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6540_AuditTrailDetails(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws Throwable {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		GSCCustomerSearch gscCustomerSearch;
		NavigationClass navigationClass;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage
		gscCustomerSearch = navigationClass.clickHomePageLink();

		// Verify landing of HomePage
		assertTrue(gscCustomerSearch.isHomePageDisplayed(), "Navigation to homepage displayed successfully");

		// click on GSC case creation
		gscCustomerSearch = functionalMethods.clickonGSCCase(gscCustomerSearch);

		// verify landing of GSC page
		assertTrue(gscCustomerSearch.isGSCPageDisplayed(), "Navigate to gsc page displayed successfully");

		// click on Add customer Info
		gscCustomerSearch = functionalMethods.clickAddCustomeInfo(gscCustomerSearch);

		// Verify landing of Customer Search page
		assertTrue(gscCustomerSearch.isAddCustomerDisplayed(), "Navigation to customer search is not displayed");

		// Enter customer first name
		gscCustomerSearch = functionalMethods.enterAuditCustomerDetails(gscCustomerSearch, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10],
				testData.getTestdata()[11], testData.getTestdata()[12], testData.getTestdata()[13],
				testData.getTestdata()[14]);

		// Click on Add Files, select & submit.
		gscCustomerSearch = functionalMethods.enterFileAttachmentDetails(gscCustomerSearch);

		// Validate the status changed to owned in Audit Trails
		// assertTrue(gscCustomerSearch.ownedStatus()," Audit Trails Status owned is not
		// displayed");

		// Validate to verify file has been attached
		assertTrue(gscCustomerSearch.hasFileAttached(testData.getExpectedResult()[0]),
				"File attachment is not Displayed");

		// Click on Action-Transfer case to Individual and select mandatory details.
		gscCustomerSearch = functionalMethods.clickonActionsTIndividual(gscCustomerSearch, testData.getTestdata()[15],
				testData.getTestdata()[15]);

		// click on submit.
		gscCustomerSearch = functionalMethods.gscTransferSubmit(gscCustomerSearch);

		// Validate for audit trails verification

		// Click on Actions, send case email and verify audit details.
		gscCustomerSearch = functionalMethods.clickonActions(gscCustomerSearch, testData.getTestdata()[15]);

		// Validate audit trails correspondance text
		assertTrue(gscCustomerSearch.hasCorrespondanceAttached(testData.getExpectedResult()[0]),
				"Correspondance attachment is not Displayed");

	}

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6826_GSCWithdrawDetails(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException, AWTException, IOException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		GSCCustomerSearch gscCustomerSearch;
		NavigationClass navigationClass;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage
		gscCustomerSearch = navigationClass.clickHomePageLink();

		// Verify landing of HomePage
		assertTrue(gscCustomerSearch.isHomePageDisplayed(), "Navigation to homepage displayed successfully");

		// click on GSC case creation
		gscCustomerSearch = functionalMethods.clickonGSCCase(gscCustomerSearch);

		// verify landing of GSC page
		assertTrue(gscCustomerSearch.isGSCPageDisplayed(), "Navigate to gsc page displayed successfully");

		// click on Add customer Info gscCustomerSearch =
		functionalMethods.clickAddCustomeInfo(gscCustomerSearch);

		// Verify landing of Customer Search page
		assertTrue(gscCustomerSearch.isAddCustomerDisplayed(), "Navigation to customer search displayed");

		// Enter customer first name
		gscCustomerSearch = functionalMethods.enterGSCWithdrawDetails(gscCustomerSearch, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10],
				testData.getTestdata()[11], testData.getTestdata()[12], testData.getTestdata()[6],
				testData.getTestdata()[6]);
		// Validate Accept button.

		// Validate Accept and close button.

		// Validate Withdraw button.

		// Validate Save button

		// Click on Withdraw and verify the text message.
		gscCustomerSearch = functionalMethods.clickOnWithdraw(gscCustomerSearch);

		// Validate new draft status.
		assertTrue(gscCustomerSearch.hasNewDraftStatusDisplayed(), "New Draft status is not displayed correctly");

		// click on Submit and verify the text message.
		gscCustomerSearch = functionalMethods.clickOnSubmit(gscCustomerSearch);

		// Validate of Withdraw status
		assertTrue(gscCustomerSearch.hasWithdrawStatusDisplayed(),
				" Resolved-Withdrawn status not displayed correctly");

	}

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6826_GSC_Cancel_button(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException, AWTException, IOException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		GSCCustomerSearch gscCustomerSearch;
		NavigationClass navigationClass;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage
		gscCustomerSearch = navigationClass.clickHomePageLink();

		// Verify landing of HomePage
		assertTrue(gscCustomerSearch.isHomePageDisplayed(), "Navigation to homepage displayed successfully");

		// click on GSC case creation
		gscCustomerSearch = functionalMethods.clickonGSCCase(gscCustomerSearch);

		// verify landing of GSC page
		assertTrue(gscCustomerSearch.isGSCPageDisplayed(), "Navigate to gsc page displayed successfully");

		// Click on Withdraw
		gscCustomerSearch = functionalMethods.clickOnWithdraw(gscCustomerSearch);

		// Validate withdraw button
		assertTrue(gscCustomerSearch.hasNewDraftStatusDisplayed(), "New Draft status is not displayed correctly");

		// Click on cancel
		gscCustomerSearch = functionalMethods.clickOnCancel(gscCustomerSearch);

		// Click on Action
		gscCustomerSearch = functionalMethods.clickonAction(gscCustomerSearch);

		// Validate refresh option, workcase, print.
		assertTrue(gscCustomerSearch.isOptionsRefreshDisplayed(testData.getExpectedResult()[5]),
				"Refresh option is not displayed ");

		// Validate work case option
		assertTrue(gscCustomerSearch.isOptionsWorkCaseDisplayed(testData.getExpectedResult()[6]),
				"Work Case option is not displayed ");

		// Validate print option
		assertTrue(gscCustomerSearch.isOptionsPrintDisplayed(testData.getExpectedResult()[7]),
				"Print option is not displayed ");
	}
	
	/**
	 * Author :Aparajita Pattanaik
	 *  Description : Verify case coding field for GSC case..
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6543_GSCCaseCoding(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		CaseCoding casecoding;
		NavigationClass navigationClass;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// Login to Site Minder
		siteMinderLoginPage = functionalMethods.openPortal(getDriver(), inputEnvironmentDetails.getUrl());

		// Verify that Site Minder Page is opened
		assertTrue(siteMinderLoginPage.hasPortalOpened(), "Site Minder Portal is not opened");

		// Login to Site Minder Site
		pegaLoginPage = functionalMethods.loginToSiteMinder(siteMinderLoginPage, testData.getTestdata()[0],
				testData.getTestdata()[1]);

		// Verify that Logged in to Site Minder Site
		assertTrue(pegaLoginPage.hasPegaLoginPageDisplayed(), "Login to Site Minder Site is Unsuccessful");

		// Login to PEGA site
		navigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], NavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(navigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage
		casecoding = navigationClass.caseCodingclickHomePageLink();

		// Verify landing of HomePage
		assertTrue(casecoding.hasHomePageDisplayed(), "Navigation to homepage displayed successfully");

		// click on GSC case creation
		casecoding = functionalMethods.caseCodingClickOnGSCCase(casecoding);

		// verify landing of GSC page
		assertTrue(casecoding.gscPageDisplayed(), "Navigate to gsc page displayed successfully");
		
		//Validate Functional Area.
		
		//Validate Functional code.

		// Validate for DeniedAssistance dropdown
		assertTrue(casecoding.hasActionDeniedAssistanceDisplayed(testData.getTestdata()[0]),
				"Denied Assistance is not displayed");

		// Validate for ActionDocumented dropdown
		assertTrue(casecoding.hasActionDocumented_InformationDisplayed(testData.getTestdata()[1]),
				"Documented_Information is not displayed");
		
		//Validate Forwarded to Field Manager
		assertTrue(casecoding.hasForwardedFieldManagerdisplayed(testData.getTestdata()[2]),
				"Field Manager field is not displayed");
		
		//Validate Forwarded to Legal
		assertTrue(casecoding.hasForwardedtoLegaldisplayed(testData.getTestdata()[3]),
				"Forwarded to Legal field is not displayed");
		
		//Validate Forwarded to Legal and Safety
		assertTrue(casecoding.hasForwardedLegalSafetydisplayed(testData.getTestdata()[4]),
				"Forwarded to Legal and Safety is not displayed");
		
		//Validate Forwarded to Other Deere Unit
		assertTrue(casecoding.hasDeereUnitdisplayed(testData.getTestdata()[5]),
				"Forwarded to Deere Unit is not displayed");
			
		//Validate Forwarded to Tier 2
		assertTrue(casecoding.hasForwardedTier2displayed(testData.getTestdata()[6]),
				"Forwarded to Tier 2 is not displayed");
		
		
		//Validate No Action/Response by Customer
		assertTrue(casecoding.hasNoActionResponsedisplayed(testData.getTestdata()[7]),
				"No Action/Response by Customer is not displayed");
		
		
		//Validate Referred to Dealer
		assertTrue(casecoding.hasReferredDealerdisplayed(testData.getTestdata()[8]),
				"Referred to Dealer is not displayed");
		
		
		//Validate Resolved by Customer
		assertTrue(casecoding.hasResolvedbyCustomerdisplayed(testData.getTestdata()[9]),
				"Resolved by Customer is not displayed");
		
		
		//Validate Resolved by Dealer
		assertTrue(casecoding.hasResolvedbyDealerdisplayed(testData.getTestdata()[10]),
				"Resolved by Dealer is not displayed");
		
		
		//Validate Resolved by DTAC
		assertTrue(casecoding.hasResolvedbyDTACdisplayed(testData.getTestdata()[11]),
				"Resolved by DTAC is not displayed");
		
		
		//Validate Resolved with Coupon
		assertTrue(casecoding.hasResolvedwithCoupondisplayed(testData.getTestdata()[12]),
				"Resolved with Coupon field is not displayed");
		
			
		//Validate Resolved with JD Promise
		assertTrue(casecoding.hasResolvedwithJDPromisedisplayed(testData.getTestdata()[13]),
				"Resolved with JD Promise field is not displayed");
		
		
		//Validate Resolved with Special Allowance
		assertTrue(casecoding.hasResolvedwithSpecialAllowancedisplayed(testData.getTestdata()[14]),
				"Resolved with Special Allowance field is not displayed");
		
		
		//Validate Resolved with Warranty
		assertTrue(casecoding.hasResolvedwithWarrantydisplayed(testData.getTestdata()[15]),
				"Resolved with Warranty field is not displayed");
		
		
		//Validate Sent free manual
		assertTrue(casecoding.hasSentfreemanualondisplayed(testData.getTestdata()[16]),
				"Sent free manual field is not displayed");
		
		
		//Validate Sent Free Part(s)
		assertTrue(casecoding.hasSentFreePartdisplayed(testData.getTestdata()[17]),
				"Sent Free Part(s) field is not displayed");
		
		
		//Validate Supplied information
		assertTrue(casecoding.hasSuppliedinformationdisplayed(testData.getTestdata()[18]),
				"Supplied information field is not displayed");

	}


}
