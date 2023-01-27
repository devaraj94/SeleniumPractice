package webdriverprojects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoALLlinks {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://krninformatix.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	List<WebElement>alllinks =driver.findElements(By.xpath("//a"));
	
	int si=alllinks.size();
	for (int i = 0; i < si; i++) {
		WebElement option= alllinks.get(i);
		String te=option.getText();
		System.out.println(te);
		
	}

	}

}
