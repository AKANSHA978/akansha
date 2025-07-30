package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class shiftauto {
	@Test
	public void shift()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://recpalapp.co.uk/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Admin Login']")).click();
		driver.findElement(By.id("inputEmail")).sendKeys("merchant@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("merchant@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@href='/shift-list']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-lg text-white']")).click();
		
		
		
		
	}

}
