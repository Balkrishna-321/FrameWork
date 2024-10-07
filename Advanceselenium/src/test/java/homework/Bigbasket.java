package homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasket {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.bigbasket.com/");
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 driver.findElement(By.xpath("//div[@class='Header___StyledQuickSearch2-sc-19kl9m3-0 gzbZOD']//input[@placeholder='Search for Products...']")).sendKeys("surf");
		//search.sendKeys("apples",Keys.ENTER);
		//Thread.sleep(2000);
		
		
		//SCROLLING FULL BODY UP AND DOWN
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		//AUTOSUGGESTION HANDELING
		List<WebElement> sugges = driver.findElements(By.xpath("//div[@class='Header___StyledQuickSearch2-sc-19kl9m3-0 gzbZOD']//input[@placeholder='Search for Products...']"));
		
		for (WebElement allsuggest : sugges) {
			
			System.out.println(allsuggest.getText());
			if (allsuggest.getText().contains("500 g")) {
				
				allsuggest.click();
				
			}
			
		}
		
		
		//WebElement app = 
        //driver.findElement(By.xpath("//h3[normalize-space()='Apple - Fuji Premium']")).click();
		//act.scrollToElement(app).click().build().perform();
		

				
	}

}
