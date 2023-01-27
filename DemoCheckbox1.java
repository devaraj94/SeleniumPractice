package webdriverprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCheckbox1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.krninformatix.com/sample.html");
	boolean checkboxstatus=driver.findElement(By.id("rem")).isSelected();
System.out.println(checkboxstatus);

Thread.sleep(5000);

driver.findElement(By.id("rem")).click();
	boolean checkboxstatus1=driver.findElement(By.id("rem")).isSelected();
	System.out.println(checkboxstatus1);
	
	
	Thread.sleep(6000);
	
	driver.findElement(By.id("rem")).click();
	boolean checkboxstatus2=driver.findElement(By.id("rem")).isSelected();
	System.out.println(checkboxstatus2);
	
	Thread.sleep(3000);
	
	if(!checkboxstatus2) {
		
		driver.findElement(By.id("rem")).click();
		System.out.println(!checkboxstatus2);
	}
	}

}
