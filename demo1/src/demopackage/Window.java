package demopackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();

		chrome.get("https://www.toolsqa.com/");
		String WH = chrome.getWindowHandle();
		System.out.println("parent window handle"  + WH);
		
		Set <String> WindowHandles = chrome.getWindowHandles();
		
		for(String Window:WindowHandles)
		{
			System.out.println(Window);
		}
		chrome.close();
		chrome.quit();
		
		
	}

}
