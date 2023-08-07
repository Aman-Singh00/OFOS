package OFOS_TestScript;

import org.testng.annotations.Test;

import com.OFOS_Pom_Class.DishesPage;
import com.OFOS_Pom_Class.Home_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class OFOS_MyOrders_012 extends Base_Test {
	
	@Test
	public void placeOrderFromContinentalRestaurant() throws InterruptedException {
		
		OFOS_Login_002 login=new OFOS_Login_002();
		try {
			login.login(getValueProperty("email"), getValueProperty("password"));
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Home_Page page = new Home_Page(driver);
		js.executeScript("arguments[0].scrollIntoView(true)", page.getContinentalRestaurantLink());
		Thread.sleep(2000);
		clickAction(page.getContinentalRestaurantLink());
		
		for (int i = 0; i < page.getAllRestaurant().size(); i++) {
			if (page.getAllRestaurant().get(i).getText().equals("Heavenly Food")) {
				clickAction(page.getAllRestaurant().get(i));
				break;
			}
		}
		DishesPage dp = new DishesPage(driver);
		js.executeScript("arguments[0].scrollIntoView(true);",dp.getMenuLink() );
		Thread.sleep(2000);
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		test.log(LogStatus.FAIL, "No dishes found");
		//driver.quit();
	}


}
