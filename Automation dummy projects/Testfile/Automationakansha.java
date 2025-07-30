package Testfile;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Automationakansha {
	WebDriver driver;
	/*
	@Test(priority=2)
	
	public void abc(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://demoqa.com/broken");
	List <WebElement>abc	= driver.findElements(By.tagName("a"));
		for (WebElement link:abc) {
			String href= link.getAttribute("href");
			if (href==null || href.isEmpty())
{
	System.out.print("empty url");
		continue;
			
		}


            try {
                HttpURLConnection connection = (HttpURLConnection) (new URL(href).openConnection());
                connection.setRequestMethod("HEAD");
                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println("Broken Link: " + href + " → " + responseCode);
                } else {
                    System.out.println("Valid Link: " + href + " → " + responseCode);
                }

            } catch (Exception e) {
                System.out.println("Exception for: " + href + " → " + e.getMessage());
            }
          
        }
		  driver.quit();
    }
	*/
		
@Test
public void textbox() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
driver.get("https://demoqa.com/text-box");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("akansha");
driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("vijay nagar indore");
driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("khatibabajhansi");
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,500)");
driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();	
Thread.sleep(3000);
driver.navigate().to("https://demoqa.com/checkbox");
js.executeScript("window.scrollBy(0,200)");
WebElement chkbx=driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[1]"));
chkbx.click();
System.out.println (chkbx.isSelected());

	
}
		
		
	}
	
	
	
