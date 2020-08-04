import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
		Thread.sleep(2000);
		WebElement txt=driver.findElement(By.xpath("//td/span[contains(.,'© 2020 actiTIME Inc. All rights reserved.')]"));
		System.out.println(txt.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='aboutPopupCloseButtonId']")).click();
		
		// TODO Auto-generated method stub

	}

}
