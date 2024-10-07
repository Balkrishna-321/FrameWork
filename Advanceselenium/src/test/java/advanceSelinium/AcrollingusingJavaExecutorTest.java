package advanceSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcrollingusingJavaExecutorTest {

	@Test
	public void AcrollingusingJavaExecutor() {
		
	} {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement devele = driver.findElement(By.xpath("//a[text()='Developers']"));
		
		System.out.println(devele.getLocation().x);
		System.out.println(devele.getLocation().y);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// APPROACH 1 -> USING COORDINATES
		//js.executeScript("window.scrollBy(954,806)");
		//Thread.sleep(2000);
		//devele.click();
		
		//Thread.sleep(2000);
		
		//APPROACH 2 -> WITHOUT COORDINATES
		//js.executeScript("arguments[0].scrollIntoView()",devele);
		//devele.click();
		
		
		//APPROACH 3 -> 
		//js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//Thread.sleep(1000);
		
		//js.executeAsyncScript("window.scrollTo(0,-document.body.scrollHeight)");
		

	}

}
