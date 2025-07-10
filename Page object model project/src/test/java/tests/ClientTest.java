package tests;

import Pages.RecpalLoginPage;
import Pages.ClientPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class ClientTest {

    WebDriver driver;
    RecpalLoginPage loginPage;
    ClientPage clientPage;

    @BeforeClass
    public void setup() {
        // Launch browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open application
        driver.get("https://recpalapp.co.uk/");

        // Initialize Page Objects
        loginPage = new RecpalLoginPage(driver);
        clientPage = new ClientPage(driver);
    }

    @Test
    public void testAddClient() {
        // Login
        loginPage.login("testingpurpose@gmail.com", "Testpurpose@123");
        loginPage.clickSignIn();

        // Add Client
        clientPage.addClient(
            "Anshikaa", 
            "anshika3@gmail.com", 
            "9898989898", 
            "Anshika@123", 
            "Anshika@123", 
            "Indore"
        );
    }

    @AfterClass
    public void teardown() {
        // Close browser
        if (driver != null) {
            driver.quit();
        }
    }
}
