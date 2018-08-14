package com.deere.testCases;

import static com.deere.global.CommonFunctions.assertTrue;

import org.testng.annotations.Test;

import com.deere.global.CoreTestCase;
import com.deere.global.FunctionalMethods;
import com.deere.global.GlobalDataProvider;
import com.deere.global.InputEnvironmentDetails;
import com.deere.global.InputTestDetails;
import com.deere.isgpage.ISGCaseCreationHomePage;
import com.deere.isgpage.ISGCasePage;
import com.deere.isgpage.ISGLinkSolutionPage;
import com.deere.isgpage.ISGRecommendedSolutionsSectionPage;
import com.deere.pages.ISGNavigationClass;
import com.deere.pages.NavigationClass;
import com.deere.pages.OwnedCasePage;
import com.deere.pages.PegaLoginPage;
import com.deere.pages.SiteMinderLoginPage;
import com.deere.pages.homepage.HomePage;
import com.deere.pages.solutionsearchpage.GSCCaseCreationPage;
import com.deere.pages.solutionsearchpage.ISGCaseCreation;
import com.deere.pages.solutionsearchpage.SolutionSearchHomePage;

public class ISGTestCases extends CoreTestCase {

	/**
	 * Author : Lahari Pasupuleti Description : As a TSS, I want to enter model in
	 * product information for GSC and ISG cases so that case is populated to model
	 * information
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6560_ISGProductInformation(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		NavigationClass navigationClass;
		HomePage homePage;
		ISGCaseCreationHomePage isgCaseCreationHomePage;

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
		homePage = functionalMethods.navigateToHomePage(navigationClass);

		// Verify that if Home Page is displayed
		assertTrue(homePage.hasHomePageDisplayed(), "Navigation to Home Page Page was Unsuccessful");

		// Click on ISG Case creation Button
		isgCaseCreationHomePage = functionalMethods.NavToISGCaseCreatclkISGBtn(homePage);

		// Verify that if ISG case Creation Page is displayed
		assertTrue(isgCaseCreationHomePage.hasISGCaseCreationHomePageDisplayed(),
				"Navigation to ISG Case Creation Page was Unsuccessful");

		// Verify that Case Information section is displayed
		assertTrue(isgCaseCreationHomePage.hasCaseInformationSectionDisplayed(),
				"Case Information section heading  is not displayed currenctly");

		// Verify that Priority DropDown Filed is displayed
		assertTrue(isgCaseCreationHomePage.hasPriorityDropDownDisplayed(),
				"Priority DropDown Filed  is not displayed ");

		// Verify that Language DropDown Filed is displayed
		assertTrue(isgCaseCreationHomePage.hasLanguageDropDownDisplayed(),
				"Language DropDown Filed  is not displayed ");

		// Verify that Origin DropDown Filed is displayed
		assertTrue(isgCaseCreationHomePage.hasOriginDropDownDisplayed(), "Origin DropDown Filed  is not displayed ");

		// Verify that NCCA Text Field is displayed
		assertTrue(isgCaseCreationHomePage.hasNCCATextFieldDisplayed(), "NCCA TextBox Filed  is not displayed ");

		// Verify that Rally Text Filed is displayed
		assertTrue(isgCaseCreationHomePage.hasRallyTextFieldDisplayed(), "Rally TextBox Filed   is not displayed ");

		// Verify that Solution needs to be created for the issue of this case checkBox
		// is displayed
		assertTrue(isgCaseCreationHomePage.hasSolutionCreateChekBoxdDisplayed(),
				"Solution needs to be created for the issue of this case  checkbox  is not displayed currenctly");

		// Verify Case Information EYE Icon displayed
		assertTrue(isgCaseCreationHomePage.hasCaseCreationEYEIconDisplayed(),
				"Case Information EYE Icon  is not displayed");

		// Click on Case Information "EYE" button
		isgCaseCreationHomePage = functionalMethods.clickCaseInfmEyeBtn(isgCaseCreationHomePage);

		// Verify Small pop-up appears after click on EYE Icon
		assertTrue(isgCaseCreationHomePage.hasSmallPopUpDisplayed(), "Small pop-up appears is not displayed ");

		// Verify Created On displayed
		assertTrue(isgCaseCreationHomePage.hasCreatedOnDisplayed(), "Created On  is not displayed ");

		// Verify Created On with 'm/dd/yyy hh:mm am/pm' information displayed
		assertTrue(isgCaseCreationHomePage.hasCreatedOnWithDateTimeInfmDisplayed(),
				"Created On with  'm/dd/yyy hh:mm am/pm'  information  is not displayed");

		// Verify Last Assigned displayed
		assertTrue(isgCaseCreationHomePage.hasLastAssignedDisplayed(), "Last Assigned  is not displayed");

		// Verify Last Assigned with 'm/dd/yyy hh:mm am/pm' information displayed
		assertTrue(isgCaseCreationHomePage.hasLastAssignedWithDateTimeInfmDisplayed(),
				"Last Assigned with  'm/dd/yyy hh:mm am/pm'  information is not displayed");

		// Verify Last Modified displayed
		assertTrue(isgCaseCreationHomePage.hasLastModifiedDisplayed(), "Last Modified with is not displayed");

		// Verify Last Modified with 'm/dd/yyy hh:mm am/pm' information displayed
		assertTrue(isgCaseCreationHomePage.hasLastModifiedWithDateTimeInfmDisplayed(),
				"Last Modified with  'm/dd/yyy hh:mm am/pm'  information is not displayed");

		// Click on Add Product Info and Enter model details for Product Info
		isgCaseCreationHomePage = functionalMethods.clickAddProductInfoEnterModelDetail(isgCaseCreationHomePage,
				testData.getTestdata()[4]);

		// Verify after click on Submit for Add Product Info it closes the modal pop
		// screen or not and validate the screen heading
		assertTrue(isgCaseCreationHomePage.hasProductHeadingDisplayed(), "Product Heading is not displayed");

		// Click Edit in Product Info section
		isgCaseCreationHomePage = functionalMethods.clickEditBtn(isgCaseCreationHomePage);

		// Verify Product Information modal appears
		assertTrue(isgCaseCreationHomePage.hasProductInfDisplayed(), "Product Information is not displayed");

		// clear value for model filed
		isgCaseCreationHomePage = functionalMethods.clearValueFromModelDropDownfiled(isgCaseCreationHomePage);

		// Click on Edit Product Info and Enter model details for Product Info
		isgCaseCreationHomePage = functionalMethods.clickEditProductInfoEnterModelDetail(isgCaseCreationHomePage,
				testData.getTestdata()[5]);

		// Verify after click on Submit for Add Product Info it closes the modal pop
		// screen or not and validate the screen heading
		assertTrue(isgCaseCreationHomePage.hasProductHeadingDisplayed(), "Product Heading is not displayed");
	}

	/**
	 * Author : Lahari Pasupuleti Description : As a TSS, I want to access and
	 * search cases and solutions in CCMS system so that I can utilize exiting
	 * information available in CCMS
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6587_ISGRecommendedSolutionsSection(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		NavigationClass navigationClass;
		HomePage homePage;
		ISGRecommendedSolutionsSectionPage isgRecommendedSolutionsSectionPage;

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
		homePage = functionalMethods.navigateToHomePage(navigationClass);

		// Verify that if Home Page is displayed
		assertTrue(homePage.hasHomePageDisplayed(), "Navigation to Home Page Page was Unsuccessful");

		// Navigate to ISGRecommendedSolutionsSectionPage and Click on ISG Case creation
		// Button
		isgRecommendedSolutionsSectionPage = functionalMethods.NavToISGCaseCreatClkISGBtn(homePage);

		// Verify that if ISG case Creation Page is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasISGCaseCreationHomePageDisplayed(),
				"Navigation to ISG Case Creation Page was Unsuccessful");

		// Verify that Recommended Solutions section is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasRecommendedSolutionsDisplayed(),
				"Recommended Solutions  section heading  is not displayed correctly");

		// Verify that Languages is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasLanguagesDisplayed(),
				"Languages Label  is not displayed currenctly");

		// Verify that ID is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasIDDisplayed(), "ID Label  is not displayed currenctly");

		// Verify that Description is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasDescriptionDisplayed(),
				"Description Label  is not displayed currenctly");

		// Verify that Link New Solution is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasLinkNewSolutionDisplayed(),
				"Link New Solution heading  is not displayed currenctly");

		// Verify that Solution ID text box filed is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasSolutionIDDisplayed(),
				"Solution ID text box filed is not displayed");

		// Verify that Search Icon is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasSearchIconDisplayed(), "Search Icon filed is not displayed");

		// Verify that Languages is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasLanguageForLinkNewSolutionDisplayed(),
				"Languages Label  is not displayed");

		// Verify that ID is displayed
		// assertTrue(isgRecommendedSolutionsSectionPage.hasIDForLinkNewSolutionDisplayed(),
		// "ID Label is not displayed");

		// Verify that Description is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasDescriptionForLinkNewSolutionDisplayed(),
				"Description Label  is not displayed");

		// Verify that Link is displayed
		assertTrue(isgRecommendedSolutionsSectionPage.hasLinkDisplayed(), "Link Label  is not displayed");

		// Do a blank search of Solution ID
		isgRecommendedSolutionsSectionPage = functionalMethods
				.clickOnSearchForSolutionIdFiled(isgRecommendedSolutionsSectionPage);

		// Verify validation Message appears
		assertTrue(isgRecommendedSolutionsSectionPage.hasValidationMesgDisplayed(),
				"No published solution was found for or the solution is for internal view only and cannot be linked to the case.");

		// In Solution ID search field, enter a valid solution ID and Click on search of
		// Solution ID
		isgRecommendedSolutionsSectionPage = functionalMethods.enterSoluIdClickSecrh(isgRecommendedSolutionsSectionPage,
				testData.getTestdata()[4]);

		// verify solution will be automatically added to the case.
		assertTrue(isgRecommendedSolutionsSectionPage.hasSolutionIDDisplayed(testData.getExpectedResult()[0]),
				"72904 Id Number Not Showing under Recommended Solutions");

		// In Solution ID search field, enter a valid solution ID
		isgRecommendedSolutionsSectionPage = functionalMethods.enterSoluId(isgRecommendedSolutionsSectionPage,
				testData.getTestdata()[4]);

		// Click on search of Solution ID
		isgRecommendedSolutionsSectionPage = functionalMethods
				.clickOnSearchForSolutionIdFiled(isgRecommendedSolutionsSectionPage);

		// Verify validation Message appears
		assertTrue(isgRecommendedSolutionsSectionPage.hasValidationMessageDisplayed(), "Solution already added.");

		// In Solution ID search field, enter a valid solution ID and Click on search of
		// Solution ID
		isgRecommendedSolutionsSectionPage = functionalMethods.enterSoluIdClickSecrh(isgRecommendedSolutionsSectionPage,
				testData.getTestdata()[5]);

		// verify Language is showing as English
		assertTrue(isgRecommendedSolutionsSectionPage.hasLanguageNameDisplayed(testData.getExpectedResult()[1]),
				"English is not Showing under Recommended Solutions");

		// verify solution ID showing
		assertTrue(isgRecommendedSolutionsSectionPage.hasSolutionIDRecomdedDisplayed(testData.getExpectedResult()[2]),
				"1234 Id Number Not Showing under Recommended Solutions");

		// verify solution Description showing
		assertTrue(isgRecommendedSolutionsSectionPage.hasSolutionDescriptionDisplayed(testData.getExpectedResult()[3]),
				"1234-HBI-AX-1345 APR 21 1989 610 SEEDING TOOL WITH 8 INCH SPACING THROWS TOO MUCH DIRT OVER SEED-Jan 11 2001");

		// verify Delete Icon showing
		// assertTrue(isgRecommendedSolutionsSectionPage.hasDeleteIconDisplayed(),"Delete
		// Icon not Showing under Recommended Solutions");

		// Click on ID
		isgRecommendedSolutionsSectionPage = functionalMethods
				.clickOnSolutionIdLink(isgRecommendedSolutionsSectionPage);

		// verify Solution Number is showing
		assertTrue(isgRecommendedSolutionsSectionPage.hasSolutionNumberDisplayed(), "Solution Number is not showing");

		// verify Solution Summary is showing
		assertTrue(isgRecommendedSolutionsSectionPage.hasSolutionSummaryDisplayed(testData.getExpectedResult()[2]),
				"Solution Summary is not  Showing ");

		// verify Publication Date is showing
		assertTrue(isgRecommendedSolutionsSectionPage.hasPublicationDateDisplayed(), "Publication Date is not showing");

	}

	/**
	 * Author : Lahari Pasupuleti Description : As a TSS for ISG, I want to route
	 * cases to respective workbaskets as per details mentioned in attached
	 * worksheet, based on product selected in case so that respective workgroups ca
	 * work on it.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */
	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6486_RoutingForISG(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		ISGCasePage isgCasePage;
		NavigationClass navigationClass;
		HomePage homePage;

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
		homePage = functionalMethods.navigateToHomePage(navigationClass);

		// Verify that if Home Page is displayed
		assertTrue(homePage.hasHomePageDisplayed(), "Navigation to Home Page Page was Unsuccessful");

		// Click on Create ISG Case
		isgCasePage = functionalMethods.navigateToCreateISGCaseHome(homePage);

		// Verify that Landing Page is displayed
		assertTrue(isgCasePage.hasCreateISGCaseDisplayed(), "Navigation to CreateISGCasePage was Unsuccessful");

		// Enter ISG Case creation Details
		isgCasePage = functionalMethods.enterIsgCaseCreationDet(isgCasePage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10]);

