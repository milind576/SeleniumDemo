import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; //launching browser
		driver.manage().window().maximize();//maximize browser
		driver.get("file:///C:/Users/Milind%20Rathod/Desktop/Milind/ButtonClick.html");
		//WebElement btn=driver.findElement(By.id("otherBtn"));
		//WebDriverWait ww=new WebDriverWait(driver, 15);
		//ww.until(ExpectedConditions.elementToBeClickable(btn));
		//btn.click();
		// TODO Auto-generated method stub
        new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>(){
        	@Override
        	public Boolean apply(WebDriver driver){
        		return driver.findElement(By.id("otherBtn")).isEnabled();
        	}
        	
        });
        driver.findElement(By.id("otherBtn")).click();
        
	}

}
