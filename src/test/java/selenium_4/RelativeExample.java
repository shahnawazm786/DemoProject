package selenium_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeExample {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://askomdch.com/account/");
		By uname=RelativeLocator.with(By.tagName("input")).above(By.id("reg_email"));
		driver.findElement(uname).sendKeys("shahnawaz");
		
		//driver.quit();
		
		
	}

}
