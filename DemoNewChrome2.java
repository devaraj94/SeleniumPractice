package webdriverprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoNewChrome2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ChromeDriver.driver", "D:\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
Thread.sleep(10000);
driver.navigate().back();
Thread.sleep(6000);

driver.navigate().refresh();
driver.navigate().forward();
Thread.sleep(5000);
driver.close();
		
		
			}

}
