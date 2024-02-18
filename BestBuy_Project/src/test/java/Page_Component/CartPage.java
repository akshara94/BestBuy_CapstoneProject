package Page_Component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.WebUtil_Page;

public class CartPage extends WebUtil_Page {
	
	@FindBy(id = "gh-search-input")
	WebElement search;

	@FindBy(className = "fulfillment-add-to-cart-button")
	WebElement Add_cart1;
	
	@FindBy(xpath = "/html/body/div[9]/div/div/div[1]/button")
	WebElement continueshopping1;
	
	@FindBy(className = "fulfillment-add-to-cart-button")
	WebElement Add_cart;
	
	@FindBy(xpath = "//*[@id=\"attach-modal-drawer-overlay-backdrop\"]/div/div[1]/button")
	WebElement continueshopping;
	
	@FindBy(xpath = "//button[text()='Appliances']")
	WebElement Appliances;
	
	@FindBy(xpath = "//*[@id=\"shop-header-28090175\"]/div/div[1]/header/div[3]/div/nav/div/div/ul/li[12]")
	WebElement All_Appliances;
	
	@FindBy(className = "cart-label")
	WebElement go2cart;
	
	@FindBy(className="cart-icon")
	WebElement Checkout;
	
	@FindBy(className="checkout-buttons__checkout")
	WebElement Checkout_final;
	
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement Continueguest;
	
	 public  CartPage() {
		 
		 PageFactory.initElements(driver, this);
	 }

	 public void Open_cartpage( ) throws Throwable {
		 
	  driver.navigate().refresh();
	  iconclick(search);
      keyinput(search,"Sony Tvs");
      enterkey(search);
      iconclick(Add_cart1);
      Thread.sleep(6000);
     iconclick(continueshopping1);
     iconclick(Checkout);
     iconclick(Checkout_final);
  
     
      
	 }
	 
}