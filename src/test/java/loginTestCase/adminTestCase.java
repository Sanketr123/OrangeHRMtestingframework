package loginTestCase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.AdminPage_object;
import pageObjects.Loginpage_object;
import testBase.Reusable;

public class adminTestCase extends Reusable {
	

	@Test()                     //priority = 2, groups = "group1"
	public static void adminPage() throws InterruptedException {

		Loginpage_object login = new Loginpage_object(driver);

		login.enterUsername("Admin");

		login.enterpass("admin123");

		login.login();
		
		Thread.sleep(4000);

		AdminPage_object admin = new AdminPage_object(driver);

		admin.openadmin();
		
		admin.clickonaddadmin();
		
		Thread.sleep(3000);
		
		admin.clickonuserrole();
		Thread.sleep(3000);
//
//		admin.selectuserrole();
//		Thread.sleep(3000);
//		
//		admin.clickonuserrole();
//		Thread.sleep(3000);


	}

}
