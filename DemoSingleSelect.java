package webdriverprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chromeDriver.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.krninformatix.com/sample.html");

		WebElement SingleSelect=driver.findElement(By.id("city"));
	
	Select dd=new Select(SingleSelect);
	dd.selectByIndex(0);
	Thread.sleep(5000);
	dd.selectByValue("2");
	Thread.sleep(4000);
	dd.selectByVisibleText("Mumbai");
	
	Thread.sleep(3000);
	
	
	driver.close();
	
	
	
	}

}
