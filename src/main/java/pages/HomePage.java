package pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import static org.junit.Assert.*;


public class HomePage {
	WebDriver driver;
	
	By homePageUserName = By.xpath(".//*[@id='gb']/div[1]/div[1]/div[1]/div/a");
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}//end HomePage
	
	public String getHomePageUserName(){
		return driver.findElement(homePageUserName).getText();
	}//end getHomePageUserName
	
	public void signOut(){
		By logo=By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span");
		driver.findElement(logo).sendKeys();
		driver.findElement(logo).click();
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}//end signOut
}//end HomePage
