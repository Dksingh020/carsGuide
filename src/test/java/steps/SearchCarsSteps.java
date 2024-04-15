package steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsGuideUsedCarsSearchHomePageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {

	CarsGuideUsedCarsSearchHomePageActions carsGuideUsedCarsSearchHomePageActions=new CarsGuideUsedCarsSearchHomePageActions();
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

	@Given("I am on the Home Page {string} of CarsGuide Website")
	public void i_am_on_the_home_page_of_cars_guide_website(String websiteUrl) {

		SeleniumDriver.openPage(websiteUrl);

	}

	@When("I move to buysell For Sale Menu")
	public void i_move_to_buysell_for_sale_menu(List<String> list) {
		String menu = list.get(1);
		System.out.println("Menu-->" + menu);
		carsGuideHomePageActions.moveToCarsForSaleMenu();

	}

	@Then("click on {string} link")
	public void click_on_link(String usedcars) {
		SeleniumDriver.waitForPageToLoad();
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}
	
	
}