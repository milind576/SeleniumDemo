import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("http://automationpractice.com/index.php");
		WebElement dress=driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']"));
		Actions a=new Actions(driver);
		a.moveToElement(dress).perform();
		driver.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/li/a[@title='Casual Dresses']")).click();
		driver.findElement(By.xpath("//div[@class='left-block']/div/a/img[@title='Printed Dress']")).click();

	}

}
