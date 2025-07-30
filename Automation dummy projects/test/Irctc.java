package test;


//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static void main (String[]args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
driver.findElement(By.xpath("//a[@aria-label='Click here to register your account with I.R.C.T.C.']")).click();
	//Registerform fill 
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("akansha");
driver.findElement(By.id("fullName")).sendKeys("abc");
driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Aicb@123");
driver.findElement(By.xpath("//input[@fdprocessedid='f6tgxi']")).sendKeys("abc4@gmail.com");
	
		
		
	}

}
