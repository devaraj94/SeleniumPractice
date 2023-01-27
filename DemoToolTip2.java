package webdriverprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoToolTip2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		
		String Tooltip=driver.findElement(By.xpath("//img[@src=\"https://fdn2.gsmarena.com/vv/bigpic/samsung-galaxy-s20-fe-5g.jpg\"]")).getAttribute("title");
		
		System.out.println(Tooltip);
	}

}
