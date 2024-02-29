package loginTestCase;

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
		
		Thread.sleep(3000);
		
		logoutpage.logout();
	
		Thread.sleep(3000);

}
	
}
