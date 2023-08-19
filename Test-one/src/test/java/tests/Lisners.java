package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Lisners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart"+result.getTestName());
		Reporter.log("onTestStart: "+result.getTestName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess"+result.getTestName());
		Reporter.log("onTestSuccess: "+result.getTestName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure"+result.getTestName());
		Reporter.log("onTestFailure: "+result.getTestName());

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped"+result.getTestName());
		Reporter.log("onTestSkipped: "+result.getTestName());

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onStart"+ context.getName());
		Reporter.log("onStart: "+context.getName());

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish"+context.getName());
		Reporter.log("onFinish: "+context.getName());

	}

}
