package com.app.mock.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBaseInitializer {
	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void configBC(@Optional("chrome") String browser) {
		//String BROWSER = "firefox";
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("microsoftedge")) {
			driver = new EdgeDriver();
		}
		Reporter.log(browser+" browser launched---",true);
		driver.manage().window().maximize();
	}
	@AfterMethod(alwaysRun = true)
	public void confidAF() {
        //driver.close();
        Reporter.log("--Test case executed-",true)  ;
    }

	@AfterClass(alwaysRun = true)
	public void configAC() {
		if (driver!=null)  {
				driver.quit();
            Reporter.log("--Browser closed---\n",true);
		}

	}
}
