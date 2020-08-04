package Org.qsp.TestPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Org.qsp.Pom.FlipkartHome;

public class TestFlipkartHome {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.flipkart.com");//launching url
		FlipkartHome fh=new FlipkartHome(driver);
		fh.clickPop();
		Thread.sleep(4000);
		fh.sendText("iphone");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		fh.sendText("Mi mobile");
		
		
	}

}
