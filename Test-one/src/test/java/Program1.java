import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Program1 extends program4 {
	public Program1()
	{
		super("pavans");
		
		System.out.println("Default Constructor");
		
		
	}
	public Program1(String name)
	{
		System.out.println("parameter Constructor "+ name);
		
	}
	public static void main(String[] args) {
		Program1 p = new Program1();
				
		
	 }

	public Program1(int i) {
		// TODO Auto-generated constructor stub
		System.out.println( i);
	}
	
	}
 class program4 
{
	public  program4()
	{
		
		System.out.println(" program4 Default Constructor");
		
		
	}
	public program4(String name)
	{
		System.out.println("program4 parameter Constructor "+ name);
		
	}
	public void tests()
	{}
	
	
}


