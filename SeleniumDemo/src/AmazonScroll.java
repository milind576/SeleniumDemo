import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScroll {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Object name=js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		TakeScreenS2.takeScreens(name, driver);
		
		// TODO Auto-generated method stub

	}

}
