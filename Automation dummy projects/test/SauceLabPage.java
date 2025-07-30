package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabPage {

    WebDriver driver;

    // ====== Login Elements ======
    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;

    // ====== Cart and Checkout ======
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartLink;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    // ====== Checkout Info Form ======
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
    WebElement zipCodeField;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    // Constructor: Initialize all elements
    public SauceLabPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ====== Actions ======
    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void addToCartAndCheckout(String fname, String lname, String zip) {
        addToCartButton.click();
        cartLink.click();
        checkoutButton.click();
        firstNameField.sendKeys(fname);
        lastNameField.sendKeys(lname);
        zipCodeField.sendKeys(zip);
        continueButton.click();
        finishButton.click();
    }
}

