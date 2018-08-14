package com.deere.isgpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;

public class ISGRecommendedSolutionsSectionPage {

	@FindBy(xpath = "//button[@data-test-id='20180201164005073171878']")
	private WebElement isgCaseCreationBtn;

	@FindBy(xpath = "//span[contains(text(),'Recommended Solutions')]")
	private WebElement recommendedSolutions;

	@FindBy(xpath = "//iframe[@id='PegaGadget0Ifr']")
	private WebElement switchToFrame;

	@FindBy(xpath = "//iframe[@id='PegaGadget1Ifr']")
	private WebElement frame;

	@FindBy(xpath = "(//*[contains(text(),'Language')])[6]")
	private WebElement language;

	@FindBy(xpath = "//*[@data-test-id='201709191339170812600']//*[contains(text(),'ID')]")
	private WebElement id;

	@FindBy(xpath = "(//div[contains(text(),'Description')])[1]")
	private WebElement description;

	@FindBy(xpath = "//span[contains(text(),'Link New Solution')]")
	private WebElement linkSolution;

	@FindBy(xpath = "(//*[contains(text(),'Language')])[7]")
	private WebElement languageForLinkNewSolution;

	@FindBy(xpath = "(//div[contains(text(),'Description')])[2]")
	private WebElement descriptionForLinkNewSolution;

	@FindBy(xpath = "//div[contains(text(),'Link')]")
	private WebElement link;

	@FindBy(xpath = " //input[@class='customIntegerInput']")
	private WebElement solutionIdBox;

	@FindBy(xpath = " //img[@data-test-id='201709081532310671113459']")
	private WebElement searchIcon;

	@FindBy(xpath = " //span[@data-test-id='201708302308570779178839']")
	private WebElement valMesg;

	@FindBy(xpath = " //*[@data-test-id='201708302308570779178839']")
	private WebElement soluIdExist;

	@FindBy(xpath = " (//span[@data-test-id='2017083020192902615682'])[2]")
	private WebElement lanName;

	@FindBy(xpath = " (//*[@data-test-id='20160503060128021717349'])[2]")
	private WebElement solIdinRecomnded;

