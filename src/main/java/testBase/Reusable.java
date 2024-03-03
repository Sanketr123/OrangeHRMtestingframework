package testBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.maven.surefire.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponents.ExtendsReports;

public class Reusable {

	protected static WebDriver driver;

	protected static WebDriverWait wait;
	
		
	
	 static {
	        WebDriverManager.chromedriver().setup();
	        // Additional setup for other browsers if needed
	    }

	public static void openbrowser(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) { // same like z.equals from Excel_Data2 just we are ignoring cases

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		}

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

	}

	public static void closebrowser() throws InterruptedException {
		driver.close();

	}

	@BeforeTest(alwaysRun=true)
	@Parameters("browser")
	public void setup(String browser) throws InterruptedException {
		openbrowser(browser);
		
		
		
	}
	
public String getScreenshot(String testcasename,WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+" "+ testcasename + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+" "+ testcasename + ".png";
		
		
	}


	@AfterTest(alwaysRun=true)
	public void teardown() throws InterruptedException {
		closebrowser();
	}
}
