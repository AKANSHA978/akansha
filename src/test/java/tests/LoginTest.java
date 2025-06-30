package tests;

import base.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.LoggerUtil;

import org.apache.logging.log4j.Logger;

public class LoginTest extends BaseTest {

    Logger log = LoggerUtil.getLogger(LoginTest.class);

    @Test
    public void testLogin() {
        test = extent.createTest("Login Test - SauceDemo");

        try {
            driver.get("https://www.saucedemo.com/");
            log.info("Navigated to SauceDemo");
            test.log(Status.INFO, "Opened SauceDemo website");

            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            log.info("Entered username");

            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            log.info("Entered password");

            driver.findElement(By.id("login-button")).click();
            log.info("Clicked login button");

            test.log(Status.PASS, "Login test passed");
        } catch (Exception e) {
            log.error("Login test failed", e);
            test.log(Status.FAIL, "Login test failed: " + e.getMessage());
        }
    }
}
