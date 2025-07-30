package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shivangi bidua\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        SauceLabPage page = new SauceLabPage(driver);
        page.login("standard_user", "secret_sauce");
        page.addToCartAndCheckout("akansha", "bidua", "878999");
        System.out.print("everything sorted");

        driver.quit();
    }
}
