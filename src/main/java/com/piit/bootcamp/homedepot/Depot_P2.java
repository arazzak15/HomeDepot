package com.piit.bootcamp.homedepot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Depot_P2 {
	WebDriver driver;
	@FindBy(id="email")
	WebElement Enteremail;
	@FindBy(id="password-input-field")
	WebElement Enterpass;
	@FindBy(id="zipCode")
	WebElement Zipcode;
	@FindBy(xpath="//*[@id='phone']")
	WebElement Phonenumber;
	@FindBy(xpath="//label[@class='checkbox-btn__label-test u__text-align--left']")
	WebElement Checkbox1;
	@FindBy(xpath="(//*[@class='checkbox-btn__label-test u__text-align--left'])[2]")
	WebElement Checkbox2;
	@FindBy(xpath="//*[@type='submit']")
	WebElement Createaccount;
	public Depot_P2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void emailField(String mailaddress ) {
		Enteremail.sendKeys(mailaddress);	
	}
	public void passwordField(String password) {
		Enterpass.sendKeys(password);	
	}
	public void zipField(String zip) {
		Zipcode.sendKeys(zip);	
	}
	public void phoneNum(String num) {
		Phonenumber.sendKeys(num);	
	}
	public void cbox() {
		Checkbox1.click();
	}
	public void cbox2() {
		Checkbox2.click();
	}
	public void createAct() {
		Createaccount.click();
	}
}
