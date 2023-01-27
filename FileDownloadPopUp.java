package webdriverprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopUp {

	public static void main(String[] args) {
		FirefoxProfile prof=new FirefoxProfile();
	prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
	prof.setPreference("browser.download.folderList", 2);
	
		
	
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.krninformatix.com/download.php");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("(//a[text()='Download'])[1]")).click();
	}

}
