package webdriverprojects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMULTISelectALLOptions {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.ChromeDriver.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.krninformatix.com/sample.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	WebElement MultiSelect=driver.findElement(By.id("cities"));
Select dd=new Select(MultiSelect);
dd.selectByIndex(2);
Thread.sleep(4000);
dd.selectByValue("1");
Thread.sleep(5000);
dd.selectByVisibleText("Chennai");

List<WebElement>AllOptions=dd.getAllSelectedOptions();
int si=AllOptions.size();
for (int i = 0; i < si; i++) {
	WebElement Option=AllOptions.get(i);
	String te=Option.getText();
	System.out.println(te);
}
	}

}