	@FindBy(xpath = " (//*[@data-test-id=''20171114143911056685661'])[2]")
	private WebElement delete;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "1234")
	private WebElement idLinkText;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "72904")
	private WebElement soluId;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "HBI-AX-1345 APR 21")
	private WebElement solDesRecomnded;

	@FindBy(xpath = " //strong[contains(text(),'Solution Number: 1234')]")
	private WebElement solutionNumber;

	@FindBy(xpath = " //strong[contains(text(),'Solution Summary: HBI-AX-1345 APR')]")
	private WebElement solutionSummary;

	@FindBy(xpath = " //strong[contains(text(),'Publication Date')]")
	private WebElement publicationDate;
	
	@FindBy(xpath = "//span[@data-test-id='20141009112850013116473']")
	private WebElement isgPage;

	protected WebDriver driver;

	public ISGRecommendedSolutionsSectionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public ISGRecommendedSolutionsSectionPage clickCreateISGCaseBtn() {
		CommonFunctions.waitForElement(driver, isgCaseCreationBtn).click();
		return new ISGRecommendedSolutionsSectionPage(driver);
	}

	public boolean hasRecommendedSolutionsDisplayed() {
		CommonFunctions.scrollSomeDown(driver);
		// CommonFunctions.scrollToElement(driver, recommendedSolutions);
		return CommonFunctions.isElementExist(driver, recommendedSolutions);
	}
	
	
	public boolean hasISGCaseCreationHomePageDisplayed() {
		return CommonFunctions.isElementExist(driver, isgPage);
	}

	public ISGRecommendedSolutionsSectionPage switchToFrame() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitForElement(driver, switchToFrame);
		CommonFunctions.switchToiFrameByWebElement(driver, switchToFrame);
		return new ISGRecommendedSolutionsSectionPage(driver);
	}

	public boolean hasLanguagesDisplayed() {
		return CommonFunctions.isElementExist(driver, language);
	}

	public boolean hasIDDisplayed() {
		return CommonFunctions.isElementExist(driver, id);
	}

	public boolean hasDescriptionDisplayed() {
		return CommonFunctions.isElementExist(driver, description);
	}

	public boolean hasLinkNewSolutionDisplayed() {
		CommonFunctions.scrollSomeDown(driver);
		return CommonFunctions.isElementExist(driver, linkSolution);
	}

	public boolean hasLanguageForLinkNewSolutionDisplayed() {
		return CommonFunctions.isElementExist(driver, languageForLinkNewSolution);
	}

	/*public boolean hasIDForLinkNewSolutionDisplayed() {
		return CommonFunctions.isElementExist(driver, idForLinkNewSolution);
	}*/

	public boolean hasDescriptionForLinkNewSolutionDisplayed() {
		return CommonFunctions.isElementExist(driver, descriptionForLinkNewSolution);
	}

	public boolean hasLinkDisplayed() {
		return CommonFunctions.isElementExist(driver, link);
	}

	public boolean hasSolutionIDDisplayed() {
		return CommonFunctions.isElementExist(driver, solutionIdBox);
	}

	public boolean hasSearchIconDisplayed() {
		return CommonFunctions.isElementExist(driver, searchIcon);
	}

	public ISGRecommendedSolutionsSectionPage clickSearchIcon() {
		CommonFunctions.waitForElement(driver, searchIcon).click();
		return new ISGRecommendedSolutionsSectionPage(driver);
	}

	public boolean hasValidationMesgDisplayed() {
		return CommonFunctions.isElementExist(driver, valMesg);
	}

	public ISGRecommendedSolutionsSectionPage enterIdInSolSearchFiled(String id) {
		CommonFunctions.waitForElement(driver, solutionIdBox).sendKeys(id);
		return new ISGRecommendedSolutionsSectionPage(driver);
	}

	public boolean hasSolutionIDDisplayed(String string) {
		return CommonFunctions.isElementExist(driver, soluId);
	}

	public boolean hasSolutionIDRecomdedDisplayed(String string) {
		return CommonFunctions.isElementExist(driver, idLinkText);
	}

	public boolean hasValidationMessageDisplayed() {
		return CommonFunctions.isElementExist(driver, soluIdExist);
	}

	public boolean hasLanguageNameDisplayed(String string) {
		return CommonFunctions.isElementExist(driver, lanName);
	}

	public boolean hasRecomdSolutionIDDisplayed(String string) {
		return CommonFunctions.isElementExist(driver, solIdinRecomnded);
	}

	public boolean hasSolutionDescriptionDisplayed(String string) {
		return CommonFunctions.isElementExist(driver, solDesRecomnded);
	}

	public boolean hasDeleteIconDisplayed() {
		return CommonFunctions.isElementExist(driver, delete);
	}

	public ISGRecommendedSolutionsSectionPage clickOnSolutionIdLink() {
		CommonFunctions.waitForElement(driver, idLinkText).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ISGRecommendedSolutionsSectionPage(driver);
	}

	public ISGRecommendedSolutionsSectionPage frameSwitching() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.waitForElement(driver, frame);
		CommonFunctions.switchToiFrameByWebElement(driver, frame);
		return new ISGRecommendedSolutionsSectionPage(driver);
	}

	public boolean hasSolutionNumberDisplayed() {
		return CommonFunctions.isElementExist(driver, solutionNumber);
	}

	public boolean hasSolutionSummaryDisplayed(String string) {
		return CommonFunctions.isElementExist(driver, solutionSummary);
	}

	public boolean hasPublicationDateDisplayed() {
		return CommonFunctions.isElementExist(driver, publicationDate);
	}

}
