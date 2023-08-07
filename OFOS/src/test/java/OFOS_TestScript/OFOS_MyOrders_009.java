package OFOS_TestScript;

import org.testng.annotations.Test;

import com.OFOS_Pom_Class.MyOrdersPage;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class OFOS_MyOrders_009 extends Base_Test {
	
	
	@Test
	public void deletePlacedOrder() throws InterruptedException
	{
		OFOS_MyOrders_006 order = new OFOS_MyOrders_006();
	
		try {
			order.placeOrderViaCOD();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyOrdersPage my =new MyOrdersPage(driver);
		
		
		
		for(int i=0;i<my.getDeleteButtonofAllItems().size();i++)
		{   //test.log(LogStatus.INFO, "Clicked on delete button of "+);
			my.getDeleteButtonofAllItems().get(i).click();
			driver.switchTo().alert().accept();
			test.log(LogStatus.PASS, "Order is deleted successfully");
			test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		}
		
		
		
		
	}

}
