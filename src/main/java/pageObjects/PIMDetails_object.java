package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMDetails_object {
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input' ])[1]")  //  oxd-select-dropdown --position-bottom
	WebElement editbutton;
	

	public PIMDetails_object(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void EnterNationality() throws InterruptedException {

		editbutton.sendKeys("J");
		Thread.sleep(4000);
		editbutton.click();
		

	}
	
	
	

}
