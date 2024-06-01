package StepDefenition;

import Browsers.BrowserLaunch;
import ElementUtils.webElementCommons;
import Pages.MakeMyTripOneWaySearchPage;
import Pages.SearchReultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchwithSameCity extends BrowserLaunch {
	
	@When("i select From Location as {string}")
	public void i_select_from_location(String from) {
		MakeMyTripOneWaySearchPage M = new MakeMyTripOneWaySearchPage(browser);
		M.ClickFromLocation();
		M.SelectDataFromList(from);
		//test.log(Status.INFO, "Select the from location as :"+"PNQ");
	}

	@When("i select To Location as {string}")
	public void i_select_to_from(String to) {
		MakeMyTripOneWaySearchPage M = new MakeMyTripOneWaySearchPage(browser);
		M.ClickToLocation();
		M.SelectDataFromList(to);
		//test.log(Status.INFO, "Select the to location as : "+"MAA");
	}

	@Then("vaidate the same city Error")
	public void vaidate_the_same_city_Error() {
		MakeMyTripOneWaySearchPage sp = new MakeMyTripOneWaySearchPage(browser);
		org.junit.Assert.assertEquals(sp.GetSameCityError(), "From & To airports cannot be the same");
	}
	
	

}
