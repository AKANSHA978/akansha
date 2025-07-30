package session01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hotstar {
	public static void main(String[]args)
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hotstar.com/in/home");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(@class,'search')]")));
		searchIcon.click();

		WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		searchInput.sendKeys("Movies");
        
		
	}

}
