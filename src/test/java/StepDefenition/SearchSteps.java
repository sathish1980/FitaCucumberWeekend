package StepDefenition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Browsers.BrowserLaunch;
import ElementUtils.webElementCommons;
import Pages.MakeMyTripOneWaySearchPage;
import Pages.SearchReultPage;
import Utils.propertyFile;
import io.cucumber.java.en.*;



public class SearchSteps extends BrowserLaunch {
	String filePath =null;
	int count=0;
	
	@Given("Launch the browser and Enter the URL")
	public void launch_the_browser_and_enter_the_url() throws IOException {
		LaunchBrowser();
		String URL = propertyFile.ReadDataFromProperty().getProperty("url");
		browser.get(URL);
	}

	@When("i see the Add popup then i will close it")
	public void i_see_the_add_popup_then_i_will_close_it() {
		webElementCommons.CloseLoginPopup(browser);
		webElementCommons.ClickOnAdd(browser);
	}

	@When("i select From Location")
	public void i_select_from_location() {
		MakeMyTripOneWaySearchPage M = new MakeMyTripOneWaySearchPage(browser);
		M.ClickFromLocation();
		M.SelectDataFromList("PNQ");
		//test.log(Status.INFO, "Select the from location as :"+"PNQ");
	}

	@When("i select To From")
	public void i_select_to_from() {
		MakeMyTripOneWaySearchPage M = new MakeMyTripOneWaySearchPage(browser);
		M.ClickToLocation();
		M.SelectDataFromList("MAA");
		//test.log(Status.INFO, "Select the to location as : "+"MAA");
	}

	@When("Select date")
	public void select_date() {
		MakeMyTripOneWaySearchPage M = new MakeMyTripOneWaySearchPage(browser);
		M.SelectDate("25");
		//test.log(Status.INFO, "Select the Date as " +"25");
	}

	@When("i click on Search button")
	public void i_click_on_search_button() {
		MakeMyTripOneWaySearchPage M = new MakeMyTripOneWaySearchPage(browser);
		M.clickOnSearchButton();
		//test.log(Status.INFO, "SearchButton is cicked");
	}

	@Then("Search result should display according to the search criteria")
	public void search_result_should_display_according_to_the_search_criteria() {
		SearchReultPage sp = new SearchReultPage(browser);
		org.junit.Assert.assertEquals(sp.GetNetworkError(), "NETWORK PROBLEM");
		filePath = webElementCommons.Screenshot(browser,"SearchFlightWithValidCountry"+count);
	}
	

	@And("finally i will close the browser")
	public void finally_i_will_close_the_browser() {
		//CloseReport();
		CloseBrowser();

	}
	
	@And("Click on back button")
	public void Click_on_back_button() {
		browser.navigate().back();

	}

}
