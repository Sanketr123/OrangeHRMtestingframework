package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Reusable;

public class Loginpage_object extends Reusable{
	

//	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
//	WebElement adminButton;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;
	
	public Loginpage_object(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
		
	public void enterUsername(String user) {
        username.sendKeys(user);
    }
	
	public void enterpass(String pass) {
		password.sendKeys(pass);
    }
	
	public void login() {
		loginbutton.click();
    }
	
//	public void openadmin() {
//
//		adminButton.click();
//
//	}
	

}
