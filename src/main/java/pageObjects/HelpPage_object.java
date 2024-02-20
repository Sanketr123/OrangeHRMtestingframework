package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage_object {

	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	WebElement adminButton;

	@FindBy(xpath = "(//button[@class='oxd-icon-button'])[1]")
	WebElement helpButton;
	
	@FindBy(xpath = "//div[@class='article-relatives']")
	WebElement footersection;
	
	// @FindBy(xpath = "(//button[@class='oxd-icon-button'])[1]")
	// WebElement helpButton;

	public HelpPage_object(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickonadmin() {
		adminButton.click();
	}

	public void clickonhelp() {
		helpButton.click();
	}
	
	public void SwitchTOChild(WebDriver driver) throws InterruptedException {
		
		Set<String> windowid = driver.getWindowHandles();
		
		System.out.println(windowid);
		Thread.sleep(4000);
		
		Iterator<String> it = windowid.iterator();
		
		String parentid=it.next();
		
		String childid=it.next();
		
		driver.switchTo().window(childid);
		
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		
		//WebElement footerlink= driver.findElement(By.xpath(" "));
		
		System.out.println(driver.findElement(By.xpath("//div[@class='article-relatives'] //a"))); //links in footer 10
		
		//verifyfooter link
		
		Thread.sleep(4000);
		driver.switchTo().window(parentid);
		
	}


}
