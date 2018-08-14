package com.deere.gscpage;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.deere.global.CommonFunctions;

public class CaseCoding {
	// click on gsc
	@FindBy(xpath = "//button[@data-test-id='20180201163908004467353']")
	private WebElement createGSCcase;

	@FindBy(xpath = "(//label[contains(text(),'Home')])[1]")
	private WebElement homePagetab;

	// click on home page
	@FindBy(xpath = "(//label[contains(text(),'Home')])[1]")
	private WebElement homePageTab;

	
	// Add Customer Information Details
	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[1]")
	private WebElement gscAddCustInfoButton;

	// CaseCoding functional code, functional area
	@FindBy(xpath = "//input[@id='FUNC_AREA_NM']")
	private WebElement caseCodingFunctionalArea;

	@FindBy(xpath = "(//span[text()='CCE'])[1]")
	private WebElement selectCaseCodingFunctionalArea;

	@FindBy(xpath = "//input[@id='FUNC_CODE_NM']")
	private WebElement caseCodingFunctionalCode;

	@FindBy(name = "PegaGadget0Ifr")
	private WebElement iFrameHomePage;

	// Casecoding_Action validation
	@FindBy(xpath = "//select[@id='Action']")
	private WebElement actionTextbox;

	@FindBy(xpath = "//option[contains(text(),'Denied Assistance')]")
	private WebElement actionDeniedAssistance;

	@FindBy(xpath = "//option[contains(text(),'Documented Information')]")
	private WebElement actionDocumentedInformation;

	@FindBy(xpath = "//select[@data-test-id='20180424083132047413538']")
	private WebElement actionForwardedToFieldManager;
	
	@FindBy(xpath = "//option[contains(text(),'Forwarded to Legal')]]")
	private WebElement actionForwardedtoLegal;

	@FindBy(xpath = "//option[contains(text(),'Forwarded to Legal and Safety')]")
	private WebElement actionForwardedToLegalAndSafety;

	@FindBy(xpath = "//option[contains(text(),'Forwarded to Other Deere Unit')]")
	private WebElement actionForwardedToOtherDeereUnit;

	@FindBy(xpath = "//option[contains(text(),'Forwarded to Tier 2')]")
	private WebElement actionTier2;

	@FindBy(xpath = "//option[contains(text(),'No Action/Response by Customer')]")
	private WebElement actionResponeCustomer;

	@FindBy(xpath = "//option[contains(text(),'Referred to Dealer')]")
	private WebElement actionReferredDealer;

	@FindBy(xpath = "//option[contains(text(),'Resolved by Customer')]")
	private WebElement actionResolvedCustomer;

	@FindBy(xpath = "//option[contains(text(),'Resolved by DTAC')]")
	private WebElement actionResolvedDTAC;

	@FindBy(xpath = "//option[contains(text(),'Resolved by Dealer')]")
	private WebElement actionResolvedDealer;

	@FindBy(xpath = "//option[contains(text(),'Resolved with Coupon')]")
	private WebElement actionResolvedCoupon;

	@FindBy(xpath = "//option[contains(text(),'Resolved with JD Promise')]")
	private WebElement actionResolvedJD;

	@FindBy(xpath = "//option[contains(text(),'Resolved with Special Allowance')]")
	private WebElement actionResolveSpecial;

	@FindBy(xpath = "//option[contains(text(),'Resolved with Warranty')]")
	private WebElement actionResolveWaranty;

	@FindBy(xpath = "//option[contains(text(),'Sent Free Part(s)')]")
	private WebElement actionSentFreeParts;

	@FindBy(xpath = "//option[contains(text(),'Sent free manual')]")
	private WebElement actionSentFreeManual;

	@FindBy(xpath = "//option[contains(text(),'Supplied Information')]")
	private WebElement actionSuppliedInformation;

	// Add product info details
	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[2]")
	private WebElement gscAddProductInfoIcon;

	@FindBy(xpath = "//input[@id='DecalModel']")
	private WebElement gscModel;

	@FindBy(xpath = "(//span[text()='r/JD Miscellaneous Equipment'])[2]")
	private WebElement gscSelectedModel;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement gscProductInformationSubitButton;

	protected WebDriver driver;

