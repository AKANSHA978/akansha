package tests;

import Pages.SitePage;
import Pages.RecpalLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SitePageTest {

    WebDriver driver;
    RecpalLoginPage loginPage;
    SitePage sitePage;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://recpalapp.co.uk/");

        loginPage = new RecpalLoginPage(driver);
        sitePage = new SitePage(driver);
    }

    @Test
    public void testAddSite() {
        // Login
        loginPage.login("merchant@gmail.com", "merchant@123");
        loginPage.clickSignIn();

        // Fill the site form
        sitePage.Siteform(
            "anshula",              // client name (dropdown input)
            "kapoor",               // contact person name
            "ans@gmail.com",        // contact person email
            "88577599798",          // contact person phone
            "ankriti",              // site name
            "indore",               // address
            "ankr@gmail.com",       // client email
            "89967467888"  ,      
    // client phone
            "true",
            "true",
            "true"
            
        );

        // Select dropdown values
    
    }
}

