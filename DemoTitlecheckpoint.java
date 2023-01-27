package webdriverprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTitlecheckpoint {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		
		Thread.sleep(2000);
String ExpectedTitle="actiTIME - Login";
String ActualTitle=driver.getTitle();
	
	
	
	if
	(ActualTitle.equals(ExpectedTitle)) {
		
		System.out.println("the title is same");
	}
	else {
		System.out.println("the title is diffrent");
	}
	}

}
