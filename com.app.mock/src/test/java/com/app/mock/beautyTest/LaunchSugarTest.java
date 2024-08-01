package com.app.mock.beautyTest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.app.mock.baseTest.TestBaseInitializer;


	public class LaunchSugarTest extends TestBaseInitializer {
		@Test(groups = {"beauty"})
		public void launchSugarTest(Method mtd) {
			Reporter.log("Executing "+mtd.getName(),true);
			driver.get("https://in.sugarcosmetics.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 Reporter.log("Launching Sugar Cosmetic...",true);
			String currentUrl = driver.getCurrentUrl();
			Assert.assertTrue(currentUrl.contains("sugar"));
	        Reporter.log("Sugar cosmatics launched...",true);
	    }

}
