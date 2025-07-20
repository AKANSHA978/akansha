package session01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class dynamicwebtesting {
	public static void main (String[]args) throws InterruptedException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
	//	driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		driver.findElement(By.xpath("//img[@alt='Flight Bookings']")).click();
		driver.findElement(By.xpath("//input[@name='0-departcity']")).sendKeys("mumbai");
		driver.findElement(By.xpath("//input[@name='0-arrivalcity']")).sendKeys("Pune");
		 driver.findElement(By.xpath("//input[@name=\"0-datefrom\"]")).click();
		 
		
	
	


}
}