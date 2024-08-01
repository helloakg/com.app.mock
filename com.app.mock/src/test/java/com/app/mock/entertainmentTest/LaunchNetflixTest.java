package com.app.mock.entertainmentTest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.app.mock.baseTest.TestBaseInitializer;

public class LaunchNetflixTest extends TestBaseInitializer{
	
	@Test(groups = {"entertainment"})
	public void launchNetflixTest(Method mtd) {
		Reporter.log("Executing "+mtd.getName(),true);
		driver.get("https://www.netflix.com/in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Reporter.log("Launching Netflix...",true);
        String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("netflix"));
        Reporter.log("Netflix launched...",true);
    }

}
