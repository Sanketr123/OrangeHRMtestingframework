package reusableComponents;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendsReports {
	
	
	public void ExtenReport() {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		
		Date date = new Date();
		
		String actualdate = format.format(date);		
		
		String reportPath = System.getProperty("user.dir")+ "\\target\\ExecutonReport"+actualdate+".html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
		
		ExtentReports extend =new ExtentReports();
		
		extend.attachReporter(sparkReporter);
		
		sparkReporter.config().setTheme(Theme.DARK);
		
		sparkReporter.config().setDocumentTitle("Orange HRM POM Framework practice");
		
		return;
		
		
		
	}

}
