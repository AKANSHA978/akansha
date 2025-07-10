package Base;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import utils.ExtentReportManager;
import utils.LogUtil;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public ExtentTest test;

    @BeforeClass
    public void setupSuite() {
        LogUtil.info("===== Test Suite Started =====");
        ExtentReportManager.initReport();  // Init Extent Report
    }

    @BeforeMethod
    public void setup() {
        LogUtil.info("Launching Chrome browser...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://recpalapp.co.uk/");
        LogUtil.info("Navigated to: https://recpalapp.co.uk/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            LogUtil.info("Browser closed.");
        }
    }

    @AfterClass
    public void endSuite() {
        ExtentReportManager.flushReport();
        LogUtil.info("===== Test Suite Ended =====");
    }
}
