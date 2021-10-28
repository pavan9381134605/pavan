package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iedriver 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\user\\Downloads\\selenium\\libs\\IEDriverServer.exe");
		WebDriver ie = new InternetExplorerDriver();
		ie.get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		
	}

}
