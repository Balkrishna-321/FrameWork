package advanceSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handelingsvgtags {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.kayak.co.in/?ispredir=true");
		
		// := //*[name()='svg' and @attributename='attributevalue']
		driver.findElement(By.cssSelector(null));
		driver.findElement(By.xpath("//*[name()='svg' and @class=\"A_8a-icon\"]")).click();

	}

}
