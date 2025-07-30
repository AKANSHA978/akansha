package session01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
	public static void main (String[]args) throws InterruptedException
	{ ChromeOptions options = new ChromeOptions();

    options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user-name")).sendKeys("error_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).submit();
	    WebElement element =driver.findElement(By.id(""));
		Select acc = new Select(element);
		acc.selectByValue("abc");
				
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-bolt-t-shirt"))).click();
		
		driver.findElement(By.id("shopping_cart_container")).click();
		;
		
	}

}
