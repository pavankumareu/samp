package tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kindle", Keys.ENTER);
		// driver.findElement(By.cssSelector("span.a-price-whole")).click();
		List<WebElement> list = driver
				.findElements(By.xpath("//a[text()='Kindle Edition']//following::span[@class='a-price-whole'][1]"));
		int i = 0;
		String main = driver.getWindowHandle();
		for (WebElement e : list) {
			System.out.println(e.getText());

			i = Integer.parseInt(e.getText());
			if (i >= 1) {
				e.click();
				Set<String> set =driver.getWindowHandles();
				for(String window:set)
				{
					if(window!=main)
					{
						driver.switchTo().window(window);
						System.out.println(System.getProperty("user.dir"));
						File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						org.openqa.selenium.io.FileHandler.copy(file, new File(System.getProperty("G:\\toolqa\\Test-one\\tests")));
					//System.out.println(driver.getTitle());
					driver.switchTo().window(main);
					}
					
				}

			}
		}
	}

}
