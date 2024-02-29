package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Reusable;

public class logoutPage_object extends Reusable{
	

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement aboutbutton;
	
	@FindBy(xpath = "//a[text()='About']")
	WebElement abouttext;
	
	@FindBy(xpath = "//p[text()='OrangeHRM']")
	WebElement companyname;
	
	@FindBy(xpath = "//button[@class='oxd-dialog-close-button oxd-dialog-close-button-position']")
	WebElement closeabout;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutText;
	
	@FindBy(xpath = "//h5[text()='Login']")
	WebElement loginpage;
	
	
	public logoutPage_object(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
		
	public void aboutbutton() throws InterruptedException {
		aboutbutton.click();
		
		abouttext.click();
		
		
		System.out.println("Company Name is " + companyname.getText());
		
		Thread.sleep(3000);
		closeabout.click();
		
    }
	
	public void logout() throws InterruptedException {
		aboutbutton.click();
		
		logoutText.click();
		
		Thread.sleep(3000);
		System.out.println(loginpage.getText());
		
	}
	


}
