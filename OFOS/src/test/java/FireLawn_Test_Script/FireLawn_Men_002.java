package FireLawn_Test_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_classes.Login_Page;
import pom_classes.Welcome_page;


public class FireLawn_Men_002 extends Base_Test{
	

	@Test
	public void mouseHoverOnMenTab() throws Throwable
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
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Topwear']/../../../.."));
		
			if(element.isDisplayed())
			{
			Assert.assertEquals(element.isDisplayed(), true);
			test.log(LogStatus.PASS, test.addScreenCapture(to_Take_Screenshot(element)));
			}
			else
			{
				test.log(LogStatus.FAIL, "No ");
			}
		}
		
		
		

	}
	
	


