import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launching browser
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String parent = driver.getWindowHandle();
		System.out.println("parent window handle"+ parent);
		Set<String> windows=driver.getWindowHandles();
		System.out.println("child window handle"+ windows);
		List<String> lst= new ArrayList<String>(windows);
		for(int i=lst.size()-1;i>=0;i--){
			String win=lst.get(i);
			driver.switchTo().window(win);
			Thread.sleep(4000);
			driver.close();
		}
			
		
		// TODO Auto-generated method stub

	}

}
