package webdriverprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCalendar {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.in");
	
	driver.findElement(By.xpath("//span[@class=\"fl icon-calendar_icon-new icon-onward-calendar icon\"]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
	
	driver.close();

	

	}

}