		/*
		 * //Click and Add Product Info Details
		 * isgCasePage=functionalMethods.addProductInfoDetails(isgCasePage,testData.
		 * getTestdata()[7]);
		 * 
		 * //Enter the Functional details
		 * isgCasePage=functionalMethods.addFunctionalDetails(isgCasePage,
		 * testData.getTestdata()[8],
		 * testData.getTestdata()[9],testData.getTestdata()[10]);
		 */

		// Verify Correct Customer Details is showing
		assertTrue(isgCasePage.hasCustomerDetailsDisplayedInMainPage(), "Correct Customer details are not displayed");
	}

	/**
	 * Author : Lahari Pasupuleti Description : As TSS user I should have the
	 * ability to Link solutions to ISG cases.
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
	public static void test_TC6805_LinkSolutionsTotheCasefromSolutionScreen(
			InputEnvironmentDetails inputEnvironmentDetails, InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		NavigationClass navigationClass;
		ISGLinkSolutionPage isgLinkSolutionPage;

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
		isgLinkSolutionPage = functionalMethods.NavToISGLinkSolutionPageClkHome(navigationClass);

		// Validating if Home is displayed
		assertTrue(isgLinkSolutionPage.hasHomePageDisplayed(), "Navigation to Home Page is Unsuccessful");

		// Click on WorkgroupQueue
		isgLinkSolutionPage = functionalMethods.clickWorkBasketQueue(isgLinkSolutionPage);

		// Verify WorkGroup queue grid showing
		assertTrue(isgLinkSolutionPage.hasWorkGroupQueueGridDisplayed(), " Workgroup queue grid is not showing");

		// Click to open 5 ISG cases and Click on Solutions Search and click on search
		isgLinkSolutionPage = functionalMethods.clickISGCases(isgLinkSolutionPage);

		// Verify list of Solutions is presented under the search fields
		assertTrue(isgLinkSolutionPage.hasListOfSolutionsDisplayed(), "list of Solutions  is not showing");

		// Choose a Solution and click on Link to Case (link) next to it.
		isgLinkSolutionPage = functionalMethods.clickLinkSolution(isgLinkSolutionPage);

		// Link Solution in Same Language pop-up is opened. It contains a list of 5
		// recently opened Cases with checkBox, case ID and Summary.
		assertTrue(isgLinkSolutionPage.hasLinkSolutionInSameLanguagePopUpDisplayed(),
				"Link Solution in Same Language Pop UP is not showing");

		// Compare a list of 5 recently opened Cases with checkBox, case ID and Summary
		// and Check the checkBox next to case ID that you want to attach the Solution
		isgLinkSolutionPage = functionalMethods.CompareAndCheckCheckBoxForCaseId(isgLinkSolutionPage);

		// Open the case that you choose to attach the solution
		isgLinkSolutionPage = functionalMethods.openCaseIdOfChooseSolution(isgLinkSolutionPage);

	}

	/**
	 * Author : Lahari Pasupuleti Description : As a TSS for ISG, I want to route
	 * cases to respective workbaskets as per details mentioned in attached
	 * worksheet, based on product selected in case so that respective workgroups ca
	 * work on it.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */
	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6806_LinkSolutionsToCaseWithDifferentLanguage(
			InputEnvironmentDetails inputEnvironmentDetails, InputTestDetails testData) {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		ISGCasePage isgCasePage;
		ISGNavigationClass isgNavigationClass;
		NavigationClass navigationClass;
		ISGLinkSolutionPage isgLinkSolutionPage;
		HomePage homePage;
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
		homePage = functionalMethods.navigateToHomePage(navigationClass);

		// Verify that if Home Page is displayed
		assertTrue(homePage.hasHomePageDisplayed(), "Navigation to Home Page Page was Unsuccessful");

		// Click on Create ISG Case
		isgCasePage = functionalMethods.navigateToCreateISGCaseHome(homePage);

		// Verify that Landing Page is displayed
		assertTrue(isgCasePage.hasCreateISGCaseDisplayed(), "Navigation to Create ISG Case was Unsuccessful");

		// Enter ISG Case creation Details
		isgCasePage = functionalMethods.enterIsgCaseCreationDet(isgCasePage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10]);

		// Click and Add Product Info Details
		isgCasePage = functionalMethods.addProductInfoDetails(isgCasePage, testData.getTestdata()[7]);

		// Enter the Functional details
		isgLinkSolutionPage = functionalMethods.navigateToISGLinkSolutionPage(isgCasePage, testData.getTestdata()[8],
				testData.getTestdata()[9], testData.getTestdata()[10], testData.getTestdata()[11]);

		// Verify Correct Customer Details is showing
		assertTrue(isgLinkSolutionPage.hasCustomerDetailsDisplayedInMainPage(),
				"Correct Customer details are not displayed");

		// Click on Solutions Search and click on search
		isgLinkSolutionPage = functionalMethods.clickSolutionsSearch(isgLinkSolutionPage);

	}

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6813_LinkSolutionFromSolutionsAction(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		NavigationClass navigationClass;
		ISGLinkSolutionPage isgLinkSolutionPage;
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
		isgLinkSolutionPage = functionalMethods.NavToISGLinkSolutionPageClkHome(navigationClass);

		// Click on WorkgroupQueue
		isgLinkSolutionPage = functionalMethods.clickWorkBasketQueue(isgLinkSolutionPage);

		// Verify WorkGroup queue grid showing
		assertTrue(isgLinkSolutionPage.hasWorkGroupQueueGridDisplayed(), " Workgroup queue grid is not showing");

		// Click to open 5 ISG cases
		isgLinkSolutionPage = functionalMethods.clickISGCases(isgLinkSolutionPage);

		// Click on Solutions Search and click on search
		isgLinkSolutionPage = functionalMethods.clickSolutionsSearch(isgLinkSolutionPage);

		// Verify list of Solutions is presented under the search fields
		assertTrue(isgLinkSolutionPage.hasListOfSolutionsDisplayed(), "list of Solutions  are  not showing");

		// Click on any solution and Actions
		isgLinkSolutionPage = functionalMethods.clickAnySolution(isgLinkSolutionPage);

		// verify solution opened successfully
		// assertTrue(isgLinkSolutionPage.hasSolutionOpend(), " Solutions is not opened
		// ");

		// Click on Actions
		isgLinkSolutionPage = functionalMethods.clickActionsDD(isgLinkSolutionPage);

		// Click on Solutions Search and click on search
		isgLinkSolutionPage = functionalMethods.clickSolutionsSearch(isgLinkSolutionPage);

		// Verify list of Solutions is presented under the search fields
		assertTrue(isgLinkSolutionPage.hasListOfSolutionsDisplayed(), "list of Solutions  are  not showing");

		// Click on any solution and Actions
		isgLinkSolutionPage = functionalMethods.clickAnySolution(isgLinkSolutionPage);

		// verify solution opened successfully
		// assertTrue(isgLinkSolutionPage.hasSolutionOpend(), " Solutions is not opened
		// ");

		// Click on Actions
		isgLinkSolutionPage = functionalMethods.clickActionsDD(isgLinkSolutionPage);

	}

	/**
	 * Author : Aparajita Pattanaik Description :Create ISG case and tansfer to
	 * Individual
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6441_ISGTransferToWBIndividual(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		ISGNavigationClass isgNavigationClass;
		ISGCasePage isgCasePage;
		HomePage homePage;

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
		isgNavigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], ISGNavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(isgNavigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage page
		homePage = isgNavigationClass.clickHomeLink();

		// Verify that Landing Page is displayed
		assertTrue(homePage.isHomePageDisplayedISG(testData.getExpectedResult()[0]),
				"Navigation to Home page was Unsuccessful");

		// Click on Create ISG Case
		isgCasePage = functionalMethods.navigateToCreateISGCaseHome(isgNavigationClass);

		// Verify that Landing Page is displayed
		assertTrue(isgCasePage.hasCreateISGCaseDisplayed(), "Navigation to Create ISG Case was Unsuccessful");

		// Verify the customer page is displayed
		// assertTrue(isgCasePage.hasCustomerTitleDisplayed(), "Customer title not
		// displayed");

		// Enter Customer details for Transfer To Individual
		isgCasePage = functionalMethods.isgEnterCustomerDetails(isgCasePage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10]);

		// Validate owned status.
		assertTrue(isgCasePage.isStatusOwned(), "Status owned is not displayed");

		// click on Actions, Transfer to Individual details and verify audit details.
		isgCasePage = functionalMethods.isgActionsButton(isgCasePage, testData.getTestdata()[11],
				testData.getTestdata()[12]);

		// Validate Audit

		// click on case close and discard
		 isgCasePage = functionalMethods.clickOnCaseCloseAndDiscard(isgCasePage);

	}

	/**
	 * Author : Aparajita Pattanaik Description :Create ISG case and transfer to WB
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6441_ISGTransferToWB(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		ISGNavigationClass isgNavigationClass;
		ISGCasePage isgCasePage;
		HomePage homePage;
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
		isgNavigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], ISGNavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(isgNavigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage page
		homePage = isgNavigationClass.clickHomeLink();
		System.out.println("clicked on home button");

		// Verify that Landing Page is displayed
		assertTrue(homePage.isHomePageDisplayedISG(testData.getExpectedResult()[0]),
				"Navigation to Home page was Unsuccessful");

		// Click on Create ISG Case
		isgCasePage = functionalMethods.navigateToCreateISGCaseHome(isgNavigationClass);

		// Verify that Landing Page is displayed
		assertTrue(isgCasePage.hasCreateISGCaseDisplayed(), "Navigation to Create ISG Case was Unsuccessful");

		// Enter Customer Info
		isgCasePage = functionalMethods.isgEnterCustomerDetails(isgCasePage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10]);

		// Verify Correct Customer details are entered
		assertTrue(isgCasePage.hasCustomerDetailsDisplayed(), "Correct Customer details are not displayed");

		// Validate owned status.
		assertTrue(isgCasePage.isStatusOwned(), "Status owned is not displayed");

		// click on Actions
		isgCasePage = functionalMethods.isgActionsButton(isgCasePage);

		// Click on Transfer case to work basket

		// Click on submit button.

		// Click on Audit button.

		// Validate Audit button.

	}

	/**
	 * Author : Aparajita Pattanaik Description :Create ISG case and verifying
	 * thestatus and buttons.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */
	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6586_ISG_Buttons(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		ISGNavigationClass isgNavigationClass;
		ISGCasePage isgCasePage;
		HomePage homePage;
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
		isgNavigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], ISGNavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(isgNavigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage page
		homePage = isgNavigationClass.clickHomeLink();

		// Verify that Landing Page is displayed
		assertTrue(homePage.isHomePageDisplayedISG(testData.getExpectedResult()[0]),
				"Navigation to Home page was Unsuccessful");

		// Click on Create ISG Case
		isgCasePage = functionalMethods.navigateToCreateISGCaseHome(isgNavigationClass);

		// Verify that Landing Page is displayed
		assertTrue(isgCasePage.hasCreateISGCaseDisplayed(), "Navigation to Create ISG Case was Unsuccessful");

		// Validate for NewDraft status.

		// Validate for Accept

		// Validate for Save
		assertTrue(isgCasePage.hasSaveStatus(), "Save status is not displayed successfully");

		// Validate for Accept and close

		// Enter Customer Info
		isgCasePage = functionalMethods.isgEnterCustomerDetails(isgCasePage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10]);

		// Validate owned status.
		assertTrue(isgCasePage.isStatusOwned(), "Status owned is not displayed");

		// Validate for Close
		assertTrue(isgCasePage.hasCloseStatus(), "Close status is not displayed successfully");

		// Validate for Save
		assertTrue(isgCasePage.hasSaveStatus(), "Save status is not displayed successfully");

		// Validate for Cancel.
		assertTrue(isgCasePage.hasCancelStatus(), "Cancel status is not displayed successfully");

		// Click on close
		isgCasePage = functionalMethods.clickOnClose(isgCasePage);

		// Validate for Resolved and completed status..

		// Click on Action and Reopen
		isgCasePage = functionalMethods.clickOnReopen(isgCasePage);

		// Validate for Reopened
		assertTrue(isgCasePage.hasReopenStatus(), "Reopen status is not displayed successfully");

		// Click on Action,TSS reopn, workcase
		isgCasePage = functionalMethods.clickOnActionWorkcase(isgCasePage);

		// Validate for Accept
		assertTrue(isgCasePage.hasAcceptStatusDisplayed(), "Accept status is not displayed successfully");

		// Validate for save
		assertTrue(isgCasePage.hasSaveStatus(), "Save status is not displayed successfully");

		// Validate for cancel
		assertTrue(isgCasePage.hasCancelStatus(), "Cancel status is not displayed successfully");

		// Validate for close
		isgCasePage = functionalMethods.clickOnClose(isgCasePage);

	}

	/**
	 * Author : Aparajita Pattanaik Description : Verify action button dropdown for
	 * each and every status of ISG case.
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */
	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6482TestActions(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		ISGNavigationClass isgNavigationClass;
		ISGCasePage isgCasePage;
		HomePage homePage;
		

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
		isgNavigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], ISGNavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(isgNavigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage page
		homePage = isgNavigationClass.clickHomeLink();

		// Verify that Landing Page is displayed
		assertTrue(homePage.isHomePageDisplayedISG(testData.getExpectedResult()[0]),
				"Navigation to Home page was Unsuccessful");

		// Click on Create ISG Case
		isgCasePage = functionalMethods.navigateToCreateISGCaseHome(isgNavigationClass);

		// Verify that Landing Page is displayed
		assertTrue(isgCasePage.hasCreateISGCaseDisplayed(), "Navigation to Create ISG Case was Unsuccessful");

		// Validate for NewDraft
		assertTrue(isgCasePage.hasNewDraftStatusDisplayed(testData.getExpectedResult()[0]),
				"NewDraft status is not displayed");

		// Click on Actions
		isgCasePage = functionalMethods.isgActionsButton(isgCasePage);

		// Validate for Refresh
		assertTrue(isgCasePage.hasRefreshDisplayed(testData.getExpectedResult()[1]),
				"Refresh option is not displayed ");

		// Validate for Print
		assertTrue(isgCasePage.hasPrintDisplayed(testData.getExpectedResult()[1]),
				"Print option is not getting displayed ");

		// Click on Add Customer Info
		// isgCasePage = functionalMethods.isgAddCustomerInfo(isgCasePage);

		// Enter Customer Info
		isgCasePage = functionalMethods.isgEnterCustomerDetails(isgCasePage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10]);

		// Validate the case status to Owned
		assertTrue(isgCasePage.isStatusOwned(), "Owned status is not displayed");

		// Click on Actions
		isgCasePage = functionalMethods.isgActionsButton(isgCasePage);

		// Validate Refresh button
		assertTrue(isgCasePage.hasRefreshDisplayed(testData.getExpectedResult()[1]),
				"Refresh option is not displayed ");

		// Validate Print button
		assertTrue(isgCasePage.hasPrintDisplayed(testData.getExpectedResult()[1]), "Print option is not displayed ");

		// Validate for Transfer case to WB button
		assertTrue(isgCasePage.hasTransferCaseToWBDisplayed(testData.getExpectedResult()[2]),
				"Transfer Case To WB option is not  displayed ");

		// Validate for Transfer case to Individual button
		assertTrue(isgCasePage.hasTransferIndividuDisplayed(testData.getExpectedResult()[3]),
				"Transfer Case To Individual option is not  displayed ");

		// Validate for send case email
		assertTrue(isgCasePage.hasSendCaseEmailDisplayed(testData.getExpectedResult()[4]),
				"Send Case Email option is not  displayed ");
		
		// Validate the case status to Owned
		assertTrue(isgCasePage.isStatusOwned(), "Owned status is not displayed");

		// Click on close
		isgCasePage = functionalMethods.clickOnClose(isgCasePage);
	
		// Assert the case status Resolved and completed
		assertTrue(isgCasePage.hasResolvedCompletedDisplayed(testData.getExpectedResult()[5]),
				"ResolvedCompleted option is not displayed ");
		
		// Click on Actions
				isgCasePage = functionalMethods.isgActionsButton(isgCasePage);

		// Assert for Refresh
		assertTrue(isgCasePage.hasRefreshDisplayed(testData.getExpectedResult()[1]),
				"Refresh option is not displayed ");

		// Assert for Print
		assertTrue(isgCasePage.hasPrintDisplayed(testData.getExpectedResult()[1]), "Print option is not displayed ");

		// Assert for Send case email
		assertTrue(isgCasePage.hasSendCaseEmailDisplayed(testData.getExpectedResult()[1]),
				"Send Case Email option is not  displayed ");

	}
	/**
	 * Author : Aparajita Pattanaik
	 *  Description :ISG case creation
	 * 
	 * @param testData
	 * @param environmentDetails
	 * @param inputBrowserDetails
	 * @param driver
	 * @return
	 * @throws Throwable
	 */

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6804_ISGCaseCreation(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		ISGNavigationClass isgNavigationClass;
		
		ISGCasePage isgCasePage;
		HomePage homePage;
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
		isgNavigationClass = functionalMethods.loginToPega(pegaLoginPage, testData.getTestdata()[2],
				testData.getTestdata()[3], ISGNavigationClass.class);

		// Verify that Landing Page is displayed
		assertTrue(isgNavigationClass.isLandingPageDisplayed(), "Landing page is not displayed");

		// Navigate to HomePage page
		homePage = isgNavigationClass.clickHomeLink();

		// Verify that Landing Page is displayed
		assertTrue(homePage.isHomePageDisplayedISG(testData.getExpectedResult()[0]),
				"Navigation to Home page was Unsuccessful");

		// Click on Create ISG Case
		isgCasePage = functionalMethods.navigateToCreateISGCaseHome(isgNavigationClass);

		// Verify that Landing Page is displayed
		assertTrue(isgCasePage.hasCreateISGCaseDisplayed(), "Navigation to Create ISG Case was Unsuccessful");

		// Validate customer info header
		assertTrue(isgCasePage.hasCustomerInfoDisplayed(testData.getExpectedResult()[0]),
				"customer info is not Displayed succesfully");

		// Validate Contact & Dealership info
		assertTrue(isgCasePage.hasConatctAndDealershipDisplayed(testData.getExpectedResult()[1]),
				"Contact & Dealership info is not Displayed succesfully");

		// Validate Product info header
		assertTrue(isgCasePage.hasProductInfoDisplayed(testData.getExpectedResult()[2]),
				"product info is not Displayed successfully");

		// Validate Case Coding header
		assertTrue(isgCasePage.hasCaseCodingDisplayed(testData.getExpectedResult()[3]),
				"Case Coding is not Displayed successfully");

		// Validate Case Information header
		assertTrue(isgCasePage.hasCaseInformationDisplayed(testData.getExpectedResult()[4]),
				"Case Information  is not Displayed successfully");

		// Validate Related Case header
		assertTrue(isgCasePage.hasRelatedCaseDisplayed(testData.getExpectedResult()[5]),
				"Related case is not Displayed successfully");

		// Validate Problem Details header
		assertTrue(isgCasePage.hasProblemDetailsDisplayed(testData.getExpectedResult()[6]),
				"Problem Details info is not Displayed successfully");

		// Validate Summary field header
		assertTrue(isgCasePage.hasSummaryDisplayed(testData.getExpectedResult()[7]),
				"Summary is not Displayed successfully");

		// Validate Workbasket field
		assertTrue(isgCasePage.hasWorkbasketDisplayed(testData.getExpectedResult()[8]),
				"Workbasket is not Displayed successfully");

		// Validate Accept button
		assertTrue(isgCasePage.hasAcceptDisplayed(testData.getExpectedResult()[10]),
				"Accept is not Displayed successfully");

		// Validate Accept and Close button
		assertTrue(isgCasePage.hasAcceptandCloseDisplayed(testData.getExpectedResult()[11]),
				"Accept and Close is not Displayed successfully");

		// Validate Withdraw button
		assertTrue(isgCasePage.hasWithdrawDisplayed(testData.getExpectedResult()[12]),
				"Withdraw is not Displayed successfully");

		// Validate Save button
		assertTrue(isgCasePage.hasSaveDisplayed(testData.getExpectedResult()[13]),
				"Save is not Displayed successfully");

		// Validate Audit button
		//assertTrue(isgCasePage.hasAuditDisplayed(testData.getExpectedResult()[14]),
			//	"Audit is not Displayed successfully");

		// Enter iSG Customer Info details
		isgCasePage = functionalMethods.isgEnterCustomerDetails(isgCasePage, testData.getTestdata()[4],
				testData.getTestdata()[5], testData.getTestdata()[6], testData.getTestdata()[7],
				testData.getTestdata()[8], testData.getTestdata()[9], testData.getTestdata()[10]);

		// Validate owned status.
		assertTrue(isgCasePage.isStatusOwned(), "Status owned is not displayed successfully");

	}

	@Test(dataProvider = GlobalDataProvider.TEST_DATA_PROVIDER, dataProviderClass = GlobalDataProvider.class)
	public static void test_TC6543_ISGCaseCoding(InputEnvironmentDetails inputEnvironmentDetails,
			InputTestDetails testData) throws InterruptedException {
		SiteMinderLoginPage siteMinderLoginPage;
		PegaLoginPage pegaLoginPage;
		ISGCaseCreation isgCaseCreation;
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
		isgCaseCreation = navigationClass.isgHomePageLink();

		// Verify landing of HomePage
		// assertTrue(casecodingPage.homePageDisplayed(), "Navigation to homepage
		// displayed successfully");

		// click on isg case creation
		isgCaseCreation = functionalMethods.clickonISGCase(isgCaseCreation);

		// ISGPageDisplayed
		assertTrue(isgCaseCreation.hasISGPageDisplayed(), "Navigate to gsc page displayed successfully");

		// Assertion for Accept_Offer
		assertTrue(isgCaseCreation.hasAcceptOffer(testData.getTestdata()[4]), "Accept Offer is not displayed");

		// Assertion for Activate
		assertTrue(isgCaseCreation.hasActivate(testData.getTestdata()[5]), "Activate is not displayed");

		// Assertion for NewHardware
		assertTrue(isgCaseCreation.hasDisplayedAddNewHardware(testData.getTestdata()[6]),
				"Add New Hardware is not displayed");

		// Assertion for ComarIssue
		assertTrue(isgCaseCreation.hasDisplayedComarIssue(testData.getTestdata()[7]), "Comar Issue is not displayed");

		// Assertion for Deactivate.
		assertTrue(isgCaseCreation.hasDisplayedDeactivate(testData.getTestdata()[8]), "Deactivate is not displayed");

		// Assertion for Decline
		assertTrue(isgCaseCreation.hasDisplayedDecline(testData.getTestdata()[9]), "Decline is not displayed");

		// Assertion for Decomission
		assertTrue(isgCaseCreation.hasDisplayedDecomission(testData.getTestdata()[10]), "Decomission is not displayed");

		// Assertion for Demo
		assertTrue(isgCaseCreation.hasDisplayedDemo(testData.getTestdata()[11]), "Demo is not displayed");

		// Assertion for Marketing
		assertTrue(isgCaseCreation.hasDisplayedMarketing(testData.getTestdata()[12]),
				"Marketing mirror is not displayed");

		// Assertion for Normal_Transfer
		assertTrue(isgCaseCreation.hasDisplayedNormal_Transfer(testData.getTestdata()[13]),
				"Normal Transfer is not displayed");

		// Assertion for Preview
		assertTrue(isgCaseCreation.hasDisplayedPreview(testData.getTestdata()[14]), "Preview offer is not displayed");

		// Assertion for Publish
		assertTrue(isgCaseCreation.hasDisplayedPublish(testData.getTestdata()[15]), "Publish offer is not displayed");

		// Assertion for Reactivate
		assertTrue(isgCaseCreation.hasDisplayedReactivate(testData.getTestdata()[16]), "Reactivate is not displayed");

		// Assertion for Reassign
		assertTrue(isgCaseCreation.hasDisplayedReassign(testData.getTestdata()[17]), "Reassign is not displayed");

		// Assertion for Refund_Request
		assertTrue(isgCaseCreation.hasDisplayedRefund_Request(testData.getTestdata()[18]),
				"Refund Request is not displayed");

		// Assertion for Remove_offer
		assertTrue(isgCaseCreation.hasDisplayedRemove_Offer(testData.getTestdata()[19]),
				"Remove offer is not displayed");

		// Assertion for Renew
		assertTrue(isgCaseCreation.hasDisplayedRenew(testData.getTestdata()[20]), "Renew is not displayed");

		// Assertion for Sync
		assertTrue(isgCaseCreation.hasDisplayedSync(testData.getTestdata()[21]), "Sync is not displayed");

		// Assertion for Waranty_transfer
		assertTrue(isgCaseCreation.hasDisplayedWarantyTransfer(testData.getTestdata()[22]),
				"Waranty transfer is not displayed");

	}

}
