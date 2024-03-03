package loginTestCase;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import pageObjects.Loginpage_object;
import pageObjects.logoutPage_object;
import testBase.Reusable;

public class logoutTestCase extends Reusable{
	
	@Test()           //priority = 1, groups = "group1"
	public static void logout() throws InterruptedException {
			
	
		
		Loginpage_object login=new Loginpage_object(driver);
		
		login.enterUsername("Admin");
		
		login.enterpass("admin123");
		
		login.login();
		
		
		logoutPage_object logoutpage = new logoutPage_object(driver);
		
		logoutpage.aboutbutton();
		
		
		logoutpage.logout();
	
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		
		
		

}
	
}
