package RecpalRelated.copy;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SitePageTest {
    WebDriver driver;
    RecpalloginBase loginPage;
    SitePage sitePage;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://recpalapp.co.uk/");

        loginPage = new RecpalloginBase(driver);
        sitePage = new SitePage(driver);
    }

    @Test
    public void testAddSite() throws InterruptedException {
        // Login
        loginPage.login("merchant@gmail.com", "merchant@123");
        loginPage.buttonclick();
        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Fill site form
        sitePage.clientmenu.click();
        sitePage.sitebutton.click();
        sitePage.addsitebutton.click();
        sitePage.clientname.sendKeys("anshula");
        sitePage.contactpersonname.sendKeys("kapoor");
        sitePage.contactpersonemail.sendKeys("ans@gmail.com");
        sitePage.contactpersonphn.sendKeys("88577599798");
        sitePage.sitename.sendKeys("ankriti");
        sitePage.address.sendKeys("indore");
        sitePage.cemail.sendKeys("ankr@gmail.com");
        sitePage.phnnmbr.sendKeys("89967467888");

        sitePage.splitrates("true");
        sitePage.statusd("true");
        sitePage.portalaccess("true");
        sitePage.signinbutton.click();
        // Save (optional if Save button exists)
        // sitePage.saveButton.click();
    }
}
