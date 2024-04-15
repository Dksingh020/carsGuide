package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsGuideHomePageLocators;
import pages.locators.CarsGuideUsedCarsSearchLocators;
import utils.SeleniumDriver;

public class CarsGuideUsedCarsSearchHomePageActions {
	
	CarsGuideUsedCarsSearchLocators carsGuideUsedCarsSearchLocators=null;
	public CarsGuideUsedCarsSearchHomePageActions()
	{
		
		this.carsGuideUsedCarsSearchLocators=new CarsGuideUsedCarsSearchLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideUsedCarsSearchLocators);
	}
	
	public void selectCarsFromMenu(String menu)
	{
//		SeleniumDriver.getDriver().findElement(By.xpath("//select[@id='make']")).click();
		 Select sel=new Select(carsGuideUsedCarsSearchLocators.car);
		    sel.selectByVisibleText(menu);
	}
	
	public void selectModelFromMenu(String model)
	{
//		SeleniumDriver.getDriver().findElement(By.xpath("//select[@id='model']")).click();
		Select sel=new Select(carsGuideUsedCarsSearchLocators.CarsModel);
	    sel.selectByVisibleText(model);
	}
	
	public void selectStateFromMenu(String state)
	{		
//		SeleniumDriver.getDriver().findElement(By.xpath("//select[@id='state']")).click();
		Select sel=new Select(carsGuideUsedCarsSearchLocators.state);
	    sel.selectByVisibleText(state);
	}
	
	public void selectRegionFromMenu(String region)
	{		
//		SeleniumDriver.getDriver().findElement(By.xpath("//select[@id='region']")).click();
		 Select sel=new Select(carsGuideUsedCarsSearchLocators.regions);
		    sel.selectByVisibleText(region);
	}
	
	public void selectMinPriceFromMenu(String min)
	{		
//		SeleniumDriver.getDriver().findElement(By.xpath("//select[@id='priceFrom']")).click();
		Select sel=new Select(carsGuideUsedCarsSearchLocators.pricefrom);
	    sel.selectByVisibleText(min);
	}
	public void selectMaxPriceFromMenu(String max)
	{		
//		SeleniumDriver.getDriver().findElement(By.xpath("//select[@id='priceFrom']")).click();
		Select sel=new Select(carsGuideUsedCarsSearchLocators.priceTo);
	    sel.selectByVisibleText(max);
	}
	public void clickOnUsedSearchCarsMenu()
	{
		carsGuideUsedCarsSearchLocators.button.click();
		
	}


}
