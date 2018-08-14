package com.deere.isgpage;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.deere.global.CommonFunctions;


public class ISGLinkSolutionPage {
	
	@FindBy(xpath = "//table[@id='RULE_KEY'][@aria-label='Workgroup Queue']")
	private WebElement WorkGroupQueue;
	
	@FindBy(xpath = "//table[@pl_prop_class='Assign-WorkBasket']")
	private WebElement caseTable;
	
	
	protected WebDriver driver;

	public ISGLinkSolutionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	// Click on WorkgroupQueue
	public ISGLinkSolutionPage clickonWorkGroupQueue() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, WorkGroupQueue).click();
		return new ISGLinkSolutionPage(driver);
	}
	
	public boolean hasWorkGroupQueueGridDisplayed() {
		return CommonFunctions.isElementExist(driver, caseTable);
	}
	
	@FindBy(xpath="//a[@title='Advanced Filters']")
	private WebElement filterLink;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitBtn;

	@FindBy(xpath="//span[contains(text(),'Filter Preferences')]")
	private WebElement filterPreferences;
	
	@FindBy(xpath="(//input[@data-test-id='201709231530290040900469'])[6]")
	private WebElement isgChckBox;
	
	@FindBy(xpath="//button[@data-test-id='20141008160437053510472']")
	private WebElement submit;
	
	
	
	public boolean clickFilterLink()
	{
		 CommonFunctions.waitForElement(driver, filterLink).click();
		 return CommonFunctions.isElementExist(driver, filterPreferences);
		
	}
	
	public ISGLinkSolutionPage chkIsg()
	{
		 CommonFunctions.waitForElement(driver, isgChckBox).click();
			 CommonFunctions.waitForElement(driver, submit).click();
			 return new	ISGLinkSolutionPage(driver);
	}
	
	
	
	
	
	private static HashMap<Long, String> isgCaseIdTSS = new HashMap<Long, String>();
	
	@FindBy(xpath = "//div[@node_name='CaseHeader']//span[@class='workarea_header_id']")
	private static WebElement isgCaseID;

	public String getIsgCaseId() {
		return isgCaseIdTSS.get(Thread.currentThread().getId());
	}

	public String   setIsgCaseID() {
		 return isgCaseIdTSS.put(Thread.currentThread().getId(),
				 	CommonFunctions.waitForElement(driver, isgCaseID).getText().replace("(", "").replace(")", ""));
	

	}
	
	@FindBy(xpath = "//label[contains(text(),'ISG-')]")
   	private List<WebElement> sizeISGCase; 

   

	
	
	@FindBy(xpath = "//table[@id='RULE_KEY'][@aria-label='Solution Search']")
	private static WebElement soluSearch;
	
	@FindBy(xpath = "(//button[@data-test-id='20170614162426000640819'])[1]")
	private static WebElement searchBtn;
	
	@FindBy(xpath = "//table[@data-test-id='201709191447440631401-layout']")
	private static WebElement listOfSolu;
	
	@FindBy(xpath = "(//a[@data-test-id='201708041604420982125695'])[1]")
	private static WebElement listSolu;
	
	@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
	private static WebElement linkSoluPopUp;
    
	@FindBy(xpath = "//iframe[@name='PegaGadget4Ifr']")
	private static WebElement frame;
	
	@FindBy(xpath = "(//input[@data-test-id='201706121156570626322805'])[1]")
	private static WebElement soluLang;
	
	@FindBy(xpath = "//div[@id='po0']")
	private static WebElement soluLangFrame; 
	
	
	@FindBy(xpath = "//tr[@data-test-id='201710030705450264275-R3']")
	private static WebElement difflanguage;
	
	@FindBy(xpath = "(//input[@data-test-id='20170608181712065454824'])[3]")
	private static WebElement sellanguageCheckbox;
	
	@FindBy(xpath = "(//button[@data-test-id=\"20170614162426000640819\"])[2]")
	private static WebElement searchButton;
	
	@FindBy(xpath = "(//a[@data-test-id='201708041604420982125695'])[1]")
	private static WebElement linkToCase;
	
	@FindBy(xpath = "(//button[@data-test-id=\"20170614162426000639748\"])[1]")
	private static WebElement clearBtn;



	public ISGLinkSolutionPage clickSoluSeach() {
		 CommonFunctions.waitForElement(driver, soluSearch).click();
		 CommonFunctions.SwitchToDefaultFrame(driver);
		 CommonFunctions.waitAndSwitchToFrame(driver, frame);
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// CommonFunctions.waitForElement(driver, searchBtn).click();
		 return new ISGLinkSolutionPage(driver);
	}
	
	public ISGLinkSolutionPage clickSearchBtn() {
		
		 CommonFunctions.isElementExist(driver, clearBtn);
		 CommonFunctions.isElementExist(driver, searchBtn);
		 CommonFunctions.waitForElement(driver, searchBtn).click();
		 return new ISGLinkSolutionPage(driver);
	}
	
	public ISGLinkSolutionPage selectLanguage() {   
		 CommonFunctions.waitForElement(driver, soluSearch).click();
		 CommonFunctions.SwitchToDefaultFrame(driver);
		 CommonFunctions.waitAndSwitchToFrame(driver, frame);
		 CommonFunctions.waitForElement(driver, soluLang).click();
		 CommonFunctions.isElementExist(driver, soluLangFrame);
		 CommonFunctions.isElementExist(driver, difflanguage);
		 CommonFunctions.waitForElement(driver, sellanguageCheckbox).click();
		 CommonFunctions.waitForElement(driver, searchButton).click();
		 CommonFunctions.waitForElement(driver, linkToCase).click();
		 return new ISGLinkSolutionPage(driver);
	}


	public boolean hasListOfSolutionsDisplayed() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		 CommonFunctions.waitAndSwitchToFrame(driver, frame);
		return CommonFunctions.isElementExist(driver, listOfSolu);
	}


	public ISGLinkSolutionPage clickLinkSolution() {
		 CommonFunctions.waitForElement(driver, listSolu).click();
		 return new ISGLinkSolutionPage(driver);
	}
	
	public boolean hasLinkSolutionInSameLanguagePopUpDisplayed() {
		return CommonFunctions.isElementExist(driver, linkSoluPopUp);
	}


	
	@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
	private static WebElement popHeader;
	
	@FindBy(xpath = "//*[@id=\"modaldialog_hd\"]")
	private static WebElement popHeaderTwo;
	
	@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
	private static WebElement linkCaseId1;
	
	@FindBy(xpath = "(//*[@id='RULE_KEY']/tbody/tr/td[2]/span/label)[8]")
	private static WebElement soluOpend;
	
	@FindBy(xpath = "//*[@id=\"nextButton\"]")
	private static WebElement nextBtn;
	
	@FindBy(xpath = "//*[@id=\"backButton\"]")
	private static WebElement backBtn;
	
	@FindBy(xpath = "//*[@id=\"submitButton\"]")
	private static WebElement finBtn;
	
	@FindBy(xpath = "//a[contains(text(),'ISG-')]")
   	private List<WebElement> sizeISGCasePopUp; 
	
	
	public static Iterator<String> iterator ;
	public ISGLinkSolutionPage clickToOpenISGCase() throws InterruptedException {
	    clickFilterLink();
		chkIsg();
		CommonFunctions.retryingFindElement(driver, caseTable);
       for (int i = 1; i <= 5; i++)
	        {
	            // terminate loop when i is 5.
	            if (i == 5)
	            break;
	            	   System.out.println("i: " + i);
	            	
	      String caseIdNum =  driver.findElement(By.xpath("(//span[@data-test-id='201711161622040015382477'])[" + i +"]")).getText();
	     driver.findElement(By.xpath("(//span[@data-test-id='201711161622040015382477'])[" + i +"]")).click();
	   		
	         Collection<String> Elements = new ArrayList<String>();
	  	           Elements.add(caseIdNum);
	  	          // System.out.println(Elements);
	  	         Iterator<String> iterator = Elements.iterator();
	  	          // while loop
	  	           while (iterator.hasNext()) {
	  	           System.out.println("value= " + iterator.next());
	  	           }
	 
	            Thread.sleep(3000);
			 CommonFunctions.waitForElement(driver, WorkGroupQueue).click();
				clickFilterLink();
				chkIsg();
				Thread.sleep(3000);
}		

//	int sizeISGCases = CommonFunctions.waitForElements(driver, sizeISGCase).size();
//    for (int j = 0; j < sizeISGCases; j++) {
//           String elementText = driver.findElements(By.xpath("//label[contains(text(),'ISG-')]")).get(j).getText();
//           ArrayList<String> Elements=new ArrayList<>();
//           Elements.add(elementText);
//           System.out.println(Elements);
//           System.out.println(Elements.get(j));
//           System.out.println(Elements.get(j).substring(2, 8));

   
	      
		 return new ISGLinkSolutionPage(driver);
	}
	
	public static Iterator<String> caseiterator ;
	public static String checkbox;
	public ISGLinkSolutionPage selectCheckBox() {
		CommonFunctions.isElementExist(driver, popHeader);
       int sizeOfISGCases = CommonFunctions.waitForElements(driver, sizeISGCasePopUp).size();
		System.out.println(sizeOfISGCases);
	    for (int j = 0; j < sizeOfISGCases; j++) {
	    	 if (j == sizeOfISGCases)
		            break;
	           String elementText = driver.findElements(By.xpath("//a[contains(text(),'ISG-')]")).get(j).getText();
	          Collection<String> Elements = new ArrayList<String>();
	           Elements.add(elementText);
	           
	             caseiterator = Elements.iterator();
	           
	           // while loop
	           while (caseiterator.hasNext()) {
	           System.out.println("value= " + caseiterator.next());
	           }
	          
	    }
	           //System.out.println(Elements.get(j).substring(2, 8));
	           
	           CommonFunctions.waitForElement(driver, checkBox).click();
				 checkbox=CommonFunctions.waitForElement(driver, caseNum).getText();
				 System.out.println("the checkbox id is:" +checkbox);
	           
		CommonFunctions.waitForElement(driver, nextBtn).click();
		CommonFunctions.isElementExist(driver, popHeaderTwo);
		CommonFunctions.isElementExist(driver, backBtn);
		CommonFunctions.isElementExist(driver, finBtn);
		 CommonFunctions.waitForElement(driver, backBtn).click();
		 CommonFunctions.waitForElement(driver, nextBtn).click();
			CommonFunctions.isElementExist(driver, popHeaderTwo);
			 CommonFunctions.isElementExist(driver, message);
			CommonFunctions.isElementExist(driver, backBtn);
			CommonFunctions.waitForElement(driver, finBtn).click();
	  
		 CommonFunctions.isElementExist(driver, linkSoluPopUp);
		 
		 
		 return new ISGLinkSolutionPage(driver);
	}
	
	//contains a list of 5 recently opened Cases with checkbox, case ID and Summary.
	public ISGLinkSolutionPage comparerecentlyOpenedCasesInLinkSolution() {
		//Compare Two  Iterators to over a Link List
				boolean same = true;
			        while(iterator.hasNext()){
			        	System.out.println(iterator.next() );
			            if(!iterator.next().equals(caseiterator.next())){
			            	System.out.println(caseiterator.next() );
			            same = false;
			            break;
			          }
			        }
	        return new ISGLinkSolutionPage(driver);
	       
		}
	
	public ISGLinkSolutionPage compareCaseIdsAndOpenCase() {
	//Compare Two  Iterators to over a Link List
		boolean same = true;
	        while(iterator.hasNext()){
	        	System.out.println(iterator.next() );
	            if(!iterator.next().equals(checkbox)){
	            	System.out.println(checkbox);
	            same = false;
	            break;
	          }
	        }
        return new ISGLinkSolutionPage(driver);
       
	}
	
	@FindBy(xpath = "//input[@data-test-id='20170923174822053693855']")
	private static WebElement txtBox;
	
	@FindBy(xpath = "//span[@data-test-id='201711161622040015382477']")
	private static WebElement caseIdClick;
	
	
	public ISGLinkSolutionPage chkIsgCaseEnterDataIntoTxtFiled()
	{
		 CommonFunctions.waitForElement(driver, isgChckBox).click();
		 CommonFunctions.waitForElement(driver, txtBox).sendKeys(checkbox);
			 CommonFunctions.waitForElement(driver, submit).click();
			 return new	ISGLinkSolutionPage(driver);
	}
	
	public ISGLinkSolutionPage openCase() {
		clickonWorkGroupQueue();
		 clickFilterLink();
		 chkIsgCaseEnterDataIntoTxtFiled();
		CommonFunctions.waitForElement(driver, caseIdClick).click();
		alertHandle();
		alertHandle();
		switchToFrame();
	        return new ISGLinkSolutionPage(driver);
	       
		}

	public ISGLinkSolutionPage switchToFrame() {
		CommonFunctions.SwitchToDefaultFrame(driver);
		CommonFunctions.switchToiFrameByWebElement(driver, iFrame);
		
	        return new ISGLinkSolutionPage(driver);
	       
		}
	
	
	
	public ISGLinkSolutionPage alertHandle() {
		CommonFunctions.waitForAlert(driver);
		
	        return new ISGLinkSolutionPage(driver);
	       
		}
	@FindBy(xpath = "//iframe[@name=\"PegaGadget0Ifr\"]")
	private static WebElement iFrame;
	
			
			@FindBy(xpath = "(//a[@data-test-id='20160324082916014825607'])[1]")
			private static WebElement solutionClick;
			
			@FindBy(xpath = "//*[@id='RULE_KEY']/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/div")
			private static WebElement actionClick;
			
			@FindBy(xpath = "//ul[@id='pyNavigation1509690005731']")
			private static WebElement actionFrame;
			
			@FindBy(xpath = "//ul[@id='pyNavigation1509690005731']/li[1]")
			private static WebElement actionLinksolu;
			
			
			@FindBy(xpath = "//ul[@id='pyNavigation1509690005731']/li[2]")
			private static WebElement actionViewLang;
			
			
			@FindBy(xpath = "//ul[@id='pyNavigation1509690005731']/li[3]")
			private static WebElement actionPrint;
			
			@FindBy(xpath = "//iframe[@id='PegaGadget5Ifr']")
			private static WebElement iframe;
			
			
			public ISGLinkSolutionPage clickSolution() {
				 CommonFunctions.waitForElement(driver, solutionClick).click();
				 return new ISGLinkSolutionPage(driver);
			}
			
			

			public boolean hasSolutionOpend() {
				return CommonFunctions.isElementExist(driver, soluOpend);
			}
			
			public ISGLinkSolutionPage clickAction() {
				CommonFunctions.SwitchToDefaultFrame(driver);
				 CommonFunctions.waitAndSwitchToFrame(driver, iframe);
				// CommonFunctions.isElementExist(driver, actionClick);
				 CommonFunctions.waitForElement(driver, actionClick).click();
					CommonFunctions.isElementExist(driver, actionFrame);
					 CommonFunctions.isElementExist(driver, actionLinksolu);
					 CommonFunctions.isElementExist(driver, actionViewLang);
					 CommonFunctions.isElementExist(driver, actionPrint);
					 CommonFunctions.waitForElement(driver, actionLinksolu).click();
				 
				 return new ISGLinkSolutionPage(driver);
			}
			
