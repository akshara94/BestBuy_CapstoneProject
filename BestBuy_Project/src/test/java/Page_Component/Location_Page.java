package Page_Component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Engine_Component.Base_Page;

public class Location_Page extends Base_Page{//validate link broken links
	
	
	@FindBy(className="us-link")
	WebElement countryUSA;
	
	@FindBy(className="canada-link")
	WebElement countryCanada;
	
	public Location_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void deliveryAtUSA() {
		iconclick(countryUSA);
	}
	
	public void deliveryAtCanada() {
		iconclick(countryCanada);
	}
	
	public String bestBuyPageTitle() throws Exception {
		return getPageTitle();
	}
	
	public int urlResponseCode() throws Throwable {
		return getResponseCode(getValue("url"));
	}

	
}
	
	


