package webdriverprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoTitle2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ChromeDriver.driver", "D:\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String ExpectedTitle="actiTIME - Login";
		String ActualTitle=driver.getTitle();
		
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("this title is same");
		}
		else {
			
			System.out.println("this title is diffrent");
		}
	}

}
