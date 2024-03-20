package com.hybrid_framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	WebDriver ldriver;
	
	//create constructor of the class
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//find all elements
	@FindBy(xpath = "//a[contains(text(), 'Create new account')]")
	WebElement createnewaccount;
	
	//create method for the webelement
	public void createNewAccount() {
		createnewaccount.click();
	}
	
}