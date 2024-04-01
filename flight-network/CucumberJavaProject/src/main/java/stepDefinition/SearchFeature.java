package stepDefinition;

import com.FlyNetwork.tests.HomePageTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFeature {
	HomePageTest homepageTest= new HomePageTest();
	@Given("I open google chrome browser and go to flightnetwork URL")
	public void i_open_google_chrome_browser_and_go_to_flightnetwork_url() {
		
		homepageTest.navigateHome();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("I input from Athenas to Montevideo")
	public void i_input_from_athenas_to_montevideo() {
		homepageTest.searchAction();
	
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("click search")
	public void click_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("I validate the outcomes results")
	public void i_validate_the_outcomes_results() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
}
