package webdriverprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAttribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.krninformatix.com/sample.html");
		
	String Atrib=	driver.findElement(By.xpath("//a[@class='myclass']")).getAttribute("href");
	
	System.out.println(Atrib);

	}

}
