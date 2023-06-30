package awsome;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.messages.types.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class MyStepdefs {

    ChromeDriver driver;

    @Given("I go to the first first page")
    public void iGoToTheFirstFirstPage() {
        System.out.println("First Step");
        //System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt=new ChromeOptions();
        driver=new ChromeDriver(opt);
        driver.get("https://askomdch.com/");
        driver.manage().window().maximize();
        driver.quit();
    }

    @When("I select {string}")
    public void iSelect(String arg0) {
        System.out.println("Second Step"+arg0);
    }

    @Then("I should see {int} {string} in the cart")
    public void iShouldSeeInTheCart(int arg0, String arg1) {
        System.out.println("First Step"+arg0+ "Item"+arg1);
    }

    @Given("Step from {string} in {string} feature file")
    public void stepFromScen_out_row_numInScenarioOutlinesFeatureFile(String scenario,String file) {
        System.out.format("Thread ID - %2d - %s from %s feature file.\n",
                Thread.currentThread().getId(), scenario,file);
    }

    @Given("I verify the column contains expected value")
    public void iVerifyTheColumnContainsExpectedValue(DataTable dataTable) {
        List<Map<String,String>> mapValue=dataTable.asMaps();
        for(Map<String,String> map:mapValue){
            System.out.println("User name \t" + map.get("user"));
            System.out.println("Password \t"+map.get("password"));
        }

    }


    /*
    @Given("I go to the first first page")
    public void i_go_to_the_first_first_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

    }
    @When("I select {string}")
    public void i_select(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("I should see {int} {string} in the cart")
    public void i_should_see_in_the_cart(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }


    @And("Verify the item quantity")
    public void verify_the_item_quantity() {
    }

    @And("Verify the text")
    public void verifyTheText() {
    }*/
}
