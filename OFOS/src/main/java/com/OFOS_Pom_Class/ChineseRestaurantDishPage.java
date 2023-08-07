package com.OFOS_Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChineseRestaurantDishPage extends Base_Page {

	public ChineseRestaurantDishPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//div[@class='collapse in']//div[@class='row']")
	private WebElement alldish;
	
	@FindBy(xpath = "//a[contains(text(),'Vegetable')]/../../../../../div[2]/input[2]")
	private WebElement addToCart;
	
	@FindBy(xpath = "//a[contains(text(),'Vegetable')]/../../../../../div[2]/input[1]")
	private WebElement dishQuantity;

	public WebElement getAlldish() {
		return alldish;
	}

	public void setAlldish(WebElement alldish) {
		this.alldish = alldish;
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
