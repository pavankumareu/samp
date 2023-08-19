package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testone {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeMethod(groups="smoke")
	public void t2aTest(String browsers)
	{
	String bs=	System.getProperty("browserr");
	if(bs==null)
		bs=browsers;
	
		
		Reporter.log("Browser inilizaton Start");
		System.out.println("This is  t2 before test "+bs);
		if(bs.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(bs.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(bs.equals("edge"))
		{
			driver =new EdgeDriver();
		}
		Reporter.log("Browser inilizaton Completed");
	}
	@AfterTest()
	public void t2bTest()
	{
		System.out.println("This is  t2 after test ");
		

	}
	@Parameters({"username","pass","url"})
	@Test(groups="smoke")
	public void methodOne(String sname,String spass,String urls)
	{
		Reporter.log("Methodone started executing");
		System.out.println("This is Smoke Methodone: "+sname );
		driver.manage().window().maximize();
		driver.get(System.getProperty("url"));
		driver.close();
		Reporter.log("Methodone completed executing");

	}
	
	@BeforeGroups
	public void methodTwo()
	{
		System.out.println("This is normal Methodone");
		
	}
	@Test
	public void methodThree()
	{
		System.out.println("This is smoke methodfour");
		throw new SkipException("Temporarly skipping testcase");
	}
	
	@Test(retryAnalyzer = RetryAnlyer.class)
	public void methodThsee()
	{		Reporter.log("MethodThsee started executing");

		System.out.println("This is smoke methodthree");
		//Assert.fail("Forcefully failing the testcase");
		Reporter.log("MethodThsee completed executing");

	}
}
