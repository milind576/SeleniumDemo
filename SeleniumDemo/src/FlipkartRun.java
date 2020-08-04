import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartRun {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.flipkart.com");//launching url
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("boat rockerz",Keys.ENTER);
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//WebElement elect=driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
		//Actions elect1=new Actions(driver);
		//elect1.moveToElement(elect).perform();
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		Actions a=new Actions(driver);
		//System.out.println(menus.getClass());
		System.out.println("------------------------------------");
        for(WebElement menuName:menus){
        	String name=menuName.getText();
        	System.err.println(name);
        	Thread.sleep(2000);
        	a.moveToElement(menuName).build().perform();
        	Thread.sleep(2000);	
            List<WebElement> submenus=driver.findElements(By.xpath("//span[contains(.,'"+ name +"')]/parent::li/descendant::ul[@class='QPOmNK']/li"));
        	Thread.sleep(2000);
            for(WebElement subMenuName:submenus){
        		System.out.println(subMenuName.getText());
            }
        }
        		
		
	}

}
