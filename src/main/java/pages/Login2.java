package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {
@FindBy(id="username")
WebElement username;

@FindBy(id="password")
WebElement password;

@FindBy(xpath="//button[@type='submit']")
WebElement button;

public Login2(WebDriver L){
	PageFactory.initElements(L, this);
}

public void details(String user, String pass) {
	username.sendKeys("user");
	password.sendKeys("pass");

}

public void click() {
	button.click();
}}