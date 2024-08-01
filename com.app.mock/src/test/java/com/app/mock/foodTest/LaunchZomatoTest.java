package com.app.mock.foodTest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.app.mock.baseTest.TestBaseInitializer;

	public class LaunchZomatoTest extends TestBaseInitializer{
		@Test(groups = {"zomato"})
		public void launchZomatoTest(Method mtd) {
			Reporter.log("Executing "+mtd.getName(),true);
			driver.get("https://www.zomato.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        Reporter.log("Launching Zomato...",true);
	        String currentUrl = driver.getCurrentUrl();
			Assert.assertTrue(currentUrl.contains("zomato"));
	        Reporter.log("Zomato launched...",true);
	    }

}
