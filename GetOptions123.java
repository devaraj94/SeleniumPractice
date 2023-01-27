package webdriverprojects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions123 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.krninformatix.com/sample.html");

WebElement MultiSelect= driver.findElement(By.id("cities"));
Select dd=new Select(MultiSelect);
dd.selectByIndex(1);
Thread.sleep(5000);
dd.selectByValue("3");
Thread.sleep(4000);
dd.selectByVisibleText("Delhi");



List<WebElement>allOption= dd.getOptions();

int si=allOption.size();

for (int i = 0; i < si; i++) {
	
WebElement Option=allOption.get(i);
 String te=Option.getText();
 System.out.println(te);
}
	
}

}
