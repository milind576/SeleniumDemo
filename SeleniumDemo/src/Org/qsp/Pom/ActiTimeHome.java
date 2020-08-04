package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHome {
	@FindBy(name="username")
	private WebElement userName;
	@FindBy(name="pwd")
	private WebElement passWord;
	@FindBy(id="loginButton")
	private WebElement lgnBtn;
	@FindBy(id="logoutLink")
	private WebElement logOut;
	
	public ActiTimeHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void sendUserName(String text){
		userName.sendKeys(text);
	}
	
	public void sendPassword(String text) {
		passWord.sendKeys(text);
		
	}
	
	public void clickLogin(){
		lgnBtn.click();
	}
	
	public void clickLogout(){
		logOut.click();
	}
	
		
		// TODO Auto-generated method stub

	}


