package test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceLab {
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriverchromedriver","C:\\Users\\shivangi bidua\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("akansha");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("bidua");
	driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("878999");
	driver.findElement(By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action']")).click();
	driver.findElement(By.xpath("//button[@id='finish']")).click();
	
	driver.quit();
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	 try
		 { Thread.sleep(2000); }
		 catch (InterruptedException e)
		 {}
      WebElement dropdown=driver.findElement(By.className("product_sort_container"));
        Select abc = new Select(dropdown);
        //  sortselect.selectByVisibleText("Price (low to high)");
        //abc.selectByValue("za");
        abc.selectByIndex(2);
        */
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//click on sidebar
	//	driver.findElement(By.id("react-burger-menu-btn")).click();
	//   driver.findElement((By.id("about_sidebar_link"))).click();
	//   driver.findElement(By.linkText("Logout")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.id("reset_sidebar_link")).click();
		
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
