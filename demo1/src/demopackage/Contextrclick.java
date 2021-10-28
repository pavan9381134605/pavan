package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextrclick {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		chrome.manage().window().maximize();
		
		WebElement crc = chrome.findElement(By.cssSelector(".context-menu-one"));
		Actions thug =new Actions (chrome);
		thug.contextClick(crc).build().perform();
		
		chrome.close();
		chrome.quit();
		
		
	}

}
