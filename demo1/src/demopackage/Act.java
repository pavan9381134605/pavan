package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\selenium\\\\libs\\\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://mrbool.com/how-to-create-your-own-search-engine-with-php-and-mysql/32733");
        Actions act = new Actions(chrome);
		act.moveToElement(chrome.findElement(By.xpath("//*[@*='menulink']"))).build().perform();
		act.moveToElement(chrome.findElement(By.xpath("(//*[.='Courses'])[5]"))).click().build().perform();
		act.moveToElement(chrome.findElement(By.xpath("//*[@*='Search']"))).click().build().perform();
		
		
		Thread.sleep(5000);
		chrome.close();
		chrome.quit();
	}

}
