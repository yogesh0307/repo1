package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="txtUsername")
	private  WebElement user;
	  
	  @FindBy(id="txtPassword")
	  private WebElement pass;
	  
	  @FindBy(xpath="//input[@id='btnLogin']")
	  private WebElement button;
 	  
	  public Loginpage(WebDriver W) {
   PageFactory.initElements(W, this);
 
}

public void cred(String username, String password) {
user.sendKeys(username);
pass.sendKeys(password);
}


public void click() {
  button.click();
}
}
