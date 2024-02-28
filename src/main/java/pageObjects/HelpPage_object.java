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
		
		String parentid=it.next();
		
		String childid=it.next();
		
		driver.switchTo().window(childid);
		
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		
		//WebElement footerlink= driver.findElement(By.xpath(" "));
		
//		WebElement footerlink=(driver.findElement(By.xpath("//div[@class='article-relatives'] //a")));
//		System.out.println(footerlink);//links in footer 5   //check launchbrowser class

//		WebElement footerlink=driver.findElement(By.xpath("//div[@class='article-relatives'] //a"));
//
//		for(int i=1;i<footerlink;i++){
//		
//			
//
//		}
//		
		
//	List <WebElement> footer = (driver.findElements(By.xpath("//div[@class='article-relatives'] //a")));
//		
//		int foo=footer.size();
//		
//		System.out.println(foo);
//		
//		 Iterator<WebElement> iterator = footer.iterator();
//	        while (iterator.hasNext()) {
//	            WebElement item = iterator.next();
//	            
//	            System.out.println(item.getText());
//	        }
	        
		  List<WebElement> footer = (driver.findElements(By.xpath("//div[@class='article-relatives'] //a")));
	        
		for(WebElement link : footer) {
			
			 link.sendKeys(Keys.CONTROL,Keys.ENTER);
			 
			 Set <String> linkhandel=driver.getWindowHandles();
			 
			Iterator<String> linkhan= linkhandel.iterator();
			
			while(linkhan.hasNext()) {
				
				driver.switchTo().window(linkhan.next());
				
				System.out.println( driver.getTitle());
	
			}
			
			driver.switchTo().window(childid);
			 
	        }
		
		//verifyfooter link
		
//		Thread.sleep(6000);
//		driver.switchTo().window(parentid);
		
	}


}
