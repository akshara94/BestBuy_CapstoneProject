package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Page { //create the file property
	
public String getValue(String key) throws Throwable {
		
	    String filepath = System.getProperty("user.dir") + "/Filesheet.xlsx"; 
		String Value = null;	
		
		try {
	    Properties prop = new Properties();		
		
			FileInputStream instream = new FileInputStream(filepath);

			prop.load(instream);
			Value = prop.getProperty(key);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Value;
		
		}


}
