package Org.qsp.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GoogleDemo {
	@Test
	public void googleM1(){
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.google.com");//launching url
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Reporter.log("M1",true);
	}
	@Test
	public void googleM2(){
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.google.com");//launching url
		driver.findElement(By.name("N")).sendKeys("qspiders",Keys.ENTER);
		Reporter.log("M2",true);
	}
	
	

}
