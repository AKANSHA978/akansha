package RecpalRelated.copy;

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
	
	@FindBy(xpath="//a[@href='#clientMenu']")
	WebElement signinbutton;
	
	public SitePage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	
	public void Siteform(String name,String email, String phdnnmbr, String cpersonphn, String cname, String add , String ecmail,String phone) {
		
		clientmenu.click();
		sitebutton.click();
		addsitebutton.click();
		clientname.sendKeys(name);
		contactpersonname.sendKeys(email);
		contactpersonemail.sendKeys(phdnnmbr);
		contactpersonphn.sendKeys(cpersonphn);
		sitename.sendKeys(cname);
		address.sendKeys(add);
		cemail.sendKeys(ecmail);
		phnnmbr.sendKeys(phone);
		signinbutton.click();
		
		
	}
	
	public void splitrates(String text) {
	    Select select = new Select(splitrate);
	    select.selectByValue(text);
	}

	public void statusd(String value) {
	    Select select = new Select(status);
	    select.selectByValue(value);
	}
	
	public void portalaccess(String text) {
	    Select select = new Select(portalaccess);
	    select.selectByValue(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
