package com.deere.mailrelatedpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.deere.global.CommonFunctions;

public class GmailStep2 {

	@FindBy(xpath="(//a[@href='https://www.google.co.in/intl/en/options/'])[1]")
	private WebElement GmailAppButton;
	
	@FindBy(xpath="")
	private WebElement GmailButton;
	
protected WebDriver driver;
	
	public  GmailStep2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public boolean hasAppButtonExist() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(GmailAppButton));
				
		return CommonFunctions.isElementExist(driver,GmailAppButton );
	}
	
	/*
	new WebDriverWait(driver, 95).until(ExpectedConditions
			.presenceOfElementLocated(By.xpath("(//a[@href='https://www.google.co.in/intl/en/options/'])[1]")));
	driver.findElement(By.xpath("(//a[@href='https://www.google.co.in/intl/en/options/'])[1]")).click();
	*/
	 public GmailStep2 clickOnAppsButton1(){
		 new WebDriverWait(driver, 95).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@href='https://www.google.co.in/intl/en/options/'])[1]")));
		 System.out.println("presence of toogle");
		   CommonFunctions.waitForElement(driver, GmailAppButton).click();
		   System.out.println("Clicked on toogle");
	       return new GmailStep2(driver);
	       
		    }
	
	 public GmailStep2 clickOnAppsButton(){
	   CommonFunctions.waitForElement(driver, GmailAppButton).click();
       return new GmailStep2(driver);
       
	    }
		
	 public GmailStep3 clickOnGmailButton(){
		   CommonFunctions.waitForElement(driver, GmailButton).click();
	       return new GmailStep3(driver);
	       
		    }
	 public GmailStep3 clickOnGmailButton1(){
		 new WebDriverWait(driver, 60).until(ExpectedConditions
					.visibilityOf(GmailButton));
		 CommonFunctions.waitForElement(driver, GmailButton).click();
		 
			System.out.println("clicked on GMAIL button");
		  // CommonFunctions.waitForElement(driver, GmailButton).click();
	       return new GmailStep3(driver);
	       
		    }
			
}
