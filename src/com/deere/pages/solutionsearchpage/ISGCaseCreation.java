package com.deere.pages.solutionsearchpage;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;

public class ISGCaseCreation {
	
	@FindBy(xpath = "//button[@data-test-id='20180201164005073171878']")
	private WebElement createisgcase;

	@FindBy(xpath = "//select[@id='FunctionalIssue']")
	private WebElement actionTextbox;

	@FindBy(xpath = "//option[contains(text(),'Accept Offer')]")
	private List<WebElement> acceptOffer;

	@FindBy(xpath = "//option[contains(text(),'Activate')]")
	private List<WebElement> activate;

	@FindBy(xpath = "//option[contains(text(),'Add New Hardware')]")
	private List<WebElement> newHardware;

	@FindBy(xpath = "//option[contains(text(),'Comar Issue')]")
	private List<WebElement> comarIssue;

	@FindBy(xpath = "//option[contains(text(),'Deactivate')]")
	private List<WebElement> deactivate;

	@FindBy(xpath = "//option[contains(text(),'Decline Offer')]")
	private List<WebElement> declineOffer;

	@FindBy(xpath = "//option[contains(text(),'Decommission Transfer')] ")
	private List<WebElement> decommission;

	@FindBy(xpath = "//option[contains(text(),'Demo')]")
	private List<WebElement> demo;

	@FindBy(xpath = "//option[contains(text(),'Marketing Mirror')]")
	private List<WebElement> marketingMirror;

	@FindBy(xpath = "//option[contains(text(),'Normal Transfer')]")
	private List<WebElement> normalTransfer;

	@FindBy(xpath = "//option[contains(text(),'Preview Offer')]")
	private List<WebElement> previewOffer;

	@FindBy(xpath = "//option[contains(text(),'Publish Offer')]")
	private List<WebElement> publishOffer;

	@FindBy(xpath = "//option[contains(text(),'Reactivate')]")
	private List<WebElement> reactivate;

	@FindBy(xpath = "//option[contains(text(),'Reassign')]")
	private List<WebElement> reassign;

	@FindBy(xpath = "//option[contains(text(),'Refund Request')]")
	private List<WebElement> refundRequest;

	@FindBy(xpath = "//option[contains(text(),'Remove Offer')]")
	private List<WebElement> removeOffer;

	@FindBy(xpath = "//option[contains(text(),'Renew')]")
	private List<WebElement> renew;

	@FindBy(xpath = "//option[contains(text(),'Sync')]")
	private List<WebElement> sync;

	@FindBy(xpath = "//option[contains(text(),'Warranty Transfer')]")
	private List<WebElement> warrantyTransfer;

	@FindBy(name = "PegaGadget0Ifr")
	private WebElement iFrameHomepage;

	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[1]")
	private WebElement addCustomerIcon;

	// click on home page
	@FindBy(xpath = "(//label[contains(text(),'Home')])[1]")
	private WebElement homePagetab;

	

	@FindBy(xpath = "//select[@id='FunctionalIssue']")
	private WebElement ActionTextbox;

	@FindBy(xpath = "//option[contains(text(),'Accept Offer')]")
	private List<WebElement> AcceptOffer;

	@FindBy(xpath = "//option[contains(text(),'Activate')]")
	private List<WebElement> Activate;

	@FindBy(xpath = "//option[contains(text(),'Add New Hardware')]")
	private List<WebElement> NewHardware;

	@FindBy(xpath = "//option[contains(text(),'Comar Issue')]")
	private List<WebElement> ComarIssue;

	@FindBy(xpath = "//option[contains(text(),'Deactivate')]")
	private List<WebElement> Deactivate;

	@FindBy(xpath = "//option[contains(text(),'Decline Offer')]")
	private List<WebElement> DeclineOffer;

	@FindBy(xpath = "//option[contains(text(),'Decommission Transfer')] ")
	private List<WebElement> Decommission;

	@FindBy(xpath = "//option[contains(text(),'Demo')]")
	private List<WebElement> Demo;

	@FindBy(xpath = "//option[contains(text(),'Marketing Mirror')]")
	private List<WebElement> MarketingMirror;

	@FindBy(xpath = "//option[contains(text(),'Normal Transfer')]")
	private List<WebElement> NormalTransfer;

	@FindBy(xpath = "//option[contains(text(),'Preview Offer')]")
	private List<WebElement> PreviewOffer;

	@FindBy(xpath = "//option[contains(text(),'Publish Offer')]")
	private List<WebElement> PublishOffer;

	@FindBy(xpath = "//option[contains(text(),'Reactivate')]")
	private List<WebElement> Reactivate;

	@FindBy(xpath = "//option[contains(text(),'Reassign')]")
	private List<WebElement> Reassign;

	@FindBy(xpath = "//option[contains(text(),'Refund Request')]")
	private List<WebElement> RefundRequest;

