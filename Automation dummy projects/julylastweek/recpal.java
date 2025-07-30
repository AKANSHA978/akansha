package julylastweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class recpal {
	WebDriver driver;
	
@BeforeMethod 
public void setup()
	{
		
		driver= new ChromeDriver();
		driver.get("https://recpalapp.co.uk/");	
		
	}

@DataProvider (name="loginrecpal")
public Object[][] getdata() {
	return new Object[][]{
			{ "merchant@gmail.com","merchant@123"},		
	        {"merchant@gmail.com","merchant@124"},
};

}
@Test(dataProvider="loginrecpal")
public void logintest(String username,String password)
{
	driver.findElement(By.xpath("//button[contains(text(), 'Admin Login')]")).click();
	driver.findElement(By.id("inputEmail")).sendKeys(username);
	driver.findElement(By.id("inputPassword")).sendKeys(password);
	driver.findElement(By.xpath("//span[contains(text(), 'Sign in')]")).click();
}

}



