import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("file:///C:/Users/Milind%20Rathod/Desktop/Milind/Demo7.html");
		WebElement ele=driver.findElement(By.xpath("//select[@id='b']"));
		Select s=new Select(ele);
		List<WebElement> opts=s.getOptions();
		if(s.isMultiple()){
				s.selectByValue(opts.get(1).getText());
				System.out.println(opts.get(1).getText());
				s.selectByValue(opts.get(3).getText());
				System.out.println(opts.get(3).getText());
				Thread.sleep(2000);
			}
		System.out.println("========================");
		List<WebElement> sopt=s.getAllSelectedOptions();
		for(WebElement selectedOpts: sopt){
			System.out.println(selectedOpts.getText());
		}
		s.deselectAll();
		
		// TODO Auto-generated method stub

	}

}
