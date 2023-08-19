package testng;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Input a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
//Ex1:("Hello", 2) → "Helo"   
public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of word: ");
		String str = sc.nextLine();
		System.out.println("Enter the no of characters : ");
		int n = sc.nextInt();
		try {
			newStringWord(str, n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void newStringWord(String s, int l) {
		String ns = "";

		ns = s.substring(0, l) + s.substring(s.length() - l, s.length());

		if (ns.length() >= 2) {
			System.out.println("New String : " + ns);
		} else {
			System.out.println(" the new string length is less then 2");
		}
	}

}
