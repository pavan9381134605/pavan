package demopackage;


import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;	   
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce

 {

	public static void main(String[] args) throws InterruptedException 
	{

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
           WebDriver chrome = new ChromeDriver();
           chrome.get("https://login.salesforce.com/?locale=in");
	       chrome.findElement(By.cssSelector("input[type='email']")).sendKeys("rockstar");
	       chrome.findElement(By.cssSelector("input[type='password']")).sendKeys("devil");
	       chrome.findElement(By.cssSelector("input[name='rememberUn']")).click();
	       chrome.findElement(By.cssSelector("input[name='Login']")).click();
		   
		   
	   Thread.sleep(5000);
	   
		chrome.close();
		chrome.quit();
		
		
		
		
	}

}
