package automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BrowserWindowTests {

    WebDriver driver;
    String mainWindowHandle;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        mainWindowHandle = driver.getWindowHandle();
    }

    @Test(priority = 1)
    public void testNewTab() {
        driver.findElement(By.id("tabButton")).click();

        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                String text = driver.findElement(By.id("sampleHeading")).getText();
                System.out.println("New Tab Text: " + text);
                assert text.contains("This is a sample page");
                driver.close(); // close new tab
                driver.switchTo().window(mainWindowHandle);
            }
        }
    }

    @Test(priority = 2)
    public void testNewWindow() {
        driver.findElement(By.id("windowButton")).click();

        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                String text = driver.findElement(By.id("sampleHeading")).getText();
                System.out.println("New Window Text: " + text);
                assert text.contains("This is a sample page");
                driver.close(); // close new window
                driver.switchTo().window(mainWindowHandle);
            }
        }
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
