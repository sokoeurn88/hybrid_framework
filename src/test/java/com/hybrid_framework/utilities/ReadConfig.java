package com.hybrid_framework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


//ReadConfig class read variable values from config.properties, then provide to baseclass

public class ReadConfig {
	
	Properties pro;
	
	//create class constructor
	public ReadConfig() {
		
		File src = new File("./Configuration/config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch(Exception e) {
			
			System.out.println("Exception is "+ e.getMessage());
			
		}
	}
	
	//create a method to read data from properties files
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	
	public String getchromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	
	public String getgeckopath() {
		String geckopath = pro.getProperty("geckopath");
		return geckopath;
	}
	
	
	public String getmsedgepath() {
		String msedgepath = pro.getProperty("msedgepath");
		return msedgepath;
	}
	
	
	
	
	
	
	

}
