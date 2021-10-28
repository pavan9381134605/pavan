package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orange 
{

	public static void main(String[] args) throws InterruptedException
	
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
        chrome.findElement(By.id("txtUsername")).click();
        chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
        chrome.findElement(By.id("txtPassword")).sendKeys("admin123");
        chrome.findElement(By.xpath("//*[@*='button']")).click();
        chrome.findElement(By.linkText("Admin")).click();
        chrome.findElement(By.id("btnAdd")).click();        
        chrome.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("kumar");
        chrome.findElement(By.id("systemUser_userName")).sendKeys("pavan");

        
        Thread.sleep(5000);
		
		chrome.close();
		chrome.quit();
        
		
		
		
	}

}
