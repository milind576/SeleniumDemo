
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
		Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
		try {
		new App().runFirefox();
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
		});
		Thread t2 = new Thread(new Runnable() {
		@Override
		public void run() {
		try {
		new App().runChrome();
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
		});

		t1.start();
		t2.start();
		
		// TODO Auto-generated method stub

	}
	
	public void runChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/aditisedalia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		}

		public void runFirefox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/aditisedalia/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		}

}
