package OFOS_TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OFOS_Pom_Class.Home_Page;
import com.OFOS_Pom_Class.Register_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_classes.Login_Page;

public class OFOS_Register_001 extends Base_Test {
	@DataProvider(name="RegisterData")
	public Object[][] testdata() throws IOException{
		return ReadExcel.multipleData("Register");
	}
	
	@Test(dataProvider = "RegisterData")
	public void register(String userName, String firstname,String LastName,String email,String phoneno,String password,String ConfirmPassword,String Address)
	{ 
		Home_Page home = new Home_Page(driver);
		Register_Page register= new Register_Page(driver);
		Login_Page login=new Login_Page(driver);
		
		clickAction(home.getRegisterLink());
		enter_value(register.getUsernameTextField(), userName);
		enter_value(register.getFirstNameTextField(), firstname);
		enter_value(register.getLastNameTextField(), LastName);
		enter_value(register.getEmailTextField(), email);
		enter_value(register.getPhoneNoTextField(), phoneno);
		enter_value(register.getPasswordTextField(), password);
		enter_value(register.getConfirmPasswordTextField(), ConfirmPassword);
		enter_value(register.getAddressTextField(), Address);
		clickAction(register.getRegisterButton());
		
		try {
		driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("No alert");
			test.log(LogStatus.INFO, "User successfully registered");
		}
		
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		
		
		
		
		
		
		
		
		
		
		
	}

}