//			public ISGLinkSolutionPage clickLinksolutionFromAction() {
//				 CommonFunctions.waitForElement(driver, actionClick).click();
//				 CommonFunctions.waitForElement(driver, actionLinksolu).click();
//				 return new ISGLinkSolutionPage(driver);
//			}
			

			@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
			private static WebElement linlSoluPopUpHead;
			
			@FindBy(xpath = "//tr[@data-test-id='201709290553370725472-R1']")
			private static WebElement caseOne;
			
			@FindBy(xpath = "//tr[@data-test-id='201709290553370725472-R2']")
			private static WebElement caseTwo;
			
			@FindBy(xpath = "//tr[@data-test-id='201709290553370725472-R3']")
			private static WebElement caseThree;
			
			@FindBy(xpath = "//tr[@data-test-id='201709290553370725472-R4']")
			private static WebElement caseFour;
			
			@FindBy(xpath = "//tr[@data-test-id='201709290553370725472-R5']")
			private static WebElement caseFive;
			
			@FindBy(xpath = "//table[@pl_prop_class='Code-Pega-Thread']")
			private WebElement linkTable;
			
			@FindBy(xpath = "//button[@id='nextButton']")
			private WebElement nextButton;
			
			@FindBy(xpath = "(//input[@data-test-id='20160611050517053825243'])[1]")
			private WebElement checkBox;
			
			@FindBy(xpath = "//div[@data-test-id='201801090214370877163806']")
			private WebElement message;
			
			@FindBy(xpath = "//button[@id='submitButton']")
			private WebElement finishBtn;
			
			@FindBy(xpath = "//iframe[@id='PegaGadget2Ifr']")
			private WebElement LinkIframe;
			
			@FindBy(xpath = "(//a[@data-test-id='20160511062025000045972'])[1]")
			private WebElement caseNum;
			
			private static String caseIdOne;
			
			public ISGLinkSolutionPage linksolutionPopUp() {
                 CommonFunctions.isElementExist(driver, linlSoluPopUpHead);
//				 CommonFunctions.isElementExist(driver, caseOne);
//				 CommonFunctions.isElementExist(driver, caseTwo);
//				 CommonFunctions.isElementExist(driver, caseThree);
//				 CommonFunctions.isElementExist(driver, caseFour);
				 //CommonFunctions.isElementExist(driver, caseFive);
				 CommonFunctions.waitForElement(driver, checkBox).click();
				 String caseIdOne=CommonFunctions.waitForElement(driver, caseNum).getText();
				 System.out.println(caseIdOne);
				 CommonFunctions.waitForElement(driver, nextButton).click();
				 CommonFunctions.isElementExist(driver, message);
				 CommonFunctions.waitForElement(driver, finishBtn).click();
				 
				 
				 return new ISGLinkSolutionPage(driver);
			}
			
			@FindBy(how = How.PARTIAL_LINK_TEXT, using = "98516")
			private WebElement soluId;
			
			@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Reinforcing Engine Cover to Prevent Cracks")
			private WebElement solDes;
			
			@FindBy(xpath = " //strong[contains(text(),'Publication Date')]")
			private WebElement publicationDate;
			
			
			@FindBy(xpath = " //strong[contains(text(),'Solution Number: 1234')]")
			private WebElement solutionNumber;
			
			@FindBy(xpath = " //strong[contains(text(),'Solution Summary: HBI-AX-1345 APR')]")
			private WebElement solutionSummary;

			
			@FindBy(xpath = "(//*[@id='RULE_KEY']/tbody/tr/td[2]/span/label)[8]")
			private WebElement caseId;
			
			public ISGLinkSolutionPage naviageToCase() {
				CommonFunctions.SwitchToDefaultFrame(driver);
				String caseNum=CommonFunctions.waitForElement(driver, caseId).getText();
				System.out.println(caseNum);
				
//				int sizeISGCases = CommonFunctions.waitForElements(driver, sizeISGCase).size();
//			    for (int j = 0; j < sizeISGCases; j++) {
//			           String elementText = driver.findElements(By.xpath("//label[contains(text(),'ISG-')]")).get(j).getText();
//			           ArrayList<String> Elements=new ArrayList<>();
//			           Elements.add(elementText);
//			           System.out.println(Elements);
//			           System.out.println(Elements.get(j));
//			           System.out.println(Elements.get(j).substring(2, 8));
//			           
//			           if (Elements.get(j).substring(2, 8).contains(caseNum)) {
//
//			        	   Elements.get(j).substring(2, 8).contains(caseNum);
					CommonFunctions.waitForElement(driver, caseId).click();
					CommonFunctions.isElementExist(driver, soluId);
					CommonFunctions.isElementExist(driver, solDes);
			
//					else {
//						System.out.println("case Ids are not matching");
//					}
//			    }
				
				return new ISGLinkSolutionPage(driver);
			}

			public boolean hasLinkSolutionDisplayed() {
				
				return CommonFunctions.isElementExist(driver, actionLinksolu);
			}


			public boolean hasViewLanguageDisplayed() {
				// TODO Auto-generated method stub
				return CommonFunctions.isElementExist(driver, actionViewLang);

			}


			public boolean hasPrintDisplayed() {
				// TODO Auto-generated method stub
				return CommonFunctions.isElementExist(driver, actionPrint);

			}
			
			@FindBy(xpath = "//span[@id='modaldialog_hd_title']")
			private static WebElement linkPopUp;
			 
			
			public ISGLinkSolutionPage clickLinkSolutionOption() {
				 CommonFunctions.waitForElement(driver, actionLinksolu).click();
				 CommonFunctions.isElementExist(driver, linkPopUp);
				 return new ISGLinkSolutionPage(driver);
			}
			
			@FindBy(id="FUNC_AREA_NM")
			private WebElement ISGFunctionalArea;
			
			
			
			@FindBy(xpath="//input[@id='FUNC_CODE_NM']")
			private WebElement ISGFunctionalCode;
			
			@FindBy(xpath="//span[text()='1602']")
			private WebElement ISGFunctionalCode_Select;
			
			@FindBy(id="CasePriority")
			private WebElement ISGCase_Priority;
			
			@FindBy(id="LanguageWithCode")
			private WebElement ISGCaselanguagecode;
			
			@FindBy(id="Origin")
			private WebElement ISGCase_Origin;
			
			@FindBy(xpath="//*[@name='$PpyWorkPage$pCaseSummary']")
			private WebElement ISGSummary;

			@FindBy(xpath="(//button[@data-test-id='201802011400580656111285'])[1]")
			private WebElement ISGAccept_Button;
			
			public ISGLinkSolutionPage Functionalarea(String category) {
				CommonFunctions.waitForElement(driver, ISGFunctionalArea).sendKeys(category);
				CommonFunctions.waitForElement(driver, ISGFunctionalArea).sendKeys(Keys.ARROW_DOWN);
				return new ISGLinkSolutionPage(driver);
				}
			
			public ISGLinkSolutionPage FunctionalCode(String category) {
				CommonFunctions.waitForElement(driver, ISGFunctionalCode).sendKeys(category);
				CommonFunctions.waitForElement(driver, ISGFunctionalCode).sendKeys(Keys.ARROW_DOWN);		
				return new ISGLinkSolutionPage(driver);
				}
			
			public ISGLinkSolutionPage ISGCase_Priority() {
				CommonFunctions.selectFromDropdown(driver, "1-Tech in Field - Urgent", ISGCase_Priority);					
				return new ISGLinkSolutionPage(driver);
				}
			public ISGLinkSolutionPage ISGCase_Origin() {
				CommonFunctions.selectFromDropdown(driver, "Email", ISGCase_Origin);					
				return new ISGLinkSolutionPage(driver);
				}
			
			public ISGLinkSolutionPage Summary(String summary) {
				CommonFunctions.waitForElement(driver, ISGSummary).sendKeys(summary);			
				return new ISGLinkSolutionPage(driver);
				}
			public ISGLinkSolutionPage Accept_Button() {
				
				CommonFunctions.waitForElement(driver, ISGAccept_Button).click();			
				return new ISGLinkSolutionPage(driver);
				}
			
			@FindBy(xpath="(//span[@data-test-id=\"201802211054570002105727\"])[1]")
			private WebElement isgCustomer_MainPage_FirstName;
			
			public boolean hasCustomerDetailsDisplayedInMainPage() {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return CommonFunctions.isElementExist(driver,isgCustomer_MainPage_FirstName );	
				
			}
			@FindBy(xpath = "//select[@data-test-id='20180424140126019614930']")
			private WebElement languDD;

			public ISGLinkSolutionPage isgCase_Language(String language) {
				CommonFunctions.waitAndSwitchToFrame(driver, languDD);
				CommonFunctions.selectFromDropdown(driver, language, languDD);
				return new ISGLinkSolutionPage(driver);
			}

			
			@FindBy(xpath = "//div[@node_name='TSSAgentHome']")
			private WebElement homePage;

			public boolean hasHomePageDisplayed() {
				// TODO Auto-generated method stub
				return CommonFunctions.isElementExist(driver, homePage);
			}
  
}
