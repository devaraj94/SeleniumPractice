package webdriverprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipPopUp2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	String tooltip1=driver.findElement(By.xpath("//button[@id=\"toolTipButton\"]")).getText();
	
	System.out.println(tooltip1);
	}

}
