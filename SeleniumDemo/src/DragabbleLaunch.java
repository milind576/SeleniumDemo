import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragabbleLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//driver.switchTo().frame(frame);
		//Actions a=new Actions(driver);
		//Thread.sleep(2000);
		//WebElement dragg=driver.findElement(By.xpath("//div[@id='draggable']"));
		//a.dragAndDropBy(dragg,100,0).perform();
		
		WebElement draggable =driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement droppable =driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(draggable, droppable).perform();
		
		System.out.println(droppable.getText());
		// TODO Auto-generated method stub

	}

}
