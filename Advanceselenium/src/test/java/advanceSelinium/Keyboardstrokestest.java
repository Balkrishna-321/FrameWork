package advanceSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardstrokestest {

	@Test
	public  void keyboardstroketest() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement log = driver.findElement(By.name("user-name"));
		log.sendKeys("standard_user",Keys.TAB);
		
		Thread.sleep(2000);
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("secret_sauce",Keys.ENTER);
		
       //driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	}

}
