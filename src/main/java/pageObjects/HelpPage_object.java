package pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

		String parentid = it.next(); // admin page

		String childid = it.next(); // help page

		driver.switchTo().window(childid); // switch to help page

		String childTitle = driver.getTitle();
		System.out.println(childTitle); // help page title



		List<WebElement> footer = (driver.findElements(By.xpath("//div[@class='article-relatives'] //a"))); // 5 footer
																											// links

		for (WebElement link : footer) {

			link.sendKeys(Keys.CONTROL, Keys.ENTER); // open links in new tab

			Set<String> linkhandel = driver.getWindowHandles(); // get all ids of opened tab

			Iterator<String> linkhan = linkhandel.iterator(); // iterate on all ids

			while (linkhan.hasNext()) { // will iterate till last link

				driver.switchTo().window(linkhan.next()); // driver will switch window for every iteration

				System.out.println(driver.getTitle()); // will print title for every new child window

			} 
			
			driver.switchTo().window(childid);

	
		}
		
		
		//driver.close();

		
//		if(driver.switchTo().equals(childid)) {
//			
//			Thread.sleep(4000);
//			driver.close();
//		}

	}

}
