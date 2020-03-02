package com.piit.bootcamp.homedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Depot_P3 {
	WebDriver driver;
	@FindBy(id="pro-skip-link")
	WebElement Prolink;
	
	public Depot_P3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void linkBut() {
		Prolink.click();	
	}

}
