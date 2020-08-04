package Org.qsp.TestPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Org.qsp.Pom.ActiTimeHome;

public class TestActiTimeHome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://demo.actitime.com/login.do");//launching url
		ActiTimeHome ah=new ActiTimeHome(driver);
		ah.sendUserName("admin");
		Thread.sleep(2000);
		ah.sendPassword("manager");
		Thread.sleep(2000);
		ah.clickLogin();
		Thread.sleep(2000);
		ah.clickLogout();
		
		
		// TODO Auto-generated method stub

	}

}
