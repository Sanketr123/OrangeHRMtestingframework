package loginTestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Loginpage_object;
import pageObjects.PIMDetails_object;
import pageObjects.PIMPage_object;
import testBase.Reusable;

public class pimTestCase extends Reusable {
	
	
	@Test(priority=1)
	public static void pimpage() throws InterruptedException {

		// openbrowser("Chrome");

		PIMPage_object login = new PIMPage_object(driver);

		login.clickonPIMclo();

		login.EnterEmpName();

		login.EnterEmpId();

		login.editEmp();

	}

	@Test (priority=2)

	public static void pimDetails() throws InterruptedException {

		// openbrowser("Chrome");

		PIMDetails_object PIMdetails = new PIMDetails_object(driver);
		
		PIMdetails.EnterNationality();
		
		

	}

}
