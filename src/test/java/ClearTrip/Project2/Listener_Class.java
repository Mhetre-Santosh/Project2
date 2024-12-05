package ClearTrip.Project2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener_Class implements ITestListener {

	static ChromeDriver driver;
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("My test case is pass");
		
		TakesScreenshot ts = (TakesScreenshot)Launch_Quit.driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File ("C:\\Users\\Santosh\\eclipse-workspace\\Project2\\src\\test\\java\\ClearTrip\\Project2\\Pass test case\\passed"+Math.random()+".png");
		try {
			FileHandler.copy(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("My test case is fail");
		
		TakesScreenshot ts = (TakesScreenshot)Launch_Quit.driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File ("C:\\Users\\Santosh\\eclipse-workspace\\Project2\\src\\test\\java\\ClearTrip\\Project2\\Fail test case\\failed"+Math.random()+".png");
		try {
			FileHandler.copy(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


