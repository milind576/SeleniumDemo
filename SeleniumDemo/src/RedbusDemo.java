import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedbusDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");// notification popup handled
		WebDriver driver = new ChromeDriver(co) ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Ahmedabad");
		driver.findElement(By.xpath("//ul[@class='autoFill']/descendant::li[contains(.,'CTM Char Rasta, Ahmedabad')]")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Pune");
		driver.findElement(By.xpath("//ul[@class='autoFill']/descendant::li[contains(.,'Swargate, Pune')]")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//button[contains(.,'>')]")).click();
		driver.findElement(By.xpath("//tr[@class='rb-monthHeader']/parent::tbody/descendant::tr/td[contains(.,'3')]")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		//driver.findElement(By.xpath("//div[@class='overlay-container']/div/i")).click();
		List<WebElement> lst=driver.findElements(By.xpath("//div[@class='sort-sec clearfix onward ']/descendant::div"));// menus displayed
		WebDriverWait ww=new WebDriverWait(driver, 10);// explicitly wait
		for(WebElement lst1:lst){
			ww.until(ExpectedConditions.elementToBeClickable(lst1));// if it is  clickable than click
			lst1.click();
			System.out.println(lst1.getText());
		}
		
		/*List<WebElement> cb=driver.findElements(By.xpath("//ul[@class='dept-time dt-time-filter']/descendant::li"));
		for(WebElement cbx:cb){
			System.out.println(cbx.getText());
			ww.until(ExpectedConditions.elementToBeClickable(cbx));
			cbx.click();
		}
		*/
		
		driver.findElement(By.xpath("//li[@id='9687671']/descendant::div/div[@class='clearfix m-top-16']/div[contains(.,'View Seats')]")).click();
		// TODO Auto-generated method stub

	}

}
