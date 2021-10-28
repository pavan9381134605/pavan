package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driveer","C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://demoqa.com/alerts");
		chrome.findElement(By.id("alertButton")).click();
		
		
	}

}
