package tests;

	import java.time.Duration;

import org.openqa.selenium.By;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

	public class recpalfilter {
		WebDriver driver ;
		@BeforeMethod
	    public void setup() {
			ChromeOptions c= new ChromeOptions();
			c.addArguments("--incognito");
	        driver = new ChromeDriver(c);
	        driver.manage().window().maximize();
	        driver.get("https://recpalapp.co.uk/");
	        driver.findElement(By.xpath("//button[@class='me-2 btn btn-outline-secondary']")).click();
	        driver.findElement(By.id("inputEmail")).sendKeys("anshika@gmail.com");
	        driver.findElement(By.id("inputPassword")).sendKeys("anshika@123");
	        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	      
	    }
		
		@Test
		public void Clientfilter() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@href=\"#clientMenu\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/client-list\"]")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-danger text-nowrap btn-lg']")).click();
	  
	        Thread.sleep(3000);
	        WebElement ActiveFilter=  driver.findElement(By.xpath("//div[@class='d-flex gap-2 mb-3 justify-content-between']//select[1]"));
		    Select filter= new Select(ActiveFilter);
		    filter.selectByValue("true");
		    WebElement client=  driver.findElement(By.xpath("(//select)[2]"));
			Select c= new Select(client);
			c.selectByValue("Apollo Hospitals");
			
			    WebElement job=  driver.findElement(By.xpath("(//select)[3]"));
				Select j= new Select(job);
				j.selectByValue("7");
				driver.findElement(By.xpath("//button[@class='btn-sm bg-dark text-white px-4 py-1']")).click();
		       driver.findElement(By.xpath("//input[@placeholder='Search clients...']")).sendKeys("Akanshaa");
		}
		
	
		@Test
		public void sitefilter() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//a[@href=\"#clientMenu\"]")).click();
		 driver.findElement(By.xpath("//a[@href='/site']")).click();	
		 driver.findElement(By.xpath("//button[@class='btn btn-danger text-nowrap btn-lg']")).click();
		  
	        Thread.sleep(3000);
	        WebElement ActiveFilter=  driver.findElement(By.xpath("(//select)[1]"));
		    Select filter= new Select(ActiveFilter);
		    filter.selectByValue("true");
		    WebElement client=  driver.findElement(By.xpath("(//select)[2]"));
			Select c= new Select(client);
			c.selectByValue("26");
			
			    WebElement job=  driver.findElement(By.xpath("(//select)[3]"));
				Select j= new Select(job);
				j.selectByValue("Apollo Premier");
				driver.findElement(By.xpath("(//button[normalize-space()='Reset Filters'])[1]")).click();
		       driver.findElement(By.xpath("//input[@placeholder='Search Site...']")).sendKeys("Akanshaa");
			driver.close();		}
	
	
	

}
 
