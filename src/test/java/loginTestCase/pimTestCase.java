package loginTestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Loginpage_object;
import pageObjects.PIMDetails_object;
import pageObjects.PIMPage_object;
import testBase.Reusable;

public class pimTestCase extends Reusable {

	@Test(priority = 1)
	public static void pimpage() throws InterruptedException {

		Loginpage_object login = new Loginpage_object(driver);

		login.enterUsername("Admin");

		login.enterpass("admin123");

		login.login();

		PIMPage_object pim = new PIMPage_object(driver);

		pim.clickonPIMclo();
		
		Thread.sleep(3000);

		pim.EnterEmpName();
		
		Thread.sleep(4000);

		pim.EnterEmpId();
		
		Thread.sleep(4000);

		pim.editEmp();
		
		Thread.sleep(3000);

	}

	@Test(priority = 2)

	public static void pimDetails() throws InterruptedException {

		// openbrowser("Chrome");

		PIMDetails_object PIMdetails = new PIMDetails_object(driver);

		PIMdetails.EnterNationality();
		
		Thread.sleep(3000);
		
		PIMdetails.selectGender();
		
		Thread.sleep(3000);
		
		PIMdetails.addFile();
		
		Thread.sleep(5000);

		

	}

}
