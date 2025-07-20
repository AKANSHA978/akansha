package session01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class flightTestScenario {
	
@Test
public void test1() throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
     
     driver.get("https://blazedemo.com/");  
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement drpdown=  driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
	Select dp= new Select(drpdown);
	dp.selectByValue("Paris");
	
	  WebElement drpdown2=  driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
		Select dp2= new Select(drpdown2);
		dp2.selectByValue("Rome");
	
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		driver.findElement(By.xpath("//input[@value=\"Choose This Flight\"][1]")).click();
		
		Thread.sleep(3000);
		//fillform
		driver.findElement(By.xpath("//input[@id=\"inputName\"]")).sendKeys("akansha");
		driver.findElement(By.xpath("//input[@id=\"address\"]")).sendKeys("vijay nagar indore");
		driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("indore");
		driver.findElement(By.xpath("//input[@id=\"state\"]")).sendKeys("m.p");
		driver.findElement(By.xpath("//input[@id=\"zipCode\"]")).sendKeys("45678");
		
		
		 WebElement cardtype=  driver.findElement(By.xpath("//select[@id=\"cardType\"]"));
			Select type= new Select(cardtype);
			type.selectByValue("visa");
		
		
		driver.findElement(By.xpath("//input[@id=\"creditCardNumber\"]")).sendKeys("894579579834");
		driver.findElement(By.xpath("//input[@id=\"creditCardMonth\"]")).sendKeys("july");
		driver.findElement(By.xpath("//input[@id=\"creditCardYear\"]")).sendKeys("2027");
		driver.findElement(By.xpath("//input[@id=\"nameOnCard\"]")).sendKeys("akansha");
		driver.findElement(By.xpath("//input[@value=\"Purchase Flight\"]")).click();
	
		WebElement complete=driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']"));
		String actualtext= complete.getText();
		Assert.assertEquals(actualtext,"Thank you for your purchase today!");
		driver.close();
		
		
}
	
	
	
	
	
	
	
	
	
	
	

}
