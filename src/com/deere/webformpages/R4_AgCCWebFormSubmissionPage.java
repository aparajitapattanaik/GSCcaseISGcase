package com.deere.webformpages;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deere.global.CommonFunctions;

public class R4_AgCCWebFormSubmissionPage {

	public static String Caseid_R4Agcc,alertMsg;
	private R4_AgCC agcc;

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@class='cta_btn']")
	private WebElement submit;

	@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
	private WebElement firstName;

	@FindBy(xpath = "//span[@data-test-id=\"20180309154956072045627\"]")
	private WebElement phoneNumber;

	@FindBy(xpath = "//span[@data-test-id=\"20180309163651024524817\"]")
	private WebElement email;

	@FindBy(xpath = "//div[@data-test-id=\"20180309163423012514679\"]")
	private WebElement primaryMessage;

	@FindBy(xpath = "//select[@data-test-id=\"2018031412181703917767\"]")
	private WebElement selectProduct;

	@FindBy(xpath = "#PIN")
	private WebElement machinePIN;

	@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
	private WebElement description;

	@FindBy(xpath = "#DealerName")
	private WebElement dealerName;

	@FindBy(xpath = "#DealerCity")
	private WebElement dealerCity;

	@FindBy(xpath = "#DealerState")
	private WebElement dealerState;

	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement attButton;

	@FindBy(xpath = "//div[@class='file-input-wrapper centered']")
	private WebElement selectButton;

	@FindBy(xpath = "//button[@data-test-id='20140919030420037410647']")
	private WebElement fileAttachButton;

	@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
	private WebElement attachSubmitButton;

	@FindBy(xpath = "//div[@data-test-id='2015012615503109611417']")
	private WebElement subinfo;
	
	@FindBy(xpath = "#DealerName")
	private WebElement r4Agcc_DealerName;

	@FindBy(xpath = "#DealerCity")
	private WebElement r4Agcc_DealerCity;

	@FindBy(xpath = "#DealerState")
	private WebElement r4Agcc_DealerState;
	
	@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
	private WebElement r4Agcc_ClearButton;
	
	@FindBy(xpath = "//a[@class='Case_tools']")
	private WebElement r4Agcc_attachedFileLink;



	protected WebDriver driver;

	public R4_AgCCWebFormSubmissionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean hasWebFormOpened() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, firstName);
	}

	public boolean hasPhone() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, phoneNumber);
	}

	public boolean hasEmail() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, email);
	}

	public boolean hasPrimaryMessage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, primaryMessage);
	}

	// Product DD selection in JDLinkswebform
	public R4_AgCCWebFormSubmissionPage productSelection() {
		CommonFunctions.waitForElement(driver, selectProduct);
		CommonFunctions.selectFromDropdown(driver, "JDLink Dashboard", selectProduct);
		return new R4_AgCCWebFormSubmissionPage(driver);
	}

	// Detailed_description entering in JDLinkswebform
	public R4_AgCCWebFormSubmissionPage detailedDescription(String desc) throws InterruptedException {

		CommonFunctions.waitForElement(driver, description).sendKeys(desc);
		Thread.sleep(2000);
		return new R4_AgCCWebFormSubmissionPage(driver);

	}

	// File uploading and submit
	public R4_AgCCWebFormSubmissionPage uploadFile() throws Throwable {
		CommonFunctions.waitForElement(driver, attButton).click();
		CommonFunctions.waitForElement(driver, selectButton).click();
		 CommonFunctions.uploadFileUsingRobotClass("C:\\Users\\laharip\\Pictures\\Emailble Report.png");
		CommonFunctions.waitForElement(driver, fileAttachButton).click();
		return new R4_AgCCWebFormSubmissionPage(driver);
	}
	
	public R4_AgCCWebFormSubmissionPage clickSubmit() throws IOException {
		CommonFunctions.waitForElement(driver, attachSubmitButton).click();
		return new R4_AgCCWebFormSubmissionPage(driver);
	}
	
	public R4_AgCCWebFormSubmissionPage getCaseID() throws IOException {
		String tm = CommonFunctions.waitForElement(driver, subinfo).getText();
		String[] strArr = tm.split(" ");
		Caseid_R4Agcc = strArr[8];
		return new R4_AgCCWebFormSubmissionPage(driver);
	}
		
	public boolean hasFinalMessage(String msg){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (CommonFunctions.waitForElement(driver, subinfo ).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
	
	public R4_AgCCWebFormSubmissionPage waitForAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(500);
			alertMsg=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		}catch(Exception e) {
	 }
		return new R4_AgCCWebFormSubmissionPage(driver);
	} 
	
	public boolean hasDealerNameExist() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4Agcc_DealerName);

	}

	public boolean hasDealerCityExist() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4Agcc_DealerCity);

	}

	public boolean hasDealerStateExist() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,r4Agcc_DealerState);

	}
	
	public boolean hasClearButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, r4Agcc_ClearButton);
	}
	
	public R4_AgCCWebFormSubmissionPage clickOnClearButton() {
		CommonFunctions.waitForElement(driver, r4Agcc_ClearButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submitBtn).click();
		CommonFunctions.waitForAlert(driver);
		CommonFunctions.isElementExist(driver, validMessg);
		return new R4_AgCCWebFormSubmissionPage(driver);
	}
	
	public R4_AgCCWebFormSubmissionPage clickSubmitButton() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submitBtn).click();
		CommonFunctions.waitForAlert(driver);
		CommonFunctions.isElementExist(driver, validMessg);
		return new R4_AgCCWebFormSubmissionPage(driver);
	}
	
	// Assertion for FileAttached
		public boolean hasFileAttached() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return CommonFunctions.isElementExist(driver, r4Agcc_attachedFileLink);
		}

		@FindBy(xpath = "//span[@data-test-id='20180309154956071941973']")
			private WebElement name;
			
			@FindBy(xpath = "//*[@id='$PpyWorkPage$pWebformCommentError']")
			private WebElement validMessg;
			
			@FindBy(xpath = "(//span[@data-test-id='20180309154956071942663'])[2]")
			private WebElement address;


			public boolean hasFirstNameLastNameDisplyed() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return CommonFunctions.isElementExist(driver, name);
			
			}

			public boolean hasAddressDisplyed() {
				return CommonFunctions.isElementExist(driver, address);
			}
			
			@FindBy(xpath = "//textarea[@data-test-id='2018031407540502455903']")
			private WebElement jdParts_Description;
			
			@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
			private WebElement jdParts_AttButton;

			public boolean hasCommentsTextAreaDisplayed() {
				return CommonFunctions.isElementExist(driver, jdParts_Description);
			}

			public boolean hasAddFileButtonDisplayed() {
				// TODO Auto-generated method stub
				return CommonFunctions.isElementExist(driver, jdParts_AttButton);
				
				
			}
			
			@FindBy(xpath = "//button[@data-test-id='2018032009190808106446']")
			private WebElement submitBtn;
			
			@FindBy(xpath = "//button[@data-test-id='2018032009190808117329']")
			private WebElement cancleBtn;

			public boolean hasSubmitButtonDisplayed() {
				// TODO Auto-generated method stub
				CommonFunctions.scrollSomeDown(driver);
				return CommonFunctions.isElementExist(driver, submitBtn);
			}

			public boolean hasClearButtonDisplayed() {
				// TODO Auto-generated method stub
				return CommonFunctions.isElementExist(driver, cancleBtn);
			}
			
			@FindBy(xpath = "//span[@data-test-id='20180309154956072045627']")
			private WebElement jdParts_PhoneNumber;

			@FindBy(xpath = "//span[@data-test-id='20180309163651024524817']")
			private WebElement jdParts_Email;

			@FindBy(xpath = "//div[@data-test-id='20180309163423012514679']")
			private WebElement jdParts_PrimaryMessage;
			
			public boolean hasPhoneNumberDisplyed() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return CommonFunctions.isElementExist(driver, jdParts_PhoneNumber);
			}

			public boolean hasEmailAddressDisplyed() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return CommonFunctions.isElementExist(driver, jdParts_Email);
			}

			public boolean hasPrimaryMessageDisplayed() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return CommonFunctions.isElementExist(driver, jdParts_PrimaryMessage);
			}
			
			@FindBy(xpath = "//input[@data-test-id=\"2018030916435602054843\"]")
			private WebElement dealName;

			@FindBy(xpath = "//span[@data-test-id='20180309163651024524817']")
			private WebElement dealCity;

			@FindBy(xpath = "//input[@data-test-id=\"20180309164356020550666\"]")
			private WebElement dealState;
			
			@FindBy(xpath = "(//div[@class=\"content-item content-label item-2 standard_dataLabelWrite\"])[2]")
			private WebElement r4AgccWebForm;

			public boolean hasDealerNameTextAreaDisplayed() {
				// TODO Auto-generated method stub
				return CommonFunctions.isElementExist(driver, dealName);
			}

			public boolean hasDealerCityTextAreaDisplayed() {
				// TODO Auto-generated method stub
				return CommonFunctions.isElementExist(driver, dealCity);
			}

			public boolean hasDealerStateAreaDisplayed() {
				// TODO Auto-generated method stub
				return CommonFunctions.isElementExist(driver, dealState);
			}

			public boolean hasR4AgccWebFormPageDisplayed() {
				// TODO Auto-generated method stub
				return CommonFunctions.isElementExist(driver, r4AgccWebForm);
			}
			
	

}
