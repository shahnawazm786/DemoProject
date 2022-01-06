package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTestCase {

	public static WebDriver driver=null;
	@BeforeSuite
	public void intialize() throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		// To maximize browser
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://askomdch.com/");
		//driver.manage().deleteAllCookies();
	}
	
	@AfterSuite
	public void release() throws Exception{
		//Thread.sleep(3000);
		//BaseTestCase.driver.close();
		BaseTestCase.driver.quit();
	}

}
