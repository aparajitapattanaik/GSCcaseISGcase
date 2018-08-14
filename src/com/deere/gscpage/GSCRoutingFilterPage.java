package com.deere.gscpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;

public class GSCRoutingFilterPage {

	@FindBy(xpath="(//label[contains(text(),'Home')])[1]")
	private WebElement homePagetab;
	
	@FindBy(xpath="(//*[@data-test-id='201708231545550244393669'])[1]")
	private WebElement Filters;
	
	@FindBy(xpath="//*[@name='$PpyDisplayHarness$pFilterOptList$gWG$pFilterOpt$l1$pPropertyName']")
	private WebElement workgroups;
	
	@FindBy(xpath="(//span[text()='AgCC'])[1]")
	private WebElement workgroupselection;
	
	@FindBy(xpath="//*[@id='RULE_KEY']/fieldset/div/div[2]/div/div/div/div/div")
	private WebElement subgroup;
	
	@FindBy(xpath="(//input[@data-test-id='20180215124155099052369'])[1]")
	private WebElement subgroup_selection;
	
	@FindBy(xpath="(//*[@class='buttonTdButton'])[1]")
	private WebElement subgroup_submit;
	
	@FindBy(xpath="(//*[@id='SelectCheckBox4'])[2]")
	private WebElement case_type;
	
	@FindBy(xpath="//*[@data-test-id='20141008160437053510472']")
	private WebElement filter_submit;
	
	@FindBy(xpath="//span[@id='modaldialog_hd_title']")
	private WebElement FilterPreferances;


  protected WebDriver driver;
		
     public GSCRoutingFilterPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
	}
     public GSCRoutingFilterPage clickonWorkGroupQueuefilter()
     {
    	 try {
    		 Thread.sleep(2000);
    	 } catch(Exception e)
    		 {
    			 e.printStackTrace();
    		 		 }
    		  CommonFunctions.waitForElement(driver, Filters).click();
    		  return new GSCRoutingFilterPage(driver);
    	 } 
     
     public GSCRoutingFilterPage clickonFilter()
     {
    	 try {
    		 Thread.sleep(2000);
    	 } catch(Exception e)
    		 {
    			 e.printStackTrace();
    		 		 }
    		  CommonFunctions.waitForElement(driver, Filters).click();
    		  return new GSCRoutingFilterPage(driver);
    	 }
     public GSCRoutingFilterPage subgroupsubmitbutton()
     {
    	 try {
    		 Thread.sleep(2000);
    	 } catch(Exception e)
    		 {
    			 e.printStackTrace();
    		 		 }
    		  CommonFunctions.waitForElement(driver, subgroup_submit).click();
    		  return new GSCRoutingFilterPage(driver);
    	 }   
     public GSCRoutingFilterPage entersubgroupselection()
     {
    	 try {
    		 Thread.sleep(2000);
    	 } catch(Exception e)
    		 {
    			 e.printStackTrace();
    		 		 }
    		  CommonFunctions.waitForElement(driver, subgroup).click();
    		  return new GSCRoutingFilterPage(driver); 
     }
     public GSCRoutingFilterPage enterWorkbasket(String WBasket)
     {
   		CommonFunctions.waitForElement(driver, workgroups).sendKeys(WBasket);
    			return new GSCRoutingFilterPage(driver);
    		}
     public GSCRoutingFilterPage selectSubgroups(String Subgroup)
     {
   		CommonFunctions.waitForElement(driver, subgroup_selection).sendKeys(Subgroup);
   		CommonFunctions.waitForElement(driver, subgroup_selection).click();
   		
    			return new GSCRoutingFilterPage(driver);
    		}
	  
     
    	public boolean homePageDisplayed()
    	{
    		try {
    			
    			Thread.sleep(3000);
    			
    		}catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    
    		
    		
    
    	//CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadget);
    	return CommonFunctions.isElementExist(driver, homePagetab);
    	}
    	 
    	public boolean filterpreferancesDisplayed()
    	{
    		try {
    			Thread.sleep(2000);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    		return CommonFunctions.isElementExist(driver, FilterPreferances);
    	}
   

}