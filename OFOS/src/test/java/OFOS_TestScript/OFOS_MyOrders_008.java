package OFOS_TestScript;

import org.testng.annotations.Test;

import com.OFOS_Pom_Class.Home_Page;
import com.OFOS_Pom_Class.MyOrdersPage;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class OFOS_MyOrders_008  extends Base_Test{
	
	@Test
	public void dispatchOrder() throws InterruptedException
	{
		OFOS_MyOrders_006 myorder = new OFOS_MyOrders_006();
		try {
			myorder.placeOrderViaCOD();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Home_Page home = new Home_Page(driver);
		MyOrdersPage mp = new MyOrdersPage(driver);
		Thread.sleep(5000);
		//clickAction(home.getMyOrderLink());
		
		
		if(mp.getDispatchButtons().get(0).isSelected())
		{
			mp.getDispatchButtons().get(0).click();
			test.log(LogStatus.PASS, "Dispatch suceed");
			test.log(LogStatus.INFO,  test.addScreenCapture(getPhoto(driver)));
		}
		else
		{
			test.log(LogStatus.FAIL, "Dispatch not suceed");
			test.log(LogStatus.INFO,  test.addScreenCapture(getPhoto(driver)));
		}
		
	}

}
