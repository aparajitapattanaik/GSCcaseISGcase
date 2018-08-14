package com.deere.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.deere.global.CommonFunctions;

public class CaseCodingPage {
	
	@FindBy(xpath = "//button[@data-test-id='20180201163908004467353']")
	private WebElement creategsccase;

	@FindBy(xpath = "(//label[contains(text(),'Home')])[1]")
	private WebElement homePagetab;

	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[1]")
	private WebElement GSCAddCustInfoButton;

	
	@FindBy(xpath = "//input[@id='FUNC_AREA_NM']")
	private WebElement CaseCodingFunctionalArea;

	@FindBy(xpath = "(//span[text()='CCE'])[1]")
	private WebElement SelectCaseCodingFunctionalArea;

	@FindBy(xpath = "//input[@id='FUNC_CODE_NM']")
	private WebElement CaseCodingFunctionalcode;

	@FindBy(name = "PegaGadget0Ifr")
	private WebElement IframeHomepage;

	@FindBy(xpath = "//select[@id='Action']")
	private WebElement ActionTextbox;

	@FindBy(xpath = "//option[contains(text(),'Denied Assistance')]")
	private List<WebElement> ActionTextboxOptions;

	@FindBy(xpath = "//option[contains(text(),'Documented Information')]")
	private List<WebElement> ActionDocumentedInformation;

	@FindBy(xpath = "//option[contains(text(),'Forwarded to Field Manager')]")
	private List<WebElement> ActionForwardedtoField_Manager;

	@FindBy(xpath = "//option[contains(text(),'Forwarded to Legal')]]")
	private List<WebElement> ActionForwardedtoLegal;

	@FindBy(xpath = "//option[contains(text(),'Forwarded to Legal and Safety')]")
	private List<WebElement> Action_Forwarded_to_Legal_and_Safety;

	@FindBy(xpath = "//option[contains(text(),'Forwarded to Other Deere Unit')]")
	private List<WebElement> Action_Forwarded_to_OtherDeereUnit;

	@FindBy(xpath = "//option[contains(text(),'Forwarded to Tier 2')]")
	private List<WebElement> Action_Tier2;

	@FindBy(xpath = "//option[contains(text(),'No Action/Response by Customer')]")
	private List<WebElement> Action_Respone_Customer;

	@FindBy(xpath = "//option[contains(text(),'Referred to Dealer')]")
	private List<WebElement> Action_Referred_Dealer;

	@FindBy(xpath = "//option[contains(text(),'Resolved by Customer')]")
	private List<WebElement> Action_Resolved_Customer;

	@FindBy(xpath = "//option[contains(text(),'Resolved by DTAC')]")
	private List<WebElement> Action_Resolved_DTAC;

	@FindBy(xpath = "//option[contains(text(),'Resolved by Dealer')]")
	private List<WebElement> Action_Resolved_Dealer;

	@FindBy(xpath = "//option[contains(text(),'Resolved with Coupon')]")
	private List<WebElement> Action_Resolved_coupon;

	@FindBy(xpath = "//option[contains(text(),'Resolved with JD Promise')]")
	private List<WebElement> Action_Resolved_JD;

	@FindBy(xpath = "//option[contains(text(),'Resolved with Special Allowance')]")
	private List<WebElement> Action_Resolve_special;

	@FindBy(xpath = "//option[contains(text(),'Resolved with Warranty')]")
	private List<WebElement> Action_Resolve_waranty;

	@FindBy(xpath = "//option[contains(text(),'Sent Free Part(s)')]")
	private List<WebElement> Action_sent_free_parts;

	@FindBy(xpath = "//option[contains(text(),'Sent free manual')]")
	private List<WebElement> Action_sent_free_manual;

	@FindBy(xpath = "//option[contains(text(),'Supplied Information')]")
	private List<WebElement> Action_SuppliedInformation;

	// Add product info details
	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[2]")
	private WebElement GSCAddProductInfoIcon;

	@FindBy(xpath = "//input[@id='DecalModel']")
	private WebElement GSCModel;

	@FindBy(xpath = "(//span[text()='r/JD Miscellaneous Equipment'])[2]")
	private WebElement GSCSelectedModel;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement GSCProductInformationSubitButton;

	protected WebDriver driver;

	public CaseCodingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean homePageDisplayed() {

		try {

			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadget);
		return CommonFunctions.isElementExist(driver, homePagetab);

	}

	public CaseCodingPage clickonGSCCase() {
		try {

			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, creategsccase).click();
		// CommonFunctions.switchToiFrameByIDOrName(driver, "IframeHomepage");
		return new CaseCodingPage(driver);
	}

