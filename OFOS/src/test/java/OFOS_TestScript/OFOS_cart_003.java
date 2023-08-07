package OFOS_TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OFOS_Pom_Class.DishesPage;
import com.OFOS_Pom_Class.Home_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class OFOS_cart_003 extends Base_Test {

	@Test
	public void addTocart() {
		Home_Page home = new Home_Page(driver);
		DishesPage dp = new DishesPage(driver);
		
		OFOS_Login_002 login=new OFOS_Login_002();
		try {
			login.login(getValueProperty("email"), getValueProperty("password"));
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			Assert.assertEquals(home.getOrderNowButton().isDisplayed(), true);
			test.log(LogStatus.INFO, "order button is displayed");
		} catch (Exception e) {
			// TODO: handle exception
		}

		home.clickAction(home.getOrderNowButton());
		test.log(LogStatus.INFO, "User is successfully added dish");

		test.log(LogStatus.PASS, dp.getDishPrice().getText());
		dp.getDishQuantityTextField().clear();
		 //change the quantity of dish
		enter_value(dp.getDishQuantityTextField(), "2");
		test.log(LogStatus.PASS, dp.getDishQuantityTextField().getAttribute("value"));

		try {
			Assert.assertEquals(dp.getDishAddToCartCartButton().isDisplayed(), true);
			test.log(LogStatus.PASS, "Add to cart button is displayed");
		} catch (Exception e) {
			// TODO: handle exception

		}
		clickAction(dp.getDishAddToCartCartButton());

		test.log(LogStatus.PASS, "User successfully add the dish in cart item");
		
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));

	}

}
