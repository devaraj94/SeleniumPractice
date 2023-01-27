package webdriverprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ChromeDriver.driver", "D:\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
