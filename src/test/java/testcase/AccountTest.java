package testcase;

import org.testng.annotations.Test;

import Pages.AskToHomeRegisterPage;

public class AccountTest extends BaseTestCase{
@Test
public void createAccount() {
	AskToHomeRegisterPage registerPage=new AskToHomeRegisterPage(driver);
	registerPage.clickOnAccountLink();
	registerPage.enterUserName();
	registerPage.enterEmail();
	registerPage.enterPassword();
	registerPage.clickRegisterButton();
}
}
