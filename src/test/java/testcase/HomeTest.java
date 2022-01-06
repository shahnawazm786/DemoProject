package testcase;

import org.testng.annotations.Test;

import Pages.AskToHomePage;

public class HomeTest extends BaseTestCase{

	@Test
	public void AnchorText() {
		AskToHomePage homePage=new AskToHomePage(driver);
		homePage.getText();
	}
}
