package demopackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class JSyahoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
	    WebDriver chrome = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) chrome;  
		js.executeScript("Window.location='https://demoqa.com/automation-practice-form'");
		chrome.manage().window().maximize();
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		
		
		
		
		
	}

}
