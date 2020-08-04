package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHome {
	@FindBy(xpath= "//button[@class='_2AkmmA _29YdH8']")
	private WebElement closePop;
	
	@FindBy(name="q")
	private WebElement search;

	public FlipkartHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void clickPop(){
		closePop.click();
	}
	
	public void sendText(String text){
		search.sendKeys(text);
	}
	
	
	
	

}
