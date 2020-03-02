package com.piit.bootcamp.homedepot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


@SuppressWarnings("unused")
public class Exe_Homedepot {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  Home_P1 firstpage= new Home_P1(driver);
	  Depot_P2 secondpage= new Depot_P2(driver);
	  Depot_P3 thirdpage= new Depot_P3(driver);
	  
	  firstpage.accountButton();
	  Thread.sleep(3000);
	  firstpage.registerButton();
	  Thread.sleep(5000);
	  
	  secondpage.emailField("akadernj@gmail.com");
	  Thread.sleep(3000);
	  secondpage.passwordField("Sk231235");
	  Thread.sleep(3000);
	  secondpage.zipField("08401");
	  Thread.sleep(3000);
	  secondpage.phoneNum("6097895670");
	  Thread.sleep(3000);
	  secondpage.cbox();
	  
	
	  
	  Thread.sleep(3000);
	  secondpage.cbox2();
	  secondpage.createAct();
	  Thread.sleep(3000);
	  
	  thirdpage.linkBut();
	  
	  
	    
  }
  
  
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Driver Latest/chromedriver.exe");
      driver= new ChromeDriver();
      driver.get("https://www.homedepot.com/");
      driver.manage().window().maximize();
      Thread.sleep(3000);
  }

  @AfterClass
  public void afterClass() {
  }

}
