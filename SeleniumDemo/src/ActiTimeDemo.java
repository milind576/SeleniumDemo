import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("https://demo.actitime.com/login.do");//launching url
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
       // driver.findElement(By.partialLinkText("TIME Inc.")).click();
       //Set<String> tabs=driver.getWindowHandles();
       //for(String tab:tabs){
        	//driver.switchTo().window(tab);
       // }
       //System.out.println(driver.getTitle());
      // driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		//WebElement username=driver.findElement(By.xpath("//b[text()='admin']"));
		//String usertext=username.getText();
		//System.out.println(usertext);
		//WebElement password=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		//System.out.println(password.getText());
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usertext);
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText(),Keys.ENTER);
	}

}
