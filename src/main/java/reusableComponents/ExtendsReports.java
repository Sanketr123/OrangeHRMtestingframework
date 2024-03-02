package reusableComponents;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.maven.surefire.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.Reusable;

public class ExtendsReports {
	

	 ExtendsReports extent;
	
	  
	
	public static ExtentReports setupextents() {
		
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		
		Date date = new Date();
		
		String actualdate = format.format(date);		
		
		String reportPath = System.getProperty("user.dir")+ "\\target\\ExecutionReport"+actualdate+".html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
		
		ExtentReports extend =new ExtentReports();
		
		extend.attachReporter(sparkReporter);
		
		sparkReporter.config().setTheme(Theme.DARK);
		
		sparkReporter.config().setDocumentTitle("Orange HRM POM Framework practice");
		
		return extend;
		
		
		
	}
	
	
}
