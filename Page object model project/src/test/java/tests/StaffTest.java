package tests;

import Pages.RecpalLoginPage;
import Pages.StaffPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class StaffTest {

    WebDriver driver;
    RecpalLoginPage loginPage;
    StaffPage staffPage;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://recpalapp.co.uk/");

        // Initialize Page Objects
        loginPage = new RecpalLoginPage(driver);
        staffPage = new StaffPage(driver);
    }

    @Test
    public void testAddStaff() {
        // Step 1: Login
        loginPage.login("anshika@gmail.com", "anshika@123");
        loginPage.clickSignIn();

        // Step 2: Navigate to Staff and Add Staff
        staffPage.navigateToAddStaff();

        staffPage.addStaff(
            "Akash",               // First name
            "Singh",               // Last name
            "Manager",             // Position (dropdown visible text)
            "Self_employed",       // Job type (dropdown value)
            "1",                   // Employment type (dropdown value)
            "akash@example.com",   // Email
            "Akash@123",           // Password
            "Akash@123",           // Confirm password
            "9876543210"           // Phone number
        );
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

	
	
