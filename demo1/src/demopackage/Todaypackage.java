package demopackage;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Todaypackage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
         WebDriver chrome = new ChromeDriver();
        chrome.get("https://demoqa.com/automation-practice-form");
        
       String title = chrome.getTitle(); 
       System.out.println(title);
       
        String rockstar = chrome.getCurrentUrl();
        System.out.println(rockstar);
        chrome.findElement(By.id("firstName")).sendKeys("rockstar");
        Thread.sleep(2000);
        chrome.findElement(By.id("lastName")).sendKeys("fasionista");
        Thread.sleep(2000);

        chrome.findElement(By.id("userEmail")).sendKeys("bingipavan36mail@gmail.com");
        Thread.sleep(2000);

        chrome.findElement(By.xpath("//label[text()='Female']")).click();       
        Thread.sleep(2000);
        chrome.findElement(By.id("userNumber")).sendKeys("9381134605");        
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)chrome;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      
        chrome.findElement(By.id("subjectsInput")).sendKeys("powerstar");
        
        Thread.sleep(1000);
        
        chrome.findElement(By.xpath("//label[text()='Reading']")).click();       
        Thread.sleep(1000);
        String attribute =chrome.findElement(By.id("lastName")).getAttribute("type");
        System.out.println(attribute);
        Thread.sleep(1000);
        String cssvalue = chrome.findElement(By.id("lastName")).getCssValue("font-weight");
        System.out.println(cssvalue);
        String tagname = chrome.findElement(By.id("lastName")).getTagName();
        System.out.println(tagname);
        String gettext = chrome.findElement(By.id("lastName")).getText();
        System.out.println(gettext);
        boolean isDisplayed = chrome.findElement(By.id("lastName")).isDisplayed();
        System.out.println(isDisplayed);
        
        JavascriptExecutor pj = (JavascriptExecutor)chrome;
        pj.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      
        chrome.findElement(By.xpath("//div[text()='Select State']")).click();
        Thread.sleep(2000);
         chrome.findElement(By.xpath("//div[text()='Uttar Pradesh']")).click();
        Thread.sleep(2000);
        chrome.findElement(By.xpath("//div[text()='Select City']")).click();
        Thread.sleep(2000);
        chrome.findElement(By.xpath("//div[text()='Agra']")).click();

        chrome.findElement(By.id("submit")).submit();
       
       Point Point = chrome.findElement(By.id("submit")).getLocation();
       System.out.println(Point.x);
       System.out.println(Point.y);
       
       String a =chrome.findElement(By.xpath("//*[.='Label']/../../../tbody/tr[1]/td[2]")).getText();
       System.out.println(a);
       String b  =  chrome.findElement(By.xpath("//*[.='Label']/../../../tbody/tr[2]/td[2]")).getText();
       System.out.println(b);
       String c  =  chrome.findElement(By.xpath("//*[.='Label']/../../../tbody/tr[3]/td[2]")).getText();
       System.out.println(c);
       String d  =  chrome.findElement(By.xpath("//*[.='Label']/../../../tbody/tr[4]/td[2]")).getText();
       System.out.println(d);
       String e  =  chrome.findElement(By.xpath("//*[.='Label']/../../../tbody/tr[5]/td[2]")).getText();
       System.out.println(e);
       String f =  chrome.findElement(By.xpath("//*[.='Label']/../../../tbody/tr[6]/td[2]")).getText();
       System.out.println(f);
       String g  =  chrome.findElement(By.xpath("//*[.='Label']/../../../tbody/tr[7]/td[2]")).getText();
       System.out.println(g);
       String h  =  chrome.findElement(By.xpath("//*[.='Label']/../../../tbody/tr[8]/td[2]")).getText();
       System.out.println(h);

       Thread.sleep(2000);

       chrome.close();
       chrome.quit();
      
	}

}
