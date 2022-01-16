package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.get("https://askomdch.com/");
		By username=By.id("reg_username");
		sendKeys(driver,username,20,5,"test");
	}
	public static void sendKeys(WebDriver driver,By locator,long timeout,long polling,String data){
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.pollingEvery(Duration.ofSeconds(polling))
		.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(data);
		
	}

}
