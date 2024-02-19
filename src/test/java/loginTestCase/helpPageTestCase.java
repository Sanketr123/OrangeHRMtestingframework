package loginTestCase;

import org.testng.annotations.Test;

import pageObjects.HelpPage_object;
import pageObjects.Loginpage_object;
import testBase.Reusable;

public class helpPageTestCase extends Reusable {

	@Test() // priority = 1, groups = "group1"
	public static void windowoperation() throws InterruptedException {

		Loginpage_object login = new Loginpage_object(driver);

		login.enterUsername("Admin");

		login.enterpass("admin123");

		login.login();
		
		
		HelpPage_object help =new HelpPage_object(driver);
		
		help.clickonadmin();
		Thread.sleep(3000);
		
		help.clickonhelp();
		Thread.sleep(3000);


	}

}