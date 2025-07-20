package session01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class nopcommerce {
	
		public static void main(String[] args) {
	       ChromeOptions options= new ChromeOptions();
	       options.addArguments("--incognito");

	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("https://demo.nopcommerce.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).click();
            driver.findElement(By.xpath("//a[@title='Show products in category Notebooks']//img")).click();
		}

	}



