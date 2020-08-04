import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SamHtml {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		WebDriverWait ww=new WebDriverWait(driver, 15);
	    driver.get("file:///C:/Users/Milind%20Rathod/Desktop/Milind/Sam1.html");
		//WebElement ele= driver.findElement(By.xpath("//input[@name='textA']"));
		//ele.sendKeys("what is your name");
		//ww.until(ExpectedConditions.textToBePresentInElementValue(ele,"what is your name"));
		//driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Milind");
		// TODO Auto-generated method stub
	    
	    new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
	    	@Override
	    	public Boolean apply(WebDriver driver){
	    		return driver.findElement(By.name("textB")).isDisplayed();
	    	}
	    	
	    });
	    driver.findElement(By.name("textA")).sendKeys("milind");
	    	
	    }

	}

