package webdriverprojects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoJavaAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.krninformatix.com/selenium/testing.html");
		
		driver.findElement(By.xpath("//button[@onclick=\"generateConfirmBox()\"]")).click();
	Thread.sleep(5000);
		Alert alertwindow=driver.switchTo().alert();
		Thread.sleep(5000);
		String TextFn=alertwindow.getText();
		
		System.out.println(TextFn);
		Thread.sleep(5000);
		alertwindow.accept();
	
	}

}
