package loginTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AdminPage_object;
import pageObjects.Loginpage_object;
import testBase.Reusable;

public class loginTestCase extends Reusable{


	@Test(priority = 1, groups = "group1")
	public static void login() throws InterruptedException {
			
		
		openbrowser("Chrome");
		
		Loginpage_object login=new Loginpage_object(driver);
		
		login.enterUsername("Admin");
		
		login.enterpass("admin123");
		
		login.login();
	
		
		String title=driver.getTitle();
		System.out.println(title);
		
		 Assert.assertTrue(title.contains("OrangeHRM"), "Title does not contain expected text");
		 
		// login.openadmin();
		 
		 Thread.sleep(5000);
		 
		 
		

	}
	
}