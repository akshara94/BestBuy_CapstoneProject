package Test_component;

import org.testng.annotations.Test;
import Engine_Component.Base_Page;
import Page_Component.CartPage;
import Utility.WebUtil_Page;

public class TC06_CartPage extends Base_Page {
	
	@Test(priority =7)
	
	public void Testcases_CartPage() throws Throwable {
		
		WebUtil_Page.init();
		CartPage cart = new CartPage();
		cart.Open_cartpage();
		WebUtil_Page.TakeScreenshot();
	}

	
}
