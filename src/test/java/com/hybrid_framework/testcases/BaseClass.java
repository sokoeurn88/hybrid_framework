package com.hybrid_framework.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.hybrid_framework.utilities.ReadConfig;

class BaseClass{
	
	//create object of read config class
	ReadConfig readconfig = new ReadConfig();
	
	
	public String baseURL = readconfig.getApplicationURL();
	public static WebDriver driver;
	public static Logger logger;

	//create method setup
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		//creating log 4j 
		logger = Logger.getLogger("hybrid_framework");		
		PropertyConfigurator.configure("log4j.properties");
		
		//test multiple browser
		if(br.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if(br.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", readconfig.getgeckopath());
			driver = new FirefoxDriver();
			
		} else if(br.equals("edge")) {
			
			System.setProperty("webdriver.edge.driver", readconfig.getmsedgepath());
			driver = new EdgeDriver();
			
		}
		
		driver.get(baseURL);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}