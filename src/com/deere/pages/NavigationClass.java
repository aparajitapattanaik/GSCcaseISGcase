package com.deere.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.greenfleet.GreenFleetCreationPage;
import com.deere.gscpage.CaseCoding;
import com.deere.gscpage.GSCCustomerSearch;
import com.deere.gscpage.GSCRoutingFilterPage;
import com.deere.gscpage.GSCRoutingPage;
import com.deere.isgpage.ISGCaseCreationHomePage;
import com.deere.isgpage.ISGCaseSearchPage;
import com.deere.isgpage.ISGLinkSolutionPage;
import com.deere.isgpage.ISGRecommendedSolutionsSectionPage;
import com.deere.pages.homepage.HomePage;
import com.deere.pages.reports.ReportsPage;
import com.deere.pages.solutionsearchpage.GSCCaseCreationPage;
import com.deere.pages.solutionsearchpage.ISGCaseCreation;
import com.deere.pages.solutionsearchpage.SolutionSearchHomePage;

public class NavigationClass {

	@FindBy(xpath = "//span//label[text()='Home']")
	private WebElement homeLink;

	@FindBy(xpath = "//a[@class='JD_Header_Secondary']")
	private WebElement header;

	@FindBy(xpath = "//table[@id='RULE_KEY']//label[text()='Home']")
	private WebElement homeTab;

	@FindBy(xpath = "//button[text()='Case Search']")
	private WebElement caseSearchBtn;

	@FindBy(xpath = "//iframe[contains(@src,'ViewOnlyUserHome')]")
	private WebElement pegaGadgetIframe;

	@FindBy(xpath = "//iframe[contains(@src,'TCSMWorkGroupArea')]")
	private WebElement pegaGadgetFrame;

	@FindBy(xpath = "//div[@role='menuitem']//h3[text()='My Territory']")
	private WebElement myTerritoryLink;

	@FindBy(xpath = "//li[contains(@title,'Solution Search')]")
	private WebElement solutionSearchTab;

	@FindBy(xpath = "//label[text()='My Territory']")
	private WebElement myTerritoryMainLink;

	@FindBy(xpath = "(//label[contains(text(),'Home')])[1]")
	private WebElement homePageTab;

	@FindBy(xpath = "//label[contains(text(),'Reports')]")
	private WebElement reportsLink;

	@FindBy(xpath = "//li[@aria-label='Case Search']")
	private WebElement caseSearchTab;

	protected WebDriver driver;

	public NavigationClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public ISGCaseCreationHomePage clickHomeLink() {
		CommonFunctions.waitForElement(driver, homeLink).click();
		return new ISGCaseCreationHomePage(driver);
	}

	public ISGLinkSolutionPage clickHomeButton() {
		CommonFunctions.waitForElement(driver, homeLink).click();
		return new ISGLinkSolutionPage(driver);
	}

	public GSCRoutingPage clickHomeButn() {
		CommonFunctions.waitForElement(driver, homeLink).click();
		return new GSCRoutingPage(driver);
	}

	public ISGRecommendedSolutionsSectionPage clickHomeBtn() {
		CommonFunctions.waitForElement(driver, homeLink).click();
		return new ISGRecommendedSolutionsSectionPage(driver);
	}
	
	public HomePage clickOnHomeButton() {
		CommonFunctions.waitForElement(driver, homeLink).click();
		return new HomePage(driver);
	}

	public NavigationClass switchToIframe() {
		CommonFunctions.waitAndSwitchToFrame(driver, pegaGadgetIframe);
		return new NavigationClass(driver);
	}

	public SolutionSearchHomePage clickSolutionSearchHomeLink() {
		CommonFunctions.waitForElement(driver, solutionSearchTab).click();
		return new SolutionSearchHomePage(driver);
	}

	public boolean hasMyTerritoryPageDisplayed() {
		CommonFunctions.switchToiFrameByWebElement(driver, pegaGadgetFrame);
		return CommonFunctions.isElementExist(driver, myTerritoryLink);
	}

	public boolean isLandingPageDisplayed() {
		return CommonFunctions.isElementExist(driver, header);
	}

	public GSCCustomerSearch clickHomePageLink() {
		CommonFunctions.waitForElement(driver, homePageTab).click();
		return new GSCCustomerSearch(driver);

	}
	
	public CaseCoding caseCodingclickHomePageLink() {
		CommonFunctions.waitForElement(driver, homePageTab).click();
		return new CaseCoding(driver);

	}
	


	public GSCRoutingFilterPage routingFilterHomePageLink() {
		CommonFunctions.waitForElement(driver, homePageTab).click();
		return new GSCRoutingFilterPage(driver);
	}
	
	public HomePage clickHomePageLink1() {
		CommonFunctions.waitForElement(driver, homePageTab).click();
		return new HomePage(driver);

	}

	public ReportsPage clickReportsLink() {
		CommonFunctions.waitForElement(driver, reportsLink).click();
		return new ReportsPage(driver);
	}

	public ISGCaseSearchPage clickCaseSearchHomeLink() {
		CommonFunctions.waitForElement(driver, caseSearchTab).click();
		return new ISGCaseSearchPage(driver);
	}

	public GSCCustomerSearch clickHomePageButton() {
		CommonFunctions.waitForElement(driver, homePageTab).click();
		return new GSCCustomerSearch(driver);

	}

	public ISGCaseCreation isgHomePageLink() {
		CommonFunctions.waitForElement(driver, homePageTab).click();
		return new ISGCaseCreation(driver);
	}
	public GreenFleetCreationPage clickHome() {
		CommonFunctions.waitForElement(driver, homeTab).click();
		return new GreenFleetCreationPage(driver);
	}
	
	public GSCCaseCreationPage clickHomePagLink() {
		CommonFunctions.waitForElement(driver, homeTab).click();
		return new GSCCaseCreationPage(driver);
	}	
}
