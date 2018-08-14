package com.deere.gscpage;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.global.GlobalThings;

public class GSCRoutingFilterSearchPage extends GlobalThings{

	@FindBy(xpath = "//table[@id='RULE_KEY'][@aria-label='Workgroup Queue']")
	private WebElement workGroupQueue;

	@FindBy(xpath = "(//a[@data-test-id='201708231545550244393669'])[1]")
	private WebElement filters;

	@FindBy(xpath = "(//span[@data-test-id='201711161622040015382477'])[1]")
	private WebElement caseSelect;

	@FindBy(xpath = "//span[contains(text(),'Workgroups')]")
	private WebElement workGroup;

	@FindBy(xpath = "//label[@data-test-id='2018021510105906303661-Label']")
	private WebElement workBasketLabel;

	@FindBy(xpath = "//input[@data-test-id='2018021510105906303661'or @data-test-id='201710100918100500726859']")
	private WebElement workBasket;

	@FindBy(xpath = "//button[@data-test-id='20141008160437053510472']")
	private WebElement submit;

	@FindBy(xpath = "//span[@data-test-id='201510301349070249159288']")
	private WebElement refreshed;

	@FindBy(xpath = "//*[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement ownedStatus;

	@FindBy(xpath = "//div[@id='gridLayoutWrapper']")
	private WebElement modelAutoOptions;

	@FindBy(xpath = "(//*[@id='RULE_KEY']/tbody/tr/td[2]/span/label)[8]")
	private static WebElement gscCaseID;

	@FindBy(xpath = "//td[@data-attribute-name='Case ID']//div[@class='oflowDivM ']/span")
	private List<WebElement> caseIdList;

	@FindBy(xpath = "//td[@data-attribute-name='Status']//div[@class='oflowDivM ']/span")
	private List<WebElement> statusList;

	@FindBy(xpath = "//div[@node_name='TSSWGQueueCustomQueue']")
	private WebElement caseTable;

	@FindBy(xpath = "//iframe[@name='PegaGadget0Ifr']")
	private WebElement iframe;

	@FindBy(xpath = "//a[text()='Clear Filters']")
	private WebElement clearFiltersLink;

	@FindBy(xpath = "//input[@data-test-id='20170923174822053693855']")
	private WebElement caseIdInput;

	@FindBy(xpath = "//a[@title='Advanced Filters']")
	private WebElement filterLink;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//span[contains(text(),'Filter Preferences')]")
	private WebElement filterPreferences;

	protected WebDriver driver;

	public GSCRoutingFilterSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Click on WorkgroupQueue
	public GSCRoutingFilterSearchPage clickonWorkGroupQueue() {
		CommonFunctions.waitForElement(driver, workGroupQueue).click();
		return new GSCRoutingFilterSearchPage(driver);
	}

	// verifying work Queue lable
	public boolean hasFiltersDisplayed() {
		return CommonFunctions.isElementExist(driver, filters);
	}

	// submit button
	public GSCRoutingFilterSearchPage submitBtn() throws InterruptedException {
		CommonFunctions.waitForElement(driver, submit).click();

		return new GSCRoutingFilterSearchPage(driver);

	}

	public GSCRoutingFilterSearchPage clickFilters() {
		CommonFunctions.waitForElement(driver, filters).click();
		return new GSCRoutingFilterSearchPage(driver);
	}

	public boolean hasWorkGroupsDisplayed() {
		return CommonFunctions.isElementExist(driver, workGroup);
	}

	public boolean hasWorkBasketDisplayed() {
		return CommonFunctions.isElementExist(driver, workBasketLabel);
	}

	// workBasket
	public GSCRoutingFilterSearchPage selectWorkBasket() throws InterruptedException {
		CommonFunctions.selectFromDropdownByIndex(driver, 10, workBasket);
		CommonFunctions.selectFromDropdownByIndex(driver, 10, workBasket);
		return new GSCRoutingFilterSearchPage(driver);

	}

	// Filter workBasket
	public GSCRoutingFilterSearchPage selectfilterWorkBasket(String workbas) throws InterruptedException {
		CommonFunctions.waitForElement(driver, workBasket).sendKeys(workbas);
		workBasket.sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
			if (modelAutoOptions.getText().contains(workbas))
				modelAutoOptions.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new GSCRoutingFilterSearchPage(driver);

	}

	public boolean hasWorkGroupRefreshedDisplayed() {
		return CommonFunctions.isElementExist(driver, refreshed);
	}

	public boolean hasWorkGroupContSameWGNameDisplayed() {
		return CommonFunctions.isElementExist(driver, refreshed);
	}

	private static HashMap<Long, String> gscCaseIdTSS = new HashMap<Long, String>();

	public static String getGscCaseId() {
		return gscCaseIdTSS.get(Thread.currentThread().getId());
	}
	
	
	
	public GSCRoutingFilterSearchPage storeCaseIdIntoStringVar() {
		caseID = GSCRoutingFilterSearchPage.getGscCaseId();
		System.out.println(caseID);
		return new GSCRoutingFilterSearchPage(driver);
	}


	public GSCRoutingFilterSearchPage setGscCaseID() {
		gscCaseIdTSS.put(Thread.currentThread().getId(),
				CommonFunctions.waitForElement(driver, gscCaseID).getText().replace("(", "").replace(")", ""));

		return new GSCRoutingFilterSearchPage(driver);
	}

	//public static String caseId;

	public GSCRoutingFilterSearchPage verifyCaseIdExistInTable() {
		int count = 0;
		CommonFunctions.SwitchToDefaultFrame(driver);
		// CommonFunctions.waitAndSwitchToFrame(driver, iframe);
		CommonFunctions.waitForElement(driver, caseTable);
		CommonFunctions.retryingFindElement(driver, caseTable);
		CommonFunctions.waitForElementsToReappear(driver, caseIdList);
		for (int i = 0; i < caseIdList.size(); i++) {
			if (caseIdList.get(i).getText().equalsIgnoreCase(caseID)) {
				caseIdList.get(i).click();
				CommonFunctions.waitForAlert(driver);
				count++;
				break;
			}
		}
		if (count == 0) {
			clickFilterLink();
			CommonFunctions.waitForElement(driver, clearFiltersLink).click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			enterCaseIds(caseID);
			CommonFunctions.waitForElementClickable(driver, caseTable);
			CommonFunctions.retryingFindElement(driver, caseTable);
			for (int i = 0; i < caseIdList.size(); i++) {
				if (caseIdList.get(i).getText().equalsIgnoreCase(caseID)) {
					caseIdList.get(i).click();
					CommonFunctions.waitForAlert(driver);
					break;
				}
			}
		}
		return new GSCRoutingFilterSearchPage(driver);
	}

	private GSCRoutingFilterSearchPage enterCaseIds(String gscCaseId) {
		CommonFunctions.waitForElement(driver, caseIdInput).sendKeys(gscCaseId);
		clickSubmitBtn();
		return new GSCRoutingFilterSearchPage(driver);
	}

	public GSCRoutingFilterSearchPage clickSubmitBtn() {
		CommonFunctions.waitForElement(driver, submitBtn).click();
		CommonFunctions.waitForElementToDisappearLess(driver, filterPreferences);
		return new GSCRoutingFilterSearchPage(driver);
	}

	public boolean clickFilterLink() {
		CommonFunctions.waitForElement(driver, filterLink).click();
		return CommonFunctions.isElementExist(driver, filterPreferences);
	}

}
