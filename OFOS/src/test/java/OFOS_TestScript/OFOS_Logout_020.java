package OFOS_TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OFOS_Pom_Class.Home_Page;
import com.relevantcodes.extentreports.LogStatus;

public class OFOS_Logout_020 extends OFOS_Login_002 {
	@Test
	public void logout() {
		Home_Page page = new Home_Page(driver);
		clickAction(page.getLogoutLink());
		try {
			Assert.assertEquals(page.getLoginLink().isDisplayed(), true);
			test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			// TODO: handle exception
			test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}

	}

}
