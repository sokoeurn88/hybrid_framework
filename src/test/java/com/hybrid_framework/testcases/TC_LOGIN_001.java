package com.hybrid_framework.testcases;

import org.testng.annotations.Test;

import com.hybrid_framework.pageobjects.LoginPage;

public class TC_LOGIN_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException {
		
		logger.info("URL is opened");			//will create a file called example.log in test-output folder
		
		LoginPage lp = new LoginPage(driver);
		
		Thread.sleep(2000);
		lp.createNewAccount();
		logger.info("Click on create new account");
		
		System.out.println(driver.getTitle());
		logger.info("get title of the page");
	}
	
	
}