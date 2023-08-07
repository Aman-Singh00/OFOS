package OFOS_TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OFOS_Pom_Class.CheckOutPage;
import com.OFOS_Pom_Class.DishesPage;
import com.OFOS_Pom_Class.Home_Page;
import com.OFOS_Pom_Class.ItalianRestaurantPage;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class OFOS_MyOrders_013 extends Base_Test {

	@Test
	public void placedOrderFromItalianRestaurant() throws InterruptedException {
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
		clickAction(page.getItalianRestaurantLink());
		Thread.sleep(2000);

		for (int i = 0; i < page.getAllRestaurant().size(); i++) {
			if (page.getAllRestaurant().get(i).getText().equals("Eataly")) {
				clickAction(page.getAllRestaurant().get(i));
				break;
			}
		}

		ItalianRestaurantPage ip = new ItalianRestaurantPage(driver);

		//test.log(LogStatus.PASS, ip.getDishName().getText());
		test.log(LogStatus.PASS, ip.getDishPrice().getText());
		test.log(LogStatus.PASS, ip.getDishQuantity().getAttribute("value"));

		clickAction(ip.getAddToCart());

		test.log(LogStatus.PASS, "item added successfully");

		DishesPage dish = new DishesPage(driver);

		clickAction(dish.getCheckoutButton());

		test.log(LogStatus.PASS, "Payment page is displayed");
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		CheckOutPage check = new CheckOutPage(driver);

		clickAction(check.getCashOnDeliveryradioButton());
		test.log(LogStatus.PASS, "Successfully clicked on cash on delievery radio button");

		Thread.sleep(2000);
		Assert.assertEquals(check.getOrderNowButton().isDisplayed(), true);
		clickAction(check.getOrderNowButton());
		test.log(LogStatus.PASS, "Order now button click successfully");

		try {
			driver.switchTo().alert().accept();
			driver.switchTo().alert().accept();
			test.log(LogStatus.PASS, "Handled the alert");
		} catch (Exception e) {
			// TODO: handle exception
		}

		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		test.log(LogStatus.PASS, "your order is successfully registered");

	}

}
