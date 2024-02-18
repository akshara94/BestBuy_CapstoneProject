package Page_Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utility.WebUtil_Page;

public class ValidateBelowLink extends WebUtil_Page{ //validate below links
	
	@FindBy(xpath = "//li[@class ='body-copy']//a[text()='My Best Buy® Credit Card']")
	WebElement bestbuycredit;
	
	@FindBy(xpath= "//li[@class ='body-copy']//a[text()='Member Offers']")
	WebElement memberoffer;
			
	@FindBy(xpath = "//*[@id=\"footer\"]/ul/li[1]/div/a/strong")
	WebElement support_center;
	
	@FindBy(xpath ="//*[@id=\"footer\"]/ul/li[2]/div/a/strong")
	WebElement Check_order_status;
	
	@FindBy(xpath ="//*[@id=\"footer\"]/ul/li[3]/div/a/strong")
	WebElement Shipping_Pickup;
	
	@FindBy(xpath ="//*[@id=\"footer\"]/ul/li[4]/div/a/strong")
	WebElement Returns_exchange;
	
		@FindBy(xpath = "//li[@class = 'body-copy']//a[text() = 'Best Buy Health']")
	WebElement Health;

 public ValidateBelowLink( ) {
	 
	 PageFactory.initElements(driver, this);
 }
 
 public void Open_Belowlink() {  //methods of below links
	 
	 iconclick(bestbuycredit);
	 iconclick(memberoffer);
	 iconclick(support_center);
	 newtab(Check_order_status);
	 iconclick(Check_order_status);
	 newtab(Shipping_Pickup);
	 iconclick(Shipping_Pickup);
	 iconclick(Returns_exchange);
	 newtab(Health);
	 iconclick(Health);
 }
}
