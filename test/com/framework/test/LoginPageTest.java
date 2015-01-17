package com.framework.test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;

import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	HomePage hmPage;
	LoginPage lgnPage;
	
	@Before
	public void setup() throws Exception{
		//try 1
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
	
}//end LoginPageTest
