package com.deere.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.isgpage.ISGCasePage;
import com.deere.isgpage.ISGCaseSearchPage;
import com.deere.pages.homepage.HomePage;
import com.deere.pages.solutionsearchpage.SolutionSearchHomePage;

public class ISGNavigationClass {
	
	
	@FindBy(xpath="//span//label[text()='Case Search Home']")
	private WebElement caseSearchHomeLink;
	
	@FindBy(xpath="//a[@class='JD_Header_Secondary']")
	private WebElement header;
	
	@FindBy(xpath="//table[@id='RULE_KEY']//label[text()='Home']")
	private WebElement homeTab;
	
	@FindBy(xpath="//button[text()='Case Search']")
	private WebElement caseSearchBtn;
	
	@FindBy(xpath="//iframe[contains(@src,'ViewOnlyUserHome')]")
	private WebElement pegaGadgetIframe;

	@FindBy(xpath="//iframe[contains(@src,'TCSMWorkGroupArea')]")
	private WebElement pegaGadgetframe;
	
	@FindBy(xpath="//div[@role='menuitem']//h3[text()='My Territory']")
	private WebElement myTerritoryLink;

	@FindBy(xpath="//li[contains(@title,'Solution Search')]")
	private WebElement solutionSearchtab;
	

	@FindBy(xpath="//label[text()='Workgroup Queue']")
	private WebElement workgroupQueueLink;

	
	@FindBy(xpath="//label[text()='My Territory']")
	private WebElement myTerritoryMainLink;
	
	@FindBy(xpath="//button[@class='JD_Home pzhc pzbutton'][contains(@data-click,'Deere-CCMS-Case-CM-Work-ISG')]")
	private WebElement createISGCaseTab;
	
	@FindBy(xpath="//li[@aria-label='Case Search']")
	private WebElement CaseSearchtab;
	 
	
	
	protected WebDriver driver;
	
	public  ISGNavigationClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	public NavigationClass switchToIframe() {
		CommonFunctions.waitAndSwitchToFrame(driver, pegaGadgetIframe);
		return new NavigationClass(driver);
	}

	public SolutionSearchHomePage clickSolutionSearchHomeLink() {
		CommonFunctions.waitForElement(driver, solutionSearchtab).click();
		return new SolutionSearchHomePage(driver);
	}
	
	public HomePage clickHomeLink() {
		CommonFunctions.waitForElement(driver, homeTab).click();
		return new HomePage(driver);
	}
	
	public boolean hasMyTerritoryPageDisplayed() {
		CommonFunctions.switchToiFrameByWebElement(driver, pegaGadgetframe);
		return CommonFunctions.isElementExist(driver, myTerritoryLink);
	}
	
	public boolean isLandingPageDisplayed() {
		return CommonFunctions.isElementExist(driver, header);
	}
	
	public ISGCasePage clickCreateISGCaseHomeLink() {
		CommonFunctions.waitForElement(driver,createISGCaseTab).click();
		return new ISGCasePage(driver);
	}
	
	public ISGCaseSearchPage clickCaseSearchHomeLink() {
		CommonFunctions.waitForElement(driver, CaseSearchtab).click();
		return new ISGCaseSearchPage(driver);
	} 

}
