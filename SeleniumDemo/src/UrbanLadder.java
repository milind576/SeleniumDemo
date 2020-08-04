import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.urbanladder.com");//launching url
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		//WebElement sale=driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		//Actions a=new Actions(driver);
		//a.moveToElement(sale).perform();
		//driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/descendant::span[contains(.,'Wooden Sofa Sets')]")).click();
		//driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("Sofa",Keys.ENTER);
		//WebElement liv= driver.findElement(By.xpath("//li/span[contains(.,'Living')]"));
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys(liv.getText(),Keys.ENTER);
		// TODO Auto-generated method stub
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a=new Actions(driver);
		System.out.println(menus.getClass());
		System.out.println("------------------------------------");
        for(WebElement menuName:menus){
        	String name=menuName.getText();
        	System.err.println(name);
        	Thread.sleep(2000);
        	a.moveToElement(menuName).build().perform();
        	Thread.sleep(2000);
        	TakeScreenS.takeScreens(name, driver);// taking screen shots when doing mouse over action on menus
           // List<WebElement> submenus=driver.findElements(By.xpath("//span[contains(.,'"+ name +"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
        	//Thread.sleep(2000);
            //for(WebElement subMenuName:submenus){
        		//System.out.println(subMenuName.getText());
        		
        	//}
        }
	}

}
