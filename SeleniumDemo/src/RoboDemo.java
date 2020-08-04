import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoboDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
		WebElement dEle=driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt mfMhoc']/span[contains(.,'Java')]"));
		String name=dEle.getText();
		Actions a=new Actions(driver);
		a.doubleClick(dEle).perform();
		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		
		
		
		//driver.findElement(By.xpath(""))
		//Thread.sleep(4000);
		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_T);
		//r.keyRelease(KeyEvent.VK_T);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		// TODO Auto-generated method stub

	}

}
