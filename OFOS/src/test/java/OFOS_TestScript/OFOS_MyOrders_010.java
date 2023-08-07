package OFOS_TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OFOS_Pom_Class.CheckOutPage;
import com.OFOS_Pom_Class.DishesPage;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class OFOS_MyOrders_010 extends Base_Test {
	
	
	@Test
	public void restaurantViaCOD() throws InterruptedException
	{
		OFOS_cart_004 cart = new OFOS_cart_004();
		
		try {
			cart.restaurant();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DishesPage page = new DishesPage(driver);
		CheckOutPage check = new CheckOutPage(driver);
		clickAction(page.getCheckoutButton());
		
		test.log(LogStatus.PASS, "Payment page is displayed");
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		
		
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
		test.log(LogStatus.PASS, "your order is successfully register");
		
		
		
		
	}

}
