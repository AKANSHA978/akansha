package session01;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class prestashop {
	public static void main(String[] args) throws InterruptedException, IOException {
    

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demo.prestashop.com/#/en/front");
        driver.switchTo().frame("framelive");
       WebElement el= driver.findElement(By.id("category-3"));
        Actions ac=new Actions(driver);
        ac.moveToElement(el).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement tshirtSubmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(@href,'/4-men') and contains(@class,'dropdown-item')]")));
                tshirtSubmenu.click();
                driver.switchTo().defaultContent();

                WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
                w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("framelive")));
               
        driver.findElement(By.xpath("//a[normalize-space()='Hummingbird printed t-shirt']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary add-to-cart']")).click();
        Thread.sleep(3000);
        TakesScreenshot ts= (TakesScreenshot)driver;
        File src=   ts.getScreenshotAs(OutputType.FILE);
        
        
		FileHandler.copy(src, new File("screenshot.png"));
		   driver.quit();
	}
}
