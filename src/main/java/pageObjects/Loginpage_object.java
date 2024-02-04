package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Reusable;

public class Loginpage_object extends Reusable{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;
	
	public Loginpage_object(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
//	public void login(String user, String pass) {
//		
//		username.sendKeys(user);
//		
//		password.sendKeys(pass);
//		
//		loginbutton.click();
//		
//	}
		
	public void enterUsername(String user) {
        username.sendKeys(user);
    }
	
	public void enterpass(String pass) {
		password.sendKeys(pass);
    }
	

}
