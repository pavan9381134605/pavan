package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragedrop
{

	public static void main(String[] args)
	{


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\selenium\\libs\\chromedriver.exe");
		        WebDriver chrome = new ChromeDriver();
        chrome.get("https://jqueryui.com/droppable/");
		chrome.manage().window().maximize();
		chrome.switchTo().frame(0);
		WebElement se = chrome.findElement(By.id("draggable"));
		WebElement te = chrome.findElement(By.id("droppable"));
		Actions thug =new Actions (chrome);
		thug.clickAndHold(se).moveToElement(te).build().perform();
		WebElement se1 = chrome.findElement(By.id("draggable"));
		thug.dragAndDropBy(se1,70,80).build().perform();
		//or
		//thug.dragAndDrop(se, te).release().build().perform();
//		thug.dragAndDropBy(se, 20, 20).release().build().perform();
		
		chrome.close();
		chrome.quit();
		
		
		
	}

		
}


