package advanceSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement log = driver.findElement(By.name("user-name"));
		
		log.sendKeys("Standard-user");
		log.sendKeys(Keys.CONTROL+"a");
		log.sendKeys(Keys.CONTROL+"c",Keys.TAB);
		log.sendKeys(Keys.TAB,Keys.CONTROL+"v");
		log.sendKeys(Keys.ENTER);
		

	}

}
