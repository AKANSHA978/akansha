package RecpalRelated.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class shift {

public static void main (String[] args) throws InterruptedException {
	
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--incognito");
	WebDriver driver = new ChromeDriver(options);
	 driver.get("https://recpalapp.co.uk/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.findElement(By.xpath("//button[normalize-space()='Admin Login']")).click();
   
   driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("merchant@gmail.com");
   driver.findElement(By.xpath(" //input[@id='inputPassword']")).sendKeys("merchant@123");
   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();;
	Thread.sleep(3000);
   driver.findElement(By.xpath("//a[normalize-space()='Shifts']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[normalize-space()='+ Add Shift']")).click();
   Thread.sleep(2000);
   
   WebElement client = driver.findElement(By.xpath("(//select[@id=\"selectClients\"])[1]"));
   Select cl= new Select(client);
   cl.selectByValue("23");
   WebElement site = driver.findElement(By.xpath("(//select[@id=\"selectBusinessUnit\"])[1]"));
   Select st= new Select(site);
   st.selectByValue("20");
   WebElement jbtitle = driver.findElement(By.xpath("(//select[@id=\"selectJobTitle\"])[1]"));
   Select jb= new Select(jbtitle);
   jb.selectByValue("8");
   WebElement dateInput = driver.findElement(By.xpath("//input[@type='date']"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].value='2025-07-05';", dateInput);  
 
   WebElement shift = driver.findElement(By.xpath("(//select[@id=\"selectShifts\"])[1]"));
   Select sft= new Select(shift);
   sft.selectByValue("84");
   
   WebElement shiftstrttime = driver.findElement(By.xpath("(//select[@id=\"selectShiftStart\"])[1]"));
   Select sftt= new Select(shiftstrttime);
   sftt.selectByValue("08:00 AM");
   WebElement shiftendtime = driver.findElement(By.xpath("(//select[@id=\"selectShiftEnd\"])[1]"));
   Select sfet= new Select(shiftendtime);
   sfet.selectByValue("08:00 PM");
   WebElement shiftbreak = driver.findElement(By.xpath("(//select[@id='selectShiftsBreak'])[1]"));
   Select brk= new Select(shiftbreak);
   brk.selectByValue("45");
 
   Thread.sleep(2000);
   driver.findElement(By.xpath("div[class='col-12 input-container'] input[type='text']")).sendKeys("20");
   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10");
   driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("30");
   driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("40");
   driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("20");
   WebElement percentage = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
   Select pc= new Select(percentage);
   pc.selectByValue("25");
   
}
}