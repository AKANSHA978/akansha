package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotsExample {
    public static void main(String[] args) throws IOException {
        // Set up ChromeDriver (use WebDriverManager if preferred)
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("https://example.com");

        // Take screenshot and store as a file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Copy the screenshot to desired location
        FileHandler.copy(src, new File("screenshot.png"));

        // Close the browser
        driver.quit();
    }
}
