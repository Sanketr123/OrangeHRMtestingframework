package loginTestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Loginpage_object;
import testBase.Reusable;

public class loginTestCase extends Reusable{
	
	//WebDriver driver;


	@Test
	public void login() throws InterruptedException {
		
		 openbrowser("Chrome"); 
		
		Loginpage_object login=new Loginpage_object(driver);
		
		login.enterUsername("Admin");
		
		login.enterpass("admin123");
	
		//Reusable re = new Reusable();
		//re.openbrowser("Chrome");
//		Loginpage_object loginpage_object = new Loginpage_object(driver);
//		loginpage_object.login("Admin", "admin123");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		 //closebrowser();
	}
	
}