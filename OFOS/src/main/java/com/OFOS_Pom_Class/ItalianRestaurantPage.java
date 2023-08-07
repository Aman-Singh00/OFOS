package com.OFOS_Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pom_scripts.BasePage;

public class ItalianRestaurantPage extends Base_Page {

	public ItalianRestaurantPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "Pink Spaghetti Gamberoni")
	private WebElement dishName;
	
	
	@FindBy(xpath = "//a[text()='Pink Spaghetti Gamberoni']/../../../../../div[2]/span")
	private WebElement dishPrice;
	
	@FindBy(xpath = "//a[contains(text(),'Pink')]/../../../../../div[2]/input[2]")
	private WebElement addToCart;
	
	@FindBy(xpath = "//a[text()='Pink Spaghetti Gamberoni']/../../../../../div[2]/input[1]")
	private WebElement dishQuantity;

	public WebElement getDishName() {
		return dishName;
	}

	public void setDishName(WebElement dishName) {
		this.dishName = dishName;
	}

	public WebElement getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(WebElement dishPrice) {
		this.dishPrice = dishPrice;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}

	public WebElement getDishQuantity() {
		return dishQuantity;
	}

	public void setDishQuantity(WebElement dishQuantity) {
		this.dishQuantity = dishQuantity;
	}
	

}
