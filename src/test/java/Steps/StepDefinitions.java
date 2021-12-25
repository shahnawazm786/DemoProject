package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	@Given("You Logged into web apps")
	public void you_logged_into_web_apps() {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("Step-01");
		StepExample.ShowMe();
	}

	@When("you click to the item")
	public void you_click_to_the_item() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("Step-02");
		StepExample.Add();
	}

	@Then("item added into cart")
	public void item_added_into_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step-03");
	}

	@And("view cart link displayed")
	public void view_cart_link_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step-04");
	}
	@Then("step missed out")
	public void step_missed_out() {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Step-05");
	}

}