	@FindBy(xpath = "//option[contains(text(),'Remove Offer')]")
	private List<WebElement> RemoveOffer;

	@FindBy(xpath = "//option[contains(text(),'Renew')]")
	private List<WebElement> Renew;

	@FindBy(xpath = "//option[contains(text(),'Sync')]")
	private List<WebElement> Sync;

	@FindBy(xpath = "//option[contains(text(),'Warranty Transfer')]")
	private List<WebElement> WarrantyTransfer;

	@FindBy(name = "PegaGadget0Ifr")
	private WebElement IframeHomepage;

	@FindBy(xpath = "(//i[@data-test-id='201512210438090148308293'])[1]")
	private WebElement AddcustomerIcon;

	protected WebDriver driver;

	public ISGCaseCreation(WebDriver driver) {
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

	public ISGCaseCreation clickonISGCase() throws InterruptedException {
		try {

			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, createisgcase).click();
		Thread.sleep(1000);
		// CommonFunctions.switchToiFrameByIDOrName(driver, "IframeHomepage");
		return new ISGCaseCreation(driver);
	}

	public boolean ISGPageDisplayed() throws InterruptedException {

		CommonFunctions.waitAndSwitchToFrame(driver, IframeHomepage);
		return CommonFunctions.isElementExist(driver, AddcustomerIcon);
	}

	public boolean hasAccept_Offer(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, AcceptOffer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, AcceptOffer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	

	public boolean hasdisplayedAddNewHardware(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		// CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, NewHardware).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, NewHardware).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedComarIssue(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		// CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, ComarIssue).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, ComarIssue).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedDeactivate(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		// CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, Deactivate).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, Deactivate).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasdisplayedDecline(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, DeclineOffer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, DeclineOffer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasdisplayedDecomission(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, Decommission).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, Decommission).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasdisplayedDemo(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, Demo).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, Demo).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedMarketing(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, MarketingMirror).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, MarketingMirror).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasdisplayedNormal_Transfer(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, NormalTransfer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, NormalTransfer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedPreview(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, PreviewOffer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, PreviewOffer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedPublish(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, PublishOffer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, PublishOffer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedReactivate(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, Reactivate).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, Reactivate).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedReassign(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, Reassign).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, Reassign).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedRefund_Request(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, RefundRequest).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, RefundRequest).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedRemove_offer(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, RemoveOffer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, RemoveOffer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedRenew(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, Renew).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, Renew).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedSync(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, Sync).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, Sync).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasdisplayedWaranty_transfer(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, ActionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, WarrantyTransfer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, WarrantyTransfer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}
	
	
	
	public ISGCaseCreation clickOnISGCase() throws InterruptedException {
		try {

			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, createisgcase).click();
		Thread.sleep(1000);
		// CommonFunctions.switchToiFrameByIDOrName(driver, "IframeHomepage");
		return new ISGCaseCreation(driver);
	}

	public boolean hasISGPageDisplayed() throws InterruptedException {

		CommonFunctions.waitAndSwitchToFrame(driver, iFrameHomepage);
		return CommonFunctions.isElementExist(driver, addCustomerIcon);
	}

	public boolean hasAcceptOffer(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, acceptOffer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, acceptOffer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasActivate(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, activate).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, activate).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedAddNewHardware(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		// CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, newHardware).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, newHardware).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedComarIssue(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, comarIssue).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, comarIssue).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasDisplayedDeactivate(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		// CommonFunctions.waitForElement(driver, ActionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, deactivate).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, deactivate).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasDisplayedDecline(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, declineOffer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, declineOffer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasDisplayedDecomission(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, decommission).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, decommission).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasDisplayedDemo(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, demo).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, demo).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedMarketing(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, marketingMirror).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, marketingMirror).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean hasDisplayedNormal_Transfer(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, normalTransfer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, normalTransfer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedPreview(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, previewOffer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, previewOffer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedPublish(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, publishOffer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, publishOffer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedReactivate(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, reactivate).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, reactivate).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedReassign(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, reassign).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, reassign).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedRefund_Request(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, refundRequest).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, refundRequest).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedRemove_Offer(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, removeOffer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, removeOffer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedRenew(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, renew).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, renew).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedSync(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, sync).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, sync).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}

	public boolean hasDisplayedWarantyTransfer(String options) {
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// CommonFunctions.selectFromDropdown(driver, Value, elmt);

		CommonFunctions.waitForElement(driver, actionTextbox).click();
		// Call method for List of WebELEMENYS OF Actions

		CommonFunctions.waitForElement(driver, actionTextbox).sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i < CommonFunctions.waitForElements(driver, warrantyTransfer).size(); i++) {
			if (!CommonFunctions.waitForElements(driver, warrantyTransfer).get(i).getText().contains(options)) {
				continue;
			} else {
				return true;
			}
		}
		return false;

	}
}