	public CaseCoding(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Assertion for Homepage
	public boolean hasHomePageDisplayed() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, homePageTab);
	}

	// Assertion for GSCPageDisplaying
	public boolean gscPageDisplayed() throws InterruptedException {
		CommonFunctions.waitAndSwitchToFrame(driver, iFrameHomePage);
		return CommonFunctions.isElementExist(driver, gscAddCustInfoButton);
	}

	public boolean hasActionDeniedAssistanceDisplayed(String msg) {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	CommonFunctions.waitForElement(driver, actionTextbox).click();
	CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
	if (CommonFunctions.waitForElement(driver, actionDeniedAssistance).getText().contains(msg)) {
		return true;
	} else {
		return false;
	}
}
	// Assertion for ActionsOption
	public boolean hasActionOptions(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Select s = new Select(ActionTextbox);
		Select s = new Select(CommonFunctions.waitForElement(driver, actionTextbox));
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

	// Action for DocumentedInformation
	public boolean hasActionDocumented_InformationDisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionDocumentedInformation).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	// Action for forwarded field manager
	public boolean hasForwardedFieldManagerdisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionForwardedToFieldManager).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	// Action for hasForwardedtoLegaldisplayed
	public boolean hasForwardedtoLegaldisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionForwardedtoLegal).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	// Action for hasDeereUnitdisplayed
	public boolean hasDeereUnitdisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionForwardedToOtherDeereUnit).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean hasForwardedLegalSafetydisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionForwardedToLegalAndSafety).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	// Action for ActionResponsedisplayed
	public boolean hasNoActionResponsedisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionResponeCustomer).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}


	// Action for hasReferredDealerdisplayed
	public boolean hasReferredDealerdisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionReferredDealer).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	// Action hasResolvedbyCustomerdisplayed
	public boolean hasResolvedbyCustomerdisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionResolvedCustomer).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	// Action hasResolvedbyDealerdisplayed
	public boolean hasResolvedbyDealerdisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionResolvedDealer).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	// Action hasResolvedbyDTACdisplayed
	public boolean hasResolvedbyDTACdisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionResolvedDTAC).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	// Action hasResolvedbyCoupon
	public boolean hasResolvedwithCoupondisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionResolvedCoupon).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean hasResolvedwithSpecialAllowancedisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionResolveSpecial).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
		
	public boolean hasResolvedwithWarrantydisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionResolveWaranty).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean hasSentfreemanualondisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionSentFreeManual).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean hasSentFreePartdisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionSentFreeParts).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean hasSuppliedinformationdisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionSuppliedInformation).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
	

	// Action hasResolved with JD Promise
	public boolean hasResolvedwithJDPromisedisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionResolvedJD).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}

	// Action for other DeereUnit
	public boolean hasForwardedTier2displayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		if (CommonFunctions.waitForElement(driver, actionTier2).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
	
	// Method for click on GSC Case
		public CaseCoding clickOnGSCCase() {
			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				e.printStackTrace();
			}
			CommonFunctions.waitForElement(driver, createGSCcase).click();
			// CommonFunctions.switchToiFrameByIDOrName(driver, "IframeHomepage");
			return new CaseCoding(driver);
		}

	// click on Add product
	public CaseCoding clickonAddProductInfo() throws InterruptedException {
		Thread.sleep(3000);
		CommonFunctions.waitForElement(driver, gscAddProductInfoIcon).click();
		return new CaseCoding(driver);
	}

	// enter product model
	public CaseCoding enterProductModel(String model) {
		CommonFunctions.waitForElement(driver, gscModel).sendKeys(model);
		return new CaseCoding(driver);
	}

	// click on product submit
	public CaseCoding clickAddProductSubmit() {
		CommonFunctions.waitForElement(driver, gscProductInformationSubitButton).click();
		return new CaseCoding(driver);
	}

	// Enter casecoding FA
	public CaseCoding enterCasecodingFA(String FArea) {
		CommonFunctions.waitForElement(driver, caseCodingFunctionalArea).sendKeys(FArea);
		return new CaseCoding(driver);
	}

	// Enter casecoding FCode
	public CaseCoding enterCasecodingFC(String FCode) {
		CommonFunctions.waitForElement(driver, caseCodingFunctionalCode).sendKeys(FCode);
		return new CaseCoding(driver);
	}

	public CaseCoding caseCodingclickHomePageLink() {
		CommonFunctions.waitForElement(driver, homePagetab).click();
		return new CaseCoding(driver);

	}
}
