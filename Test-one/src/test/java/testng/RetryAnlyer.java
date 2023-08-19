package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnlyer implements IRetryAnalyzer {

	int count=0;
	int maxRetry=3;
	
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<maxRetry){
			count++;
			return true;
		}
		return false;
	
	}

}
