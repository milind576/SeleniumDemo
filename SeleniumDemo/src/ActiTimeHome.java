import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeHome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://demo.actitime.com/login.do");//launching url
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		
		// TODO Auto-generated method stub

	}

}
