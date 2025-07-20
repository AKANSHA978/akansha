			
package session01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EcommerceWebsites {

    @Test
    public void testSpeakerNavigation() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://advantageonlineshopping.com/#/");
        driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement speakers = wait.until(ExpectedConditions.elementToBeClickable(By.id("speakersTxt")));
        speakers.click();
        driver.findElement(By.xpath("//a[normalize-space()='Bose Soundlink Bluetooth Speaker III']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
        driver.findElement(By.id("menuCart")).click();
        driver.findElement(By.id("checkOutButton")).click();
        driver.findElement(By.id("registration_btn")).click();
        driver.findElement(By.name("usernameRegisterPage")).sendKeys("Akansha");
        driver.findElement(By.name("emailRegisterPage")).sendKeys("Akansha@gmail.com");
        driver.findElement(By.name("passwordRegisterPage")).sendKeys("Akansha@123");
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Akansha@123");
        driver.findElement(By.name("addressRegisterPage")).sendKeys("vijay nagar indore");
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("mp");
        
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("45009");
        driver.findElement(By.xpath("//label[normalize-space()='I agree to the www.AdvantageOnlineShopping.com Conditions of Use and Privacy Notice']")).click();
        driver.findElement(By.xpath("//button[@id='register_btn']")).click();
        System.out.print("You are now registered ");
        
    }
}
