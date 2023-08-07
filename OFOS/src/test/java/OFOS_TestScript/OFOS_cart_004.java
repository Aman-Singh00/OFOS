package OFOS_TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OFOS_Pom_Class.DishesPage;
import com.OFOS_Pom_Class.Home_Page;
import com.OFOS_Pom_Class.RestaurantsPage;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class OFOS_cart_004 extends Base_Test {

	@Test
	public void restaurant() throws InterruptedException {
		OFOS_Login_002 login = new OFOS_Login_002();
		try {
			login.login(getValueProperty("email"), getValueProperty("password"));
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Home_Page hp = new Home_Page(driver);
		RestaurantsPage resturant = new RestaurantsPage(driver);
		DishesPage dishes = new DishesPage(driver);

		try {
			Assert.assertEquals(hp.getRestaurantsLink().isDisplayed(), true);

		} catch (Exception e) {
			// TODO: handle exception
		}

		// clicking on restaurant link
		clickAction(hp.getRestaurantsLink());

		try {
			test.log(LogStatus.INFO, "Restaurant page is visible");
			test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));

		} catch (Exception e) {
			// TODO: handle exception
			test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}

		Assert.assertEquals(resturant.getRestaurantName().isDisplayed(), true);

		//clicking on particular restaurant
		clickAction(resturant.getRestaurantName());
		
		//clicking on add to cart button
		clickAction(dishes.getDishAddToCartCartButton());
		
		try {
			Assert.assertEquals(dishes.getCheckoutButton().isEnabled(), true);
			test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			// TODO: handle exception
			test.log(LogStatus.INFO, "test fail");
			test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}
		
	
	

	}

}
