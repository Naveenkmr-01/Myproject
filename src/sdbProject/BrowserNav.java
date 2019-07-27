package sdbProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BrowserNav  {
	
		
	WebDriver driver;
	
	@Parameters({"browser"})
	public void Browser(String browser) throws Exception {	
		
		getConfigFileHere con = new getConfigFileHere();
		
		switch(browser) {
		
		
		
		case "chrome": 
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver",con.getChomepath());
			
			driver.get(con.getApplicationURL());	
			
			
	   break;
		case "fireFox":
			System.out.println("Firefox browser not installed in your PC");
			break;
	    
	   default:
		 System.out.println("No browser is working fine");
		}
}
}