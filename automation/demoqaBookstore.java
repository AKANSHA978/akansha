package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaBookstore {

public static void main (String args[])	
{
	//BookstoreTests
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/books");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    WebElement inputbox = driver.findElement(By.xpath("//input[@id='searchBox']"));
    inputbox.sendKeys("Learning JavaScript Design Patterns");
    inputbox.click();
	driver.findElement(By.xpath("//a[text()='Learning JavaScript Design Patterns']")).click();
	
	//verify links available at webpage
	driver.navigate().to("https://demoqa.com/books");
  	List<WebElement> links= driver.findElements(By.tagName("a"));
	System.out.print(links.size());
	for (WebElement link:links)
	{
		String text = link.getText().trim();
        String href = link.getAttribute("href");

        System.out.println("Text: " + text );
        System.out.println("  | Href: " + href);
		
	}
	
}
		
}
