package webdriverprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoText2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.id("loginButton")).click();
	
	Thread.sleep(20000);

	
	String ExpectedText="Enter Time-Track";
	String ActualText=driver.findElement(By.xpath("(//td[@class=\"pagetitle\"])[1]")).getText();
	
	
	if(ActualText.equals(ExpectedText)) {
		
	System.out.println("this text is same");
	
	}
	else {
		
		System.out.println("this text is diffrent");
	
	}
		
	}

}
