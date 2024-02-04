package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable {

	protected WebDriver driver;
	
	//WebDriver driver=null;
	
	@BeforeTest
	 @Parameters("browser")
	public void openbrowser(String browser) throws InterruptedException {
		
		
		 
		if(browser.equalsIgnoreCase("Chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else if(browser.equalsIgnoreCase("Edge")) {  //same like z.equals from Excel_Data2 just we are ignoring cases
			
			WebDriverManager.edgedriver().setup();

			//System.setProperty(" ", " ");
			driver = new EdgeDriver();
		}
		

		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@AfterTest 
		
    public void closebrowser() throws InterruptedException {
		driver.close();
		Thread.sleep(4000);

	
	
}
}
