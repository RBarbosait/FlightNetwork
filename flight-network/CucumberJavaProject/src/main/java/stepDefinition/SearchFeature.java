package stepDefinition;

import com.FlyNetwork.tests.HomePageTest;
import com.FlyNetwork.tests.SearchPageTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFeature {
	HomePageTest homepageTest;
	@Given("I open google chrome browser and go to flightnetwork URL")
	public void i_open_google_chrome_browser_and_go_to_flightnetwork_url() {
		homepageTest=new HomePageTest();
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
		//homepageTest.clickSearch();
		//homepageTest.navigateSearchResult();

	}
	@Then("I validate the outcomes results")
	public void i_validate_the_outcomes_results() {


	}
	
	
	SearchPageTest searchpageTest;
	@Given("I search for a flight Athenas - Montevido")
	public void i_search_for_a_flight_athenas_montevido() {
		searchpageTest= new SearchPageTest();
		searchpageTest.navigateSearchResult();
		searchpageTest.clickSearch();
	    
	}
	@When("I choose AirCompany filter")
	public void i_choose_air_company_filter() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("I validate the outcomes results - flights ui display=flights from api")
	public void i_validate_the_outcomes_results_flights_ui_display_flights_from_api() {
	    searchpageTest.getSearchResult();
	}
	
}