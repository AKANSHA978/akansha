package com.ak.demo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class Recpallogin {

    @Test
    public static void testLogin() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "RMX3660"); // Your device ID
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.Recpal");
            caps.setCapability("appActivity", "com.Recpal.MainActivity");
            caps.setCapability("noReset", true);
            caps.setCapability("ignoreHiddenApiPolicyError", true);

            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            Thread.sleep(5000); // wait for app to launch

            // Email input
            WebElement emailField = driver.findElement(By.xpath("//android.widget.EditText[@text='Email']"));
            emailField.sendKeys("vivek@gmail.com");

            // Password input
            WebElement passwordField = driver.findElement(By.xpath("//android.widget.EditText[@text='Password']"));
            passwordField.sendKeys("Test@123");

            // Submit button (TextView is not clickable, so we tap the parent)
            WebElement submitBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']/.."));
            submitBtn.click();

            Thread.sleep(3000); // wait after login

            System.out.println("✅ Login test executed successfully.");

            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


