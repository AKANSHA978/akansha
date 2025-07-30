import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automationblogspot {
	@BeforeMethod
	public void bfr()
	{
		System.out.print("helo bfr");
	}
	@Test (groups= {"regression"})
	public void Test1()
	{
	System.out.print("hello akki ");	
		
	}

	@Test (groups= {"regression"})
	public void Test2()
	{
		System.out.print("akansha keep going");
	}
	
	@Test(enabled=true)
	public void Test3()
	{
		System.out.print("hello keep learning");
	}
	@Test
	public void Test4()
	{
		System.out.print("akansha is going to explore herself");
	}
	@AfterMethod
	public void after()
	{
		System.out.print("hello after");
	}
}
