package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SitePage {
	
	WebDriver driver;
	@FindBy(xpath="//a[@href='#clientMenu']")
	WebElement clientmenu;
	
	@FindBy(xpath="//a[@href='/site']")
	WebElement sitebutton;
	
	@FindBy(xpath="(//button[@data-bs-target='#addSite'])[1]")
	WebElement addsitebutton;
	
	@FindBy(xpath="(//select[@id='selectClients'])[1]")
	WebElement clientname;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement contactpersonname;
	
	@FindBy(xpath="(//input[@type='email'])[1]")
	WebElement contactpersonemail;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement contactpersonphn;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement sitename;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement address;
	
	@FindBy(xpath="(//input[@type='email'])[2]")
	WebElement cemail;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement phnnmbr;
	
	@FindBy(xpath="//select[@id='selectOptionSplitRate']")
	WebElement splitrate;
	
	@FindBy(xpath="//select[@id='selectOptionStatus']")
	WebElement status;
	
	@FindBy(xpath="//select[@id='selectOptionPortalAccess']")
	WebElement portalaccess;
	
	@FindBy(xpath="//button[normalize-space()='Add Site']")
	WebElement signinbutton;
	
	public SitePage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	
	public void Siteform(
	        String clientDropdownName,
	        String contactPersonName,
	        String contactPersonEmail,
	        String contactPersonPhone,
	        String siteName,
	        String addreess,
	        String clientEmail,
	        String clientPhone,
	        String splitRateValue,
	        String statusValue,
	        String portalAccessValue) {

	    clientmenu.click();
	    sitebutton.click();
	    addsitebutton.click();

	    clientname.sendKeys(clientDropdownName);         // dropdown input
	    contactpersonname.sendKeys(contactPersonName);
	    contactpersonemail.sendKeys(contactPersonEmail);
	    contactpersonphn.sendKeys(contactPersonPhone);
	    sitename.sendKeys(siteName);
	    address.sendKeys(addreess);
	    cemail.sendKeys(clientEmail);
	    phnnmbr.sendKeys(clientPhone);

	    // Dropdown selections
	    selectsplitrates(splitRateValue);
	    statuss(statusValue);
	    portalaccesss(portalAccessValue);

	    signinbutton.click(); // Assuming this submits the form
	}
	  // Dropdown Helpers
    public void selectsplitrates(String value) {
        new Select(splitrate).selectByValue(value);
    }

    public void statuss(String value) {
        new Select(status).selectByValue(value);
    }

    public void portalaccesss(String value) {
        new Select(portalaccess).selectByValue(value);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
