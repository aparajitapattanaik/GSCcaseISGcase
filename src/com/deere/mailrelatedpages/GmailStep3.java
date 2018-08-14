package com.deere.mailrelatedpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deere.global.CommonFunctions;
import com.deere.webformpages.CommentsWebForm;

public class GmailStep3 {

	@FindBy(xpath="//input[@aria-label='Search']")
	private WebElement GmailSearchBox;
	
	@FindBy(xpath="//span[@class='gbqfi gb_hc']")
	private WebElement GmailSearchIcon;
	
	@FindBy(xpath="(//span[contains(text(),\"Global Support Center Case Update\")])[3]")
	private WebElement InboxMessageLink;
	
	@FindBy(xpath="//a[contains(text(),'Click here to add additional comments to the ')]")
	private WebElement AddCommentsLink;
	
	
	
	
	
	
//	String SearchValue,Caseid;
	
protected WebDriver driver;
	
	public  GmailStep3(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public boolean hasAppButtonExist() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver, GmailSearchBox);
	}
	
	 public GmailStep3 clickOnSearchBox(){
		 System.out.println("About to click search box");
		   CommonFunctions.waitForElement(driver, GmailSearchBox).click();
	       return new GmailStep3(driver);
	       
	   }
	 
	 public GmailStep3 EnterValueInSearchBox(String SearchValue, String Caseid){
		   CommonFunctions.waitForElement(driver, GmailSearchBox).sendKeys(SearchValue+Caseid);
	       return new GmailStep3(driver);
	       
	   }
	 
	 public GmailStep3 clickOnSearchIcon(){
		 System.out.println("About to click search box");
		   CommonFunctions.waitForElement(driver, GmailSearchIcon).click();
	       return new GmailStep3(driver);
	   }
	 public GmailStep3 clickOnInboxLink(){
		 System.out.println("About to click Inbox link");
		   CommonFunctions.waitForElement(driver, InboxMessageLink).click();
	       return new GmailStep3(driver);
	   }
	 
	 public CommentsWebForm clickOnAddCommentsLink(){
		 System.out.println("About to click Inbox link");
		   
		   CommonFunctions.waitForElement(driver, AddCommentsLink).click();
	       return new CommentsWebForm(driver);
	   }
	 
	 
	 
	 
	
	/*
	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Global Support Center Case Update: "+" ISG-2216");
	System.out.println("entered value in search box ");
	
	//clicking on search button
	driver.findElement(By.xpath("//span[@class='gbqfi gb_hc']")).click();
	System.out.println("clicked on search button");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
   WebElement Element1=driver.findElement(By.xpath("(//span[contains(text(),\"Global Support Center Case Update\")])[3]"));
   Element1.click();
   System.out.println("clicked on mail link"); 

//clicked on additional comments link
   //clicked on additional comments link
   new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Click here to add additional comments to the ')]"))).click();
	System.out.println("clicked on additional comments link ");
	
	js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);"); */
	
}
