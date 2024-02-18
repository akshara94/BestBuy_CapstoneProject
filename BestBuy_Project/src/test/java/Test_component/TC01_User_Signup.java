package Test_component;

import org.testng.annotations.Test;
import Engine_Component.Base_Page;
import Page_Component.User_Signup;
import Utility.WebUtil_Page;

public class TC01_User_Signup extends Base_Page{
	
	@Test(priority =0)
	
	public void TestCases01_User_Signup() {
		
		WebUtil_Page.init();
		waitImplicit(20);
		User_Signup signup = new User_Signup();
		signup.Open_Signup();
	}
}


