package com.app.mock.ecomTest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.app.mock.baseTest.TestBaseInitializer;

public class LaunchAmazonTest extends TestBaseInitializer {
	@Test(groups = {"ecom"})
	public void launchAmazonTest(Method mtd) {
		Reporter.log("Executing "+mtd.getName(),true);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Reporter.log("Launching Amazon...",true);
        String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("amazon"));
        Reporter.log("Amazon launched...",true);
    }

}
