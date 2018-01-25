package ExtentsReports.ExtentsReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class TTC0Login {
	
	
	
WebDriver driver;
ExtentReports report;
ExtentTest logger;
	
Mercury login;


@BeforeTest
public void login(){
	report=new ExtentReports("C:\\workspace\\ExtentsReports\\src\\main\\java\\Reports.html");
    logger=report.startTest("login");
	 
 driver = new FirefoxDriver();
 
 logger.log(LogStatus.INFO, "Browser started " + driver);
 

 
 driver.get("http://demoaut.com/");
 
 
 logger.log(LogStatus.INFO, "Application is up and running" + driver.getTitle());
 
}
@Test(priority=0)
public void test1(){
	login = new Mercury(driver);
	
	
        login.Login("mercury","mercury");
        
        logger.log(LogStatus.PASS, "successful verified" );
 
}   
 @AfterMethod
 public void getResult(ITestResult result){
	 if(result.getStatus()== ITestResult.FAILURE){
		 logger.log(LogStatus.FAIL, "Test case falied" + result.getName());
		 logger.log(LogStatus.FAIL, "Test case falied" + result.getTestName());
		 
	 }else if (result.getStatus()== ITestResult.SKIP)
		 logger.log(LogStatus.SKIP,"Test case skiped is" + result.getName());
	 
 }
 @AfterTest
 public void endReport(){
        
report.endTest(logger);
report.flush();
 
driver.get("C:\\workspace\\ExtentsReports\\src\\main\\java\\Reports.html");
}
 

	




}



