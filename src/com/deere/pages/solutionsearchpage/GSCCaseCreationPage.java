package com.deere.pages.solutionsearchpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.gscpage.ViewEmailZeacomPage;

public class GSCCaseCreationPage {
                
                @FindBy(xpath="(//label[contains(text(),'Home')])[1]")
                private WebElement homePagetab;
                
                @FindBy(xpath="//iframe[contains(@src,'SolutionSearchHome')]")
                private WebElement iframePegaGadget;
                
                @FindBy(xpath="//button[@data-test-id='20180201163908004467353']")
                private WebElement creategsccase;
                
//Add Customer Information Details
                @FindBy(xpath="(//i[@data-test-id='201512210438090148308293'])[1]")
                private WebElement GSCAddCustInfoButton;
                
                @FindBy(xpath="//span[@id='modaldialog_hd_title']")
                private WebElement CustomerSearchHeader;
                
                @FindBy(xpath="//input[@id='firstName']")
                private WebElement CustomerFirstName;
                
                @FindBy(xpath="//input[@name='lastName']")
                private WebElement CustomerLastName;
                
                @FindBy(xpath="//select[@id='country']")
                private WebElement CustomerCountry;
                
                @FindBy(xpath="//input[@class='button btn btn-primary']")
                private WebElement GSCAddCustInfoSearchCustomers;
                
                @FindBy(xpath="//table[@id='results']/tbody/tr[2]/td[2]/a")
                private WebElement CustomerSearchDetails;

//Add product info details
                @FindBy(xpath="(//i[@data-test-id='201512210438090148308293'])[2]")
                private WebElement GSCAddProductInfoIcon;
                
                @FindBy(xpath="//input[@id='DecalModel']")
                private WebElement GSCModel;
                
                @FindBy(xpath="(//span[text()='r/JD Miscellaneous Equipment'])[2]")
                private WebElement GSCSelectedModel;
                
                @FindBy(xpath="//button[@data-test-id='20140919030420037410647']") 
                private WebElement GSCProductInformationSubitButton;
                
// CaseCoding functional code, functional area
                @FindBy(xpath="//input[@id='FUNC_AREA_NM']")
                private WebElement CaseCodingFunctionalArea;
                
                @FindBy(xpath="(//span[text()='CCE'])[1]")
                private WebElement SelectCaseCodingFunctionalArea;
                
                @FindBy(xpath="//input[@id='FUNC_CODE_NM']")
                private WebElement CaseCodingFunctionalcode;
                
                //@FindBy(xpath="//span[text()='1602']")
                //private WebElement SelectCaseCodingFunctionalcode;
                
//CaseInformation: priority, language, origin
                @FindBy(xpath="//select[@id='CasePriority']")
                private WebElement GSCPriority;
                
                @FindBy(xpath="//select[@id='LanguageWithCode']")
                private WebElement GSCLanguage;
                
                @FindBy(xpath="//select[@id='Origin']")
                private WebElement GSCOrigin;
//Add Summary 
                @FindBy(xpath="//input[@name='$PpyWorkPage$pCaseSummary']")
                private WebElement GSCAddSummary;
//Select WorkBasket
                @FindBy(xpath="//select[@id='WorkbasketName']")
                private WebElement WorkBasket;
                
                @FindBy(xpath="//select[@id='GSCSubWorkgroup']")
                private WebElement WorkSubgroup;

//IFRame
//            @FindBy(id="PegaGadget0Ifr")
                //private WebElement IframeHomepage;
                
                @FindBy(name="PegaGadget0Ifr")
                private WebElement IframeHomepage;
                
                //@FindBy(id="CSC_Section")
                //private static WebElement IFrameAddCustomer;
                
