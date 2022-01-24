package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Run the application
		startApps();
		findingElement();
		explicitWaitExample();
		closeApps();
	}
	public static void startApps() {
	// set the property
	System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
		
	}
	public static void findingElement() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium"+Keys.ENTER);
		
	}
	public static void explicitWaitExample() {
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		// Print the first result
		System.out.println(firstResult.getText());	
	}
	public static void closeApps() {
		driver.quit();
	}

}
