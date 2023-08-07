package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;import com.relevantcodes.extentreports.LogStatus;

public class Welcome_page extends Base_Page{
	
	public Welcome_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);	
	}
	
	// login button
	@FindBy(name="loginBtn")
	private WebElement loginButton;
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
	// Mens links 
	@FindBy(partialLinkText = "MEN")
	private WebElement menlink;
	
	public void clickOnMenLink()
	{
		menlink.click();
	}

	public WebElement getMenlink() {
		return menlink;
	}

	public void setMenlink(WebElement menlink) {
		this.menlink = menlink;
	}
	
	//Men's T-shirt webelement
	@FindBy(xpath = "//a[text()='T-shirts']")
	private WebElement tshirtlink;
	
	public void clickOnTshirtLink()
	{
		tshirtlink.click();
	}

	public WebElement getTshirtlink() {
		return tshirtlink;
	}

	public void setTshirtlink(WebElement tshirtlink) {
		this.tshirtlink = tshirtlink;
	}
	
	@FindBy(xpath = "//a[text()='Topwear']")
	private WebElement linkTopwear;

	public WebElement getLinkTopwear() {
		return linkTopwear;
	}

	public void setLinkTopwear(WebElement linkTopwear) {
		this.linkTopwear = linkTopwear;
	}
	
	@FindBy(xpath = "//a[text()='T-shirts']")
	private WebElement tshirtsLink;

	public WebElement getTshirtsLink() {
		return tshirtsLink;
	}

	public void setTshirtsLink(WebElement tshirtsLink) {
		this.tshirtsLink = tshirtsLink;
	}
	
	
	
	
	
	

}
