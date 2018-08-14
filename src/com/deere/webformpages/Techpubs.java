package com.deere.webformpages;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deere.global.CommonFunctions;

public class Techpubs {
	
	@FindBy(xpath="//span[@data-test-id=\"20180309154956071941973\"]")
	private WebElement techpubsFirstNameLastName;
	
	@FindBy(xpath="//span[@data-test-id=\"20180309154956072045627\"]")
	private WebElement techpubsPhoneNumber;
	
	@FindBy(xpath="(//span[@data-test-id=\"20180309154956071942663\"])[2]")
	private WebElement address;
	
	@FindBy(xpath="//span[@data-test-id=\"20180309163651024524817\"]")
	private WebElement techpubsEmail;
	
	@FindBy(xpath="//div[@data-test-id=\"20180309163423012514679\"]")
	private WebElement techpubsPrimaryMessage;
	
	@FindBy(xpath="//select[@data-test-id=\"2018031412181703917767\"]")
	private WebElement techpubsSelectProduct;
	
	@FindBy(xpath="#PIN")
	private WebElement techpubsDashboard_MachinePIN;
	
	@FindBy(xpath="//textarea[@data-test-id='2018031408201703885440']")
	private WebElement techpubsDescription;
	
	@FindBy(xpath="#DealerName")
	private WebElement TechpubsDealername;
	
	@FindBy(xpath="#DealerCity")
	private WebElement techpubsDealerCity;
	
	@FindBy(xpath="#DealerState")
	private WebElement techpubsDealerState;
	
	@FindBy(xpath="//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement techpubsAttButton;
	
	@FindBy(xpath="//div[@class='file-input-wrapper centered']")
	private WebElement techpubsSelectButton;		
	
			
	@FindBy(xpath="//button[@data-test-id='20140919030420037410647']")
	private WebElement techpubsFileAttachButton;
	
	@FindBy(xpath="//button[@data-test-id='2018032009190808106446']")
	private WebElement techpubsAttachSubmitButton;
	
	
	@FindBy(xpath="//div[@data-test-id='2015012615503109611417']")
	private WebElement techpubssubinfo;	
	
	@FindBy(xpath="//a[@class='Case_tools']")
	private WebElement techpubsattachedFileLink;	
	
	@FindBy(xpath="//select[@name='$PpyWorkPage$pWebformLanguage']")
	private WebElement techpubsDefaultLanguage;
		
	@FindBy(xpath="//span[@class='iconRequired standard_iconRequired']")
	private WebElement techpubsDescriptionMsgInPortugues;
	
	
	@FindBy(xpath="//option[@value='pt_BR']")
	private WebElement techpubsPortuguesLanguage;
	
	
	@FindBy(xpath="//button[@data-test-id='2018032009190808117329']")
	private WebElement techpubsClearButton;
	
	@FindBy(xpath = "(//div[@class='content-item content-label item-2 standard_dataLabelWrite'])[2]")
	private WebElement webForm;
	
	public static String alertMsg,Caseid_Techpubs;
		
    protected WebDriver driver;
	
	public  Techpubs(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	

	public boolean hasFirstNameDisplayed(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,techpubsFirstNameLastName );
	}
		
	public boolean hasPhoneNumberDisplayed(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,techpubsPhoneNumber );
	}

