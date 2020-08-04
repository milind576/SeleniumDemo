import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launching browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com"); // loadind browser
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
