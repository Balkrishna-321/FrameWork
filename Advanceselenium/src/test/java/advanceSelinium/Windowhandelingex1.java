package advanceSelinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandelingex1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("puma caps",Keys.ENTER);
		
		driver.findElement(By.xpath("//a[contains(text(),'Superman Printed Sports/Regular Cap')]")).click();
		
		String mtab = driver.getWindowHandle();
		System.out.println(mtab);
		
		Set<String> alltab = driver.getWindowHandles();
		System.out.println(alltab);
		
		for (String tabs : alltab) {
			
			if (!tabs.equals(mtab)) {
				
				driver.switchTo().window(tabs);
				WebElement price = driver.findElement(By.xpath("//div[contains(text(),'₹772')]"));
				System.out.println(price);
				
		//	}
			
		}
		

	}

}
}
