package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screens {
	public static void CaptureScreen(WebDriver W,String name) throws InterruptedException,IOException {
		
		
		TakesScreenshot b=(TakesScreenshot)W;
		
		File d=b.getScreenshotAs(OutputType.FILE);
		
		File c=new File(System.getProperty("user.dir")+"\\Ss\\"+name+".png");
		
		FileHandler.copy(d, c);
		
		System.out.println("Screenshot  taken");
		
}}
