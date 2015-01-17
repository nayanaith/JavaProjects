package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage implements TestDataConstants{
	WebDriver driver;
	By gmlUserName=By.name("Email");
	By gmlPwd=By.name("Passwd");
	By gmlLgnBtn= By.name("signIn");
	By gmTtleBr= By.className("banner");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}//end LoginPage
	
	public void setUserName(String usrName){
		driver.findElement(gmlUserName).sendKeys(usrName);
	}//end setUserName
	
	public void setPswrd(String psword){
		driver.findElement(gmlPwd).sendKeys(psword);
	}//end setPswrd
	
	public void clickLoginBtn(){
		driver.findElement(gmlLgnBtn).click();
	}//end clickLoginBtn
	
	public String getTitle(){
		return driver.findElement(gmTtleBr).getText();
	}//end getTitle
	
	public void loginToGmail(String usrName, String psword){
		this.setUserName(usrName);
		this.setPswrd(psword);
		this.clickLoginBtn();
	}//end loginToGmail

}//end BasePage
