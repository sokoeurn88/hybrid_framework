package com.hybrid_framework.testcases;

import org.testng.annotations.Test;

import com.hybrid_framework.pageobjects.LoginPage;

public class TC_LOGIN_001 extends BaseClass {
	
	@Test
	public void loginTest() {
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.clickFreeBook();
		System.out.println(driver.getTitle());
		
	}
	
}
