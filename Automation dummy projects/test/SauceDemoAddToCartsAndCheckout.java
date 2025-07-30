package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SauceDemoAddToCartsAndCheckout {
    public static void main(String[] args) throws InterruptedException {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");

                WebDriver driver = new ChromeDriver(options);
                driver.get("https://www.google.com");
      
        driver.manage().window().maximize();

        // Step 1: Login
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

        // Step 2: Add first item (e.g., Sauce Labs Backpack)
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(1000);

        // Step 3: Click on cart icon
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

        // Step 4: Click Checkout
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);

        // Step 5: Fill checkout information
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);

        // Step 6: Finish the order
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);

        // Optional: Confirmation
        String confirmation = driver.findElement(By.className("complete-header")).getText();
        System.out.println("Order status: " + confirmation); // Should be "Thank you for your order!"

        driver.quit();
    }
}
