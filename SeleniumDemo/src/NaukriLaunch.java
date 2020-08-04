import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launching browser
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String parent = driver.getWindowHandle();
		System.out.println("parent window handle"+ parent);
		Set<String> windows=driver.getWindowHandles();
		//windows.remove(parent);
		//for(String win : windows){
			//System.out.println("all window handle"+ win);
			//driver.switchTo().window(win);
			//driver.close();
			//Thread.sleep(5000);
		//}
		List<String> lst=new ArrayList<String>(windows);
		for(int i=lst.size()-1;i>=0;i--){
			String win=lst.get(i);
			driver.switchTo().window(win);
			Thread.sleep(2000);
			driver.close();
		}

	}

}
