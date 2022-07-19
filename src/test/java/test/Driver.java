package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Driver {
  public static WebDriver W;
  
  
  @BeforeSuite
  public void InitBrowser() {
	  //init method in before suite
	  WebDriverManager.chromedriver().setup();
	  W=new ChromeDriver();
	  W.manage().window().maximize();
	  W.get("https://opensource-demo.orangehrmlive.com/");
  }
  

  @AfterSuite
  public void afterSuite() {
	  W.quit();
  }

}
