package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login2;

public class Test2 {
	WebDriver W;
    Login2 pg;
    
@BeforeClass
public void ob() {
 pg=new Login2(W);
	}

@BeforeSuite
public void Log() {
	WebDriverManager.chromedriver().setup();
W=new ChromeDriver();
W.manage().window().maximize();
W.get("https://www.linkedin.com/login");}

@Test
public void test() {
 pg.details("user", "user123");
 
 pg.click();

}
@AfterTest
public void teardown() {
	W.close();
}
}
