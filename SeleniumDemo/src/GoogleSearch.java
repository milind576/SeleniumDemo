import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://www.google.com");//launching url
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java",Keys.ENTER);
		//Thread.sleep(2000);
		//List <WebElement> sugg=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		//for (WebElement sugName: sugg){
			//System.out.println(sugName.getText());
		//	}
		//driver.findElement(By.xpath("//span[contains(.,'javatpoint')]")).click();
		//sugg.get(2).click();
		List<WebElement> names=driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		for(WebElement searchNames: names){
			System.out.println(searchNames.getText());
		}
		names.get(3).click();

	}

}
