package RecpalRelated.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StaffPage {	
WebDriver driver;

@FindBy(xpath="//a[@href='#staffMenu']")
WebElement staffmenu;

@FindBy(xpath="//a[@href='/staff-list']")
WebElement stafflist;

@FindBy(xpath="//button[@class='btn btn-lg text-white']")
WebElement addstaff;

@FindBy(xpath="(//input[@type='text'])[1]")
WebElement firstnamefield;

@FindBy(xpath="(//input[@type='text'])[2]")
WebElement lastnamefield;

@FindBy(xpath="(//select)[1]")
WebElement positiondropdown;

@FindBy(xpath="//select[@id='selectOptionEmployee']")
WebElement jobtypedropdown ;

@FindBy(xpath="//select[@id='selectEmployeeType']")
WebElement employmentype;

@FindBy(xpath="//input[@autocomplete='new-email']")
WebElement emailfield;

@FindBy(xpath="//input[@autocomplete='new-password']")
WebElement passwordfill;

@FindBy(xpath="(//input[@type='password'])[2]")
WebElement confirmpass;

@FindBy(xpath="(//input[@type='text'])[3]")
WebElement phonenumber;

public StaffPage(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

public  void CreateStaff(String fname, String lname, String email , String Passwrd, String cnfmpass, String phnnmber) {
	staffmenu.click();
	stafflist.click();
	addstaff.click();
	firstnamefield.sendKeys(fname);
	lastnamefield.sendKeys(lname);
	emailfield.sendKeys(email);
	passwordfill.sendKeys(Passwrd);
	confirmpass.sendKeys(cnfmpass);
	phonenumber.sendKeys(phnnmber);
}

public void selectPositionByVisibleText(String text) {
    Select select = new Select(positiondropdown);
    select.selectByVisibleText(text);
}

public void selectJobTypeByValue(String text) {
    Select select = new Select(jobtypedropdown);
    select.selectByValue(text);
}

public void selectEmploymentTypeByValue(String value) {
    Select select = new Select(employmentype);
    select.selectByValue(value);
}



}
