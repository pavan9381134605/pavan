package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test
{

	public static void main(String[] args)
	{
		
		

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
         WebDriver chrome = new ChromeDriver();
         
         chrome.get("https://www.facebook.com/");
         chrome.findElement(By.id("email")).sendKeys("8520959173");
         chrome.findElement(By.name("pass")).sendKeys("8520959173");
         chrome.findElement(By.name("login")).click();
         
         String pavan = chrome.getPageSource();
         System.out.println(pavan);
       
         
         
         chrome .close();
         chrome .quit();
}
}