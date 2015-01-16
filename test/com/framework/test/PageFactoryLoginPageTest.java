package com.framework.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageFactory.HomePage;
import pageFactory.LoginPage;

public class PageFactoryLoginPageTest {
	WebDriver driver;
	
	HomePage hmPage;
	LoginPage lgnPage;
	
	@Before
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
	}//end setup
	
	@Test
	public void testSignIn(){
		lgnPage= new LoginPage(driver);
		
		String loginPageTitle=lgnPage.getTitle();
		System.out.printf("%s",loginPageTitle);
		
		lgnPage.loginToGmail("nayanaith", "loardNayaisfalone?");
		
		hmPage=new HomePage(driver);
		
		System.out.printf("%s",hmPage.getHomePageUserName());
	}//end someFunc
	
	@After
	public void closingActions(){
		hmPage.signOut();
		driver.close();
	}//end closingActions
}//end PageFactoryLoginPageTest
