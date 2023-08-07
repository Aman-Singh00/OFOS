package OFOS_TestScript;

import org.testng.annotations.Test;

import com.OFOS_Pom_Class.Home_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class OFOS_MyOrders_017 extends Base_Test {

	@Test
	public void placedOrderFromNorthIndianRestaurant() {
		OFOS_Login_002 login = new OFOS_Login_002();
		try {
			login.login(getValueProperty("email"), getValueProperty("password"));
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Home_Page page = new Home_Page(driver);
		js.executeScript("arguments[0].scrollIntoView(true)", page.getItalianRestaurantLink());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickAction(page.getNorthIndianRestaurantLink());
		
		test.log(LogStatus.FAIL, "No Restaurant Found");
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));

	}
}
