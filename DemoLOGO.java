package webdriverprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLOGO {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	boolean Logostatus=driver.findElement(By.xpath("//div[@class=\"atLogoImg\"]")).isDisplayed();
	System.out.println(Logostatus);

if (Logostatus) {
	System.out.println("the logo is displayed");
}
else {
	System.out.println("the logo is not displayed");
}
	}
}


