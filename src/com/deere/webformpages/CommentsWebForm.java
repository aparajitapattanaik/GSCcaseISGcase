package com.deere.webformpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deere.global.CommonFunctions;
import com.deere.global.CoreTestCase;

public class CommentsWebForm extends CoreTestCase{
	
	@FindBy(xpath="")
	private WebElement UserComments;
	
	@FindBy(xpath="")
	private WebElement Clear;
	
	@FindBy(xpath="")
	private WebElement Submit;
	
	@FindBy(xpath="")
	private WebElement FinalMessage;
	
	

protected WebDriver driver;
	
	public  CommentsWebForm(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public boolean hasFinalMessage() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, FinalMessage);
	}
	
	
	 public CommentsWebForm sendUserComments(String comments){
		 System.out.println("enter comments");
		// String parentHandle = driver.getWindowHandle();
		 CommonFunctions.switchToNextWindow(driver);
		 CommonFunctions.waitForElement(driver, UserComments).sendKeys(comments);
	     return new CommentsWebForm(driver);
	       
	   }
	 
	 public CommentsWebForm ClearComments(){
		 System.out.println("enter comments");
		   CommonFunctions.waitForElement(driver, Clear).click();
	       return new CommentsWebForm(driver);
	    }
	 
	 public CommentsWebForm SubmitComments(){
		 System.out.println("enter comments");
		   CommonFunctions.waitForElement(driver, Submit).click();
	       return new CommentsWebForm(driver);
	    }
	 
	

}
