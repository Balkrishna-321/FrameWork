package advanceSelinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestionflpkart {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("puma");
		
		Thread.sleep(2000);
		List<WebElement> allsuggestions = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
		
		Thread.sleep(2000);
		
		for (WebElement suggestion : allsuggestions) {
			
			System.out.println(suggestion.getText());
			if (suggestion.getText().contains("puma t shirt"))
			{
				suggestion.click();
			}
			
		}

	}

}
