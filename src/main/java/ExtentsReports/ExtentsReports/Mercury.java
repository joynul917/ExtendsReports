package ExtentsReports.ExtentsReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mercury {
	

	WebDriver driver;
	
	public Mercury(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy (name="userName")
		WebElement userName;
		@FindBy (name = "password")
		WebElement password;
		@FindBy (name = "login")
		WebElement login;

	
	public void setUserName(String strUserName){
		userName.sendKeys("mercury");
}
	public void setPasssword(String strPassword){
		password.sendKeys("mercury");
	}
	public void login(){
		login.click();
	}

	
public void Login(String strUserName, String strPassword ){
		
		this.setUserName(strUserName);
		this.setPasssword(strPassword);
		this.login();
		
	}
}


