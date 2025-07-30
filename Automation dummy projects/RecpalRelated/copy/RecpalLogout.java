package RecpalRelated.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RecpalLogout {
	
	public static void main (String[] args) throws InterruptedException {
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		
	WebDriver driver= new ChromeDriver(options);
	driver.get("https://recpalapp.co.uk/");
	driver.findElement(By.xpath("//button[normalize-space()='Admin Login']")).click();
	driver.findElement(By.id("inputEmail")).sendKeys("merchant@gmail.com");
	driver.findElement(By.id("inputPassword")).sendKeys("merchant@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	
	//driver.findElement(By.xpath("//a[@href='#clientMenu']")).click();
//	driver.findElement(By.xpath("//a[@href='/client-list']")).click();
	//driver.findElement(By.xpath("//button[text()=' Show Filters ']")).click();
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
	driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Yes, sign me out!']")).click();
		
	driver.close();	
			
		
	}

}
