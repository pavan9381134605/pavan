package demopackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Redbus
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\selenium\\libs\\chromedriver.exe");
	    WebDriver chrome = new ChromeDriver();
       chrome.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gclid=CjwKCAjwwsmLBhACEiwANq-tXGoM919We7LkEDH30unzCHlf0nI6tBLtAfZIonntoxl3LgsWCnIgTRoCRWAQAvD_BwE");
        chrome.manage().window().maximize();
		chrome.findElement(By.id("source")).sendKeys("Hyd");
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//*[.='Hyderabad']")).click();

		chrome.findElement(By.id("destination")).sendKeys("Viz");
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//*[.='Vizag']")).click();

		chrome.findElement(By.id("datepicker1")).click();
		chrome.findElement(By.xpath("(//*[.='22'])[2]")).click();
		chrome.findElement(By.id("datepicker2")).click();
		chrome.findElement(By.xpath("(//*[.='23'])[2]")).click();
		
		chrome.findElement(By.xpath("//*[.='Search']")).click();
		
		List<WebElement> rows = chrome.findElements(By.xpath("//div[@id='SerVicesDetOneway1']/div"));
		System.out.println(rows.size());
//		for(int i=1;i<=rows.size();i++)
//		{
//		System.out.println(chrome.findElement(By.xpath("//div[@id='SerVicesDetOneway1']/div"[+i+]")));
//			
//			
//		}
			
			
			
			
			
			
//		String gt=chrome.findElement(By.xpath("//div[@*='main-right']/div[1]/div[2]/div/div[1]/div[1]//h2/span")).getText();
//		System.out.println(gt);
//		String gt1=chrome.findElement(By.xpath("//div[@*='main-right']/div[1]/div[2]/div/div[1]//div[2]/h2")).getText();
//		System.out.println(gt1);

		chrome.close();
		chrome.quit();
	}

}
