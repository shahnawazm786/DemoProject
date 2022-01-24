package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExample {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void startApps() {
	// set the property
	System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
		
	}
	public static void findingElement() {
		
	}
	public static void explicitWaitExample() {
		
	}

}
