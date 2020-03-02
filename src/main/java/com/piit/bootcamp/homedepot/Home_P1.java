package com.piit.bootcamp.homedepot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Home_P1 {
	
	//Added this project into Github and imported from github and now working on it::--->>>
	
	WebDriver driver;
	@FindBy(id="headerMyAccount")
	WebElement MyAccount;
	@FindBy(xpath="//*[text()='Register']")
	WebElement Registeract;
	public Home_P1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public void accountButton() {
		MyAccount.click();	
	}
	public void registerButton() {
		Registeract.click();	
	}
}
