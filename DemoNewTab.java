package webdriverprojects;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DemoNewTab {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable--notifications");
		WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.air.irctc.co.in");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[text()=\"Tour Packages\"]")).click();
	Set<String>allwindows=driver.getWindowHandles();
	Iterator<String>  it=allwindows.iterator();
	String irctc=it.next();
	String tourpackage=it.next();
	
	System.out.println(irctc);
	System.out.println(tourpackage);
	
	driver.switchTo().window(tourpackage);
driver.findElement(By.xpath("//span[normalize-space()='Air Package']")).click();
	driver.close();
	
	driver.switchTo().window(irctc);
	
	
	
	

	
	

	}

}
