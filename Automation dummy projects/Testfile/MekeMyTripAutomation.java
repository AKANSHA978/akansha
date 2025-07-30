package Testfile;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MekeMyTripAutomation {
public static void main (String args[]) throws InterruptedException
{
	
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--incognito");
	
	
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	driver.findElement(By.xpath("//span[@class='styles__Close-sc-1bytt3z-0 kezeYI']")).click();
    driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Pune");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']")).click();
    driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("dubai");
    driver.findElement(By.xpath("//p[normalize-space()='Abu Dhabi, United Arab Emirates']")).click();
    Thread.sleep(2000);
  //  driver.findElement(By.xpath("//span[contains(text(),'Dubai Al Maktoum')]")).click();
    driver.findElement(By.xpath("//div[@aria-label='Thu Jul 10 2025']")).click(); 
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[contains(@type,'radio')])[1]")).click();
    driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
    driver.close();
   
    
    
    
    
    
    
    
    /*  // Enter city name
    WebElement inputField = driver.findElement(By.xpath("//input[@placeholder='From']"));
    inputField.sendKeys("Bangalore");

    // Wait a bit for suggestions to load
    Thread.sleep(2000);  // you can replace this with WebDriverWait for better practice

    List<WebElement> cityOptions = driver.findElements(By.xpath("//ul[@role='listbox']//li//p[@class='font14 appendBottom5 blackText']"));

    System.out.println("Dropdown values:");
    for (WebElement option : cityOptions) {
        System.out.println(option.getText());
    }

    driver.quit();
}
    */
	
   
	
	
}
	
	
}

