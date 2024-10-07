package advanceSelinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasketsearchmultipleoptionstest {

	
	@Test
	public void Bigbasketsearchmultipleoptions() {
		
	}{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("apples");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> suggestions = driver.findElements(By.xpath("[class=\"flex-1 flex items-center mr-2.5 overflow-hidden\"]"));
		
		for (WebElement items : suggestions)
		{
			System.out.println(items.getText());
			
		}

	}

}
