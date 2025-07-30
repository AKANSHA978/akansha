import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class polic {

	@Test
	public static void test1() {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
//	WebElement el=	driver.findElement(By.xpath("//a[normalize-space()=\"Insurance Products\"]"));
	WebElement	els=driver.findElement(By.xpath("//li[@class='ruby-menu-mega shade mr']//a[@href='https://www.policybazaar.com/life-insurance/term-insurance/1-crore-term-insurance/']"));
	Actions act = new Actions(driver);
		act.moveToElement(els).click();
		
	}
}
