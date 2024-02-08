package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import testBase.Reusable;

public class AdminPage_object extends Reusable {
	
	

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	WebElement adminButton;
	
	

	public AdminPage_object(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	
	public void openadmin() {

		adminButton.click();

	}
	
	
	
	

}
