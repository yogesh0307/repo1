package Utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import test.Driver;

public class listeners extends Driver implements ITestListener {

	
	public void onTestFailure(ITestResult result) {
	try {
		Screens.CaptureScreen(W, result.getName());
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
