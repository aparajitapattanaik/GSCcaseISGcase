package com.deere.gscpage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deere.global.CommonFunctions;
import com.deere.global.GlobalThings;
import com.deere.pages.solutionsearchpage.GSCCaseCreationPage;

public class GSCRoutingPage extends GlobalThings{

	@FindBy(name = "PegaGadget0Ifr")
	private WebElement iframeHomepage;

	@FindBy(xpath = "//button[@data-test-id='20180201163908004467353']")
	private WebElement createGSCCase;

	@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
	private WebElement customerSearchHeader;

	@FindBy(xpath = "//*[@id='firstName']")
	private WebElement customerFirstName;

	@FindBy(xpath = "//*[@id='lastName']")
	private WebElement customerLastName;

	@FindBy(xpath = "//select[@id='country']")
	private WebElement customerCountry;

	@FindBy(xpath = "//input[@class='button btn btn-primary']")
	private WebElement searchCustomers;

	@FindBy(xpath = "//table[@id='results']/tbody/tr[2]/td[2]/a")
	private WebElement selectSearchDetails;

	@FindBy(xpath = "//iframe[contains(@src,'SolutionSearchHome')]")
	private WebElement iframePegaGadget;

	@FindBy(xpath = "(//button[@data-test-id='20180201162439008710139'])[1]")
	private WebElement closeBtn;

	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[1]")
	private WebElement gscAddCustInfoButton;

	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[2]")
	private WebElement addProdBtn;

	@FindBy(xpath = "//input[@data-test-id='2015100603215503417556']")
	private WebElement productInfoModelDD;

	@FindBy(xpath = "//table[@id='bodyTbl_right']/tbody//div[@class='oflowDiv']//span[@class='match-highlight']")
	private WebElement modelAutoOptions;

	@FindBy(xpath = "//table[@id='gridLayoutTable']/tbody//div[@class='oflowDiv']//span[@class='match-highlight']")
	private WebElement autoOptions;

	@FindBy(xpath = "//table[@id='EXPAND-OUTERFRAME']/tbody//div[@class='oflowDiv']//span[@class='match-highlight']")
	private WebElement operaterAutoOptions;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement submitBtn;

	@FindBy(xpath = "//select[@data-test-id='201802060658510010138182']")
	private WebElement workBasket;

	@FindBy(xpath = "//table[@id='RULE_KEY'][@aria-label='Workgroup Queue']")
	private WebElement WorkGroupQueue;

	@FindBy(xpath = "//select[@data-test-id='201802060658510010138182']")
	private WebElement workBasketTrafer;

	@FindBy(xpath = "//iframe[@id='CSC_Section']")
	private WebElement frame;

	@FindBy(xpath = "//input[@data-test-id='2016050211281203883185']")
	private WebElement funCode;

	@FindBy(xpath = "//input[@data-test-id='201605021128120388258']")
	private WebElement funArea;

	@FindBy(xpath = "//*[@id='CasePriority']")
	private WebElement priorityDD;

	@FindBy(xpath = "//*[@id='Origin']")
	private WebElement originDD;

	@FindBy(xpath = "//*[@id='RULE_KEY']/div/div/div/div/div/div/input")
	private WebElement summary;

