package com.deere.mailrelatedpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.isgpage.ISGCasePage;

public class ViewEmaiPage {

	
	@FindBy(xpath="//iframe[@id='PegaGadget0Ifr']")
	private WebElement iframePegaGadgetISG;
	
	@FindBy(xpath="")
	private WebElement iframePegaGadgetISG_Assertion;
	
	
	@FindBy(xpath="(//td[contains(text(),'@')])[1]")
	private WebElement mail_Sent;
	
	@FindBy(xpath="//td[contains(text(),'JohnDeere.com')]")
	private WebElement mail_From;
	
	@FindBy(xpath="(//td[@class='dataValueRead'])[3]")
	private WebElement mail_To;
	
	@FindBy(xpath="//td[contains(text(),'New Deere.com Case ')]")
	private WebElement mail_subject;
	
	@FindBy(xpath="//font[contains(text(),'Error sending email')]")
	private WebElement mail_errorMsg;
	
	@FindBy(xpath="//iframe[@name='ShowIFrame']")
	private WebElement iframePegaGadgetViewEmail;
	
	@FindBy(xpath="//br[2]")
	private WebElement OpenedCaseMessage;
	
	
	public static String  HTMLPageSourceCode;
	
	protected WebDriver driver;
		
	public ViewEmaiPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
			
	/************************/	
	//Code For Assertions
				
			
	public boolean hasSentDisplayed() {
			
	try {
					Thread.sleep(1000);
		} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
	}
	 return CommonFunctions.isElementExist(driver,mail_Sent);
	}
	
	public boolean hasToDisplayed() {
		
		try {
						Thread.sleep(1000);
			} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
		}
    	 return CommonFunctions.isElementExist(driver,mail_To);
		}
    public boolean hasFromDisplayed() {
		
		try {
						Thread.sleep(1000);
			} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
		}
		 return CommonFunctions.isElementExist(driver,mail_From);
		}
	
 public boolean hasSubjectDisplayed() {
		
		try {
						Thread.sleep(1000);
			} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
		}
		 return CommonFunctions.isElementExist(driver,mail_subject);
		}
 
   public boolean haserrorMsgDisplayed() {
		
		try {
						Thread.sleep(1000);
			} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
		}
		 CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadgetViewEmail);
		 return CommonFunctions.isElementExist(driver,mail_errorMsg);
		}
   
   public boolean hasMailWindowDisplayed() {
		
		try { 
						Thread.sleep(4000);
			} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
		}
		CommonFunctions.switchToNextWindow(driver);
		String ChildHandler=driver.getWindowHandle();
		System.out.println("driver switched to next window"+ChildHandler );
		try {
			 Thread.sleep(2000);
            } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            }
		return CommonFunctions.isElementExist(driver,mail_From );
		}
   
  
   
   
   public  ViewEmaiPage getOpenedCaseMessage() {
		try {
						Thread.sleep(1000);
			} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
		    }
			 HTMLPageSourceCode = driver.getPageSource();
			 return new ViewEmaiPage(driver);
      }	
   
   
   public  ViewEmaiPage  hasOpenedCaseMessageDisplayed() {
         try
        {
               // HTML Page Source code contains defined text
              CommonFunctions.assertTrue(HTMLPageSourceCode.contains("Please be informed, a customer has opened case"),"");
               //Message is printed when text contains in HTML Page Sources
               System.out.println("Text is present on opened webpage");
        }
        catch (Throwable e)
        {
               //Message is printed when text NOT contain in HTML Page Sources
              System.out.println("Text is NOT present on opened webpage");
        }
         return new ViewEmaiPage(driver);
		}
   
   
   public  ISGCasePage SwitchToMainPage() {
		  driver.switchTo().window(ISGCasePage.ParentHandle);
		  return new ISGCasePage(driver);
     }	
   
 
   
	
	
}
