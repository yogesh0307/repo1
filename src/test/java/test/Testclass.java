package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Loginpage;

public class Testclass extends Driver {

	
	//WebDriver W;
	Loginpage tst;
	@BeforeClass
	public void obj() {
		tst=new Loginpage (W);}
		
		@BeforeSuite
		public void beforeS() {
			
	}
		@Test
		public void test() throws InterruptedException {
			tst.cred("Admin", "Admin123");
			Thread.sleep(3000);
			tst.click();
			
		}
		@Test
		public void test2() {
			Assert.assertEquals(W.getTitle(), "login");
		}
		
		}

		



