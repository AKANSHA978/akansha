package RecpalRelated.copy;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rexpl {

    public static void main(String[] args) {
    	
    	 ChromeOptions options = new ChromeOptions();
         Map<String, Object> prefs = new HashMap<>();
         prefs.put("credentials_enable_service", false);
         prefs.put("profile.password_manager_enabled", false);
         options.setExperimentalOption("prefs", prefs);


        // Set path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\shivangi bidua\\Downloads\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://recpalnew.netlify.app/");

        // Create WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Locate and click the "Admin Login" button
            WebElement adminLoginButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Admin Login')]"))
            );
            adminLoginButton.click();

            // Wait for email field and enter credentials
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputEmail")));
            emailField.sendKeys("merchant@gmail.com"); // replace with real email

            WebElement passwordField = driver.findElement(By.id("inputPassword"));
            passwordField.sendKeys("merchant@123"); // replace with real password

            WebElement signInButton = driver.findElement(By.cssSelector("button.btn.btn-primary.btn-block.text-capitalize.shadow-sm.cursor-pointer"));
            signInButton.click();
            
            WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='OK']")));
                okButton.click();



            System.out.println("✅ Login attempt done");

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        // Optionally close browser
        // driver.quit();
    }
}
