package com.hybrid_framework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	public void clickFreeBook() {
		ldriver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
	}

}
