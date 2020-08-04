import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class TakeScreenS2 {

	public static void takeScreens(Object name, WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		File screenShotSave=new File("./ScreenShot/amzn.png");
		Files.copy(screenShot, screenShotSave);
		
	}
	

}
