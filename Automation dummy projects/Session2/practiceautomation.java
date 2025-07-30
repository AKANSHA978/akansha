package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class practiceautomation {
	
	
	@Test
	
	public void firstscenario()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("akansha");
		driver.findElement(By.xpath("//input[@placeholder='Enter EMail']")).sendKeys("akansha@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Phone']")).sendKeys("8839566567");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("indore");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		driver.findElement(By.xpath("//input[@id='female']")).click();
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		driver.findElement(By.xpath("//input[@id='thursday']")).click();
		driver.findElement(By.xpath("//input[@id='friday']")).click();
		driver.findElement(By.xpath("//input[@id='saturday']")).click();
		
	WebElement ch=	driver.findElement(By.xpath("//select[@id='country']"));
	Select sc = new Select(ch);
	//sc.selectByValue("usa");
	sc.selectByVisibleText("Canada");
	
	WebElement ch2=	driver.findElement(By.xpath("//select[@id='colors']"));
	Select scc = new Select(ch2);
	//sc.selectByValue("usa");
	scc.selectByVisibleText("Yellow");
	WebElement ch3=	driver.findElement(By.xpath("//select[@id='animals']"));
	Select sccd = new Select(ch3);
	//sc.selectByValue("usa");
	sccd.selectByVisibleText("Cheetah");
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/19/2025");
//	driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
	//driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
	driver.switchTo().alert().dismiss();
	
//	driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
	//driver.switchTo().alert().sendKeys("akansha");
	String originalwindowhandle= driver.getWindowHandle();
	WebElement newtab = driver.findElement(By.xpath("//button[normalize-space()='New Tab']"));
    newtab.click();
   
    driver.switchTo().window(originalwindowhandle);
 
	}
}
