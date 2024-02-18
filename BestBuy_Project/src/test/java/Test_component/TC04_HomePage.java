package Test_component;

import org.testng.annotations.Test;
import Engine_Component.Base_Page;
import Page_Component.HomePage;
import Utility.WebUtil_Page;

public class TC04_HomePage extends Base_Page{
	
	@Test(priority =5)
	
	public void TsetCases_Homepage( ) {
		WebUtil_Page.init();
		HomePage home = new HomePage();
		home.Open_homepage();
		WebUtil_Page.TakeScreenshot();
	}

}
