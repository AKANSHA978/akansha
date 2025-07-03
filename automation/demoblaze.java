package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoblaze {
	
	
	@Test(enabled=false)
	public void test() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("akansha");
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("akansha123");
		//button[@onclick='register()']
		driver.findElement(By.xpath("//button[@onclick='register()']")).click();
	//close button
	//	driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[2]")).click();
		driver.switchTo().alert().accept();	
	}
	
	
	@Test(enabled=false)
	public void test2() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("login2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).sendKeys("akansha");
		driver.findElement(By.id("loginpassword")).sendKeys("akansha123");
		//button[@onclick='logIn()']
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
		driver.close();
		
	}
	
	
	@Test
	public void test3() {
			WebDriver driver= new ChromeDriver();
			driver.get("https://demoblaze.com/index.html");
			driver.manage().window().maximize();
	        driver.findElement(By.xpath("(//a[normalize-space()='Samsung galaxy s6'])[1]")).click();
	        driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


}
