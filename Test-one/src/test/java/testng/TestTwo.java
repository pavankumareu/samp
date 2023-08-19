package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTwo {
	
	@BeforeTest()
	public void t2aTest()
	{
		System.out.println("This is  t2 before test ");

	}
	@AfterTest
	public void t2bTest()
	{
		System.out.println("This is  t2 after test ");

	}
	@Test()
	public void Testtwo()
	{
		System.out.println("This is  Test two");

	}
	
	@Test
	public void Test2()
	{
		System.out.println("This is  Test2");

	}

}
