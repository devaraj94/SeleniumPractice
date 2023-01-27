package webdriverprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.ChromeDriver.driver",	"D:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("https://www.krninformatix.com/sample.html");
 WebElement MultiSelect=driver.findElement(By.id("cities"));
 Select dd=new Select(MultiSelect);
 dd.selectByIndex(1);
 Thread.sleep(5000);
 dd.selectByValue("3");
 Thread.sleep(4000);
dd.selectByVisibleText("Delhi");
Thread.sleep(4000);

dd.deselectAll();
Thread.sleep(4000);
driver.close();



	}

}
