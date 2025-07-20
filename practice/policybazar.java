package session01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class policybazar {
	static WebDriver driver;
	
@Test(priority=1)
	public static void firstscenario() throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//i[@class='icon-bg homeIconsBg term-life bgnone']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[normalize-space()='Female'])[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Female']")).click();		
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("akansha");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("08/22/1997");
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("8834939843");
		driver.findElement(By.xpath("//span[normalize-space()='View Plans']")).click();
	}


@Test(priority=2)
public void second() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//div[@class='prd-block health']")).click();
	
	
	
	
}
}