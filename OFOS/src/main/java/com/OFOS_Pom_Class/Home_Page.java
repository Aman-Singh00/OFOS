package com.OFOS_Pom_Class;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends Base_Page{

	public Home_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement HomeLink;
	
	

	@FindBy(xpath = "//a[contains(text(),'Restaurants ')]")
	private WebElement restaurantsLink;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginLink;
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLink;
	
	@FindBy(xpath = "//a[text()='My Orders']")
	private WebElement myOrderLink;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutLink;
	
	//dish name
	@FindBy(xpath="//a[text()='Yorkshire Lamb Patties']")
	private WebElement dish;
	
	//order now button of Yorkshire Lamb Patties dish
	@FindBy(xpath = "//a[text()='Yorkshire Lamb Patties']/../../div[@class=\"price-btn-block\"]/a")
	private WebElement orderNowButton;
	
	//price of Yorkshire Lamb Patties dish
	@FindBy(xpath = "//a[text()='Yorkshire Lamb Patties']/../../div[@class='price-btn-block']/span")
	private WebElement price;
	
	//name of all dish 
	@FindBy(xpath = "//div[@class='food-item-wrap']//h5//a")
	private WebElement allDish;
	
	//price of all dish
	@FindBy(xpath = "//div[@class='food-item-wrap']//div[@class='price-btn-block']/span")
	private WebElement allDishPrice;
	
	//order now button for all dish
	@FindBy(xpath = "//div[@class='food-item-wrap']//div[@class='price-btn-block']/span")
	private WebElement allDishOrderButton;
	
	
	//continental restaurant link
	@FindBy(xpath = "//a[contains(text(),'Continental')]")
	private WebElement continentalRestaurantLink;
	
	//all restaurant list
	@FindBy(xpath = "//div[@class='restaurant-wrap']//a")
	private List<WebElement> allRestaurant;
	
	
	//italian restaurant link
	@FindBy(xpath = " //a[contains(text(),'Italian')]")
	private WebElement italianRestaurantLink;
	
	
	@FindBy(xpath = "//a[contains(text(),'Chinese')]")
	private WebElement chineseRestaurant;
	
	public WebElement getChineseRestaurant() {
		return chineseRestaurant;
	}

	public void setChineseRestaurant(WebElement chineseRestaurant) {
		this.chineseRestaurant = chineseRestaurant;
	}


	//American restaurant link
	@FindBy(xpath = "//a[contains(text(),' American')]")
	private WebElement americanRestaurantLink;
	
	//southindian restaurant link
	@FindBy(xpath = "//a[contains(text(),'South Indian')]")
	private WebElement southIndianRestaurantLink;
	
	//northindian restaurant link
	@FindBy(xpath = "//a[contains(text(),'North Indian')]")
	private WebElement northIndianRestaurantLink;
	
	//hell restaurant
	@FindBy(xpath = "//a[contains(text(),'hell')]")
	private WebElement hellRestaurantLink;
	
	
	//heaven restaurant
	@FindBy(xpath = "//a[contains(text(),'Heavenly Food')]")
	private WebElement heavenFood;
	
	
	

	public WebElement getSouthIndianRestaurantLink() {
		return southIndianRestaurantLink;
	}

	public void setSouthIndianRestaurantLink(WebElement southIndianRestaurantLink) {
		this.southIndianRestaurantLink = southIndianRestaurantLink;
	}

	public WebElement getNorthIndianRestaurantLink() {
		return northIndianRestaurantLink;
	}

	public void setNorthIndianRestaurantLink(WebElement northIndianRestaurantLink) {
		this.northIndianRestaurantLink = northIndianRestaurantLink;
	}

	public WebElement getHellRestaurantLink() {
		return hellRestaurantLink;
	}

	public void setHellRestaurantLink(WebElement hellRestaurantLink) {
		this.hellRestaurantLink = hellRestaurantLink;
	}

	public WebElement getHeavenFood() {
		return heavenFood;
	}

	public void setHeavenFood(WebElement heavenFood) {
		this.heavenFood = heavenFood;
	}

	public WebElement getAmericanRestaurantLink() {
		return americanRestaurantLink;
	}

	public void setAmericanRestaurantLink(WebElement americanRestaurantLink) {
		this.americanRestaurantLink = americanRestaurantLink;
	}

	public WebElement getItalianRestaurantLink() {
		return italianRestaurantLink;
	}

	public void setItalianRestaurantLink(WebElement italianRestaurantLink) {
		this.italianRestaurantLink = italianRestaurantLink;
	}

	public List<WebElement> getAllRestaurant() {
		return allRestaurant;
	}

	public void setAllRestaurant(List<WebElement> allRestaurant) {
		this.allRestaurant = allRestaurant;
	}

	public WebElement getContinentalRestaurantLink() {
		return continentalRestaurantLink;
	}

	public void setContinentalRestaurantLink(WebElement continentalRestaurantLink) {
		this.continentalRestaurantLink = continentalRestaurantLink;
	}

	public WebElement getHomeLink() {
		return HomeLink;
	}

	public void setHomeLink(WebElement homeLink) {
		HomeLink = homeLink;
	}

	public WebElement getRestaurantsLink() {
		return restaurantsLink;
	}

	public void setRestaurantsLink(WebElement restaurantsLink) {
		this.restaurantsLink = restaurantsLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	public WebElement getMyOrderLink() {
		return myOrderLink;
	}

	public void setMyOrderLink(WebElement myOrderLink) {
		this.myOrderLink = myOrderLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}

	public WebElement getDish() {
		return dish;
	}

	public void setDish(WebElement dish) {
		this.dish = dish;
	}

	public WebElement getOrderNowButton() {
		return orderNowButton;
	}

	public void setOrderNowButton(WebElement orderNowButton) {
		this.orderNowButton = orderNowButton;
	}

	public WebElement getPrice() {
		return price;
	}

	public void setPrice(WebElement price) {
		this.price = price;
	}

	public WebElement getAllDish() {
		return allDish;
	}

	public void setAllDish(WebElement allDish) {
		this.allDish = allDish;
	}

	public WebElement getAllDishPrice() {
		return allDishPrice;
	}

	public void setAllDishPrice(WebElement allDishPrice) {
		this.allDishPrice = allDishPrice;
	}

	public WebElement getAllDishOrderButton() {
		return allDishOrderButton;
	}

	public void setAllDishOrderButton(WebElement allDishOrderButton) {
		this.allDishOrderButton = allDishOrderButton;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
