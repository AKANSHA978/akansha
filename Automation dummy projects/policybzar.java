import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class policybzar {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"login-module-inner\"]//input[@id='central-login-module-sign-mobile']")).sendKeys("987987787");
		driver.findElement(By.xpath("//div[@id='central-login-module-inner']//span[normalize-space()='Sign in with OTP']")).click();
		driver.findElement(By.xpath("//div[@id='central-login-module-inner']//img[@id='close-by-image']")).click();
		
		
		
	}
	
}
