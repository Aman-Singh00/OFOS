package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pom_scripts.BasePage;

public class TshirtPage extends BasePage{

	public TshirtPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[text()='men tshirt']")
	private WebElement menTshirtLink;

	public WebElement getMenTshirtLink() {
		return menTshirtLink;
	}

	public void setMenTshirtLink(WebElement menTshirtLink) {
		this.menTshirtLink = menTshirtLink;
	}

}
