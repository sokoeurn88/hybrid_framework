package com.hybrid_framework.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL = "https://orangehrmlive.com/en/book-a-free-demo/";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chorme.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver1.exe");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
