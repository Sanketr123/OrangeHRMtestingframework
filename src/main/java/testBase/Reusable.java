package testBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable {

	protected static WebDriver driver;

	protected static WebDriverWait wait;

	public static void openbrowser(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) { // same like z.equals from Excel_Data2 just we are ignoring cases

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		}

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void closebrowser() throws InterruptedException {
		driver.close();

	}

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws InterruptedException {
		openbrowser(browser);
	}

	@AfterTest
	public void teardown() throws InterruptedException {
		closebrowser();
	}
}
