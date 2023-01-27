package webdriverprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DemoActions {


	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://krninformatix.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement coursesoffered=driver.findElement(By.xpath("//span[text()=\"Courses Offered\"]"));
	 
	Actions act=new Actions(driver);
	act.moveToElement(coursesoffered).perform();
	Thread.sleep(3000);
	act.contextClick(coursesoffered).perform();
	Thread.sleep(4000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(3000);
	act.sendKeys(Keys.ENTER).perform();
	
	//act.sendKeys("T").perform();
	//act.sendKeys(Keys.ALT).build();
	//act.sendKeys(Keys.CONTROL).build();
	//act.sendKeys(Keys.DELETE).perform();
	}

}
