package com.deere.pages.solutionsearchpage;


import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.deere.global.CommonFunctions;

public class SolutionSearchHomePage {
	
	@FindBy(xpath="//iframe[contains(@src,'SolutionSearchHome')]")
	private WebElement iframePegaGadget;
	
	@FindBy(xpath="//input[@id='SolutionSummary'][contains(@name,'SolutionSummary')]")
	private WebElement searchtextbox ;
	
	@FindBy(xpath="//input[@id='CategoryString'][@title='Search Category']")
	private WebElement categoryTxtbox;
	
	@FindBy(xpath="//table[@id='bodyTbl_right']//tbody//div[@class='oflowDiv']//div[@class='cellIn']/span")
	private List<WebElement> categoryAutoOptions;
	
	@FindBy(xpath="//input[@id='SubCategoryString'][@title='Search Sub-Category']")
	private WebElement subCategoryTxtbox;
	
	@FindBy(xpath="//table[@id='bodyTbl_right']//tr[contains(@id,'$PD_DTACSubCategory')]//div[@class='cellIn']/span")
	private List <WebElement> subCategoryAutoOptions;
	
	@FindBy(xpath="//input[@id='SearchDecalModel']")
	private WebElement decalModelTxtbox;
	
	@FindBy(xpath="//table[@id='bodyTbl_right']/tbody/tr//td/div[@class='oflowDiv']//span[@class='match-highlight']")
	private WebElement autoOptions;
	
	@FindBy(xpath="//input[@id='ModelString'][@title='Select Decal Model']")
	private WebElement modelTxtbox;
	
	@FindBy(xpath="//table[@id='bodyTbl_right']/tbody//div[@class='oflowDiv']//span[@class='match-highlight']")
	private WebElement modelAutoOptions;
	
	@FindBy(xpath="(//button[@data-test-id='20170614162426000640819'])[1]")
	private WebElement SSSearchButton_1;
	
	@FindBy(xpath="(//a[@data-test-id='20160324082916014825607'])[1]")
	private WebElement SSSearchResultLink;
	
	
	
	
	  protected WebDriver driver;
		
		public SolutionSearchHomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
			
	
	public boolean hasSolutionSearchHomePageDisplayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitAndSwitchToFrame(driver, iframePegaGadget);
		return CommonFunctions.isElementExist(driver, searchtextbox);
	}
	
	public SolutionSearchHomePage switchToIFrame() {
		CommonFunctions.switchToiFrameByWebElement(driver, iframePegaGadget);
		return new SolutionSearchHomePage(driver);
	}
	
	public boolean hasCategoryAutoOptionDisplayed(String category) {
		CommonFunctions.waitForElement(driver, categoryTxtbox).sendKeys(Keys.ARROW_DOWN);
		for(int i=0;i<CommonFunctions.waitForElements(driver, categoryAutoOptions).size();i++) {
			if(!CommonFunctions.waitForElements(driver, categoryAutoOptions).get(i).getText().contains(category)){
				continue;
			}
			else{
				return true;
			}
		}
		return false;
	}
	
	public boolean hasSubCategoryAutoOptionDisplayed(String subCategory) {
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctions.waitForElement(driver, subCategoryTxtbox).sendKeys(Keys.ARROW_DOWN);
		for(int i=0;i<CommonFunctions.waitForElements(driver, subCategoryAutoOptions).size();i++) {
			if(!CommonFunctions.waitForElements(driver, subCategoryAutoOptions).get(i).getText().contains(subCategory)){
				continue;
			}
			else{
				return true;
			}
		}
		return false;
	}
	
public boolean hasSolutionSearchResultDisplayed(){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CommonFunctions.isElementExist(driver,SSSearchResultLink);
		
	} 
	
	public SolutionSearchHomePage SSenterCategory(String category) {
		CommonFunctions.waitForElement(driver, categoryTxtbox).sendKeys(category);
		return new SolutionSearchHomePage(driver);
	}	
	
	public SolutionSearchHomePage enterDecalModel(String decalModel) {
	CommonFunctions.waitForElement(driver,decalModelTxtbox).sendKeys(decalModel);
	decalModelTxtbox.sendKeys(Keys.ARROW_DOWN);
	CommonFunctions.waitForElement(driver, autoOptions);
	try {
		if(autoOptions.getText().contains(decalModel)) 
		autoOptions.click();
		Thread.sleep(2000);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return new SolutionSearchHomePage(driver);
	}
	
	public SolutionSearchHomePage SSenterModel(String model) {
		CommonFunctions.waitForElement(driver, modelTxtbox).sendKeys(model);
		modelTxtbox.sendKeys(Keys.ARROW_DOWN);
		CommonFunctions.waitForElement(driver, modelAutoOptions);
		try {
		if(modelAutoOptions.getText().contains(model))
			modelAutoOptions.click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new SolutionSearchHomePage(driver);
	}
	
	public SolutionSearchHomePage clickOnSolutionSearchBox(String caseid) {
		CommonFunctions.waitForElement(driver,searchtextbox ).sendKeys(caseid);
		return new SolutionSearchHomePage(driver);
		
	}
	
	
	public SolutionSearchHomePage clickOnSolutionSearchButton() {
		CommonFunctions.waitForElement(driver,SSSearchButton_1 ).click();;
		return new SolutionSearchHomePage(driver);
		
	}
	
}
