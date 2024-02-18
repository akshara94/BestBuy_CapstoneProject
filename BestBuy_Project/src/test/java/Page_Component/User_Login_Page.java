package Page_Component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WebUtil_Page;

public class User_Login_Page extends WebUtil_Page {
	
	//locators of login page
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/header/div[3]/nav/ul/li[1]/div/div/div/div/button/span")
	WebElement clickaccount;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[1]/header/div[3]/nav/ul/li[1]/div/div/div/div/div[1]/div/div/div/div/a[1]")
	WebElement clickloginpage;
	
	@FindBy(id = "fld-e")
	WebElement email;
	
	@FindBy(id = "fld-p1")
	WebElement passkey;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[3]/button")
	WebElement submitbutton;
	
	 public User_Login_Page()//page Factory constructor
	   {
		   PageFactory.initElements(driver,this);
	   }
	 public void Openlogin() { //method of login
		
		driver.navigate().refresh();
		waitImplicit(20);
		
		Actions(clickaccount);
		
		iconclick(clickloginpage);
		keyinput(email,"akshusat07@outlook.com");
		keyinput(passkey,"07AkshuNila@!989");
		iconclick(submitbutton);
	}

}
