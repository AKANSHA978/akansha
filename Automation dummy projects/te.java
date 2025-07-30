import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class te {
	public static void main (String[]args) throws InterruptedException
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shopify.com/in/blog/best-ecommerce-sites");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	System.out.println(driver.getTitle());
		
    //System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
    WebElement logo=driver.findElement(By.xpath("//a[@class=\"inline-block shrink-0 mr-12\"]"));
    System.out.println(logo.isDisplayed());
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[normalize-space()=\"Blog\"]")).click();
	driver.close();	
		
		
		
	}

}
