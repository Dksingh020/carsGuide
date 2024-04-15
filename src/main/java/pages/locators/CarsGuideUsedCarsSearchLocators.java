package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideUsedCarsSearchLocators {
	

	@FindBy(how = How.XPATH, using = "//select[@id='make']")
	public WebElement car;

	@FindBy(how = How.XPATH, using = "//select[@id='model']")
	public WebElement CarsModel;

	@FindBy(how = How.XPATH, using = "//select[@id='state']")
	public WebElement state;
	
	@FindBy(how = How.XPATH, using = "//select[@id='region']")
	public WebElement regions;
	
	@FindBy(how = How.XPATH, using = "//select[@id='priceFrom']")
	public WebElement pricefrom;
	@FindBy(how = How.XPATH, using = "//select[@id='priceTo']")
	public WebElement priceTo;
	
	@FindBy(how = How.CSS, using = ".btn.searchForm--showBtn")
	public WebElement button;

}
