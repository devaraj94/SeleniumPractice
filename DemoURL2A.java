package webdriverprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoURL2A {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new FirefoxDriver();
driver.get("https://demo.actitime.com/login.do");

driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();

Thread.sleep(40000);

String ExpectedURL="https://demo.actitime.com/user/submit_tt.do";
String ActualURL=driver.getCurrentUrl();

if (ActualURL.equals(ExpectedURL)) {
	
	System.out.println("this url is correct");
}

else {
	
	System.out.println("this is url is diffrent");
}
	}

}
