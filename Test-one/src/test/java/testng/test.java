package testng;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	
	@AfterTest
	public void aTest()
	{
		System.out.println("This is After Test");

	}
	@BeforeSuite
	public void bSuit()
	{
		System.out.println("This is Before Suit");
	}
	
	@BeforeClass
	public void bClass()
	{
		System.out.println("This is Before Class");
	}
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("This is Before Method");
	}
	@Test(alwaysRun = true ,dependsOnMethods = "Testone")
	public void Test()
	{
		System.out.println("This is  Test");

	}
	int i=1;
	@Test(description = "Sample Description about test one" )
	public void Testone()  
	{
		
		System.out.println("This is  Testone"+i);
		i++;
		

	}
	
	
	@AfterMethod
	public void aMethod()
	{
		System.out.println("This is After Method");

	}
	
	@BeforeTest
	public void bTest()
	{
		System.out.println("This is Before Test");
	}
	@AfterClass
	public void aclass()
	{
		System.out.println("This is After Class");

	}
	
	@AfterSuite
	public void aSuit()
	{
		System.out.println("This is After Suit");

	}

}
