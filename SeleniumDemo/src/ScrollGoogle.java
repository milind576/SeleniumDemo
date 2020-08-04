import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.google.com");//launching url
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		List<WebElement> lst=driver.findElements(By.xpath("//tr[@valign='top']/td/a"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(WebElement lst1:lst){
			System.out.println(lst1.getText());
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		    driver.findElement(By.xpath("//span[contains(.,'Next')]/parent::a[@id='pnnext']")).click();
		}
		// TODO Auto-generated method stub
	}

}
