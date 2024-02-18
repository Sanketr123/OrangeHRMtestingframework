package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.Reusable;

public class AdminPage_object extends Reusable {

	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	WebElement adminButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addadmin;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	WebElement userrole;
	
	@FindBy(xpath = "//div[text()='Admin']")  //  oxd-select-dropdown --position-bottom
	WebElement selectuserrole;
	

	public AdminPage_object(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void openadmin() {

		adminButton.click();

	}
	
	public void clickonaddadmin() {

		addadmin.click();

	}
	
	public void clickonuserrole() {

		userrole.click();

	}
	
	public void selectuserrole() {

//		 Select dropdown = new Select(selectuserrole);
//		 
//		 dropdown.selectByVisibleText("Admin");
		 
		// ((JavascriptExecutor) driver).executeScript("arguments[0].value='Admin';", selectuserrole);
		selectuserrole.sendKeys("A");
		
	}

}
