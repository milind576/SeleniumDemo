package Org.qsp.TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//run from the testng.xml file not from here

public class ParallelDemo {
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void bM(String bName){
		if(bName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",".\\GeckoSoft\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		if(bName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void m() throws Exception{
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.close();
	}

}
