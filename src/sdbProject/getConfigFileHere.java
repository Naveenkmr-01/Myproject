package sdbProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class getConfigFileHere {
	
	public static Properties prop_obj;
	
	public getConfigFileHere() throws Exception {
	
	//public static void main(String args[]) throws Exception {
		
		File file_load = new File("C:\\Users\\muchi\\eclipse-workspace\\naveen_firstproject\\ConfigurationFiles\\Congig.property");
		FileInputStream file = new FileInputStream(file_load);
		prop_obj = new Properties();
		prop_obj.load(file);
		
		System.out.println(prop_obj.getProperty("ChromeDriver"));
		
		}

	public String getChomepath() {

             String GiveChromePathToBrw = prop_obj.getProperty("ChromeDriver");
		return GiveChromePathToBrw;
	}

	public String getApplicationURL() {
		
		     String GiveURLToBrw = prop_obj.getProperty("URL");
		return GiveURLToBrw;
	}
	
	

}
