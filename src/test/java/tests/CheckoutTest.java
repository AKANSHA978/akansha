package tests;

import base.BaseTest;
import utils.LoggerUtil;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CheckoutTest extends BaseTest {
	Logger log = LoggerUtil.getLogger(CheckoutTest.class);

    @Test
    public void testCheckoutFlow() {
        test = extent.createTest("Checkout Flow Test");

        driver.get("https://www.saucedemo.com/");
        log.info("Opened SauceDemo website");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        log.info("Logged in");

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        log.info("Navigated to cart");

        driver.findElement(By.id("checkout")).click();
        log.info("Clicked checkout");

        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        log.info("Entered user info and continued");

        boolean isOverviewPage = driver.findElement(By.className("title")).getText().contains("Checkout: Overview");
        Assert.assertTrue(isOverviewPage, "Not on checkout overview page");
        test.pass("Checkout flow test passed");
    }
}
