package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.time.Duration;

public class SauceDemosMenuTest {
    public static void main(String[] args) throws InterruptedException {
        // Disable password manager popup
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Step 1: Login
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Step 2: Click sidebar button
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1500); // Wait for menu animation

        // Step 3: Click "All Items"
        WebElement allItems = driver.findElement(By.id("inventory_sidebar_link"));
        allItems.click();
        System.out.println("Clicked All Items");
        Thread.sleep(1500);

        // Step 4: Open menu again
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1500);

        // Step 5: Click "About"
        WebElement about = driver.findElement(By.id("about_sidebar_link"));
        about.click();
        System.out.println("Clicked About");
        Thread.sleep(1500);

        // Navigate back to main site since About redirects
        driver.navigate().back();
        Thread.sleep(1500);

        // Step 6: Open menu again
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1500);

        // Step 7: Click "Reset App State"
        WebElement reset = driver.findElement(By.id("reset_sidebar_link"));
        reset.click();
        System.out.println("Clicked Reset App State");
        Thread.sleep(1500);

        // Step 8: Open menu again
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1500);

        // Step 9: Click "Logout"
        WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
        logout.click();
        System.out.println("Clicked Logout");

        driver.quit();
    }
}
