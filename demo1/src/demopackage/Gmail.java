package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail
{

	public static void main(String[] args) throws InterruptedException
	
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        
        chrome.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp");
        
        chrome.findElement(By.xpath("//*[@*='firstName']")).sendKeys("fasionista");
        
        chrome.findElement(By.xpath("//*[@*='lastName']")).sendKeys("therock");
        
        chrome.findElement(By.xpath("//*[@*='username']")).sendKeys("thuglife36");
        
        chrome.findElement(By.xpath("//*[@*='Passwd']")).sendKeys("straks");
        
        chrome.findElement(By.xpath("//*[@*='ltr']")).sendKeys("straks");
        Thread.sleep(5000);

        chrome.findElement(By.xpath("//*[.='Show password']")).click();
        
        Thread.sleep(5000);

        chrome.close();
		chrome.quit();
		
	}

}
