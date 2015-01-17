package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.*;


public class LoginPage {
	WebDriver driver;
	
	@FindBy(name="Email")
	WebElement gmlUserName;
	
	@FindBy(name="Passwd")
	WebElement gmlPwd;
	
	@FindBy(name="signIn")
	WebElement gmlLgnBtn;
		
	@FindBy(className="banner")
	WebElement gmTtleBr;
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}//end LoginPage
	
	public void setUserName(String usrName){
		gmlUserName.sendKeys(usrName);
	}//end setUserName
	
	public void setPswrd(String psword){
		gmlPwd.sendKeys(psword);
	}//end setPswrd
	
	public void clickLoginBtn(){
		gmlLgnBtn.click();
	}//end clickLoginBtn
	
	public String getTitle(){
		return gmTtleBr.getText();
	}//end getTitle
	
	public void loginToGmail(String usrName, String psword){
		this.setUserName(usrName);
		this.setPswrd(psword);
		this.clickLoginBtn();
	}//end loginToGmail

}//end LoginPage
