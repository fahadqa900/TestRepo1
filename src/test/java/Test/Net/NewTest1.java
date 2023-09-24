package Test.Net;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewTest1 
{
  ExtentReports extent;
  ExtentTest test;
  @BeforeTest
  public void config()
  {
	  extent=new ExtentReports("C:\\Users\\fahad\\Desktop\\My Eclipse Applications\\Net\\test-output\\MyReport.html",true);;
	  extent.addSystemInfo("Host","Windows");
	  extent.addSystemInfo("User","Demo");
	  extent.addSystemInfo("Environment","QA");
	  extent.loadConfig(new File("C:\\Users\\fahad\\Desktop\\My Eclipse Applications\\Net\\extent-config.xml"));
  }
  
  @Test
  public void test1()
  {
	  test=extent.startTest("First Test");
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Test Passed");
  }
  
  @Test
  public void test2()
  {
	  test=extent.startTest("Second Test");
	  Assert.assertTrue(false);
	  //test.log(LogStatus.FAIL, "Test Failed");
  }
  
  @AfterMethod
  public void getData(ITestResult result)
  {
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  test.log(LogStatus.FAIL,result.getThrowable());
	  }
  }
  
  @AfterTest
  public void flush1()
  {
	  extent.flush();
  }
  
  
}
