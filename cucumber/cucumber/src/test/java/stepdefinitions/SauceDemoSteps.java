package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SauceDemoSteps {

    WebDriver driver;

    @Given("user launches SauceDemo website")
    public void user_launches_sauce_demo_website() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @When("user logs in with valid credentials")
    public void user_logs_in() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
    }

    @When("adds a bike light to the cart")
    public void add_item_to_cart() throws InterruptedException {
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);
    }

    @When("proceeds to checkout with customer details")
    public void checkout_with_details() throws InterruptedException {
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
    }

    @Then("order should be placed successfully")
    public void verify_order_success() {
        String confirmation = driver.findElement(By.className("complete-header")).getText();
        System.out.println("Order status: " + confirmation);
        if (confirmation.contains("Thank you for your order!")) {
            System.out.println("✅ Order placed successfully!");
        } else {
            System.out.println("❌ Order failed.");
        }
        driver.quit();
    }
}