	public boolean gscPageDisplayed() throws InterruptedException {

		CommonFunctions.waitAndSwitchToFrame(driver, IframeHomepage);
		return CommonFunctions.isElementExist(driver, GSCAddCustInfoButton);
	}

	public boolean hasActionDeniedAssistancedisplayed(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, ActionTextboxOptions).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, ActionTextboxOptions).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasActionOptions(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Select s = new Select(ActionTextbox);
		Select s = new Select(CommonFunctions.waitForElement(driver, ActionTextbox));
		List<WebElement> Options = s.getOptions();

		for (int i = 0; i < Options.size(); i++) {
			if (!Options.get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasActionDocumented_Informationdisplayed(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, ActionDocumentedInformation).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, ActionDocumentedInformation).get(i).getText()
					.contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasActionForwarded_to_Field_Manager(String options) throws InterruptedException {

		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// CommonFunctions.waitForElement(driver, ActionTextbox).click();
		Thread.sleep(2000);
		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		for (int i = 1; i < CommonFunctions.waitForElements(driver, ActionForwardedtoField_Manager).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, ActionForwardedtoField_Manager).get(i).getText()
					.contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasActionForwarded_to_Legal(String options) {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, ActionForwardedtoLegal).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, ActionForwardedtoLegal).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}

		}
		return false;

	}

	public boolean hasActionForwarded_to_Legal_and_Safety(String options) {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, Action_Forwarded_to_Legal_and_Safety).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, Action_Forwarded_to_Legal_and_Safety).get(i).getText()
					.contains(options)) {
				continue;
			} else {
				return true;
			}

		}
		return false;

	}

	public boolean hasActionForwarded_to_Other_Deere_Unit(String options) {
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, Action_Forwarded_to_OtherDeereUnit).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, Action_Forwarded_to_OtherDeereUnit).get(i).getText()
					.contains(options)) {
				continue;
			} else {
				return true;
			}

		}
		return false;

	}

	// click on Add product
	public CaseCodingPage clickonAddProductInfo() throws InterruptedException {
		Thread.sleep(3000);
		CommonFunctions.waitForElement(driver, GSCAddProductInfoIcon).click();
		return new CaseCodingPage(driver);
	}

	public CaseCodingPage enterProductModel(String model) {
		CommonFunctions.waitForElement(driver, GSCModel).sendKeys(model);
		// CommonFunctions.selectFromDropdown(driver, "02/Edger/JD Miscellaneous
		// Equipment", GSCSelectedModel);
		// CommonFunctions.waitForElement(driver, GSCSelectedModel).click();
		/*
		 * GSCModel.sendKeys(Keys.ARROW_DOWN); CommonFunctions.waitForElement(driver,
		 * GSCSelectedModel ); try {
		 * 
		 * if (GSCSelectedModel.getText().contains(model)) GSCSelectedModel.click();
		 * 
		 * }catch(Exception e) { e.printStackTrace(); }
		 */
		return new CaseCodingPage(driver);
	}

	// click on product submit
	public CaseCodingPage ClickAddProductSubmit() {

		CommonFunctions.waitForElement(driver, GSCProductInformationSubitButton).click();
		return new CaseCodingPage(driver);
	}

	public CaseCodingPage enterCasecodingFA(String FArea) {
		CommonFunctions.waitForElement(driver, CaseCodingFunctionalArea).sendKeys(FArea);
		/*
		 * CaseCodingFunctionalArea.sendKeys(Keys.ARROW_DOWN);
		 * CommonFunctions.waitForElement(driver,SelectCaseCodingFunctionalArea); try {
		 * 
		 * if(SelectCaseCodingFunctionalArea.getText().contains(FArea))
		 * SelectCaseCodingFunctionalArea.click(); }catch(Exception e) {
		 * e.printStackTrace(); }
		 */

		return new CaseCodingPage(driver);
	}

	public CaseCodingPage enterCasecodingFC(String FCode) {
		CommonFunctions.waitForElement(driver, CaseCodingFunctionalcode).sendKeys(FCode);
		/*
		 * CaseCodingFunctionalArea.sendKeys(Keys.ARROW_DOWN);
		 * CommonFunctions.waitForElement(driver,SelectCaseCodingFunctionalcode); try {
		 * 
		 * if(SelectCaseCodingFunctionalcode.getText().contains(FCode))
		 * SelectCaseCodingFunctionalcode.click(); }catch(Exception e) {
		 * e.printStackTrace(); }
		 */
		return new CaseCodingPage(driver);
	}

}
