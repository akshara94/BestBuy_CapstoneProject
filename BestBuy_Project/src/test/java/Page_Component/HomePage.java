package Page_Component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WebUtil_Page;

public class HomePage extends WebUtil_Page { //locators of home page
	
	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement topdealmenu;
	
	@FindBy(xpath ="//a[text()='Deal of the Day']")
	WebElement dealofday;
	
	@FindBy(xpath = "//a[text()='Yes, Best Buy Sells That']")
	WebElement bestbuysell;
	
	@FindBy(xpath = "//a[text()='My Best Buy Memberships']")
	WebElement memberships;
	
	@FindBy(xpath = "//span[text() ='More']")
	WebElement more;
	
	@FindBy(xpath = "//li[@class='liDropdownList']//a[text()='Credit Cards']")
	WebElement creditcard;
	
  
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Open_homepage() { //methoda of homepage
		
		iconclick(topdealmenu);
		iconclick(dealofday);
		iconclick(bestbuysell);
		iconclick(memberships);
		iconclick(more);
		iconclick(creditcard);
		
		
	}
}
