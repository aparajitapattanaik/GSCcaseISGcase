package com.deere.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.deere.global.CoreTestCase;
import com.deere.global.FunctionalMethods;
import com.deere.global.GlobalDataProvider;
import com.deere.global.InputEnvironmentDetails;
import com.deere.global.InputTestDetails;
import com.deere.greenfleet.GreenFleetCreationPage;
import com.deere.gscpage.GSCCustomerSearch;
import com.deere.isgpage.ISGCasePage;
import com.deere.isgpage.ISGCaseSearchPage;
import com.deere.pages.NavigationClass;
import com.deere.pages.PegaLoginPage;
import com.deere.pages.SiteMinderLoginPage;
import com.deere.pages.homepage.HomePage;
import com.deere.pages.solutionsearchpage.GSCCaseCreationPage;


public class GreenFleetTestCases extends CoreTestCase {

	/**
	 * Author : Aparajita Pattanaik 
	 * Description :create green fleet case using dealer user and verify in CCMs portal
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6695_GreenFleetcase(InputEnvironmentDetails inputEnvironmentDetails,InputTestDetails testData) throws Throwable {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		ISGCaseSearchPage isgCaseSearchPage;
		ISGCasePage isgCasePage;
		NavigationClass navigationClass;
		HomePage homepage;
		GreenFleetCreationPage greenFleetCreationPage;
		FunctionalMethods functionalMethods = new FunctionalMethods();

		// TempFiles_deletion.deltemp();
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
		greenFleetCreationPage = functionalMethods.navigateToGreenFleetCreationPage(navigationClass);
		// Verfy that Home Page is displayed.

		// click on GreenFleet case creation
		greenFleetCreationPage = functionalMethods.clickonGreenFleetCase(greenFleetCreationPage);

		// validate landing of GSC page
		assertTrue(greenFleetCreationPage.greenFleetPageDisplayed(), " Green fleet page is not displayed successfully");

		// Validate customer info header
		assertTrue(greenFleetCreationPage.hasCustomerInfoDisplayed(testData.getExpectedResult()[0]),
				"customer info is not Displayed");

		// Validate Contact & Dealership header
		assertTrue(greenFleetCreationPage.hasConatctAndDealershipDisplayed(testData.getExpectedResult()[1]),"Contact & Dealership info is not Displayed");

		// Validate Product info header
		assertTrue(greenFleetCreationPage.hasProductInfoDisplayed(testData.getExpectedResult()[2]),"product info is not Displayed");

		// Validate Case Coding header
		assertTrue(greenFleetCreationPage.hasCaseCodingDisplayed(testData.getExpectedResult()[3]),"Case Coding is not Displayed");

		// Validate Case Information header
		assertTrue(greenFleetCreationPage.hasCaseInformationDisplayed(testData.getExpectedResult()[4]),"Case Information  is not Displayed");
		
		// Validate for Priority

		// Assert for Language

		// Assert for GreenFleet Number

		// Validate Related Case field
		assertTrue(greenFleetCreationPage.hasRelatedCaseDisplayed(testData.getExpectedResult()[5]),
				"Related case is not Displayed");

		// Validate Problem Details field:
		assertTrue(greenFleetCreationPage.hasProblemDetailsDisplayed(testData.getExpectedResult()[6]),
				"Problem Details info is not Displayed");

		// Validate Summary field
		assertTrue(greenFleetCreationPage.hasSummaryDisplayed(testData.getExpectedResult()[7]),
				"Summary is not Displayed");

		// Assert for buttons i.e submit & save.

		// Enter green fleet customer details
		greenFleetCreationPage = functionalMethods.enterGreenFleetCase(greenFleetCreationPage,
				testData.getTestdata()[4], testData.getTestdata()[5], testData.getTestdata()[6],
				testData.getTestdata()[7], testData.getTestdata()[8], testData.getTestdata()[9],
				testData.getTestdata()[10], testData.getTestdata()[11], testData.getTestdata()[12],
				testData.getTestdata()[13]);

		// Get CaseId and click on loggout
		greenFleetCreationPage = functionalMethods.getDealerCase(greenFleetCreationPage);

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
		homepage = navigationClass.clickHomePageLink1();

		// Navigate to Case search page
		isgCaseSearchPage = navigationClass.clickCaseSearchHomeLink();

		// Verify that navigated to Case search page
		assertTrue(isgCaseSearchPage.hasCaseSearchHomePageDisplayed(),
				"Navigation to Case search page is not displayed");

		// Enter the CaseId
		isgCaseSearchPage = functionalMethods.csEnterDealerCaseId(isgCaseSearchPage, GSCCustomerSearch.Caseid);

		// Click on Case Search image button
		isgCaseSearchPage = functionalMethods.clickCaseSearchImgLink(isgCaseSearchPage);

		// Click on Case Link to navigate to main page
		isgCasePage = functionalMethods.clickCaseLink(isgCaseSearchPage);

		// Click on Action, workcase, accept.
		//isgCasePage = functionalMethods.clickonActionsWorkcaseAccept(isgCaseSearchPage);

		// Validate the owned_Status
		assertTrue(isgCasePage.hasOwnedDisplayed(testData.getExpectedResult()[8]), "Owned status is not Displayed");

		// Validate Save button
		assertTrue(isgCasePage.hasSaveDisplayed(testData.getExpectedResult()[9]), "Save is not Displayed");
		
		// Validate cancel button
		assertTrue(isgCasePage.hasCancelDisplayed(testData.getExpectedResult()[10]), "Cancel is not Displayed");
		
		// Validate close button
		assertTrue(isgCasePage.hasCloseDisplayed(testData.getExpectedResult()[11]), "Close status is not Displayed");
				
		// Click on close
		isgCasePage = functionalMethods.clickonClose(isgCasePage);
				
		// Validate the Owned_Resolved button.
		assertTrue(isgCasePage.hasResolvedCompletedDisplayed(testData.getExpectedResult()[12]), "Resolved & Compleetd status is not Displayed");

	}
	/**
	/**
	 * Author :Aparajita Description : GreenFleet Testcases
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6696GreenFleetCaseCreation(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		GreenFleetCreationPage greenFleetCreationPage;
		NavigationClass navigationClass;
		HomePage homepage;
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
		homepage = navigationClass.clickHomePageLink1();

		// Verify landing of HomePage
		assertTrue(homepage.homePageDisplayed(), "Navigation to homepage displayed successfully");

		// Verify tiles Workgroup Queue
		assertTrue(homepage.hasWorkgroupDisplayed(), "WorkgroupQueue is not displayed ");

		// Verify tiles of My Cases
		assertTrue(homepage.hasMyCasesDisplayed(), "My cases is not displayed ");

		// Verify tiles Case Search
		assertTrue(homepage.hasCaseSearchDisplayed(), "CaseSearch is not displayed ");

		// Verify tiles Solution Search
		assertTrue(homepage.hasSolutionSearchDisplayed(), "Solution search is not displayed ");

		// Verify tiles FAQ/Help
		assertTrue(homepage.hasFAQHelpDisplayed(), "FAQ is not displayed ");

		// Verify tiles DMAc Case
		assertTrue(homepage.hasDMACDisplayed(), "DMAC is  not displayed ");

		// Verify tiles DPAc Case
		assertTrue(homepage.hasDPACisplayed(), "DPAC is not displayed ");

		// Verify tiles DTAC Case
		assertTrue(homepage.hasDTACisplayed(), "DTAC is not displayed ");

		// Verify tiles GSC Case
		assertTrue(homepage.hasGSCCaseDisplayed(), "GSC Case is not displayed ");

		// Verify ISG Case
		assertTrue(homepage.hasISGCaseDisplayed(), "ISG Case is not displayed ");

		// Verify GreenFleet Case.
		assertTrue(homepage.hasGreenfleetCaseDisplayed(), "GreenFleetCase is not displayed ");

		// click on GreenFleet case creation
		greenFleetCreationPage = functionalMethods.clickonGreenFleetCase(homepage);

		// verify landing of GSC page
		assertTrue(greenFleetCreationPage.greenFleetPageDisplayed(), " Green fleet page is not displayed successfully");

		// Assert customer info
		assertTrue(greenFleetCreationPage.hasCustomerInfoDisplayed(testData.getExpectedResult()[0]),
				"customer info is not Displayed");

		// Assert Contact & Dealership info
		assertTrue(greenFleetCreationPage.hasConatctAndDealershipDisplayed(testData.getExpectedResult()[1]),
				"Contact & Dealership info is not Displayed");

		// Assert Product info
		assertTrue(greenFleetCreationPage.hasProductInfoDisplayed(testData.getExpectedResult()[2]),
				"product info is not Displayed");

		// Assert Case Coding
		assertTrue(greenFleetCreationPage.hasCaseCodingDisplayed(testData.getExpectedResult()[3]),
				"Case Coding is not Displayed");

		// Assert Case Information
		assertTrue(greenFleetCreationPage.hasCaseInformationDisplayed(testData.getExpectedResult()[4]),
				"Case Information  is not Displayed");

		// Assert Related Case
		assertTrue(greenFleetCreationPage.hasRelatedCaseDisplayed(testData.getExpectedResult()[5]),
				"Related case is not Displayed");

		// Assert Problem Details:
		assertTrue(greenFleetCreationPage.hasProblemDetailsDisplayed(testData.getExpectedResult()[6]),
				"Problem Details info is not Displayed");

		// Assert Summary (required)
		assertTrue(greenFleetCreationPage.hasSummaryDisplayed(testData.getExpectedResult()[7]),
				"Summary is not Displayed");

		// Validate Workbasket field
		assertTrue(greenFleetCreationPage.hasWorkbasketDisplayed(testData.getExpectedResult()[8]),
				"Workbasket is not Displayed");

		//Validate Greenfleet R4
		 assertTrue(greenFleetCreationPage.hasGreenFleetR4Displayed(testData.getExpectedResult()[9]), "GreenfleetR4 is not Displayed");

		// Validate Comments section
		 assertTrue(greenFleetCreationPage.hasCommentsDisplayed(testData.getExpectedResult()[10]),"Comments is not Displayed");

		// Validate Accept button
		assertTrue(greenFleetCreationPage.hasAcceptDisplayed(testData.getExpectedResult()[11]),
				"Accept is not Displayed");

		// Validate Accept and Close button
		assertTrue(greenFleetCreationPage.hasAcceptandCloseDisplayed(testData.getExpectedResult()[12]),
				"Accept and Close is not Displayed");
		
		//Validate save button
		 assertTrue(greenFleetCreationPage.hasSaveDisplayed(testData.getExpectedResult()[13]), "Save is not Displayed");

		// click on Add customer Info
		greenFleetCreationPage = functionalMethods.enterGreenFleetCase(greenFleetCreationPage,
				testData.getTestdata()[4], testData.getTestdata()[5], testData.getTestdata()[6],
				testData.getTestdata()[7], testData.getTestdata()[8], testData.getTestdata()[9],
				testData.getTestdata()[10], testData.getTestdata()[11], testData.getTestdata()[12],
				testData.getTestdata()[13]);
		// Click on Submit
		greenFleetCreationPage = functionalMethods.greenFleetSubmitButton(greenFleetCreationPage);
		
		//Click on Actions
		
		//Validate Refresh button 
		assertTrue(greenFleetCreationPage.hasRefreshDisplayed(testData.getExpectedResult()[18]),"Refresh is not Displayed");
		
		//Validate Transfer Case to WB button
		assertTrue(greenFleetCreationPage.hasWorkBasketDisplayed(testData.getExpectedResult()[19]),"Transfer To WB is not Displayed");
		
		//Validate Transfer Case to Individual button
		assertTrue(greenFleetCreationPage.hasTransferIndividualDisplayed(testData.getExpectedResult()[20]),"Transfer to Individual is not Displayed");
		
		//Validate Send Case Email button
		assertTrue(greenFleetCreationPage.hasSendCaseEmailDisplayed(testData.getExpectedResult()[21]),"send case email is not Displayed");
		
		//Validate Print button.
		assertTrue(greenFleetCreationPage.hasPrintDisplayed(testData.getExpectedResult()[22]),"print is not Displayed");		

	}
	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6867GreenFleetCaseCreationNegative(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		GreenFleetCreationPage greenFleetCreationPage;
		NavigationClass navigationClass;
		HomePage homepage;
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
		homepage = navigationClass.clickHomePageLink1();

		// click on GreenFleet case creation
		greenFleetCreationPage = functionalMethods.clickonGreenFleetCase(homepage);

		// verify landing of GSC page
		assertTrue(greenFleetCreationPage.greenFleetPageDisplayed(), " Green fleet page is not displayed successfully");

		
		 // Validate customer info header
		  assertTrue(greenFleetCreationPage.hasCustomerInfoDisplayed(testData.getExpectedResult()[0]), "customer info is not Displayed");
		  
		  // Validate Contact & Dealership info header
		  assertTrue(greenFleetCreationPage.hasConatctAndDealershipDisplayed(testData.
		  getExpectedResult()[1]), "Contact & Dealership info is not Displayed");
		  
		  //Validate  Product info icon.
		  assertTrue(greenFleetCreationPage.hasProductInfoDisplayed(testData. getExpectedResult()[2]), "product info is not Displayed");
		  
		  // Validate Case Coding header
		  assertTrue(greenFleetCreationPage.hasCaseCodingDisplayed(testData.
		  getExpectedResult()[3]), "Case Coding is not Displayed");
		  
		  // Validate Case Information header
		  assertTrue(greenFleetCreationPage.hasCaseInformationDisplayed(testData.
		  getExpectedResult()[4]), "Case Information  is not Displayed");
		 
		  //Validate Related Case header
		  assertTrue(greenFleetCreationPage.hasRelatedCaseDisplayed(testData.
		  getExpectedResult()[5]), "Related case is not Displayed");
		  
		  // Validate Problem Details section:
		  assertTrue(greenFleetCreationPage.hasProblemDetailsDisplayed(testData.
		  getExpectedResult()[6]), "Problem Details info is not Displayed");
		  
		  // Validate Summary field
		  assertTrue(greenFleetCreationPage.hasSummaryDisplayed(testData.
		  getExpectedResult()[7]), "Summary is not Displayed");
		  
		  // Validate Workbasket field
		  assertTrue(greenFleetCreationPage.hasWorkbasketDisplayed(testData.
		  getExpectedResult()[8]), "Workbasket is not Displayed");
		  
		  // Validate Greenfleet R4 field
		  assertTrue(greenFleetCreationPage.hasGreenFleetR4Displayed(testData. getExpectedResult()[9]),  "GreenfleetR4 is not Displayed");
		  
		  // Validate Comments section //
		  assertTrue(greenFleetCreationPage.hasCommentsDisplayed(testData. getExpectedResult()[0]),  "Comments is not Displayed");
		  
		  // Validate Accept button
		  assertTrue(greenFleetCreationPage.hasAcceptDisplayed(testData. getExpectedResult()[10]), "Accept is not Displayed");
		  
		  // Validate Accept and Close button
		  assertTrue(greenFleetCreationPage.hasAcceptandCloseDisplayed(testData.
		  getExpectedResult()[11]), "Accept and Close is not Displayed");
		  
		  // Validate Withdraw button
		  assertTrue(greenFleetCreationPage.hasWithdrawDisplayed(testData.getExpectedResult()[12]), "Withdraw is not Displayed");
		  
		  // Validate Save button
		  assertTrue(greenFleetCreationPage.hasSaveDisplayed(testData.getExpectedResult
		  ()[11]), "Save is not Displayed");
		  
		  // Valiadte Audit button
		  assertTrue(greenFleetCreationPage.hasAuditDisplayed(testData.getExpectedResult()[13]), "Audit is not Displayed");
		  
		  // Click on Accept & Verify the alert. 
		  greenFleetCreationPage =functionalMethods.acceptAndAlert(greenFleetCreationPage);
		 

		// Entering details in summary , priority ,click on accept and verify the alert
		greenFleetCreationPage = functionalMethods.enterDetailsGreenFleet(greenFleetCreationPage,
				testData.getTestdata()[10], testData.getTestdata()[11], testData.getTestdata()[12],
				testData.getTestdata()[13]);

		// Click on product

		// Assert Model
		assertTrue(greenFleetCreationPage.hasModalDisplayed(testData.getExpectedResult()[13]),
				"Model is not Displayed");

		// Assert Usgae.
		assertTrue(greenFleetCreationPage.hasUsageDisplayed(testData.getExpectedResult()[13]),
				"Usgae is not Displayed");

		// Assert Units
		assertTrue(greenFleetCreationPage.hasUnitsDisplayed(testData.getExpectedResult()[13]),
				"Units is not Displayed");

		// Assert PIN
		assertTrue(greenFleetCreationPage.hasPinDisplayed(testData.getExpectedResult()[13]), "PIN");

		// Assert Part number.
		assertTrue(greenFleetCreationPage.hasPartNumberDisplayed(testData.getExpectedResult()[13]),
				"Part number is not Displayed");

		// Assert componet serial number
		assertTrue(greenFleetCreationPage.hasAuditDisplayed(testData.getExpectedResult()[13]),
				"componet serial number is not Displayed");

		// Validate productEnter characters and verify the alert ,enter valid model and
		// click on submit.
		greenFleetCreationPage = functionalMethods.greenFleetProductDetails(greenFleetCreationPage,
				testData.getTestdata()[14], testData.getTestdata()[15]);

		// Click accept and verify the alert.

		//

	}

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6828GreenFleetCaseCreationTCSM(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		GreenFleetCreationPage greenFleetCreationPage;
		NavigationClass navigationClass;
		HomePage homepage;
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
		homepage = navigationClass.clickHomePageLink1();

		// click on GreenFleet case creation
		greenFleetCreationPage = functionalMethods.clickonGreenFleetCase(homepage);

		// verify landing of GSC page
		assertTrue(greenFleetCreationPage.greenFleetPageDisplayed(), " Green fleet page is not displayed successfully");

		// Assert customer info
		assertTrue(greenFleetCreationPage.hasCustomerInfoDisplayed(testData.getExpectedResult()[0]),
				"customer info is not Displayed");

		// Assert Contact & Dealership info
		assertTrue(greenFleetCreationPage.hasConatctAndDealershipDisplayed(testData.getExpectedResult()[1]),
				"Contact & Dealership info is not Displayed");

		// Assert Product info
		assertTrue(greenFleetCreationPage.hasProductInfoDisplayed(testData.getExpectedResult()[2]),
				"product info is not Displayed");

		// Assert Case Coding
		assertTrue(greenFleetCreationPage.hasCaseCodingDisplayed(testData.getExpectedResult()[3]),
				"Case Coding is not Displayed");

		// Assert Case Information
		assertTrue(greenFleetCreationPage.hasCaseInformationDisplayed(testData.getExpectedResult()[4]),
				"Case Information  is not Displayed");

		// Assert Related Case
		assertTrue(greenFleetCreationPage.hasRelatedCaseDisplayed(testData.getExpectedResult()[5]),
				"Related case is not Displayed");

		// Assert Problem Details:
		assertTrue(greenFleetCreationPage.hasProblemDetailsDisplayed(testData.getExpectedResult()[6]),
				"Problem Details info is not Displayed");

		// Assert Summary (required)
		assertTrue(greenFleetCreationPage.hasSummaryDisplayed(testData.getExpectedResult()[7]),
				"Summary is not Displayed");

		// Assert Workbasket
		assertTrue(greenFleetCreationPage.hasWorkbasketDisplayed(testData.getExpectedResult()[8]),
				"Workbasket is not Displayed");

		// Assert Greenfleet R4
		assertTrue(greenFleetCreationPage.hasGreenFleetR4Displayed(testData.getExpectedResult()[9]),
				"GreenfleetR4 is not Displayed");

		// Assert Comments section
		// assertTrue(greenFleetCreationPage.hasCommentsDisplayed(testData.getExpectedResult()[0]),
		// "Comments is not Displayed");

		// Assert Accept
		assertTrue(greenFleetCreationPage.hasAcceptDisplayed(testData.getExpectedResult()[10]),
				"Accept is not Displayed");

		// Assert Accept and Close
		assertTrue(greenFleetCreationPage.hasAcceptandCloseDisplayed(testData.getExpectedResult()[11]),
				"Accept and Close is not Displayed");

		// Assert Withdraw
		assertTrue(greenFleetCreationPage.hasWithdrawDisplayed(testData.getExpectedResult()[12]),
				"Withdraw is not Displayed");

		// Assert Save
		// assertTrue(greenFleetCreationPage.hasSaveDisplayed(testData.getExpectedResult()[13]),
		// "Save is not Displayed");

		// Assert Audit
		// assertTrue(greenFleetCreationPage.hasAuditDisplayed(testData.getExpectedResult()[14]),
		// "Audit is not Displayed");

		greenFleetCreationPage = functionalMethods.enterGreenFleetCase(greenFleetCreationPage,
				testData.getTestdata()[4], testData.getTestdata()[5], testData.getTestdata()[6],
				testData.getTestdata()[7], testData.getTestdata()[8], testData.getTestdata()[9],
				testData.getTestdata()[10], testData.getTestdata()[11], testData.getTestdata()[12],
				testData.getTestdata()[13]);

		// Assert close
		assertTrue(greenFleetCreationPage.hasCloseDisplayed(testData.getExpectedResult()[15]),
				"Close is not Displayed");

		// Assert save
		assertTrue(greenFleetCreationPage.hasSaveDisplayed(testData.getExpectedResult()[16]), "Save is not Displayed");

		// Assert cancel
		assertTrue(greenFleetCreationPage.hasCancelDisplayed(testData.getExpectedResult()[17]),
				"Cancel is not Displayed");

		// Click on Actions
		greenFleetCreationPage = functionalMethods.clickonGreenFleetAction(greenFleetCreationPage);

		// Assert Refresh,
		assertTrue(greenFleetCreationPage.hasRefreshDisplayed(testData.getExpectedResult()[18]),
				"Cancel is not Displayed");

		// Assert transfer to wb
		assertTrue(greenFleetCreationPage.hasWorkBasketDisplayed(testData.getExpectedResult()[19]),
				"Cancel is not Displayed");

		// Assert transfer to Individual
		assertTrue(greenFleetCreationPage.hasTransferIndividualDisplayed(testData.getExpectedResult()[20]),
				"Cancel is not Displayed");

		// Send case email.
		assertTrue(greenFleetCreationPage.hasSendCaseEmailDisplayed(testData.getExpectedResult()[21]),
				"send case email is not Displayed");

		// Assert print.
		assertTrue(greenFleetCreationPage.hasPrintDisplayed(testData.getExpectedResult()[22]),
				"print is not Displayed");

	}
}

