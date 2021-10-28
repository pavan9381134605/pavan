package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newlanchb {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().version("95.0.4638.54").setup();
		WebDriver ie = new FirefoxDriver();
//		WebDriver chrome = new ChromeDriver();
		ie.get("https://www.google.co.in/");
		ie.close();
		ie.quit();
//		WebDriver
//		WebDriver
	}

}
