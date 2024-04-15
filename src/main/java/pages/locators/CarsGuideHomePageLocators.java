package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {

	@FindBy(how = How.XPATH, using = "//a[@href='/buy-a-car']")
	public WebElement BuySaleLink;

	@FindBy(how = How.XPATH, using = "//a[@href='//www.carsguide.com.au/buy-a-car/used-car-search']")
	public WebElement BuyMyCarLink;

	@FindBy(how = How.LINK_TEXT, using = "Car Reviews")
	public WebElement carReviewsLink;

	@FindBy(how = How.LINK_TEXT, using = "Search Cars")
	public WebElement searchCarsLink;

	@FindBy(how = How.LINK_TEXT, using = "Used Cars Search")
	public WebElement usedSearchCarsLink;
}
