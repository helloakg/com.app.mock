package com.app.mock.entertainmentTest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.app.mock.baseTest.TestBaseInitializer;

public class LaunchPrimeTest extends TestBaseInitializer {
	@Test(groups = {"entertainment"})
	public void launchPrimeTest(Method mtd) {
		Reporter.log("Executing "+mtd.getName(),true);
		driver.get("https://www.primevideo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Reporter.log("Launching Prime...",true);
        String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("primevideo"));
        Reporter.log("Prime video launched...",true);
    }

}
