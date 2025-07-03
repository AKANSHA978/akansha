package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LoginSteps {

    WebDriver driver;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login"); // Sample login page
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("user should be redirected to dashboard")
    public void user_should_be_redirected_to_dashboard() {
        String successMessage = driver.findElement(By.cssSelector(".flash.success")).getText();
        if (successMessage.contains("You logged into a secure area!")) {
            System.out.println("Login successful ✅");
        } else {
            System.out.println("Login failed ❌");
        }
        driver.quit();
    }
}
