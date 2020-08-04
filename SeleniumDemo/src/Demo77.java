import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo77 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("file:///C:/Users/Milind%20Rathod/Desktop/Milind/Demo7.html");
		WebElement ele=driver.findElement(By.xpath("//select[@id='b']"));
		Select s=new Select(ele);
		List<WebElement> opts=s.getOptions();
		if(s.isMultiple()){
			for(WebElement opt:opts){
				s.selectByValue(opt.getText());
				Thread.sleep(1000);
			}
			for(WebElement opt:opts){
				s.selectByVisibleText(opt.getText());
			}
		}
		// TODO Auto-generated method stub

	}

}
