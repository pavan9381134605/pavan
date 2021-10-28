package demopackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wclass 
{
	public static void main(String[] args)
 {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
    WebDriver chrome = new ChromeDriver();

    chrome.get("https://www.toolsqa.com/");
	chrome.manage().window().fullscreen();
	
	Dimension dim = chrome.manage().window().getSize();
	System.out.println(dim.getHeight());
	System.out.println(dim.getWidth());
	
	Point window = chrome.manage().window().getPosition();
	System.out.print(window.getX());
	System.out.println(window.getY());

	chrome.close();
	chrome.quit();
		
		
 }

}
