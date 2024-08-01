package com.app.mock.foodTest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.app.mock.baseTest.TestBaseInitializer;

public class LaunchSwigyTest extends TestBaseInitializer{
	@Test(groups = {"swiggy"})
	public void launchSwiggyTest(Method mtd) {
		Reporter.log("Executing "+mtd.getName(),true);
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Reporter.log("Launching Swiggy...",true);
        String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("swiggy"));
        Reporter.log("Swiggy launched...",true);
    }

}
