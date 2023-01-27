package webdriverprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoActionsExampleBranches {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://krninformatix.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement br=driver.findElement(By.xpath("//span[text()=\"Branches\"]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(br).perform();
		Thread.sleep(4000);

		
		WebElement Marathalli=driver.findElement(By.xpath("//span[text()=\"Marathahalli\"]"));
	act.moveToElement(Marathalli).perform();
	
	
	WebElement seleniumtrainginMarathalli=driver.findElement(By.xpath("//a[text()=\"Selenium-Training-in-Marathahalli\"]"));
	
	act.contextClick(seleniumtrainginMarathalli);
	
	act.sendKeys(Keys.ARROW_DOWN).perform();
	act.sendKeys(Keys.ENTER).perform();
	

	}

}
