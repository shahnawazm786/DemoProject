package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import conf.IPageElements;
public class AskToHomeRegisterPage implements IPageElements {
	protected WebDriver driver;

	public AskToHomeRegisterPage(WebDriver driver){
		this.driver=driver;	
	}
	// Element to be added here
	By txtUserName=By.id(regUserName);
	By txtEmail=By.id(regEmailAddress);
	By txtPassword=By.id(regPassword);
	By btnRegister=By.id(regRegistered);
	By clickAccount=By.xpath(linkAccount);
	// Method declaration
	
	public void clickOnAccountLink() {
		driver.findElement(clickAccount).click();
		//driver.findElement(By.xpath(linkAccount)).click();;
	}
	public void enterUserName() {
		driver.findElement(txtUserName).sendKeys("MS007");
	}
	public void enterEmail() {
		driver.findElement(txtEmail).sendKeys("test@automation.in");
	}
	public void enterPassword() {
		driver.findElement(txtPassword).sendKeys("Test@2020");
	}
	public void clickRegisterButton() {
		driver.findElement(btnRegister).click();
	}

}
