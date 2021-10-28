package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Javascriptexecutor
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium\\libs\\chromedriver.exe");
	    WebDriver chrome = new ChromeDriver();
	    
		JavascriptExecutor js = (JavascriptExecutor)chrome; 
		js.executeScript("window.location='https://demoqa.com/automation-practice-form'");

		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain);
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(document.body.scrollHeigh,0)");
		Thread.sleep(3000);
		
		String innerText = js.executeScript("return document.getElementById('firstName').getAttribute('type')").toString();
		System.out.println(innerText);
		
		chrome.close();
		chrome.quit();        	
	}

}
