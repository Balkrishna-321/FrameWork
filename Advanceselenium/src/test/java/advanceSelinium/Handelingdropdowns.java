package advanceSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handelingdropdowns {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		driver.findElement(By.linkText("Create new account")).click();
		WebElement DAY = driver.findElement(By.id("day"));
		WebElement MONTH = driver.findElement(By.id("month"));
		WebElement YEAR = driver.findElement(By.id("year"));
		Thread.sleep(2000);
		DAY.sendKeys(Keys.ARROW_DOWN);
		DAY.sendKeys(Keys.ARROW_DOWN);
		DAY.sendKeys(Keys.ARROW_DOWN);
		DAY.sendKeys(Keys.ARROW_DOWN);
		DAY.sendKeys(Keys.ARROW_DOWN);
		DAY.sendKeys(Keys.ARROW_DOWN);
		DAY.sendKeys(Keys.ARROW_DOWN);
		DAY.sendKeys(Keys.ARROW_DOWN);
		

	}

}
