import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class saucedemotesting {

	public static void main(String[]args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);;
		driver.findElement(By.xpath("(//button[contains(text(),'ADD TO CART')])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'ADD TO CART')])[2]")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CHECKOUT')]")).click();
		driver.findElement(By.id("first-name")).sendKeys("akansha");
		driver.findElement(By.id("last-name")).sendKeys("bidua");
		driver.findElement(By.id("postal-code")).sendKeys("45007");
		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
		WebElement successmsg = driver.findElement(By.xpath("//div[contains(text(),'Checkout: Overview')]"));
	  String actualmsg = successmsg.getText();
	  String expectedMessage = "Checkout: Overview";
	  Assert.assertEquals(expectedMessage, actualmsg);
		
		
	}
}
