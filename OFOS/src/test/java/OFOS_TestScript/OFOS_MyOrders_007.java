package OFOS_TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OFOS_Pom_Class.CheckOutPage;
import com.OFOS_Pom_Class.DishesPage;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class OFOS_MyOrders_007 extends Base_Test {
	
	@Test
	public void placeOrderViaPaypal()
	{
		OFOS_cart_003 cart = new OFOS_cart_003();
		cart.addTocart();
		DishesPage page = new DishesPage(driver);
		CheckOutPage check = new CheckOutPage(driver);
		clickAction(page.getCheckoutButton());
		
		test.log(LogStatus.PASS, "Payment page is displayed");
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		
		clickAction(check.getOnlinePayElementRadioButton());
		
		Assert.assertEquals(check.getOnlinePayElementRadioButton().isSelected(),true);
	}
	
	
	

}
