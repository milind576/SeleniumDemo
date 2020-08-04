import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.facebook.com");//launching url
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByValue("5");
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select m=new Select(month);
		m.selectByVisibleText("Apr");
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select y=new Select(year);
		y.selectByValue("1993");
		System.out.println("======================================");
		
		List<WebElement> days= s.getOptions();
		for(WebElement dayValue:days){
			System.out.println(dayValue.getText());
		}
		
		
		
		
		
		
		
		/*driver.navigate().refresh();
		driver.getTitle();
		driver.findElement(By.xpath("//td/label[contains(.,'Email or phone')]")).sendKeys("milind05");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("100250119076");
		driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();
		*/
		
		// TODO Auto-generated method stub

	}

}
