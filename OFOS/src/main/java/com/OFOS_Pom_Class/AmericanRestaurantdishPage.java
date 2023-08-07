package com.OFOS_Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmericanRestaurantdishPage extends Base_Page {

	public AmericanRestaurantdishPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Buffalo Wings')]/../../../../../div[2]/span")
	private WebElement dishPrice;
	
	@FindBy(xpath = "//a[contains(text(),'Buffalo Wings')]/../../../../../div[2]/input[2]")
	private WebElement addToCart;
	
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

	

}
