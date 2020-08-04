

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java",Keys.ENTER);
		//WebElement search=driver.findElement(By.name("q"));
		//Point loc=search.getLocation();
		//System.out.println(loc);
		//int x=loc.getX();
		//int y=loc.getY();
		//System.out.println("x : "+ x +"========="+"y : "+ y);
	}

}
