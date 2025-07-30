import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class RedbusAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");

        // Create FluentWait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        // === Step 1: Close login popup if present ===
        try {
            WebElement closePopup = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("div.icon-close")) // Close icon for Sign-in popup
            );
            closePopup.click();
        } catch (Exception e) {
            System.out.println("Login popup not displayed.");
        }

        // === Step 2: Enter FROM city ===
        WebElement fromInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("src")));
        fromInput.clear();
        fromInput.sendKeys("Mumbai");

        WebElement fromSuggestion = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[contains(text(),'Mumbai')]")));
        fromSuggestion.click();

        // === Step 3: Enter TO city ===
        WebElement toInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("dest")));
        toInput.clear();
        toInput.sendKeys("Delhi");

        WebElement toSuggestion = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[contains(text(),'Delhi')]")));
        toSuggestion.click();

        // Optional: Quit driver
        // driver.quit();
    }
}

