package com.ak.demo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class LaunchChrome {
  
	@Test
	public static void test() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "RMX3660");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.android.chrome");
            caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
            caps.setCapability("noReset", true);
            caps.setCapability("ignoreHiddenApiPolicyError", true);

            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            Thread.sleep(5000); // wait for Chrome to launch
            driver.get("https://www.saucedemo.com/")     ;      
            
           
            
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
