package julylastweek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class bookscrape {
	
	@Test(priority=1)
	public static void Test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://books.toscrape.com/");
	//	driver.findElement(By.xpath("//a[@title='A Light in the Attic']/ancestor::article//button[contains(text(),'Add to basket')]")).click();
		driver.findElement(By.xpath("//a[@href=\"catalogue/category/books/classics_6/index.html\"]")).click();
		
		WebElement title = driver.findElement(By.xpath("//a[normalize-space()=\"Books to Scrape\"]"));
		String actualtitle= title.getText();
		String expected = "Books to Scrape";
		Assert.assertEquals(actualtitle, expected);
		driver.close();
	} 



@Test(priority=0)
public static void Test2() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
WebElement search=	driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
search.sendKeys("akansha");
search.sendKeys(Keys.ENTER);
driver.close();
}
}