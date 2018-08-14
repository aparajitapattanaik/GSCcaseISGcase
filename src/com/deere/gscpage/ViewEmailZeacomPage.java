package com.deere.gscpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.isgpage.ISGCasePage;;

public class ViewEmailZeacomPage {

	@FindBy(xpath = "//iframe[@id='PegaGadget0Ifr']")
	private WebElement iFramePegaGadgetISG;

	@FindBy(xpath = "//td[contains(text(),'GSC@JohnDeere.com')]")
	private WebElement mailFrom;

	@FindBy(xpath = "//td[contains(text(),'copethomas@johndeere.com, tipaxenia@johndeere.com, zach.wright@ruletek.com, testinggscisg@gmail.com')]")
	private WebElement mailTo;

	@FindBy(xpath = "")
	private WebElement iFramePegaGadgetISG_Assertion;

	public static String HTMLPageSourceCode2;

	protected WebDriver driver;

	public ViewEmailZeacomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean hasMailWindowZeacomDisplayed() {

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
		return CommonFunctions.isElementExist(driver, mailFrom);
	}

	 public  ISGCasePage SwitchToMainPage() {
		  driver.switchTo().window(ISGCasePage.ParentHandle);
		  return new ISGCasePage(driver);
    }	

	public ViewEmailZeacomPage getOpenedCaseMessageZeacom() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HTMLPageSourceCode2 = driver.getPageSource();
		CommonFunctions.assertTrue(HTMLPageSourceCode2.contains("Please be informed, a customer has opened case"),
				"Message to customer is not displayed");
		return new ViewEmailZeacomPage(driver);
	}
	
	public ISGCasePage switchToMainPage() {
		
		driver.switchTo().window(ISGCasePage.ParentHandle);
		return new ISGCasePage(driver);
	}

}
