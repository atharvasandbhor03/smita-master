package testng_basic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class progr_21_retryanalyzer implements IRetryAnalyzer {

	int count=0;
	int limit=4;
	@Override
	public boolean retry(ITestResult result) {
			if(count<limit)
			{
				count++;
				return true;
			}
		return false;
	}
	
	

}
