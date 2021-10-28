package demopackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acttqa {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\selenium\\libs\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://demoqa.com/automation-practice-form");
        chrome.manage().window().maximize();
        Actions act = new Actions(chrome);
        WebElement fn = chrome.findElement(By.id("firstName"));
        act.click(fn).pause(Duration.ofSeconds(3)).sendKeys("pavan").build().perform();
        WebElement ln = chrome.findElement(By.id("lastName"));
        act.click(ln).pause(Duration.ofSeconds(2)).sendKeys("rockstar").build().perform();
        WebElement email = chrome.findElement(By.xpath("(//input[@type='text'])[3]"));
        act.click(email).pause(Duration.ofSeconds(2)).sendKeys("rockstar36@gmail.com").build().perform();
        WebElement click = chrome.findElement(By.xpath("//input[@value='Male']"));
        act.click(click).build().perform();
        WebElement mb = chrome.findElement(By.xpath("(//input[@type='text'])[4]"));
        act.click(mb).pause(Duration.ofSeconds(2)).sendKeys("9381134605").build().perform();
        
        WebElement se = chrome.findElement(By.xpath("(//input[@type='text'])[4]"));
		WebElement te = chrome.findElement(By.id("currentAddress"));
		act.clickAndHold(se).moveToElement(te).build().perform();
		
        WebElement subject = chrome.findElement(By.id("subjectsInput"));
        act.click(subject).sendKeys(subject,"Ma").sendKeys(Keys.TAB).build().perform();
        
        WebElement click3 = chrome.findElement(By.xpath("//*[.='Music']"));
        act.click(click3).build().perform();
        WebElement ad = chrome.findElement(By.id("currentAddress"));
        act.click(ad).pause(Duration.ofSeconds(2)).sendKeys("bhongir").build().perform();
        
        WebElement se1 = chrome.findElement(By.id("currentAddress"));
        WebElement te2 = chrome.findElement(By.xpath("//*[.='Submit']"));
		act.clickAndHold(se1).moveToElement(te2).build().perform();
		
        WebElement click1 = chrome.findElement(By.xpath("//*[.='Uttar Pradesh']"));
        act.click(click1).sendKeys(click1,"utt").sendKeys(Keys.TAB).build().perform();
        
        WebElement click2 = chrome.findElement(By.xpath("//*[.='Select City']"));
        act.click(click2).sendKeys(click2,"ag").sendKeys(Keys.TAB).build().perform();
        
        WebElement submit = chrome.findElement(By.xpath("//*[.='Submit']"));
        act.click(submit).build().perform();
        
		chrome.close();
		chrome.quit();
	}

}
