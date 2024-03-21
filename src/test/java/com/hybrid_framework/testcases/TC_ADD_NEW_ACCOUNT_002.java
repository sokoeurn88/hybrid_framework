package com.hybrid_framework.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.hybrid_framework.pageobjects.Add_New_Account;
import com.hybrid_framework.pageobjects.LoginPage;

public class TC_ADD_NEW_ACCOUNT_002 extends BaseClass {
	
	@Test
	public void AddNewAccount() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.createNewAccount();
		
		Thread.sleep(1000);
		
		Add_New_Account ana = new Add_New_Account(driver);
		ana.putFirstName("sok");
		ana.putLastName("chhay");
		
		// Creating random email. see user defined method is below
		String remail = getRandomString()+"@gmail.com";
		ana.putEmail(remail);
		
		ana.setNewPassword("abc123");
		ana.setBirthday();
		ana.setDataBirthday();
		ana.setYear();
		ana.pickGender();
		ana.submit();
		
	}
	
	public String getRandomString() {
		String randomString = RandomStringUtils.randomAlphabetic(5);
		return randomString;
	}

	
	

}
