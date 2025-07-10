package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StaffPage {

    WebDriver driver;

    @FindBy(xpath = "//a[@href='#staffMenu']")
    WebElement staffMenu;

    @FindBy(xpath = "//a[@href='/staff-list']")
    WebElement staffList;

    @FindBy(xpath = "//button[@class='btn btn-lg text-white']")
    WebElement addStaffButton;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    WebElement firstNameField;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    WebElement lastNameField;

    @FindBy(xpath = "(//select)[1]")
    WebElement positionDropdown;

    @FindBy(xpath = "//select[@id='selectOptionEmployee']")
    WebElement jobTypeDropdown;

    @FindBy(xpath = "//select[@id='selectEmployeeType']")
    WebElement employmentTypeDropdown;

    @FindBy(xpath = "//input[@autocomplete='new-email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@autocomplete='new-password']")
    WebElement passwordField;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPasswordField;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    WebElement phoneNumberField;

    public StaffPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Navigate to Add Staff Form
    public void navigateToAddStaff() {
        staffMenu.click();
        staffList.click();
        addStaffButton.click();
    }

    // Fill Staff Form
    public void addStaff(String firstName, String lastName, String position, String jobType, String employmentType,
                         String email, String password, String confirmPassword, String phone) {

        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        selectPositionByVisibleText(position);
        selectJobTypeByValue(jobType);
        selectEmploymentTypeByValue(employmentType);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(confirmPassword);
        phoneNumberField.sendKeys(phone);
    }

    // Dropdown Helpers
    public void selectPositionByVisibleText(String text) {
        new Select(positionDropdown).selectByVisibleText(text);
    }

    public void selectJobTypeByValue(String value) {
        new Select(jobTypeDropdown).selectByValue(value);
    }

    public void selectEmploymentTypeByValue(String value) {
        new Select(employmentTypeDropdown).selectByValue(value);
    }
}