	public boolean hasAddressDisplayed(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,address );
	}

	public boolean hasTechpubsEmail(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,techpubsEmail );
	}
   
	public boolean hasTechpubsPrimaryMessage(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,techpubsPrimaryMessage );
	}
	public boolean hasTechpubsDefaultLanguageSelected() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,techpubsDefaultLanguage );	
		
	}
	
	public boolean hasClearButton() {
  		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		return CommonFunctions.isElementExist(driver,techpubsClearButton );	
  	}
  	
	@FindBy(xpath = "//*[@id='$PpyWorkPage$pWebformCommentError']")
	private WebElement validMessg;
  	
  	public Techpubs clickOnClearButton() {
  		CommonFunctions.waitForElement(driver,techpubsClearButton ).click();
  		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submitBtn).click();
		CommonFunctions.waitForAlert(driver);
		CommonFunctions.isElementExist(driver, validMessg);
  		return new Techpubs(driver);
  	}
  	
  	public Techpubs clickSumitButton() {
  		
  		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, submitBtn).click();
		CommonFunctions.waitForAlert(driver);
		CommonFunctions.isElementExist(driver, validMessg);
  		return new Techpubs(driver);
  	}


	
	/*************************************************/

   //Product DD selection in JDLinkswebform	
   public Techpubs productSelection() {
	   CommonFunctions.waitForElement(driver, techpubsSelectProduct);
	  CommonFunctions.selectFromDropdown(driver, "Techpubs Dashboard", techpubsSelectProduct);
		return new Techpubs(driver);
	}
		
	//	Detailed_description entering in JDLinkswebform
  public Techpubs detailedDescription(String desc) throws InterruptedException {
  	
  	CommonFunctions.waitForElement(driver, techpubsDescription).sendKeys(desc);
  	Thread.sleep(2000);
		return new Techpubs(driver);
	
  }
  
  public Techpubs verifyPortuguesLanguageMsg() {
	  
	  CommonFunctions.isElementExist(driver,techpubsDescriptionMsgInPortugues);
	  
	  return new Techpubs(driver); 
  }
  
  @FindBy(xpath="//select[@data-test-id=\"2018031515004908565380\"]")
	private WebElement languageDD;	
  
 public Techpubs selectPortuguesLanguage() {
	 CommonFunctions.waitForElement(driver,languageDD).click();
	 CommonFunctions.selectFromDropdownByIndex(driver, 4, languageDD);
	 // CommonFunctions.waitForElement(driver,techpubsPortuguesLanguage).click();
	  return new Techpubs(driver); 
  }
 
 public Techpubs selectEnglishLanguage() {
	 CommonFunctions.waitForElement(driver,languageDD).click();
	 CommonFunctions.selectFromDropdownByIndex(driver, 2, languageDD);
	 // CommonFunctions.waitForElement(driver,techpubsPortuguesLanguage).click();
	  return new Techpubs(driver); 
  }
  
 
    //File uploading and submit
    public Techpubs uloadFile() throws Throwable {
  	CommonFunctions.waitForElement(driver, techpubsAttButton).click();
   	CommonFunctions.waitForElement(driver, techpubsSelectButton).click();
    CommonFunctions.uploadFileUsingRobotClass("C:\\Users\\laharip\\Pictures\\Emailble Report.png");	
	CommonFunctions.waitForElement(driver, techpubsFileAttachButton).click();
	return new Techpubs(driver);
    }
	
    //Validate file attachment
    public boolean hasFileAttached() {
  		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		return CommonFunctions.isElementExist(driver,techpubsattachedFileLink );
    }
    
    
    //Get CaseID from Final message
    public Techpubs getCaseID1() {
    	CommonFunctions.waitForElement(driver, techpubsAttachSubmitButton).click();
    	String tm=CommonFunctions.waitForElement(driver, techpubssubinfo).getText();
  	  	String[] strArr = tm.split(" ");
		String Case_ID = strArr[8];
		Caseid_Techpubs=strArr[8];
		System.out.println(""+Case_ID);  
		return new Techpubs(driver);
	  }
    public Techpubs clickSubmit() throws IOException {
		CommonFunctions.waitForElement(driver, techpubsAttachSubmitButton).click();
		return new Techpubs(driver);
	}
	
	public Techpubs getCaseID() throws IOException {
		String tm = CommonFunctions.waitForElement(driver, techpubssubinfo).getText();
		String[] strArr = tm.split(" ");
		Caseid_Techpubs = strArr[8];
		return new Techpubs(driver);
	}
		
	public boolean hasFinalMessage(String msg){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (CommonFunctions.waitForElement(driver, techpubssubinfo ).getText().contains(msg)) {
			return true;
		} else {
			return false;
		}
	}
	
	public Techpubs waitForAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(500);
			alertMsg=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		}catch(Exception e) {
	 }
		return new Techpubs(driver);
	} 
	
	@FindBy(xpath = "//img[@name='MKTCaseAttachments_pyWorkPage_3']")
	private WebElement jdParts_AttButton;

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
	
	@FindBy(xpath = "//textarea[@data-test-id=\"2018031408201703885440\"]")
	private WebElement desc;


	public boolean hasDetailedDescriptionDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, desc);
	}



	public boolean hasR4TurfWebFormPageDisplayed() {
		// TODO Auto-generated method stub
		return CommonFunctions.isElementExist(driver, webForm);
	}
    
}
