package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='gb']/div[1]/div[1]/div[1]/div/a");
	WebElement homePageUserName ;
	
	@FindBy(xpath=".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")
	WebElement logo;
	
	@FindBy(xpath=".//*[@id='gb_71']")
	WebElement signOut;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}//end HomePage
	
	public String getHomePageUserName(){
		return homePageUserName.getText();
	}//end getHomePageUserName
	
	public void signOut(){
		logo.sendKeys();
		logo.click();
		signOut.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}//end signOut
}
