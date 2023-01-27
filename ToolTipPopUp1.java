package webdriverprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipPopUp1 {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.gsmarena.com/apple-phones-48.php");
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
  String tooltip=driver.findElement(By.xpath("//img[@src=\"https://fdn2.gsmarena.com/vv/bigpic/apple-iphone-13-pro.jpg\"]")).getAttribute("title");
System.out.println(tooltip);
	}

}
