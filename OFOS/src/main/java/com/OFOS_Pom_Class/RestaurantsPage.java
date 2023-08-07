package com.OFOS_Pom_Class;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pom_scripts.BasePage;

public class RestaurantsPage extends BasePage {

	public RestaurantsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//restaurant name
	@FindBy(xpath = "//a[text()='North Street Tavern']")
	private WebElement restaurantName;
	
	//restaurant address
	@FindBy(xpath = "//a[text()='North Street Tavern']/../..//span")
	private WebElement restaurantAddress;
	
	//view menu
	@FindBy(xpath = "(//a[text()='View Menu'])[1]")
	private WebElement viewMenu;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public WebElement getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(WebElement restaurantName) {
		this.restaurantName = restaurantName;
	}

	public WebElement getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(WebElement restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public WebElement getViewMenu() {
		return viewMenu;
	}

	public void setViewMenu(WebElement viewMenu) {
		this.viewMenu = viewMenu;
	}


	//View Menu button of all restaurants
	@FindBy(xpath = "//a[text()='View Menu']")
	private List<WebElement> viewMenuButtons;
	
	//Name of all restaurants
	@FindBy(xpath = "//div[@class='entry-dscr']//h5//a")
	private List<WebElement> nameofAllRestaurants;
	
	//Image of all restaurants
	@FindBy(xpath = "//div[@class='entry-dscr']/..//img")
	private List<WebElement> imageOfAllRestaurants;

	public List<WebElement> getViewMenuButtons() {
		return viewMenuButtons;
	}

	public void setViewMenuButtons(List<WebElement> viewMenuButtons) {
		this.viewMenuButtons = viewMenuButtons;
	}

	public List<WebElement> getNameofAllRestaurants() {
		return nameofAllRestaurants;
	}

	public void setNameofAllRestaurants(List<WebElement> nameofAllRestaurants) {
		this.nameofAllRestaurants = nameofAllRestaurants;
	}

	public List<WebElement> getImageOfAllRestaurants() {
		return imageOfAllRestaurants;
	}

	public void setImageOfAllRestaurants(List<WebElement> imageOfAllRestaurants) {
		this.imageOfAllRestaurants = imageOfAllRestaurants;
	}
	
	

}
