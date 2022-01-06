package Pages;

import static java.time.Duration.ofSeconds;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conf.IPageElements;

public class AskToHomePage implements IPageElements {

	protected WebDriver driver;
	protected WebDriverWait wait;
	public AskToHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using=anchorLinkHome)
	List<WebElement> elements;
	
	By elemnt=By.xpath(anchorLinkHome);
	WebElement foo=waitElement(elemnt);
	public void getText() {
		
		for(WebElement element:elements) {
		
			System.out.println(element.getText());
		}
	}
	public  WebElement waitElement(By element) {
		//return new WebDriverWait(driver, Duration.ofSeconds(3))
		//		.until(driver -> driver.findElement(element));
		return new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(element));
	}
}
