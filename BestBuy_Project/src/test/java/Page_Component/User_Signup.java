package Page_Component;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.WebUtil_Page;

public class User_Signup extends WebUtil_Page { // create the locators of signup
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/header/div[3]/nav/ul/li[1]/div/div/div/div/button/span")
	WebElement clickaccount;
	
 	@FindBy(xpath = "/html/body/div[3]/div/div/div[1]/header/div[3]/nav/ul/li[1]/div/div/div/div/div[1]/div/div/div/div/a[2]")
	WebElement signup;
 
 	@FindBy(id="firstName")
 	WebElement Firstname;
 	
 	@FindBy(id="lastName")
 	WebElement Lastname;
 	
 	@FindBy(id="email")
 	WebElement EmailID;
 	
 	@FindBy(id="fld-p1")
 	WebElement pass;
 	
 	@FindBy(id="reenterPassword")
 	WebElement conf_pass;
 	
 	@FindBy(id="phone")
 	WebElement mobilenum;
 	
 	@FindBy(id="is-recovery-phone")
 	WebElement confirm;
 	
 	@FindBy(xpath="/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[8]/button")
 	WebElement CreateAccount;
 	
   public User_Signup()//pagefactory constructor
   {
	   PageFactory.initElements(driver,this);
   }
    
	public void Open_Signup() //method of signup
    {
		
	driver.navigate().refresh();
	waitImplicit(20);
	
	Actions(clickaccount);
		
	Actions(signup);
	
  	iconclick(Firstname);
   	keyinput(Firstname, "Akshara");
   	
   	iconclick(Lastname);
   	keyinput(Lastname, "Santosh");
   	
   	iconclick(EmailID);
   	keyinput(EmailID, "akshusat07@outlook.com");
   	
   	iconclick(pass);
   	keyinput(pass, "07AkshuNila@!989");
   	
   	iconclick(conf_pass);
   	keyinput(conf_pass,"07AkshuNila@!989");
   	
   	iconclick(mobilenum);
   	keyinput(mobilenum,"9982776371");
    
    iconclick(confirm);
    
    iconclick(CreateAccount);
    waitImplicit(20);
	
}
}