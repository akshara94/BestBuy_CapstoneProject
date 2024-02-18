package Test_component;

import org.testng.annotations.Test;

import Engine_Component.Base_Page;
import Page_Component.User_Login_Page;
import Utility.WebUtil_Page;

public class TC02_User_Login extends Base_Page{
	
@Test(priority=1)
	
	public void TestCases02_User_Login() {

		WebUtil_Page.init();
		waitImplicit(20);
		User_Login_Page login = new User_Login_Page();
		login.Openlogin();
		WebUtil_Page.TakeScreenshot();
		}
}
