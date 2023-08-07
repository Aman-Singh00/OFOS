package com.OFOS_Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_Page extends Base_Page{

	public Register_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "username")
	private WebElement usernameTextField;
	
	@FindBy(name="firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextField;
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public void setUsernameTextField(WebElement usernameTextField) {
		this.usernameTextField = usernameTextField;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public void setFirstNameTextField(WebElement firstNameTextField) {
		this.firstNameTextField = firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public void setLastNameTextField(WebElement lastNameTextField) {
		this.lastNameTextField = lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}

	public WebElement getPhoneNoTextField() {
		return phoneNoTextField;
	}

	public void setPhoneNoTextField(WebElement phoneNoTextField) {
		this.phoneNoTextField = phoneNoTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public void setConfirmPasswordTextField(WebElement confirmPasswordTextField) {
		this.confirmPasswordTextField = confirmPasswordTextField;
	}

	public WebElement getAddressTextField() {
		return addressTextField;
	}

	public void setAddressTextField(WebElement addressTextField) {
		this.addressTextField = addressTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}

	@FindBy(name="email")
	private WebElement emailTextField;
	
	@FindBy(name = "phone")
	private WebElement phoneNoTextField;
	
	@FindBy(name="password")
	private WebElement passwordTextField;
	
	@FindBy(name="cpassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(name="address")
	private WebElement addressTextField;
	
	@FindBy(name = "submit")
	private WebElement registerButton;              

}
