package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Set;

public class windowhandle {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demoqa.com/browser-windows");   
        String mainWindow = driver.getWindowHandle();

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();
       
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        
        WebElement sampleText = driver.findElement(By.id("sampleHeading"));
        String actualText = sampleText.getText();

       
        Assert.assertEquals(actualText, "This is a sample page");

        
        driver.close(); 
        driver.switchTo().window(mainWindow);
        driver.quit();
    }
}
