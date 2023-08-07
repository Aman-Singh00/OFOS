package FireLawn_Test_Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_classes.Login_Page;
import pom_classes.TshirtPage;
import pom_classes.Welcome_page;

public class FireLawn_MEN_005 extends Base_Test{
	
	@Test
	public void tshirts() throws Throwable
	{
		Welcome_page page = new Welcome_page(driver);
		Assert.assertEquals(page.getLoginButton().isDisplayed(), true);
		clickAction(page.getLoginButton());
		test.log(LogStatus.INFO, "Login button click successfully");
		Login_Page lp = new Login_Page(driver);
		enter_value(lp.getEmailTextField(), getValueProperty("email"));
		Assert.assertEquals(lp.getEmailTextField().isDisplayed(), true);
		enter_value(lp.getPasswordTextField(), getValueProperty("password"));
		Assert.assertEquals(lp.getPasswordTextField().isDisplayed(), true);
		Assert.assertEquals(lp.getLoginButton().isDisplayed(), true);
		clickAction(lp.getLoginButton());
		Assert.assertEquals(page.getMenlink().isDisplayed(), true);
		initObjects();
		action.moveToElement(page.getMenlink()).perform();
		//Assert.assertEquals(page.getLinkTopwear(), true);
		//Thread.sleep(5000);
		//clickAction(page.getTshirtlink());
		
		TshirtPage tp =new TshirtPage(driver);
		action.moveToElement(tp.getMenTshirtLink()).perform();
		if(tp.getMenTshirtLink().isDisplayed())
		{
		Assert.assertEquals(tp.getMenTshirtLink().isDisplayed(), true);
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		}
		else
		{
			test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}
		
		
		
	}

}
