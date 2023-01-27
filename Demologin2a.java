package webdriverprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demologin2a {

	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		driver.findElement(By.id("loginButton")).click();
		
	Thread.sleep(30000);
	
	driver.findElement(By.id("logoutLink")).click();
	}

}