	@FindBy(xpath = "//*[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement ownedStatus;

	@FindBy(xpath = "//*[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement resolvedCompleted;

	@FindBy(xpath = "(//button[@data-test-id='201802011400580656111285'])[1]")
	private WebElement clickonAcceptButton;

	@FindBy(xpath = "//select[@data-test-id='201802060658510010138182']")
	private WebElement workBaskettrans;

	@FindBy(xpath = "//select[@id='WorkbasketName']")
	private WebElement WorkBasket;

	@FindBy(xpath = "//select[@id='GSCSubWorkgroup']")
	private WebElement WorkSubGroup;

	@FindBy(xpath = "//h2[contains(text(),'Audit')]")
	private WebElement auditTrails;

	@FindBy(xpath = "(//button[@data-test-id='201802081002310780562'])[1]")
	private WebElement canBtn;

	@FindBy(xpath = "//input[@data-test-id='201605271221250444446791']")
	private WebElement workBasketFiled;

	@FindBy(xpath = "//*[@id='$PpyWorkPage$pWBNameError']")
	private WebElement mesage;

	@FindBy(xpath = "//button[@data-test-id=\"20180201163908004467353\"]")
	private WebElement gscCase;

	@FindBy(xpath = "(//button[@data-test-id='20180206104022047318388'])[1]")
	private WebElement transfer_Button;

	@FindBy(xpath = "(//button[@data-test-id='2018051414200104299296'])[2]")
	private WebElement withdrawBtn;

	@FindBy(xpath = "(//button[@data-test-id='2018051414164108233405'])[1]")
	private WebElement withdrawSubmit;

	@FindBy(xpath = "//*[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
	private WebElement newStatus;

	@FindBy(xpath = "(//div[@class='layout layout-noheader layout-noheader-jd_containers_outer_shadow'])[2]")
	private WebElement addCustInfoSct;

	@FindBy(xpath = "(//div[@class='layout layout-noheader layout-noheader-jd_containers_outer_shadow'])[3]")
	private WebElement addDealInfoSct;

	@FindBy(xpath = "(//div[@class='layout layout-noheader layout-noheader-jd_containers_outer_shadow'])[4]")
	private WebElement addProductInfoSct;

	@FindBy(xpath = "(//*[contains(text(),'Case Coding')])[6]")
	private WebElement caseCodingSct;

	@FindBy(xpath = "(//*[contains(text(),'Case Information')])[5]")
	private WebElement caseInformSct;

	@FindBy(xpath = "(//div[@class='layout layout-noheader layout-noheader-jd_containers_outer_shadow'])[8]")
	private WebElement relatedCaseSct;

	@FindBy(xpath = "(//*[contains(text(),'Problem Details')])[5]")
	private WebElement problemDetailsSct;

	@FindBy(xpath = "//*[contains(text(),'Add Files')]")
	private WebElement addFilesSct;

	@FindBy(xpath = "(//button[@data-test-id='201802011400580656111285'])[1]")
	private WebElement accpBtn;

	@FindBy(xpath = "(//button[@data-test-id='20180201140326025511943'])[1]")
	private WebElement accepClodeBtn;

	@FindBy(xpath = "(//button[@data-test-id='20180201140326025613196'])[1]")
	private WebElement saveBtn;

	@FindBy(xpath = "(//button[@data-test-id='20180531073524008831831'])[1]")
	private WebElement withDrawBtn;

	@FindBy(xpath = "//button[@data-test-id='20141008160437053510472']")
	private WebElement subBtn;

	@FindBy(xpath = "(//button[@data-test-id='20180419123512080115230'])[1]")
	private WebElement transfer;

	@FindBy(xpath = "//input[@data-test-id='20170915163723049610155']")
	private WebElement operatorTransfer;

	@FindBy(xpath = "//input[@data-test-id='2015031809055206723480']")
	private WebElement workBasketTransfer;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037511488']")
	private WebElement cancleButton;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement submitButton;

	@FindBy(xpath = "//div[@data-test-id='2017092112440000351153']")
	private WebElement errorMessage;

	@FindBy(xpath = "//*[@id='$PreAssignPage$ppyReassignWorkGroupNameError']/span")
	private WebElement validMessage;

	@FindBy(xpath = "//div[@class='pzbtn-mid'][contains(text(),'Action')]")
	private WebElement actions;

	@FindBy(xpath = "//*[@id='pyNavigation1528360059917' or @id='pyNavigation1528360059959']")
	private WebElement actionsFrame;

	@FindBy(xpath = "//*[@id='pyNavigation1528360059959']/li[3]")
	private WebElement trasfCasetoInvidual;

	@FindBy(xpath = "//*[@id='pyNavigation1528360059959']/li[2]")
	private WebElement trasfCasetoWB;
	
	@FindBy(xpath = "//*[@id='pyNavigation1528360059959']/li[3]")
	private WebElement trasfCasetoIndi;

	@FindBy(xpath = "//*[@id='pyNavigation1528360059917' or @id='pyNavigation1528360059959']/li[2]")
	private WebElement workCase;

	@FindBy(xpath = "//input[@data-test-id='20170915163723049610155']")
	private WebElement operater;

	@FindBy(xpath = " //input[@data-test-id='2015031809055206723480' or @data-test-id='201605271221250444446791'] ")
	private WebElement workbasketTranf;

	@FindBy(xpath = "//div[@id='modaldialog_hd']")
	private WebElement trandHeader;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement submit;

	@FindBy(xpath = "//input[@data-test-id='201710100918100500726859']")
	private WebElement workBasketAutoComp;

	@FindBy(xpath = "//table[@data-test-id='20171002083407021117-layout']")
	private WebElement caseTable;

	@FindBy(xpath = "//td[@data-attribute-name='Case ID']//div[@class='oflowDivM ']/span")
	private List<WebElement> caseIdList;

	@FindBy(xpath = "//input[@class='leftJustifyStyle']")
	private WebElement caseIdInput;

	@FindBy(xpath = "//a[text()='Clear Filters']")
	private WebElement clearFiltersLink;
	
	
	@FindBy(xpath = "//*[@id='state']")
	private WebElement province;

	protected WebDriver driver;

	public GSCRoutingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public GSCRoutingPage clickonGSCCase() {

		CommonFunctions.waitForElement(driver, createGSCCase).click();
		CommonFunctions.waitAndSwitchToFrame(driver, iframeHomepage);
		return new GSCRoutingPage(driver);
	}

	public GSCRoutingPage clickAddCustomeInfo(String lastNme, String fisName, String country)
			throws InterruptedException {

		CommonFunctions.waitForElement(driver, gscAddCustInfoButton).click();
		CommonFunctions.switchToiFrameByWebElement(driver, frame);
		CommonFunctions.isElementExist(driver, customerSearchHeader);
		CommonFunctions.waitForElement(driver, customerLastName).sendKeys(lastNme);
		CommonFunctions.waitForElement(driver, customerFirstName).sendKeys(fisName);
		//state(state);
		CommonFunctions.scrollSomeDown(driver);
		CommonFunctions.waitForElement(driver, searchCustomers).click();
		CommonFunctions.waitForElement(driver, selectSearchDetails).click();
		return new GSCRoutingPage(driver);

	}

	// Model DropDown value selection
	public GSCRoutingPage productInfoModel(String model) {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitAndSwitchToFrame(driver, iframeHomepage);
		CommonFunctions.scrollToWebElement(driver, addProdBtn);
		CommonFunctions.waitForElement(driver, addProdBtn).click();
		CommonFunctions.waitForElement(driver, productInfoModelDD).sendKeys(model);
		productInfoModelDD.sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
			if (modelAutoOptions.getText().contains(model))
				modelAutoOptions.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submitBtn).click();

		return new GSCRoutingPage(driver);
	}

	// FunArea DropDown value selection
	public GSCRoutingPage functionalArea(String funcArea) throws InterruptedException {
		CommonFunctions.waitForElement(driver, funArea).sendKeys(funcArea);
		funArea.sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
			if (modelAutoOptions.getText().contains(funcArea))
				modelAutoOptions.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new GSCRoutingPage(driver);
	}

	// FunCode DropDown value selection
	public GSCRoutingPage functionalCode(String functionCode) throws InterruptedException {
		CommonFunctions.waitForElement(driver, funCode).sendKeys(functionCode);
		funCode.sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
			if (modelAutoOptions.getText().contains(functionCode))
				modelAutoOptions.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new GSCRoutingPage(driver);
	}
	
	
	// State
		public GSCRoutingPage state(String stat) throws InterruptedException {
			CommonFunctions.scrollSomeDown(driver);
			CommonFunctions.selectFromDropdown(driver, stat, province);
			return new GSCRoutingPage(driver);

		}
		
		// State
				public GSCRoutingPage country(String country) throws InterruptedException {
					CommonFunctions.scrollSomeDown(driver);
					CommonFunctions.selectFromDropdown(driver, country, customerCountry);
					return new GSCRoutingPage(driver);

				}

	// Priority
	public GSCRoutingPage priority(String priority) throws InterruptedException {
		CommonFunctions.scrollSomeDown(driver);
		CommonFunctions.selectFromDropdown(driver, priority, priorityDD);
		return new GSCRoutingPage(driver);

	}

	// Origin
	public GSCRoutingPage origin(String orig) throws InterruptedException {
		CommonFunctions.selectFromDropdown(driver, orig, originDD);
		return new GSCRoutingPage(driver);

	}

	// Summary
	public GSCRoutingPage problemDetailsSummary(String summ) throws InterruptedException {
		CommonFunctions.waitForElement(driver, summary).sendKeys(summ);

		return new GSCRoutingPage(driver);
	}

	// workBasket
	public GSCRoutingPage selectWorkBasket() throws InterruptedException {
		CommonFunctions.selectFromDropdownByIndex(driver, 10, workBasket);
		CommonFunctions.selectFromDropdownByIndex(driver, 10, workBasket);
		return new GSCRoutingPage(driver);

	}

	// workBasket
	public GSCRoutingPage selectWorkBasketTrafCase(String workbasket) throws InterruptedException {
		CommonFunctions.selectFromDropdown(driver, workbasket, workBaskettrans);
		/*
		 * CommonFunctions.selectFromDropdownByIndex(driver, 10, workBaskettrans);
		 * CommonFunctions.selectFromDropdownByIndex(driver, 10, workBaskettrans);
		 */
		
	
		return new GSCRoutingPage(driver);

	}

	// submit btn
	public GSCRoutingPage submitBtn() throws InterruptedException {
		CommonFunctions.waitForElement(driver, subBtn).click();

		return new GSCRoutingPage(driver);

	}

	// transfer
	public GSCRoutingPage transferBtn() throws InterruptedException {
		CommonFunctions.waitForElement(driver, transfer).click();

		return new GSCRoutingPage(driver);

	}

	// Accept
	public GSCRoutingPage clickonAcceptBtn() {
		CommonFunctions.waitForElement(driver, clickonAcceptButton).click();
		return new GSCRoutingPage(driver);
	}

	// Click on WorkgroupQueue
	public GSCRoutingFilterSearchPage clickonWorkGroupQueue() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, WorkGroupQueue).click();
		return new GSCRoutingFilterSearchPage(driver);
	}

