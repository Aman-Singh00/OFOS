package OFOS_TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OFOS_Pom_Class.DishesPage;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class OFOS_cart_005 extends Base_Test{
	@Test
	public void deleteCartItems()
	{
		OFOS_cart_003 cart = new OFOS_cart_003();
		cart.addTocart();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DishesPage page = new DishesPage(driver);
		clickAction(page.getDeleteButton());
		
		try {
			Thread.sleep(2000);
			Assert.assertEquals(page.getCheckoutButton().isEnabled(), false);
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
			
		} catch (Exception e) {
			// TODO: handle exception
		test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}
		
		
		
		
	}
	

}
