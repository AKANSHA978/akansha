package julylastweek;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            {"standard_user", "secret_sauce", true},  // Valid
            {"standard_user", "wrong_pass", false},   // Invalid
            {"", "", false} , 
            {"akansha","bidua",false},};
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password, boolean isSuccessExpected) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        if (isSuccessExpected) {
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "User should be redirected to dashboard");
        } else {
            WebElement errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']"));
            Assert.assertTrue(errorMsg.isDisplayed(), "Error message should be displayed");
        }
    }

    @Test
    public void testPasswordMasking() {
        WebElement passwordField = driver.findElement(By.id("password"));
        String fieldType = passwordField.getAttribute("type");
        Assert.assertEquals(fieldType, "password", "Password should be masked");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

