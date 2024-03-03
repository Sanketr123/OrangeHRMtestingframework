package loginTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.AdminPage_object;
import pageObjects.Loginpage_object;
import testBase.Reusable;

public class loginTestCase extends Reusable{
	

    
	@Test()   //retryAnalyzer=Retry.class       //priority = 1, groups = "group1"
	public static void login() throws InterruptedException {
			
		
		//openbrowser("Chrome");
		
		Loginpage_object login=new Loginpage_object(driver);
		
		login.enterUsername("Admin");
		
		login.enterpass("admin123");
		
		login.login();
	
		
		String title=driver.getTitle();
		System.out.println(title);
		
	
		 
		 
//		 <groups>
//         <run>
//             <include name="group1"/>
//         </run>
//     </groups>

	}
	
}