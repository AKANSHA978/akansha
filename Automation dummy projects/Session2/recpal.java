package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class recpal {
	public static void main (String []args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://recpalapp.co.uk/home");
		driver.findElement(By.xpath("//button[@class='me-2 btn btn-outline-secondary']")).click();
		driver.findElement(By.id("inputEmail")).sendKeys("merchant@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("merchant@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);;
		driver.findElement(By.xpath("//a[@href='/schedule']")).click();
		driver.findElement(By.xpath("")).click();
		
	}

}
