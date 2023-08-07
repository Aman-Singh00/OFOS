package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class Base_Page extends UtilityMethods {
	
	
	public Base_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	

}
