package com.app.mock.beautyTest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.app.mock.baseTest.TestBaseInitializer;

public class LaunchLorealTest extends TestBaseInitializer {
	@Test(groups = "beauty")
	public void launchLorealTest(Method mtd) {
		Reporter.log("Executing "+mtd.getName(),true);
		driver.get("https://www.lorealparis.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 Reporter.log("Launching Loreal Paris...",true);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("loreal"));
        Reporter.log("Loreal Paris launched...",true);
    }

}
