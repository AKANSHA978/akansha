import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookmyshow {
	
	public static void main(String[]args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.bookmyshow.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//img[@src=\"//in.bmscdn.com/m6/images/common-modules/regions/mumbai.png\"]")).click();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
 //   driver.findElement(By.xpath("//a[@href=\"/explore/c/stream?cat=Online Streaming Events\"]")).click();
	driver.findElement(By.xpath("//div[@class='bwc__sc-1nbn7v6-14 gyNbOV']")).click();
	driver.close();
	
	
	}
}
