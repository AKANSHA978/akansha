package tests;

import base.BaseTest;
import utils.LoggerUtil;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AddToCartTest extends BaseTest {
	Logger log = LoggerUtil.getLogger(AddToCartTest.class);

    @Test
    public void testAddToCart() {
        test = extent.createTest("Add to Cart Test");

        driver.get("https://www.saucedemo.com/");
        log.info("Opened SauceDemo website");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        log.info("Logged in");

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        log.info("Added backpack to cart");

        String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals(cartCount, "1", "Cart should have 1 item");
        log.info("Verified cart has 1 item");

        test.pass("Add to cart test passed");
    }
}
