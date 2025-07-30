package RecpalRelated.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class StaffTest {

    WebDriver driver;
    RecpalloginBase loginPage;
    StaffPage staffPage;

    @BeforeClass
    public void setup() {
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://recpalapp.co.uk/"); // Replace with actual URL

        loginPage = new RecpalloginBase(driver);
        staffPage = new StaffPage(driver);
    }

    @Test
    public void testAddStaff() throws InterruptedException {
        // Step 1: Login using base class
        loginPage.login("merchant@gmail.com", "merchant@123");
        loginPage.buttonclick();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Step 2: Add staff (fill with sample data)
        staffPage.staffmenu.click();
        staffPage.stafflist.click();
        staffPage.addstaff.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        staffPage.firstnamefield.sendKeys("Akash");
        staffPage.lastnamefield.sendKeys("Singh");
        staffPage.selectPositionByVisibleText("Manager");        // you can create this method in StaffPage
        staffPage.selectJobTypeByValue("Self_employed");       // method inside StaffPage
        staffPage.selectEmploymentTypeByValue("1");// method inside StaffPage
        staffPage.emailfield.sendKeys("akash@example.com");
        staffPage.passwordfill.sendKeys("Akash@123");
        staffPage.confirmpass.sendKeys("Akash@123");
        staffPage.phonenumber.sendKeys("9876543210");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}

	
	