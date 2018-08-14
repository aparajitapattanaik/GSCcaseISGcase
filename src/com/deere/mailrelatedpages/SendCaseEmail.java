package com.deere.mailrelatedpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;


public class SendCaseEmail {
	
	@FindBy(xpath="//span[contains(text(),'Send Case Email')]")
    private WebElement ClickGSCSendCaseMailButton;
	
	 @FindBy(xpath="//input[@data-test-id='201612271036230356233958']")
     private WebElement ClickGSCEmailEnterBox;
	 
     @FindBy(xpath="//button[@data-test-id='20140919030420037410647']")
     private WebElement ClickGSCSendButton;
	
	protected WebDriver driver;
     
    public SendCaseEmail(WebDriver driver) {
                     PageFactory.initElements(driver, this);
                     this.driver=driver;
     }

    public SendCaseEmail entersendcasemail(String mail)
    {
                    try {
                                    Thread.sleep(2000);
                    }catch(Exception e) {
                                    e.printStackTrace();
                    }
                    CommonFunctions.waitForElement(driver,ClickGSCEmailEnterBox).sendKeys(mail);
                                   return new SendCaseEmail(driver);
                    
    }
    
    public SendCaseEmail sendbutton()
    {
                    /*try {
                                    Thread.sleep(2000);
                                   
                    }catch(Exception e) {
                                    e.printStackTrace();
                    }*/
                    CommonFunctions.waitForElement(driver, ClickGSCSendButton).click();
                                   return new SendCaseEmail(driver);
                    
    }
}
