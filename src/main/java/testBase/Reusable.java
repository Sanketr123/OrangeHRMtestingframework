package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable {

	
	WebDriver driver=null;
	
	@BeforeTest
	public WebDriver openbrowser(String browser) throws InterruptedException {
		
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
		  
		  return driver;
	}
	
	
	@AfterTest
    public WebDriver closebrowser() throws InterruptedException {
		
		driver.close();
		Thread.sleep(4000);

	
	return driver;
	
}
}
