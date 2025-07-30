package Testfile;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class FlipkartHoverClickFix {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");

        // Close login popup
        try {
            WebElement closeBtn = driver.findElement(By.xpath("//button[text()='✕']"));
            closeBtn.click();
        } catch (Exception e) {}

        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Hover on "Home & Furniture"
        WebElement menu = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
        actions.moveToElement(menu).perform();

        // Wait for dropdown to appear and locate "Kitchen & Dining"
        WebElement kitchenDining = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//a[contains(text(),'Kitchen & Dining')]")
        ));

        // Scroll to ensure visibility (important on Flipkart)
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", kitchenDining);

        // Click using JavaScript (safe way for tricky elements)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", kitchenDining);

        // Wait for page to load (optional)
        Thread.sleep(3000);  //a[contains(text(),'kitchen&Dining')]

        // Print current page title
        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}
