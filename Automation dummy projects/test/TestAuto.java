package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAuto {
	public static void main (String[]args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivangi bidua\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.cssSelector("button[type='submit']")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='My Info']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("akku");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("pgl");
	Thread.sleep(2000);
	WebElement dobField = driver.findElement(By.xpath("//label[text()='Date of Birth']/../following-sibling::div//input"));
    dobField.click();
    dobField.sendKeys("1995-06-25");
    System.out.println("DOB entered successfully");

    // Close
    Thread.sleep(3000);
    driver.quit();

	
	

	}
}
