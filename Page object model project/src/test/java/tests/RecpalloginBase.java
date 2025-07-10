package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class RecpalloginBase {
WebDriver driver;

@FindBy(xpath="//button[normalize-space()='Admin Login']")
WebElement adminbutton;

@FindBy(id="inputEmail")
WebElement usernamefield;

@FindBy(id="inputPassword")
WebElement passwordfield;

@FindBy(xpath="//button[@type='submit']")
WebElement signinbuttonfield;

public RecpalloginBase(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void login(String username, String password ) {
	adminbutton.click();
	usernamefield.sendKeys(username);
	passwordfield.sendKeys(password);	
}

public void buttonclick () {
	
	signinbuttonfield.click();
	
}

}
