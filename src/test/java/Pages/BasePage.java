package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	WebDriver driver;
	public void intialize() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();	
	}
	public void closeDriver() {
	driver.quit();	
	}
	public WebDriver getDriver() {
		return driver;
	}
}
