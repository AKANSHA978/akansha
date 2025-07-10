package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class demoQA {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        // Store the original window
        String originalWindow = driver.getWindowHandle();

        // Click "New Tab" button
        driver.findElement(By.id("tabButton")).click();

        // Switch to new tab
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Close new tab
        driver.close();

        // Switch back to original
        driver.switchTo().window(originalWindow);

        // Click "New Window" button
        driver.findElement(By.id("windowButton")).click();

        // Switch to new window
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Close new window
        driver.close();

        // Switch back to original
        driver.switchTo().window(originalWindow);

        // Final cleanup
        driver.quit();
    }
}
