package loginTestCase;

import org.testng.annotations.Test;

import pageObjects.AdminPage_object;
import testBase.Reusable;

public class adminTestCase extends Reusable{
	
	
	@Test(priority = 2, groups = "group1")
	public void adminPage() throws InterruptedException {
	
	 AdminPage_object admin = new AdminPage_object(driver);
	 
	 admin.openadmin();
	 
	}

}
