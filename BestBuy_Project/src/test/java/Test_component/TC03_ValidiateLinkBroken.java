package Test_component;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Page_Component.Location_Page;
import Utility.WebUtil_Page;



public class TC03_ValidiateLinkBroken extends WebUtil_Page{ // check validate 
	
	@BeforeTest
	public void setup() {
		testName = "validateLinkBroken";
		testDescription = "Link in HomePage bottom is broken or not";
		testCategory = "Regression";
		testAuthor = "Akshara";
	}
	
	@Test(priority= 2)
	public void tc_05_validateLinkBroken() throws Exception {
		WebUtil_Page.init();
		Location_Page lp=new Location_Page();
		lp.deliveryAtUSA();
		WebUtil_Page.TakeScreenshot();
	}}
	

