package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeoutException;

public class WaitsExample {

	public static void main(String[] args) throws TimeoutException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		
		driver.get("https://askomdch.com/");
		By accountLink=By.xpath("//a[text()='Account']");
		By username=By.id("reg_username");
		click(driver,accountLink,20,5);
		sendKeys(driver,username,20,5,"test");
	}
	public static void sendKeys(WebDriver driver,By locator,long timeout,long polling,String data){
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.pollingEvery(Duration.ofSeconds(polling))
		.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(data);
		
	}
	public static void click(WebDriver driver,By locator,long timeout,long polling) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.pollingEvery(Duration.ofSeconds(polling))
		.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();	
	}

}
