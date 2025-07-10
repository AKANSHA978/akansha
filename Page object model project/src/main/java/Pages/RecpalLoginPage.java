package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtil;  // Optional if you have a logging utility

public class RecpalLoginPage {

    WebDriver driver;

    @FindBy(xpath = "//button[normalize-space()='Admin Login']")
    WebElement adminButton;

    @FindBy(id = "inputEmail")
    WebElement usernameField;

    @FindBy(id = "inputPassword")
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement signInButton;

    // Constructor
    public RecpalLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Perform login
    public void login(String username, String password) {
        LogUtil.info("Clicking Admin Login");
        adminButton.click();

        LogUtil.info("Entering username and password");
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    // Click Sign In button
    public void clickSignIn() {
        LogUtil.info("Clicking Sign In button");
        signInButton.click();
    }

    // Optional: Validate login page is displayed
    public boolean isLoginButtonDisplayed() {
        return signInButton.isDisplayed();
    }
}

