package ClearTrip.Project2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic implements IRetryAnalyzer{

	int count = 0;
	int retry_count = 1;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retry_count)
		{
			count++;
			return true;
		}
		return false;
	}

}
