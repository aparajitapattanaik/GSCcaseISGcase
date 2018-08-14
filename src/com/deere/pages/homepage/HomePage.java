package com.deere.pages.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.global.ExtentReportManager;
import com.deere.greenfleet.GreenFleetCreationPage;
import com.deere.isgpage.ISGCaseCreationHomePage;
import com.deere.isgpage.ISGCasePage;
import com.deere.isgpage.ISGRecommendedSolutionsSectionPage;
import com.deere.pages.SiteMinderLoginPage;
import com.deere.pages.solutionsearchpage.SolutionSearchHomePage;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage {
	
	@FindBy(xpath="//span[@id='TABSPAN']/span/label[text()='Home']")
	private WebElement homeBtn;
	
	@FindBy(xpath="//div[@node_name='TSSAgentHome']")
	private WebElement homePage;
	
	@FindBy(xpath="//iframe[@id='PegaGadget0Ifr']")
	private WebElement iframePegaGadget;
	
	@FindBy(xpath="//button[@class='JD_Home pzhc pzbutton'][contains(@data-click,'Deere-FW-CCMSFW-Work-Parts')]")
	private WebElement createDPACcaseBtn;
	
	@FindBy(xpath = "//label[text()='My Cases']")
	private WebElement myCasesLink;
	
	@FindBy(xpath = "//button[text()='Create DMAC Case']")
	private WebElement createDMACcaseBtn;
	
	@FindBy(xpath="//button/span[text()='Create DMAC Case']")
	private WebElement createDMACcaseBtnDA;
	
	@FindBy(xpath = "//label[text() = 'My Organizati...']")
	private WebElement myOrganizationsCasesLink;

	@FindBy(xpath="//a[@class='JD_Header_Link'][@title='Open Menu']")
	private WebElement openMenuDropDown;
	
	@FindBy(xpath="//ul[contains(@id,'pyNavigation')]//li[3]//span[text()='Log off']")
	private WebElement logOffBtn;
	
	@FindBy(xpath="//div[@id='RULE_KEY']//button[contains(@data-click,'Deere-FW-CCMSFW-Work-Parts')]")
	private WebElement createDPACCaseBtn;
	
	
	
	@FindBy(xpath="//span[@id='modaldialog_hd_title']")
	private WebElement submitDPACCaseWindow;
	
	@FindBy(xpath="//div[@id='RULE_KEY']//button[contains(@data-click,'Deere-FW-CCMSFW-Work-Service')]")
	private WebElement createDTACCase;
	
	@FindBy(xpath="//span[@id='modaldialog_hd_title'][contains(text(),'Case creation prompt')]")
	private WebElement caseCreationPromptDTAC;
	
	@FindBy(xpath="//button[@class='pzhc'][contains(@data-click,'Deere-CCMS-Case-CM-Work-Service')]")
	private WebElement okBtnCaseCreationPrompt;
	
	@FindBy(xpath="//table[@id='RULE_KEY']//span/label[text()='Solution Search']")
	private WebElement solutionSearchTab;
	
	@FindBy(xpath="//button[@data-test-id='20180201164005073171878']")
	private WebElement isgBtn;
	
	@FindBy(xpath = "//button[@data-test-id='20180201164005073171878']")
	private WebElement isgCaseCreationBtn;
	
	@FindBy(xpath="//button[@class='JD_Home pzhc pzbutton'][contains(@data-click,'Deere-CCMS-Case-CM-Work-ISG')]")
	private WebElement CreateISGCaseTab;
	
	@FindBy(xpath="//button[@class='JD_Home pzhc pzbutton'][contains(@data-click,'Deere-CCMS-Case-CM-Work-ISG')]")
	private WebElement createISGCaseTab;
	
	@FindBy(xpath = "//button[@data-test-id=\"201710051152570490264282\"][contains(text(),'Solution Search')]")
	private WebElement solutionSearchButton;
	
	@FindBy(xpath = "//button[@data-test-id='201710051152570490264282'][contains(text(),'Workgroup Queue')]")
	private WebElement workgroupQueue;
	
	@FindBy(xpath = "//button[@data-test-id='201710051152570490264282'][contains(text(),'FAQ/Help')]")
	private WebElement faqHelp;

	@FindBy(xpath = "//button[@data-test-id='201710051152570490264282'][contains(text(),'Create DTAC Case')]")
	private WebElement dtacTab;
	
	@FindBy(xpath = "//button[@data-test-id='20180201163908004467353'][contains(text(),'Create GSC Case')]")
	private WebElement gscTab;
	
	@FindBy(xpath = "//button[@data-test-id=\"201804021539280262224741\"][contains(text(),'Create GreenFleet Case')]")
	private WebElement greenFleetCase;
	
	@FindBy(xpath = "(//label[contains(text(),'Home')])[1]")
	private WebElement homePageTab;
	

	@FindBy(xpath = "//button[@data-test-id=\"201710051152570490264282\"][contains(text(),'My Cases')]")
	private WebElement myCases;
	
	@FindBy(xpath = "//button[@data-test-id='201710051152570490264282'][contains(text(),'Case Search')]")
	private WebElement caseSearch;
	
	@FindBy(xpath = "//button[@data-test-id='201804021539280262224741']")
	private WebElement createGreenfleetCase;

	
	protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public ISGRecommendedSolutionsSectionPage clickCreateISGCaseBtn() {
		CommonFunctions.waitForElement(driver, isgCaseCreationBtn).click();
		return new ISGRecommendedSolutionsSectionPage(driver);
	}
	
	public ISGCasePage clickCreateISGCaseHomeLink() {
		CommonFunctions.waitForElement(driver,createISGCaseTab).click();
		return new ISGCasePage(driver);
	}
	
	public boolean hasHomePageDisplayed() {
		return CommonFunctions.isElementExist(driver, homePage);
	}

	public boolean isHomePageDisplayed() {
		return CommonFunctions.isElementExist(driver, createDMACcaseBtn);
	}
	
	public boolean isHomePageDisplayedISG() {
		return CommonFunctions.isElementExist(driver, CreateISGCaseTab);
	}
	
	public boolean isHomePageDisplayedDA() {
		return CommonFunctions.isElementExist(driver, createDMACcaseBtnDA);
	}
	
	public synchronized SiteMinderLoginPage signOut(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
			CommonFunctions.waitForElement(driver, openMenuDropDown).click();
			CommonFunctions.waitForElement(driver, logOffBtn).click();
			ExtentReportManager.getLogger().log(LogStatus.PASS, "Logging Off from Application");
		}
		catch(Exception e) {
			throw new RuntimeException(e.getMessage());			
		}
		return new SiteMinderLoginPage(driver);
	}
	
	public boolean hasCaseCreatedPromptDTACDisplayed() {
		return CommonFunctions.isElementExist(driver, caseCreationPromptDTAC);
	}

	public HomePage clickCreateDTACCaseBtn() {
		CommonFunctions.waitForElement(driver, createDTACCase).click();
		return new HomePage(driver);
	}
	
	public ISGCaseCreationHomePage clickISgBtn() {
        CommonFunctions.waitForElement(driver, isgBtn).click();
			
			return new ISGCaseCreationHomePage(driver);
		}
	
	public SolutionSearchHomePage clickSolutionSearchTab() {
		CommonFunctions.waitForElement(driver, solutionSearchTab).click();
		return new SolutionSearchHomePage(driver);
	}
	

	public boolean hasSolutionSearchDisplayed() {
		return CommonFunctions.isElementExist(driver, solutionSearchButton);
	}

	public boolean hasWorkgroupDisplayed() {
		try {

			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return CommonFunctions.isElementExist(driver, workgroupQueue);
	}
	
	public GreenFleetCreationPage clickonGreenFleetCase() {
		CommonFunctions.waitForElement(driver, createGreenfleetCase).click();
		return new GreenFleetCreationPage(driver);
	}
	
	public boolean isHomePageDisplayedISG(String home) {
		return CommonFunctions.isElementExist(driver, createISGCaseTab);
	}

	public boolean hasFAQHelpDisplayed() {
		return CommonFunctions.isElementExist(driver, faqHelp);
	}

	public boolean hasDMACDisplayed() {
		return CommonFunctions.isElementExist(driver, createDMACcaseBtn);
	}

	public boolean hasDPACisplayed() {
		return CommonFunctions.isElementExist(driver, createDPACCaseBtn);
	}

	public boolean hasDTACisplayed() {
		return CommonFunctions.isElementExist(driver, dtacTab);
	}

	public boolean hasGSCCaseDisplayed() {
		return CommonFunctions.isElementExist(driver, gscTab);
	}

	public boolean hasISGCaseDisplayed() {
		return CommonFunctions.isElementExist(driver, createISGCaseTab);
	}

	public boolean hasGreenfleetCaseDisplayed() {
		return CommonFunctions.isElementExist(driver, greenFleetCase);
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
	

	public boolean hasMyCasesDisplayed() {
		return CommonFunctions.isElementExist(driver, myCases);
	}

	public boolean hasCaseSearchDisplayed() {
		return CommonFunctions.isElementExist(driver, caseSearch);
	
	}	
	}
	