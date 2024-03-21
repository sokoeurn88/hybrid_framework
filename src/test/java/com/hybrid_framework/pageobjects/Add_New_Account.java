package com.hybrid_framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Add_New_Account {
	
	WebDriver ldriver;
	public Add_New_Account(WebDriver rdriver) {				// Create a class constructor
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	// Find the elements on the webpage
	@FindBy(how = How.XPATH, using="//div[contains(text(), 'First name')]") WebElement firstname;
	public void putFirstName(String fname) {firstname.sendKeys(fname);}
	
	@FindBy(how = How.XPATH, using="//input[@id='u_e_d_dR']") WebElement lastname ;
	public void putLastName(String lname) {lastname.sendKeys(lname);};
	
	@FindBy(how = How.XPATH, using="//input[@id='u_e_g_hT']") WebElement email ;
	public void putEmail(String eemail) {email.sendKeys(eemail);}
	
	@FindBy(how = How.XPATH, using="//input[@id='password_step_input']") WebElement newpassword ;
	public void setNewPassword(String password) {newpassword.sendKeys(password);}
	
	@FindBy(how = How.XPATH, using="//option[normalize-space()='Sep']") WebElement monthbirthday ;
	public void setBirthday() {monthbirthday.click();}
	
	@FindBy(how = How.XPATH, using="//option[normalize-space()='10']") WebElement datebirthday ;
	public void setDataBirthday() {datebirthday.click();}
	
	@FindBy(how = How.XPATH, using="//option[@value='1988']") WebElement yearbirthday ;
	public void setYear() {yearbirthday.click();}
	
	@FindBy(how = How.XPATH, using="//label[normalize-space()='Male']") WebElement gender;
	public void pickGender() {gender.click();}
	
	@FindBy(how = How.XPATH, using="//button[@id='u_e_s_Iu']") WebElement signup;
	public void submit() {signup.click();}

	

}
