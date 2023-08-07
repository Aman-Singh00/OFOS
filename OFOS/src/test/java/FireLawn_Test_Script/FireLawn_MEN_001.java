package FireLawn_Test_Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_classes.Login_Page;
import pom_classes.Welcome_page;

public class FireLawn_MEN_001 extends Base_Test{
	
	
	@Test
	public void menTab() throws Throwable
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
		if(page.getMenlink().isDisplayed())
		{
			test.log(LogStatus.PASS, test.addScreenCapture(to_Take_Screenshot(page.getMenlink())));
		}
		else
		{
			test.log(LogStatus.FAIL, "Men Tab is not available on Home page");
		}
	
	}

}
