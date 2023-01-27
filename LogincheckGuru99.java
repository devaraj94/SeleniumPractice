package webdriverprojects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogincheckGuru99 {
	public class Logincheck {

		public void main (String[]args) {
			WebDriver driver=new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver1.exe");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.demo.guru99.com/V4");

			driver.findElement(By.name("uid")).sendKeys("Userld");
			driver.findElement(By.name("password")).sendKeys("Password");
			driver.findElement(By.name("btnLogin")).click();

			String ActualTi=" Guru99 Bank Home Page ";
			String ExpectedTi=driver.getTitle();

			if (ActualTi.equals(ExpectedTi)) {

				System.out.println("The title is verified");
			}
			else {
				System.out.println("The title is NOT verified");
			}

		}
	}
}
	


