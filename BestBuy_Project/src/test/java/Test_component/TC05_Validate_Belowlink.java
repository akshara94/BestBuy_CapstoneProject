package Test_component;

import org.testng.annotations.Test;

import Engine_Component.Base_Page;
import Page_Component.ValidateBelowLink;
import Utility.WebUtil_Page;

public class TC05_Validate_Belowlink extends Base_Page{
	
	@Test(priority =6)
	
	public void Testcases_validatebelowlink() {
		
		
		WebUtil_Page.init();
		ValidateBelowLink belowlink = new ValidateBelowLink() ;
		belowlink.Open_Belowlink();
		WebUtil_Page.TakeScreenshot();
	}

}
