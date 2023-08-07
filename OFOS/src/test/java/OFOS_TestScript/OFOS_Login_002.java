package OFOS_TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OFOS_Pom_Class.Home_Page;
import com.OFOS_Pom_Class.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;

public class OFOS_Login_002 extends Base_Test {

	@DataProvider(name = "LoginData")
	public Object[][] testdata() throws IOException {
		return ReadExcel.multipleData("Login");
	}

	@Test(dataProvider = "LoginData")
	public void login(String username, String password) {
		Home_Page home = new Home_Page(driver);
		LoginPage login = new LoginPage(driver);

		clickAction(home.getLoginLink());
		enter_value(login.getUsernameTF(), username);
		enter_value(login.getPasswordTF(), password);
		clickAction(login.getLoginButton());

		try {
			Assert.assertEquals(home.getLogoutLink().isDisplayed(), true);
			test.log(LogStatus.PASS, "User login successfully");

		} catch (Exception e) {
			// TODO: handle exception
		}

		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));

	}

}
