package com.deere.isgpage;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.global.GlobalThings;
import com.deere.gscpage.ViewEmailZeacomPage;
import com.deere.isgpage.ISGCasePage;
import com.deere.pages.solutionsearchpage.SolutionSearchHomePage;

public class ISGCaseSearchPage extends GlobalThings{

	@FindBy(xpath = "//iframe[contains(@src,'SolutionSearchHome')]")
	private WebElement iframePegaGadget;

	@FindBy(xpath = "//input[@id='SolutionSummary'][contains(@name,'SolutionSummary')]")
	private WebElement searchTextBox;

	@FindBy(xpath = "//input[@id='CategoryString'][@title='Search Category']")
	private WebElement categoryTxtbox;

	@FindBy(xpath = "(//a[starts-with(@title,'New Deere.com Case')])[1]")
	private WebElement gscNewCaseMailLinkZeacom;

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

	@FindBy(xpath = "(//a[@class='Case_tools'])[2]")
	private WebElement gscNewCaseMailLink;

	@FindBy(name = "PegaGadget0Ifr")
	private WebElement iframePegaGadgetCaseSearch;

	@FindBy(xpath = "//*[@id='pySearchText']")
	private WebElement CaseSearchBox;

	@FindBy(xpath = "//img[contains(@data-click,'pyWorkSearch')]")
	private WebElement CaseSearchImgLink;

	@FindBy(xpath = "//*[@data-test-id='20150212053008079033139']")
	private WebElement CaseLinkToMainPage;

	@FindBy(xpath = "//span[@data-test-id='20180424084340049412218']")
	private WebElement GSCWorkBasket;

	@FindBy(xpath = "//iframe[@id='PegaGadget1Ifr']")
	private WebElement iframePegaGadgetISG_Assertion;

	@FindBy(xpath = "(//*[@id='TABSPAN']/span/label)[2]")
	private WebElement gscCorrespondence;

	@FindBy(xpath = "//iframe[@name='PegaGadget1Ifr']")
	private WebElement iframe;

	@FindBy(xpath = "//td[contains(text(),'JohnDeere.com')]")
	private WebElement mail_From;

	@FindBy(xpath = "//div[text()='Actions ']")
	private WebElement actionBtn;

	@FindBy(xpath = "//span[text()='Work Case']")
	private WebElement workCaseInActions;

	@FindBy(xpath = "//*[@data-test-id='201802011400580656111285']")
	private WebElement acceptButton;

	@FindBy(xpath = "/html/body/table[2]/tbody/tr/td/table[1]/tbody/tr[4]/td[2]")
	private WebElement mail_Subject;
	
	@FindBy(xpath = "//iframe[@name='PegaGadget1Ifr']")
	private WebElement iframe1; 

	protected WebDriver driver;

	public ISGCaseSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public ISGCasePage frameSwitching() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadgetISG_Assertion);

		return new ISGCasePage(driver);
	}

	public boolean hasCaseSearchHomePageDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadgetCaseSearch);
		return CommonFunctions.isElementExist(driver, CaseSearchBox);
	}

	public ISGCaseSearchPage enterCaseIDInCaseSearchBox(String caseID) {
		CommonFunctions.waitForElement(driver, CaseSearchBox).sendKeys(caseID);
		return new ISGCaseSearchPage(driver);
	}
	
	public ISGCaseSearchPage enterCaseIDInCaseSearchBoxR4() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, CaseSearchBox);
		
		CommonFunctions.waitForElement(driver, CaseSearchBox).sendKeys(Caseid_R4Turf);
		return new ISGCaseSearchPage(driver);
	}

	public ISGCaseSearchPage clickCaseSearchImgLink() {
		CommonFunctions.waitForElement(driver, CaseSearchImgLink).click();
		return new ISGCaseSearchPage(driver);
	}

	public ISGCasePage clickCaseLink() {
		CommonFunctions.waitForElement(driver, CaseLinkToMainPage).click();

		return new ISGCasePage(driver);
	}
	
	public ISGCaseSearchPage clickOnCaseLink() {
		CommonFunctions.waitForElement(driver, CaseLinkToMainPage).click();

		return new ISGCaseSearchPage(driver);
	}

	public ISGCaseSearchPage clickCaseIdLink() {
		CommonFunctions.waitForElement(driver, CaseLinkToMainPage).click();
		return new ISGCaseSearchPage(driver);
	}

	public boolean hasSolutionSearchHomePageDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadget);
		return CommonFunctions.isElementExist(driver, searchTextBox);
	}

	public ISGCaseSearchPage switchToIFrame() {
		CommonFunctions.switchToiFrameByWebElement(driver, iframePegaGadgetCaseSearch);
		return new ISGCaseSearchPage(driver);
	}

	public boolean hasCategoryAutoOptionDisplayed(String category) {
		CommonFunctions.waitForElement(driver, categoryTxtbox).sendKeys(Keys.ARROW_DOWN);
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

	public SolutionSearchHomePage enterCategory(String category) {
		CommonFunctions.waitForElement(driver, categoryTxtbox).sendKeys(category);
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

	public SolutionSearchHomePage enterModel(String model) {
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

	public static String ParentHandle;

	public ISGCaseSearchPage clickOnCorrespondence() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.switchToiFrameByWebElement(driver, iframe);
		CommonFunctions.scrollSomeDown(driver);
		CommonFunctions.isElementExist(driver, gscCorrespondence);
		// CommonFunctions.waitForElement(driver, GSCCorrespondence).click();
		// System.out.println("scrolled down ");
		ParentHandle = driver.getWindowHandle();
		System.out.println("Parent window is " + ParentHandle);
		return new ISGCaseSearchPage(driver);
	}

	public ISGCaseSearchPage clickOnMail() {
		CommonFunctions.waitForElement(driver, gscNewCaseMailLink).click();
		return new ISGCaseSearchPage(driver);
	}

	public ViewEmailZeacomPage clickOnMailZeacom() {
		CommonFunctions.waitForElement(driver, gscNewCaseMailLinkZeacom).click();
		return new ViewEmailZeacomPage(driver);
	}

	public boolean hasMailWindowDisplayed() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.switchToNextWindow(driver);
		String ChildHandler = driver.getWindowHandle();
		System.out.println("driver switched to next window" + ChildHandler);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, mail_From);
	}

	public boolean hasSubjectDisplayed() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, mail_Subject);
	}

	public ISGCasePage clickOnActionsBtn() {
		CommonFunctions.waitForElement(driver, actionBtn).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ISGCasePage(driver);
	}

	public ISGCasePage clickOnWorkCase() {
		CommonFunctions.waitForElement(driver, workCaseInActions).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ISGCasePage(driver);
	}

	public ISGCasePage clickOnAcceptBtn() {
		CommonFunctions.waitForElement(driver, acceptButton).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ISGCasePage(driver);
	}
	
	public ISGCasePage switchToFrame1() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitAndSwitchToFrame(driver, iframe1);
		return new ISGCasePage(driver);
	} 

}
