package FireLawn_Test_Script;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_classes.Login_Page;
import pom_classes.Welcome_page;

public class FireLawn_Men_003 extends Base_Test {
	
	
	@Test
	public void topWear() throws Throwable
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
		Thread.sleep(10000);
		action.moveToElement(page.getMenlink()).perform();
		Assert.assertEquals(page.getLinkTopwear(), true);
		action.moveToElement(page.getLinkTopwear()).perform();
		clickAction(page.getLinkTopwear());
		//action.moveToElement(driver.findElement(By.xpath("//a[text()='Home']"))).perform();
		
		
	}

}
