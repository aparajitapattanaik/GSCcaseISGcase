package com.deere.global;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.deere.gscpage.GSCRoutingFilterSearchPage;
import com.deere.gscpage.GSCRoutingPage;
import com.deere.webformpages.R4_AgCC;

/**
 * 
 * @author sm24398
 * This class is a storage of all global static variables
 */
public class GlobalThings {
	public static final String reportDirectory = new File(".").getAbsolutePath() + "TestReport\\";
	public static final String testDirectory = new File(".").getAbsolutePath() + "TestDirectory\\";
	public static final List <InputTestDetails> listOfInputs = new ArrayList<InputTestDetails>();
	public static final List <InputSuiteDetails> listOfsuite = new ArrayList<InputSuiteDetails>();
	public static final List <InputBrowserDetails> listOfBrowser = new ArrayList<InputBrowserDetails>();
	public static final List <InputEnvironmentDetails> listOfEnv = new ArrayList<InputEnvironmentDetails>();
	public static final List<TestResultReport> testResultReports = new ArrayList<TestResultReport>();
	public static final List <InputEmailDetails> listOfEmail = new ArrayList<>();
	public static final String driversPath = System.getProperty("user.dir")+"\\Drivers";
	public static Long timeForExecution = (long) 0;
	public static int failedTestcaseCount = 0;
	public static final String downloadFilePath = new File(System.getProperty("user.dir")).getAbsolutePath() + "\\DownloadedFiles\\";
	public static final String downloadUrl = "chrome://downloads";
	public static String portalLanguage = null;
	public static Long executionEndTimeForScenario = (long) 0;
	public static Long executionStartTimeForScenario = (long) 0;
	public static final String fileUpload = new File("").getAbsolutePath() +"\\SupportingDocs\\New Text Document.txt";
	public static final List<InputTestDetails> listOfTestSkipped = new ArrayList<>();
	public static final String extentConfigFile = new File("").getAbsolutePath() + "\\extent-config.xml";
	public static final String xmlFile = new File("").getAbsolutePath() + "\\testNG.xml";
	protected static Long startTime_Excution = (long) 0;
	
	public static final String openBtnImage = new File("").getAbsolutePath()+"\\SupportingDocs\\OpenBtn.PNG";
	protected static long totalTestCases = 0;
	public static String Caseid_JDParts;
	public static GSCRoutingPage caseId;
	public static String caseID;
	public static String caseID_Deere;
	public static String filePath="C:\\Users\\sandeepr\\Desktop\\R4Turf.png"; 
	protected static HashMap<Long, String> isgCaseIdTSS = new HashMap<Long, String>();
	public static Iterator<String> caseiterator ;
	public static String checkbox;
	private static String caseIdOne;
	public static Iterator<String> iterator;
	public static String Caseid_R4Turf,alertMsg;
	public static String Caseid_R4Agcc;
	private R4_AgCC agcc;
	public static String caseID_StellarSupport;
	public static String caseID_SouthEastAsia;
	public static String caseID_India;
	public static String caseID_SouthSahara;
	public static String caseID_JDlinks;
	public static String caseID_Agronomy;
	public static String caseID_GreenFleet;
	public static String filepath = new File("").getAbsolutePath()+"\\SupportingDocs\\CaseID.txt";
	public static String finalMsg;
	public static String[] finalMsgSplit;
	public static String case_ID;
	public static final String filePathImage = new File("").getAbsolutePath()+"\\SupportingDocs\\WebFormsImg.png"; 
}