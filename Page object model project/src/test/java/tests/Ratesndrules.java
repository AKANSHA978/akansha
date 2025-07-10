package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Ratesndrules {

	public static void main (String[]args) throws InterruptedException
	{

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
	
	WebDriver driver= new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.get("https://recpalapp.co.uk/");
	driver.findElement(By.xpath("//button[normalize-space()='Admin Login']")).click();
	driver.findElement(By.id("inputEmail")).sendKeys("abck@gmail.com");
	driver.findElement(By.id("inputPassword")).sendKeys("merchant@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
		
	driver.findElement(By.xpath("//a[@href='#clientMenu']")).click();
	driver.findElement(By.xpath("//a[@href='/rates_and_rules']")).click();
	driver.findElement(By.xpath("//button[text()=' + Add Rate ']")).click();
WebElement client =	driver.findElement(By.xpath("(//select[@id='selectClients'])[1]"));
Select clientdrp= new Select(client);
clientdrp.selectByValue("57");
		
WebElement sitedrp=	driver.findElement(By.xpath("(//select[@id='siteSelect'])[1]"));
Select site= new Select(sitedrp);
site.selectByValue("65");	

WebElement jobtitle=	driver.findElement(By.xpath("(//select[@id='selectJobTitle'])[1]"));
Select job= new Select(jobtitle);
job.selectByValue("7");	




		
		
	}
	
	
	


}
