package RecpalRelated.copy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
public class RecpalTest  {

	@SuppressWarnings("deprecation")
	public static void main (String[]args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://recpalapp.co.uk/");
		
		driver.manage().window().maximize();
		
		RecpalloginBase rc = new RecpalloginBase(driver);
		rc.login("merchant@gmail.com","merchant@123");
		rc.buttonclick();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ClientPage cl= new ClientPage(driver);
				cl.addClient("anshuman","anshuman@gmail.com","87896988","ans@123", "ans@123","indore");
	}	
}
