package advanceSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownusingwebelementstest {

	@Test
	
	public void dropdownusingwebelements() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()=4]")).click();
		driver.findElement(By.xpath("//option[text()=\"Mar\"]"));
		driver.findElement(By.xpath("//option[@value=\"1997\"]")).clear();

	}

}
