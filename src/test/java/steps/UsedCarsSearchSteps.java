package steps;

import java.util.List;

import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsGuideUsedCarsSearchHomePageActions;
import pages.locators.CarsGuideUsedCarsSearchLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchSteps {
	CarsGuideUsedCarsSearchHomePageActions carsGuideUsedCarsSearchHomePageActions=new CarsGuideUsedCarsSearchHomePageActions();
	CarsGuideHomePageActions  carsGuideHomePageActions=new CarsGuideHomePageActions(); 
	@Given("I navigate to the  Home Page {string} of CarsGuide Website")
	public void i_navigate_to_the_home_page_of_cars_guide_website(String weburl) {

		SeleniumDriver.openPage(weburl);
	}

//	@When("I validate the page")
	public void i_validate_the_page() {
		SeleniumDriver.pageTitle("Used Cars Search");
	}

//	@And("click on Anymake drop down  Search link")
//	public void click_on_anymake_drop_down_search_link() {
//	   ;
//	}

	@And("select carMaker from AnyMake dropdown")
	public void select_car_maker_from_any_make_dropdown(List<String> list) {
		String menu = list.get(1);
		System.out.println("Menu-->" + menu);
		carsGuideUsedCarsSearchHomePageActions.selectCarsFromMenu(menu);
		 
	}

	@And("select car model from next dropdown")
	public void select_car_model_from_next_dropdown(List<String> list) {
		String menu = list.get(1);
		System.out.println("Menu-->" + menu);
		carsGuideUsedCarsSearchHomePageActions.selectModelFromMenu(menu);
	}

	@And("select  state")
	public void select_state(List<String> list) {
		String menu = list.get(1);
		System.out.println("Menu-->" + menu);
		carsGuideUsedCarsSearchHomePageActions.selectStateFromMenu(menu);
		
	}

	@And("select region in state")
	public void select_region_in_state(List<String> list) {
		String menu = list.get(1);
		System.out.println("Menu-->" + menu);
		carsGuideUsedCarsSearchHomePageActions.selectRegionFromMenu(menu);
	}

	@And("select price  from Select Min dropdown")
	public void select_price_from_select_min_dropdown(List<String> list) {
		String menu = list.get(1);
		System.out.println("Menu-->" + menu);
		carsGuideUsedCarsSearchHomePageActions.selectMinPriceFromMenu(menu);
	}

	@And("select price from Select Max dropdown")
	public void select_price_from_select_max_dropdown(List<String> list) {
		String menu = list.get(1);
		System.out.println("Menu-->" + menu);
		carsGuideUsedCarsSearchHomePageActions.selectMaxPriceFromMenu(menu);
	}

	@Then("click on show_used_vehicles button")
	public void click_on_show_used_vehicles_button() {
		carsGuideUsedCarsSearchHomePageActions.clickOnUsedSearchCarsMenu();
	}

}
