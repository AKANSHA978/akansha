package Testfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flpkartpayment {
	
	public static void main (String[] args) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
	/*	;
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("8839533169");
		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
	
		*/
		
	//	driver.findElement(By.)
	//	driver.close();		
		
		
	}

}
