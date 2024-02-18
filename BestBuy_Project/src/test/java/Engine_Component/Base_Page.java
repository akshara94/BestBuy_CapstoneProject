package Engine_Component;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utility.WebUtil_Page;

public class Base_Page extends WebUtil_Page {
	
	@BeforeSuite
	public void startReport() {

		html = new ExtentHtmlReporter(System.getProperty("user.dir" ) + "/ExtentReport.html");
		report = new ExtentReports();
		report.attachReporter(html);
		System.out.println("Before-Suite");
	}
	@BeforeMethod
	public void start() throws Exception {
         System.out.println("Before-Method");
	}
	
	@AfterMethod
	
	public void close() {
		driver.quit();
		System.out.println("After-Method");
	}
	
	@AfterSuite
	public void endReport() {
		report.flush();
		System.out.println("After-Suite");
	}
}

