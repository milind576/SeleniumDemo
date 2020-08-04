import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");//launching url
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		File screenShotSave=new File("./ScreenShot/Demo.png");
		Files.copy(screenShot, screenShotSave);
		// TODO Auto-generated method stub

	}

}
