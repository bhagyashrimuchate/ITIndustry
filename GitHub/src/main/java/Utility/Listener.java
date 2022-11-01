package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestBase.TestBaseClass;

public class Listener extends TestBaseClass implements ITestListener 
{
   //Right clik On class and Then clik on src and Implements methods
	@Override
	public void onTestStart(ITestResult result) {
		//System.out.println("Test Case Started");
		logger.info("Test Case Started");
		//Utilclass.ScreenShot(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed");		
	   // adding SS then add method
	   
	   //which test case then that script name will default added in folder name
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//Utilclass.ScreenShot(result.getName());

		System.out.println("Test Case Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
  
}
