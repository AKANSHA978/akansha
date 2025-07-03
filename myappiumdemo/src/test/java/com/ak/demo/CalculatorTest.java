package com.ak.demo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    AndroidDriver driver;

    @SuppressWarnings("deprecation")
	@BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("RMX3660")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.coloros.calculator")
                .setAppActivity("com.android.calculator2.Calculator")
                .setNoReset(true);
        options.setCapability("ignoreHiddenApiPolicyError", true);


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options); // ✅ CORRECT

    }

    @Test
    public void testAddition() {
        // Tap 2
        driver.findElement(By.id("com.coloros.calculator:id/digit_2")).click();
        // Tap +
        driver.findElement(By.id("com.coloros.calculator:id/op_add")).click();
        // Tap 3
        driver.findElement(By.id("com.coloros.calculator:id/digit_3")).click();
        // Tap =
        driver.findElement(By.id("com.coloros.calculator:id/eq")).click();
        // Get result
        String result = driver.findElement(By.id("com.coloros.calculator:id/eq")).getText();

        System.out.println("Actual Result: " + result);
        Assert.assertEquals(result.trim(), "5", "Expected result should be 5");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

