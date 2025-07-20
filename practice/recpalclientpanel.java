package session01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class recpalclientpanel {
	public static void main (String[] args)
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://recpalapp.co.uk/");
	driver.findElement(By.xpath("//button[normalize-space()='Client Login']")).click();
	driver.findElement(By.id("inputEmail")).sendKeys("quantums@gmail.com");
	driver.findElement(By.id("inputPassword")).sendKeys("Test@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
