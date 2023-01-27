package webdriverprojects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckbox1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/learn.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement>allcheckbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
int si=allcheckbox.size();
for (int i = 0; i < si; i++) {
	WebElement check= allcheckbox.get(i);
	check.click();
}
	}

}
