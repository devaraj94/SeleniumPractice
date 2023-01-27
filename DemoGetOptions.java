package webdriverprojects;

import java.awt.Component;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.LittleEndianDataInputStream;

public class DemoGetOptions {

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
		
	List<WebElement> AllOptions=dd.getOptions();
	int si=AllOptions.size();
	for (int i = 0; i < si; i++) {
		WebElement Option=AllOptions.get(i);
	String	te=Option.getText();
	System.out.println(te);
		
	}
	
	}

}
