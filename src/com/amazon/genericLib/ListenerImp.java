package com.amazon.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

/**
 * This class is used to take screenshot if any testScript is failed
 * @author prasanna
 *
 */
@Listeners
public class ListenerImp implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Date d = new Date();
		
		int day = d.getDate();
		String[] dateArr = d.toString().split(" ");
		String month = dateArr[1];
		String year = dateArr[5];
		String time = dateArr[3].replaceAll(":", "-");
		String methodName = result.getMethod().getMethodName();
		
		EventFiringWebDriver fire = new EventFiringWebDriver(Base.scrnDriver);
		File src = fire.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+methodName+"_"+day+"_"+month+"_"+year+"_"+time+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