                @FindBy(xpath="//iframe[@id='CSC_Section']")
                private WebElement IFrameAddCustomer;
//Click on Accept Button
                @FindBy(xpath="(//button[@data-test-id='201802011400580656111285'])[1]")
                private WebElement ClickonAcceptButton;

//Click on Route Button
                @FindBy(xpath="(//button[@data-test-id='201802011400580656112342'])[1]")
                private WebElement ClickonRouteButton;
//Status as new
                @FindBy(xpath="//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
                private WebElement StatusAsNew;
//Click on Action button
                @FindBy(xpath="//div[@class='pzbtn-rgt']/descendant::div[contains(text(),'Actions')]")
                private WebElement ClickonActionButton;
//ClickonSendCaseEmail
                @FindBy(xpath="//span[contains(text(),'Send Case Email')]")
                private WebElement ClickGSCSendCaseMailButton;
                @FindBy(xpath="//input[@data-test-id='201612271036230356233958']")
                private WebElement ClickGSCEmailEnterBox;
                @FindBy(xpath="//button[@data-test-id='20140919030420037410647']")
                private WebElement ClickGSCSendButton;
                
//click on Audit Trails
                @FindBy(xpath="//h2[contains(text(),'Audit')]")
                private WebElement AuditTrails;

//Casecoding_Action validation
                @FindBy(xpath="//select[@id='Action']")
                private WebElement ActionTextbox;

//CaseCoding_Action_category
                @FindBy(xpath="")
                private WebElement ActionTextboxOptions;
//Assertion Audit Trails
                @FindBy(xpath="//div[contains(text(),'Time')]")
            	private WebElement Time;
            	
            	// assert Description
            	@FindBy(xpath="//div[contains(text(),'Description')]")
            	private WebElement Description;
            		
            	// assert PerformedBy
            	@FindBy(xpath="//div[contains(text(),'Performed by')]")
            	private WebElement PerformedBy;
 	//Transfer to workbasket
                @FindBy(xpath="//span[contains(text(),'Work Case')]")
                private WebElement WorkcaseButton;
                
                @FindBy(xpath="(//button[@data-test-id='201802011400580656112342'])[1]")
                private WebElement RouteButton;
                
                @FindBy(xpath="(//div[@class='field-item dataValueRead'])[3]")
                private WebElement AssertNew;
                
                @FindBy(xpath="//div[@class='content-item content-field item-3 remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing']")
                private WebElement StatusOwned;
                
                @FindBy(xpath="//li[@title='Transfer Case To WB']")
                private WebElement Transfer_case_To_WB;
                
                @FindBy(xpath="(//button[@data-test-id='20180206104022047318388'])[1]")
                private WebElement Transfer_Button;

                
                
                protected WebDriver driver;
        		
                public GSCCaseCreationPage(WebDriver driver) {
           			PageFactory.initElements(driver, this);
           			this.driver=driver;
           	}
    
                public boolean homePageDisplayed(){
                                
                                try {
                                                
                                                Thread.sleep(3000);
                                                
                                }catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                                
                //CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadget);
                return CommonFunctions.isElementExist(driver, homePagetab);
                
}
                public boolean gscPageDisplayed() throws InterruptedException 
                {              
                                
                                 CommonFunctions.waitAndSwitchToFrame(driver, IframeHomepage);
                                return CommonFunctions.isElementExist(driver,GSCAddCustInfoButton);
                }
                
                
                public boolean addCustomerDisplayed()
                {
                                try {
                                                
                                                Thread.sleep(1000);
                                                
                                }catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                
                return CommonFunctions.isElementExist(driver,CustomerSearchHeader);
}
                
                
                public GSCCaseCreationPage clickonGSCCase() 
                {
try {
                                                
                                                Thread.sleep(1000);
                                                
                                }catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                CommonFunctions.waitForElement(driver,creategsccase).click();
                    //CommonFunctions.switchToiFrameByIDOrName(driver, "IframeHomepage");
                                  return new GSCCaseCreationPage(driver);
                }
                
                public GSCCaseCreationPage clickAddCustomeInfo() throws InterruptedException
                {
                                //CommonFunctions.waitAndSwitchToFrame(driver, IframeHomepage);
                                
                                //Thread.sleep(2000);
                                
                                //CommonFunctions.waitAndSwitchToFrame(driver, IFrameAddCustomer);
                                CommonFunctions.waitForElement(driver,GSCAddCustInfoButton).click();
                                return new GSCCaseCreationPage(driver);
                                
                                
                }

                public boolean firstnameDisplayed()
                {
                                try {
                                                
                                }catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                return CommonFunctions.isElementExist(driver,CustomerFirstName);
                }
                
                public boolean lastnameDisplayed()
                {
                                try {
                                                
                                }catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                return CommonFunctions.isElementExist(driver,CustomerLastName);
                }
                
                public boolean hasCustomeInfoDisplayed()
                {
                                try {
                                                Thread.sleep(1000);
                                                driver.switchTo().parentFrame();
                                                Thread.sleep(1000);
                                                }catch(Exception e)
                                                                {
                                                                                e.printStackTrace();
                                                                }
                                return CommonFunctions.isElementExist(driver,GSCAddProductInfoIcon);           
                }
                //asertion for Route---> Status as New
                public boolean statusNew()
                {
    try {
                                                
                                }catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                return CommonFunctions.isElementExist(driver,StatusAsNew); 
                }
                public boolean hasActionDisplayed()
                {
try {
                                                Thread.sleep(3000);
                                }catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                return CommonFunctions.isElementExist(driver,ClickonActionButton);   
                }
                
//method for customer firstname
  public GSCCaseCreationPage enterCustomerFirstName(String CustFirstName) throws InterruptedException
  {
                  //driver.switchTo().defaultContent();
                  //CommonFunctions.waitAndSwitchToFrame(driver, IframeHomepage);
                  CommonFunctions.waitAndSwitchToFrame(driver, IFrameAddCustomer);
                  try {
                                  
                                  Thread.sleep(3000);
                                  
                  }catch(Exception e) {
                                  e.printStackTrace();
                  }
                  CommonFunctions.waitForElement(driver,CustomerFirstName).sendKeys(CustFirstName);
                  return new GSCCaseCreationPage(driver);
  }
//method for customer lastname  
  public GSCCaseCreationPage enterCustomerLastName(String CustLastName)
 {
                  CommonFunctions.waitForElement(driver,CustomerLastName).sendKeys(CustLastName);
                                return new GSCCaseCreationPage(driver);
  }
// method to select country
  public GSCCaseCreationPage selectCountry(String Country)
  {
                  try {
                                  
                                  Thread.sleep(3000);
                                  
                  }catch(Exception e)
                  {
                                  e.printStackTrace();
                  }
                  CommonFunctions.waitForElement(driver, CustomerCountry).sendKeys(Country);
                                                return new GSCCaseCreationPage(driver);
                
  }
//method for Search customer
  public GSCCaseCreationPage GSCSearchCustomer()
  {
                  CommonFunctions.waitForElement(driver, GSCAddCustInfoSearchCustomers).click();
                  return new GSCCaseCreationPage(driver);
  }
  //click on search customer details 
  public GSCCaseCreationPage GSCSearchCustomerDetails()
  {
                  CommonFunctions.waitForElement(driver, CustomerSearchDetails).click();
                  return new GSCCaseCreationPage(driver);
  }
  //click on Add product
  public GSCCaseCreationPage clickonAddProductInfo() throws InterruptedException
  {
                  Thread.sleep(3000);
                  CommonFunctions.waitForElement(driver, GSCAddProductInfoIcon).click();
                  return new GSCCaseCreationPage(driver);  
  }
  //enter product model
  public GSCCaseCreationPage enterProductModel(String model)
  {
                  CommonFunctions.waitForElement(driver, GSCModel).sendKeys(model);
                // CommonFunctions.selectFromDropdown(driver, "02/Edger/JD Miscellaneous Equipment", GSCSelectedModel);
                //  CommonFunctions.waitForElement(driver, GSCSelectedModel).click();
                /*  GSCModel.sendKeys(Keys.ARROW_DOWN);
                  CommonFunctions.waitForElement(driver, GSCSelectedModel );
                  try {
                                  
                                  if (GSCSelectedModel.getText().contains(model))
                                                  GSCSelectedModel.click();
                                  
                  }catch(Exception e)
                  {
                                  e.printStackTrace();
                  }*/
                  return new GSCCaseCreationPage(driver);
  }
  //click on product submit
  public GSCCaseCreationPage ClickAddProductSubmit()
  {
                
                  CommonFunctions.waitForElement(driver, GSCProductInformationSubitButton).click();
                  return new GSCCaseCreationPage(driver);
  }
  
  public GSCCaseCreationPage enterCasecodingFA(String FArea )
  {
                  CommonFunctions.waitForElement(driver,CaseCodingFunctionalArea).sendKeys(FArea);
                /* CaseCodingFunctionalArea.sendKeys(Keys.ARROW_DOWN);
                  CommonFunctions.waitForElement(driver,SelectCaseCodingFunctionalArea);
                  try {
                                  
                                  if(SelectCaseCodingFunctionalArea.getText().contains(FArea))
                                                  SelectCaseCodingFunctionalArea.click();  
                  }catch(Exception e)
                  {
                                e.printStackTrace(); 
                  }*/
                  
                  return new GSCCaseCreationPage(driver);
  }
  
  public GSCCaseCreationPage enterCasecodingFC(String FCode)
  {
                  CommonFunctions.waitForElement(driver,CaseCodingFunctionalcode).sendKeys(FCode);
                /* CaseCodingFunctionalArea.sendKeys(Keys.ARROW_DOWN);
                  CommonFunctions.waitForElement(driver,SelectCaseCodingFunctionalcode);
                  try {
                                  
                                  if(SelectCaseCodingFunctionalcode.getText().contains(FCode))
                                                  SelectCaseCodingFunctionalcode.click();  
                  }catch(Exception e)
                  {
                                e.printStackTrace(); 
                  }
                  */
                  return new GSCCaseCreationPage(driver);
  }
                                
  public GSCCaseCreationPage enterPriority(String Priority) throws InterruptedException {
                  
                  Thread.sleep(3000);
                  
                  CommonFunctions.waitForElement(driver,GSCPriority).sendKeys(Priority);
                // CommonFunctions.selectFromDropdown(driver, "1-Tech in Field - Urgent", GSCPriority);                              
      return new GSCCaseCreationPage(driver);
      }
  public GSCCaseCreationPage enterLanguage(String Language) {
                  CommonFunctions.waitForElement(driver,GSCLanguage).sendKeys(Language);
                // CommonFunctions.selectFromDropdown(driver, "English", GSCLanguage);                              
      return new GSCCaseCreationPage(driver);
      }
  
  public GSCCaseCreationPage enterOrigin(String Origin) throws InterruptedException
  {
                  Thread.sleep(1000);
                  CommonFunctions.waitForElement(driver,GSCOrigin).sendKeys(Origin);
                //  CommonFunctions.selectFromDropdown(driver, "Email", GSCOrigin);                              
      return new GSCCaseCreationPage(driver);
  }
  
  public GSCCaseCreationPage EnterAddSummary(String summary)
  {
                  CommonFunctions.waitForElement(driver, GSCAddSummary).sendKeys(summary);
                                return new GSCCaseCreationPage(driver);
  }
  
  public GSCCaseCreationPage selectWorkBasket(String Workbasket)
  {
                // CommonFunctions.waitForElement(driver, WorkBasket).sendKeys(Workbasket);
                  try {
                                  Thread.sleep(3000);
                                  
                  }catch(Exception e)
                  {
                                  e.printStackTrace();
                  }
                  CommonFunctions.selectFromDropdown(driver,Workbasket, WorkBasket);
                  CommonFunctions.selectFromDropdown(driver,Workbasket, WorkBasket);

                  return new GSCCaseCreationPage(driver);
  }
  
  public GSCCaseCreationPage selectWorkgroup(String Workgroup) throws InterruptedException
  {
                try{
                                
                                 Thread.sleep(3000);
                }catch(Exception e)
                {
                                e.printStackTrace();
                }
                  CommonFunctions.waitForElement(driver, WorkSubgroup).sendKeys(Workgroup);  
                  //CommonFunctions.selectFromDropdown(driver, Workgroup,  WorkSubgroup);
                  return new GSCCaseCreationPage(driver);
  }
   public GSCCaseCreationPage clickonAccept()
   {
                   CommonFunctions.waitForElement(driver, ClickonAcceptButton).click();
                                  return new GSCCaseCreationPage(driver);
   }
   public GSCCaseCreationPage clickonRoute()
   {
                   CommonFunctions.waitForElement(driver, ClickonRouteButton).click();
                                  return new GSCCaseCreationPage(driver);
   }
   //******************Aparajita*AuditTrails*********************************
   public GSCCaseCreationPage clickonActions()
   {
                   CommonFunctions.waitForElement(driver, ClickonActionButton).click();
                                  return new GSCCaseCreationPage(driver);
   }
   public GSCCaseCreationPage sendcasemail()
   {
                   try {
                                   Thread.sleep(2000);
                                   
                   }catch(Exception e)
                   {
                                   e.printStackTrace();
                   }
                   CommonFunctions.waitForElement(driver, ClickGSCSendCaseMailButton).click();
                                  return new GSCCaseCreationPage(driver);
                   
   }
   
   public GSCCaseCreationPage entersendcasemail(String mail)
   {
                   try {
                                   Thread.sleep(2000);
                   }catch(Exception e) {
                                   e.printStackTrace();
                   }
                   CommonFunctions.waitForElement(driver, ClickGSCEmailEnterBox).sendKeys(mail);
                                  return new GSCCaseCreationPage(driver);
                   
   }
   public GSCCaseCreationPage sendbutton()
   {
                   /*try {
                                   Thread.sleep(2000);
                                  
                   }catch(Exception e) {
                                   e.printStackTrace();
                   }*/
                   CommonFunctions.waitForElement(driver, ClickGSCSendButton).click();
                                  return new GSCCaseCreationPage(driver);
                   
   }
   
   public GSCCaseCreationPage audittrails()
   {
                   CommonFunctions.scrollToElement(driver, AuditTrails);
                   CommonFunctions.waitForElement(driver, AuditTrails).click();
                                  return new GSCCaseCreationPage(driver);   
                                  
   }
   public boolean Time()
   {
	   try {
		   Thread.sleep(1000);
		   
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return CommonFunctions.isElementExist(driver, Time);
	   
   }
    
public boolean Description()
   {
	   try {
		   Thread.sleep(1000);
		   
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return CommonFunctions.isElementExist(driver, Description);
	   
   }
   public boolean PerformedBy()
   {
	   try {
		   Thread.sleep(1000);
		   
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return CommonFunctions.isElementExist(driver, PerformedBy);
	   
   } 
   public GSCCaseCreationPage alertVerification()
   {
                   try {
                                   Thread.sleep(2000);
                   }catch(Exception e) {
                                   e.printStackTrace();
                   }
                   CommonFunctions.waitForAlert(driver);
                   return new GSCCaseCreationPage(driver);
   }
   

  
//**************** Aparajita US31497******************************************************************//

public boolean Route_NewStatus()
{
       try {
              Thread.sleep(2000);
       }catch(Exception e) {
              e.printStackTrace();
       }

return CommonFunctions.isElementExist(driver, StatusAsNew);


}
public boolean OwnedStatus()
{
       try {
              Thread.sleep(1000);
       }catch(Exception e) {
              e.printStackTrace();
       }
       return CommonFunctions.isElementExist(driver, StatusOwned);
}


public GSCCaseCreationPage clickonAction()
{
       try {
              Thread.sleep(2000);
              
       }catch(Exception e) {
              e.printStackTrace();
       }
       CommonFunctions.waitForElement(driver, ClickonActionButton).click();
             return new GSCCaseCreationPage(driver);
       
}
public GSCCaseCreationPage clickonWorkcase()
{
      try {
              Thread.sleep(2000);
              
       }catch(Exception e) {
              e.printStackTrace();
       }
       CommonFunctions.waitForElement(driver, WorkcaseButton).click();
             return new GSCCaseCreationPage(driver);
      
}

public GSCCaseCreationPage clickontransfer_case_Workbasket()
{
      try {
              Thread.sleep(2000);
              
       }catch(Exception e) {
              e.printStackTrace();
       }
       CommonFunctions.waitForElement(driver, Transfer_case_To_WB).click();
             return new GSCCaseCreationPage(driver);
    
}

public GSCCaseCreationPage clickontransfer()
{
      try {
              Thread.sleep(2000);
              
       }catch(Exception e) {
              e.printStackTrace();
       }
       CommonFunctions.waitForElement(driver, Transfer_Button).click();
             return new GSCCaseCreationPage(driver);
}


}
