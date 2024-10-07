package advanceSelinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionamazonTest {

	@Test
	public void Autosuggestionamazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> allsuggestions = driver.findElements(By.xpath("//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (WebElement suggestions : allsuggestions) {
			
			System.out.println(suggestions.getText());
			
			if (suggestions.getText().contains("puma sandals for men")) {
				
				suggestions.click();
				
			}
			
		}
	}

}
