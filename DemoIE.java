package webdriverprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoIE {

	public static void main(String[] args) {
	System.setProperty("WebDriver.ie.driver", "D:\\IEDriverServere");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("www.google.com");



	}

}
