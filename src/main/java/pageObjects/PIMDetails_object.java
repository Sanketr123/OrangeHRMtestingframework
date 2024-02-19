package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMDetails_object {
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input' ])[1]")  //  oxd-select-dropdown --position-bottom
	WebElement editbutton;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")  //  oxd-select-dropdown --position-bottom
	WebElement dob;
	
	@FindBy(xpath = "(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]")  //  oxd-select-dropdown --position-bottom
	WebElement gender;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text']")  //  oxd-select-dropdown --position-bottom
	WebElement addattachment;
	

	public PIMDetails_object(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void EnterNationality() throws InterruptedException {

		editbutton.sendKeys("J");
		Thread.sleep(4000);
		editbutton.click();
		

	}
	
	public void selectdate() throws InterruptedException {

		editbutton.sendKeys("J");
		Thread.sleep(4000);
		editbutton.click();
		

	}
	
	public void selectGender() throws InterruptedException {

		gender.click();
		

	}
	
	public void addFile() throws InterruptedException {

		String filepath= System.getProperty("user.dir");
		addattachment.sendKeys(filepath+"\\Files\\For Selenium.txt");
		

	}
	

}
