package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Reusable;

public class PIMPage_object extends Reusable{
	
	@FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[2]")  //  oxd-select-dropdown --position-bottom
	WebElement clickonPIM;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")  //  oxd-select-dropdown --position-bottom   //(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])[1]
	WebElement Empname;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")  //  oxd-select-dropdown --position-bottom
	WebElement Empid;
	
	@FindBy(xpath = "//button[@type='submit']")  //  oxd-select-dropdown --position-bottom
	WebElement submitbutton;
	
	@FindBy(xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]")  //  oxd-select-dropdown --position-bottom
	WebElement editbutton;
	

	public PIMPage_object(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void clickonPIMclo() {

		clickonPIM.click();

	}
	
	public void EnterEmpName() {

		Empname.sendKeys("Rahul Das");
		

	}
	
	public void EnterEmpId() {

		Empid.sendKeys("12345");
		

	}
	
	public void sublitbutton() {

		submitbutton.click();
		

	}
	
	public void editEmp() {

		editbutton.click();
		

	}
	



}
