package advanceSelinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HnadelingdropdownSelectclass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
				
		
		WebElement date = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		
		//  APPROACH 1 ->   USING INDEX VALUE
		
		Select seldate = new Select(date);
		Select selmon = new Select(month);
		Select selyea = new Select(year);
		
		seldate.selectByIndex(10);
		selmon.selectByIndex(5);
		selyea.selectByIndex(24);
		
		
		

	}

}
