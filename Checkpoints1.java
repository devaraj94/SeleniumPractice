package webdriverprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkpoints1 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new FirefoxDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	
	driver.findElement(By.id("loginButton")).click();
	
	//URL Checkpoint
	
	Thread.sleep(2000);
	String expectedURL="https://demo.actitime.com/user/submit_tt.do";
	
	String actualURL=driver.getCurrentUrl();
	if (actualURL.equals(expectedURL)) {
		System.out.println("this url is same");
	}
	
	else {
		System.out.println("this url is diffrent");
	

	}

	}
}

