package demopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
	    WebDriver chrome = new ChromeDriver();
	    chrome.navigate().to("https://www.toolsqa.com/");

	    chrome.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    chrome.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    chrome.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
	   
	    
		
		chrome.close();
		chrome.quit();
				
		
	}

}
