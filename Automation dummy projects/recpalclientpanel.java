import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class recpalclientpanel {
	@Test
	public void recpaladmin() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://recpalapp.co.uk/");
		driver.findElement(By.xpath("//button[contains(text(),'Client Login')]")).click();
		driver.findElement(By.id("inputEmail")).sendKeys("quantums@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Test@123");
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link nav-icon nav-profile d-flex align-items-center pe-0 text-capitalize']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes, sign me out!')]")).click();
	}
@Test
public void recpaladmin2() throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://recpalapp.co.uk/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//button[contains(text(),'Client Login')]")).click();
	driver.findElement(By.id("inputEmail")).sendKeys("quantums@gmail.com");
	driver.findElement(By.id("inputPassword")).sendKeys("Test@123");
	driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),' Shifts ')]")).click();
	
	driver.findElement(By.xpath(" //button[normalize-space()='+ Add Shift'] ")).click();
	WebElement site= driver.findElement(By.id("selectBusinessUnit"));
	Select sc = new Select(site);
	sc.selectByValue("20");
	
	WebElement jobtitle= driver.findElement(By.id("selectJobTitle"));
	Select jt = new Select(jobtitle);
	jt.selectByValue("7");

	WebElement date = driver.findElement(By.xpath("//input[@class='form-control w-100']"));

	// Use JavaScriptExecutor
	JavascriptExecutor js = (JavascriptExecutor) driver;

	// Step 1: Click on the input (optional but helpful for some UIs)
	js.executeScript("arguments[0].click();", date);

	// Optional: remove 'readonly' if it exists
	js.executeScript("arguments[0].removeAttribute('readonly');", date);

	// Step 2: Set the value
	String dateValue = "2025-07-23";
	js.executeScript("arguments[0].value='" + dateValue + "';", date);

}

}