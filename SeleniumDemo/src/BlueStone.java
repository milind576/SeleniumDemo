import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		//driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("Diamond Ring");
		//driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		//driver.findElement(By.xpath("//img[@alt='The Nury Vanki Ring']")).click();
		//Set<String> tabs=driver.getWindowHandles();
		//for(String tab:tabs){
			//driver.switchTo().window(tab);
		//}
		//System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		//WebElement error=driver.findElement(By.xpath("//div/div[contains(.,'* This field is required')]"));
		//String errortext=error.getText();
		//System.out.println(errortext);
		//WebElement jewel=driver.findElement(By.xpath("//a[contains(.,'All Jewellery')]"));
        //Actions a=new Actions(driver);
        //a.moveToElement(jewel).perform();
        //driver.findElement(By.xpath("//span[contains(.,'Kadas')]")).click();
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a=new Actions(driver);
		System.out.println(menus.getClass());
		System.out.println("------------------------------------");
        for(WebElement menuName:menus){
        	String name= menuName.getText();
        	System.err.println(name);//      Printing Menu Names
        	Thread.sleep(2000);
        	a.moveToElement(menuName).build().perform();// Mouse over action on menus
        	Thread.sleep(2000);
        	List<WebElement> subMenus=driver.findElements(By.xpath("//a[contains(.,'"+ name +"')]/parent::li/descendant::ul[@class='two-col']/li"));
        	Thread.sleep(2000);
        	 for(WebElement subMenuName:subMenus){
         		System.out.println(subMenuName.getText()); // Printing Submenu Names
        }
        
        }
        
		// TODO Auto-generated method stub

	}

}
