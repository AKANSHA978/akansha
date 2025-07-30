package RecpalRelated.copy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecPalAdmisnLoginTest {

    public static void main(String[] args) throws InterruptedException {
        // Set path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\shivangi bidua\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Open the RecPal app
        driver.get("https://recpalnew.netlify.app/");

        // Wait for the page to load (better to use WebDriverWait in production)
        Thread.sleep(2000);

        // Click on the "Admin Login" button
        WebElement adminLoginButton = driver.findElement(By.xpath("//button[text()='Admin Login']"));
        adminLoginButton.click();

        // Wait for login form to appear
        Thread.sleep(2000);

        // Enter email
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("your_email@example.com"); // Replace with actual email

        // Enter password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("your_password"); // Replace with actual password

        // Click Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        loginButton.click();

        // Wait to verify login
        Thread.sleep(5000);

        System.out.println("Admin login flow completed.");
        
        // driver.quit(); // Uncomment to close the browser at the end
    }
}

