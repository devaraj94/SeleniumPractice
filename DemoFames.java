package webdriverprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFames {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://krninformatix.com/frames/frames.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(0);
		//String title1=driver.getPageSource();
		//System.out.println(title1);
		//driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.name("name1")).sendKeys("Devaraj");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("secondframe");
		driver.findElement(By.name("rep")).click();
driver.switchTo().defaultContent();
//driver.switchTo().parentFrame();

WebElement frm=driver.findElement(By.xpath("//frame[@src=\"third.html\"]"));
driver.switchTo().frame(frm);
driver.findElement(By.name("check")).click();
driver.switchTo().parentFrame();


	}

}
