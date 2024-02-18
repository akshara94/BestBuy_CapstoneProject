package Utility;
import java.io.File;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.asserts.SoftAssert;

public class WebUtil_Page extends File_Page { //methods of click,screenshots,sendkeys...
	
public static WebDriver driver;
public static ExtentHtmlReporter html = null;
public static ExtentReports report = null;
public String testName;
public String testDescription;
public String testCategory;
public String testAuthor;
	
	
	public static void init() {  //create webbrowser
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com");
		Actions act= new Actions(driver);
	    WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img"));
	    act.doubleClick(ele).perform();
	   
	
	}
	
	public static void launchBrowser(String browser) {//create cross browser method
		
	   if(browser.equalsIgnoreCase("chrome")) {
		 driver =new ChromeDriver();
				
  } else if(browser.equalsIgnoreCase("firefox")) {
		
	  driver = new FirefoxDriver();
  }
	else {
		
		 System.out.println("Opening chrome browser as Default browser");
		 driver = new ChromeDriver();
	}
		  driver.manage().window().maximize();
	}
	
	public static void iconclick(WebElement element)   { //craete the click button method
    	       element.click();
        }
    
     public static void browserclose() { //create the close browser method
    	
    	     driver.close();
       }
     public static void newtab(WebElement element) {
    	 driver.switchTo().newWindow(WindowType.TAB);
    	 driver.navigate().to("https://www.bestbuy.com");
      }
     
     public static void enterkey(WebElement element)
     {
    	 element.sendKeys(Keys.ENTER);
    	 //edriver.findElement(By.id("gh-search-input")).sendKeys(Keys.ENTER);
     }
     public static void getApplication(String url) {
		    	 driver.get(url);
		     }
     
     public static void keyinput(WebElement element, String value) { //create the inputkey for sendkey
    		element.sendKeys(value);
    	}
     
     public static String getPageTitle() {
    	
    	  return driver.getTitle();
     }

    public static void waitImplicit( int Value) {  //create the waitimplicit method
    	  
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Value));
    	}

    public static void waitExplicit(WebElement element) { //create the explicitwait method
	    	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	    	  wait.until(ExpectedConditions.visibilityOf(element));
	    	}
    	
    public static String keyoutput(WebElement element) { //create the output for get the key 
	    		
	    		String value = element.getText();
	    		return value;
    	}
    
    public static void dropdown(WebElement element, String value) { // create dropdown method
    		
    		Select sel = new Select(element);
    		sel.selectByVisibleText(value);

    	}
    
    public static void Alertbox(WebElement element) { //alertbox method
    		driver.switchTo().alert().dismiss();
    		
    	}
    
    public static void Actions(WebElement element) {
    		
    		Actions act = new Actions(driver);
    		act.click(element).perform();
    	}
    	
    public static void TakeScreenshot()  { //create screenshots method
    		
    		try {
    			
    		String location = System.getProperty("user.dir") + "/ScreenShots/picture5.png";
    		
    		TakesScreenshot ts = (TakesScreenshot)driver;
    		
    		File souce = ts.getScreenshotAs(OutputType.FILE);
    		
    	    File destination = new File(location);
    	
    		FileHandler.copy(souce, destination);
    		
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    	}
    public static int getResponseCode(String url) throws Exception, Exception {
		@SuppressWarnings("deprecation")
		URL link = new URL(url);
		HttpURLConnection connect = (HttpURLConnection) link.openConnection();
	
		int responseCode = connect.getResponseCode();
		return responseCode;
    
}
    public static void softAssert(String actResult, String expResult) {
		SoftAssert sa = new SoftAssert();
	sa.assertEquals(actResult, expResult);
	}
    public static void jsScrollUntillElement(WebElement element) {
		waitExplicit(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
    
}
    	
    		



