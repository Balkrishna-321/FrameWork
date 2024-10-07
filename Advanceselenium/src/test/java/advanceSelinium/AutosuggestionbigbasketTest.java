package advanceSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionbigbasketTest {

	@Test
	public void Autosuggestionbigbasket() {
		
	} {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//input[@class='flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700']")).sendKeys("apples");

	}

}