	// Owned Status
	public boolean isOwnedStatusDisplayed() {
		return CommonFunctions.isElementExist(driver, ownedStatus);
	}

	// selecting Transfer to Individual option from Actions and submit all details
	// in Transfer popup screen clic on submit
	public GSCRoutingPage clickonActionsselectVal(String oper, String work) {
		CommonFunctions.waitForElement(driver, actions).click();
		CommonFunctions.waitForElement(driver, actionsFrame);
		CommonFunctions.waitForElement(driver, trasfCasetoInvidual).click();
		CommonFunctions.waitForElement(driver, trandHeader);
		CommonFunctions.waitForElement(driver, operater).sendKeys(oper);
		CommonFunctions.waitForElement(driver, workbasketTranf).sendKeys(work);
		funCode.sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
			if (modelAutoOptions.getText().contains(work))
				modelAutoOptions.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submit).click();

		return new GSCRoutingPage(driver);

	}

	public GSCRoutingPage clickonWorkCase() {
		CommonFunctions.waitForElement(driver, actions).click();
		CommonFunctions.waitForElement(driver, actionsFrame);
		CommonFunctions.waitForElement(driver, workCase).click();

		return new GSCRoutingPage(driver);

	}

	public GSCRoutingPage clickontransferToWorkBasket() {
		CommonFunctions.waitForElement(driver, actions).click();
		CommonFunctions.waitForElement(driver, actionsFrame);
		CommonFunctions.waitForElement(driver, trasfCasetoWB).click();

		return new GSCRoutingPage(driver);

	}
	
	public GSCRoutingPage clickontransferToIndividual() {
		CommonFunctions.waitForElement(driver, actions).click();
		CommonFunctions.waitForElement(driver, actionsFrame);
		CommonFunctions.waitForElement(driver, trasfCasetoIndi).click();

		return new GSCRoutingPage(driver);

	}

	// in Transfer popup screen click on submit
	public GSCRoutingPage clickonActionsSelectWorkCase() {
		CommonFunctions.waitForElement(driver, actions).click();
		CommonFunctions.waitForElement(driver, actionsFrame);
		CommonFunctions.waitForElement(driver, trasfCasetoWB).click();

		return new GSCRoutingPage(driver);

	}

	public boolean hasNewStatusDisplayed() throws InterruptedException {
		return CommonFunctions.isElementExist(driver, newStatus);
	}

	public boolean hasOwnedStatusDisplayed() throws InterruptedException {
		return CommonFunctions.isElementExist(driver, ownedStatus);
	}

	public boolean hasWorkBasketAutoCompleteDisplayed() {
		return CommonFunctions.isElementExist(driver, workBasketAutoComp);
	}

	public boolean hasAddNewCusInfoDisplayed() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.switchToiFrameByWebElement(driver, iframeHomepage);
		return CommonFunctions.isElementExist(driver, addCustInfoSct);

	}

	public boolean hasAddContactDealershipInfoDisplayed() {
		CommonFunctions.scrollToElement(driver, addDealInfoSct);
		return CommonFunctions.isElementExist(driver, addDealInfoSct);
	}

	public boolean hasAddProductInfoDisplayed() {
		//CommonFunctions.scrollToElement(driver, addProductInfoSct);
		return CommonFunctions.isElementExist(driver, addProductInfoSct);
	}

	public boolean hasCaseCodingDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, caseCodingSct);
	}

	public boolean hasCaseInformationDisplayed() {
		CommonFunctions.scrollToElement(driver, caseInformSct);
		return CommonFunctions.isElementExist(driver, caseInformSct);
	}

	public boolean hasRelatedCaseDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, relatedCaseSct);
	}

	public boolean hasProbDetailsDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, problemDetailsSct);
	}

	public boolean hasAllFilesDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, addFilesSct);
	}

	public boolean hasActionBtnDisplayed() {
		// TODO Auto-generated method stub
		CommonFunctions.scrollToElement(driver, accpBtn);
		return CommonFunctions.isElementExist(driver, accpBtn);
	}

	public boolean hasAccpAndCloseDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, accepClodeBtn);
	}

	public boolean hasSaveBtnDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, saveBtn);
	}

	public boolean hasWithdrawBtnDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, withDrawBtn);
	}

	public boolean hasOperatorDisplayed() {
		return CommonFunctions.isElementExist(driver, operatorTransfer);
	}

	public boolean hasWorkBasketDisplayed() {
		return CommonFunctions.isElementExist(driver, workBasketTransfer);
	}

	public boolean hasCancleDisplayed() {
		return CommonFunctions.isElementExist(driver, cancleButton);
	}

	public boolean hasSubmitDisplayed() {
		return CommonFunctions.isElementExist(driver, submitButton);
	}

	public GSCRoutingPage submitBtnClick() {
		CommonFunctions.waitForElement(driver, submitButton).click();
		CommonFunctions.waitForAlert(driver);
		return new GSCRoutingPage(driver);
	}

	@FindBy(xpath = "//span[contains(text(),'TS94982')]")
	private WebElement operaterSelect;
	
	public GSCRoutingPage operatiorFiledDataInval(String oper) throws InterruptedException {
		 CommonFunctions.waitForElement(driver, operatorTransfer).clear();
		 WebElement textBoxElement =CommonFunctions.waitForElement(driver, operatorTransfer);
		textBoxElement.sendKeys(oper);
		textBoxElement.sendKeys(Keys.TAB);
		textBoxElement.sendKeys(Keys.ENTER);
		return new GSCRoutingPage(driver);
	}
	
	public GSCRoutingPage operatiorFiledDataValid(String oper) throws InterruptedException {
		WebElement textBoxElement = CommonFunctions.waitForElement(driver, operatorTransfer);
		textBoxElement.clear();
		textBoxElement.sendKeys(oper);
		textBoxElement.sendKeys(Keys.TAB);
		textBoxElement.sendKeys(Keys.ENTER);
		return new GSCRoutingPage(driver);
	}

	public GSCRoutingPage operatiorFiledData(String oper) throws InterruptedException {
		CommonFunctions.waitForElement(driver, operatorTransfer).clear();
		CommonFunctions.waitForElement(driver, operatorTransfer).sendKeys(oper);
		CommonFunctions.waitForElement(driver, operatorTransfer).sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		Thread.sleep(2000);
		// Robot robot;
		// try {
		// robot = new Robot();
		// robot.keyPress(KeyEvent.VK_KP_DOWN);
		// robot.keyRelease(KeyEvent.VK_KP_DOWN);
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		//
		// } catch (AWTException e) {
		// e.printStackTrace();
		// }

		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
			if (modelAutoOptions.getText().contains(oper))
				modelAutoOptions.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		return new GSCRoutingPage(driver);
	}

	public boolean hasUserEnteredDisplayed() {
		return CommonFunctions.isElementExist(driver, errorMessage);
	}

	public boolean hasValidationMessgDisplayed() {
		return CommonFunctions.isElementExist(driver, validMessage);
	}

	public GSCRoutingPage selectValFromWorkBasket(String workbaket) {
		CommonFunctions.waitForElement(driver, workbasketTranf).sendKeys(workbaket);
		CommonFunctions.waitForElement(driver, workbasketTranf).sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
			if (modelAutoOptions.getText().contains(workbaket))
				modelAutoOptions.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		//CommonFunctions.waitForElement(driver, canBtn).click();
		return new GSCRoutingPage(driver);

	}
	
	public GSCRoutingPage selectWorkBasket(String workbaket) {
		CommonFunctions.waitForElement(driver, workBasket).sendKeys(workbaket);
		CommonFunctions.waitForElement(driver, workBasket).sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
			if (modelAutoOptions.getText().contains(workbaket))
				modelAutoOptions.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, canBtn).click();
		return new GSCRoutingPage(driver);

	}

	@FindBy(xpath = "//span[contains(text(),'PCDSC')]")
	private WebElement workSelect;

	public GSCRoutingPage clickonActionsselectValTranWB(String oper, String wrkBask) throws InterruptedException {
		operatiorFiledData(oper);
		System.out.println("operater selected successfully");

		WebElement textBoxElement = CommonFunctions.waitForElement(driver, workbasketTranf);
		textBoxElement.sendKeys(wrkBask);

		// Thread.sleep(5000);
		// Robot robot;
		// try {
		// robot = new Robot();
		// robot.keyPress(KeyEvent.VK_KP_DOWN);
		// robot.keyRelease(KeyEvent.VK_KP_DOWN);
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		//
		// } catch (AWTException e) {
		// e.printStackTrace();
		// }
		// selectOptionWithText("PCDSC");
		workbasketTranf.sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, operaterAutoOptions);
		try {
			if (operaterAutoOptions.getText().contains(wrkBask))
				Thread.sleep(2000);
			operaterAutoOptions.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);

		System.out.println(CommonFunctions.waitForElement(driver, submitBtn).getText());
		CommonFunctions.waitForElement(driver, submitBtn).click();
		return new GSCRoutingPage(driver);

	}

	public WebDriverWait wait;

	public void selectOptionWithText(String textToSelect) {

		try {

			WebElement autoOptions = CommonFunctions.waitForElement(driver, operaterAutoOptions);

			wait.until(ExpectedConditions.visibilityOf(autoOptions));

			List<WebElement> optionsToSelect = autoOptions.findElements(By.className("match-highlight"));
			for (WebElement option : optionsToSelect) {
				if (option.getText().equals(textToSelect)) {
					System.out.println("Trying to select: " + textToSelect);
					option.click();
					break;
				}
			}

		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public GSCRoutingPage selectValFromWorkBasketClikCancle(String workbaket) {
		CommonFunctions.waitForElement(driver, workbasketTranf).sendKeys(workbaket);
		workbasketTranf.sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
			if (modelAutoOptions.getText().contains(workbaket))
				modelAutoOptions.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submit).click();
		return new GSCRoutingPage(driver);

	}

	public boolean hasCancleBtnDisplayed() {
		return CommonFunctions.isElementExist(driver, canBtn);
	}

	public boolean hasTransferBtnDisplayed() {
		return CommonFunctions.isElementExist(driver, transfer);
	}

	public boolean hasWorkBasektDisplayed() {
		return CommonFunctions.isElementExist(driver, workBasket);
	}

	public GSCRoutingPage AcceptAlert() {
		CommonFunctions.waitForAlert(driver);
		return new GSCRoutingPage(driver);
	}

	public boolean hasValidationMessageDisplayed() {
		return CommonFunctions.isElementExist(driver, mesage);
	}

	@FindBy(xpath = "//span//label[text()='My Cases']")
	private WebElement myCases;

	private static HashMap<Long, String> gscCaseIdTSS = new HashMap<Long, String>();

	public GSCRoutingPage getGscCaseId() {
		 gscCaseIdTSS.get(Thread.currentThread().getId());
		 return storeCaseId();   
		
	}
	
	GSCRoutingPage gscRoutingPage;

	public GSCRoutingPage storeCaseId() {
	return caseId = gscRoutingPage.getGscCaseId();
	
	
	}
	
	
	public GSCRoutingFilterSearchPage verifyCaseIdExistInTable(String caseId) {
		int count = 0;
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitForElement(driver, myCases).click();
		// CommonFunctions.waitAndSwitchToFrame(driver, iframe);
		CommonFunctions.waitForElement(driver, caseTable);
		CommonFunctions.retryingFindElement(driver, caseTable);
		CommonFunctions.waitForElementsToReappear(driver, caseIdList);
		for (int i = 0; i < caseIdList.size(); i++) {
			if (caseIdList.get(i).getText().equalsIgnoreCase(caseId)) {
				String Data = caseIdList.get(i).getText();
				System.out.print(Data);
				caseIdList.get(i).click();
				System.out.print("Case is exist in my cases Grid");
				CommonFunctions.waitForAlert(driver);
				count++;
				break;
			}
		}

		return new GSCRoutingFilterSearchPage(driver);
	}

	public boolean isHomePageDisplayed() {
		return CommonFunctions.isElementExist(driver, gscCase);
	}

	public GSCRoutingPage clickonCloseBtn() {
		CommonFunctions.waitForElement(driver, closeBtn).click();

		return new GSCRoutingPage(driver);
	}

	public boolean isResolvedCompletedStatusDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, resolvedCompleted);
	}
}
